/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.generator

import com.google.inject.Inject
import component.Component
import component.ConfiguredComponent
import component.Connection
import component.impl.ConfiguredComponentImpl
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import org.apache.commons.math3.geometry.euclidean.threed.Rotation
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import urdf.Joint
import urdf.Link
import urdf.Pose
import urdf.UrdfFactory
import urdf.impl.LinkImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#codegeneration
 */
class KinematicsGenerator extends AbstractGenerator {

	@Inject extension CMakeListsCompiler
	@Inject extension DisplayLaunchCompiler
	@Inject extension RvizConfigCompiler
	@Inject extension PackageXmlCompiler
	@Inject extension ReadMeCompiler
	@Inject extension VCSReposCompiler

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (component : resource.allContents.toIterable.filter(Component)) {
			val pkg_name = component.gitRepo.package;
			fsa.generateFile(pkg_name + "/urdf/" + component.name + ".urdf", component.compile);
			fsa.generateFile(pkg_name + "/launch/display.launch.py",
				compile_DisplayLaunch(component));
			fsa.generateFile(pkg_name + "/rviz/display.rviz",
				compile_RvizConfig(""));
			var depends_list = get_dependency_list(component);

			fsa.generateFile(pkg_name + "/package.xml",
				compile_package_xml_format3(pkg_name, depends_list));
			fsa.generateFile(pkg_name + "/CMakeLists.txt", compile_CMakeLists(pkg_name));
			fsa.generateFile(pkg_name + "/" + component.name + ".repos", compile_Repos(component));
			fsa.generateFile(pkg_name + "/README.md", compile_ReadMe(component));

			// "Copy" model and its dependent models into the description folder
			fsa.generateFile(pkg_name + "/models/" + component.name + ".kin",
				compile_Model(component));
			for (configuredComponent : component.component) {
				val depComponent = configuredComponent.type;
				fsa.generateFile(pkg_name + "/models/" + depComponent.name + ".kin",
					compile_Model(depComponent));
			}
		}
	}

	private def compile_Model(Component component) {
		var outputStream = new ByteArrayOutputStream();
		component.eResource.save(outputStream, null);
		val modelStr = new String(outputStream.toByteArray());
		return modelStr;
	}

	private def get_dependency_list(Component component) {
		var depends_list = new ArrayList<CharSequence>();
		for (configuredComponent : component.component) {
			depends_list.add(configuredComponent.type.gitRepo.package);
		}
		return depends_list;
	}

	private def get_transform(Pose pose1, Pose pose2) {
		val xyz1 = pose1.xyz;
		val rpy1 = pose1.rpy;
		val xyz2 = pose2.xyz;
		val rpy2 = pose1.rpy;

		var translationLinkCommonToLink1 = new Vector3D(xyz1.get(0), xyz1.get(1), xyz1.get(2));
		var rotationLinkCommonToLink1 = new Vector3D(rpy1.get(0), rpy1.get(1), rpy1.get(2));

		var translationLinkCommonToLink2 = new Vector3D(xyz2.get(0), xyz2.get(1), xyz2.get(2));
		var rotationLinkCommonToLink2 = new Vector3D(rpy2.get(0), rpy2.get(1), rpy2.get(2));

		// Convert Euler angles to rotation matrices
		var rotationMatrixLinkCommonToLink1 = new Rotation(
			RotationOrder.XYZ,
			rotationLinkCommonToLink1.getX(),
			rotationLinkCommonToLink1.getY(),
			rotationLinkCommonToLink1.getZ()
		);

		var rotationMatrixLinkCommonToLink2 = new Rotation(
			RotationOrder.XYZ,
			rotationLinkCommonToLink2.getX(),
			rotationLinkCommonToLink2.getY(),
			rotationLinkCommonToLink2.getZ()
		);

		// Compute the transformation from link1 to link2
		var rotationFromLink1ToLink2 = rotationMatrixLinkCommonToLink2.applyTo(
			rotationMatrixLinkCommonToLink1.revert());

		var translationFromLink1ToLink2 = translationLinkCommonToLink2.subtract(
			rotationMatrixLinkCommonToLink2.applyInverseTo(translationLinkCommonToLink1)
		);

		var newOrigin = UrdfFactory.eINSTANCE.createPose();
		newOrigin.xyz.add(translationFromLink1ToLink2.x);
		newOrigin.xyz.add(translationFromLink1ToLink2.y);
		newOrigin.xyz.add(translationFromLink1ToLink2.z);

		val rpyAngles = rotationFromLink1ToLink2.getAngles(RotationOrder.XYZ);

		newOrigin.rpy.add(rpyAngles.get(0));
		newOrigin.rpy.add(rpyAngles.get(0));
		newOrigin.rpy.add(rpyAngles.get(0));

		return newOrigin;
	}

	private def compile_origin(Pose pose) {
		var xyzStr = "";
		var rpyStr = "";

		if (pose.xyz.size() > 0) {
			xyzStr = " xyz=\"" + pose.xyz.get(0) + " " + pose.xyz.get(1) + " " + pose.xyz.get(2) + "\" ";
		}
		if (pose.rpy.size() > 0) {
			rpyStr = " rpy=\"" + pose.rpy.get(0) + " " + pose.rpy.get(1) + " " + pose.rpy.get(2) + "\" ";
		}
		var originStr = "<origin" + xyzStr + rpyStr + "/>";

		return originStr;
	}

	private def compile_joint(Joint joint, String prefix) '''
<joint name="«prefix + joint.name»" type="«joint.type»">
	<parent link="«prefix + joint.parent.link»" />
	<child link="«prefix + joint.child.link»" />
	«compile_origin(joint.origin)»
	«IF joint.axis !== null»
	<axis xyz="«joint.axis.xyz»" />
	«ENDIF»
	«IF joint.limit !== null»
	<limit effort="«joint.limit.effort»" lower="«joint.limit.lower»" upper="«joint.limit.upper»" velocity="«joint.limit.velocity»" />
	«ENDIF»
</joint>
	'''

	private def compile_link(Link link, String prefix) '''
<link name="«prefix + link.name»" >
	«IF link.visual !== null»
	<visual>
		«IF link.visual.origin !== null»
		«compile_origin(link.visual.origin)»
		«ENDIF»
		«IF link.visual.geometry !== null»
		<geometry>
			«IF link.visual.geometry.mesh !== null»
			<mesh filename="«link.visual.geometry.mesh.filename»" «IF (link.visual.geometry.mesh.scale.size >= 3)»scale="«link.visual.geometry.mesh.scale.get(0)» «link.visual.geometry.mesh.scale.get(1)» «link.visual.geometry.mesh.scale.get(2)»"«ENDIF» />
			«ENDIF»
			«IF link.visual.geometry.box !== null»
			<box size="«link.visual.geometry.box.size»" />
			«ENDIF»
			«IF link.visual.geometry.cylinder !== null»
			<cylinder length="«link.visual.geometry.cylinder.length»" radius"«link.visual.geometry.cylinder.radius»"/>
			«ENDIF»
		</geometry>
		«ENDIF»
	</visual>
	«ENDIF»
	«IF link.collision !== null»
		<collision>
			«IF link.collision.origin !== null»
			«compile_origin(link.collision.origin)»
			«ENDIF»
			«IF link.collision.geometry !== null»
			<geometry>
				«IF link.collision.geometry.mesh !== null»
				<mesh filename="«link.collision.geometry.mesh.filename»" «IF (link.visual.geometry.mesh.scale.size >= 3)»scale="«link.collision.geometry.mesh.scale.get(0)» «link.collision.geometry.mesh.scale.get(1)» «link.collision.geometry.mesh.scale.get(2)»"«ENDIF» />
				«ENDIF»
				«IF link.collision.geometry.box !== null»
				<box size="«link.collision.geometry.box.size»" />
				«ENDIF»
				«IF link.collision.geometry.cylinder !== null»
				<cylinder length="«link.collision.geometry.cylinder.length»" radius="«link.collision.geometry.cylinder.radius»"/>
				«ENDIF»
			</geometry>
			«ENDIF»
		</collision>
		«ENDIF»
		«IF link.inertial !== null»
			<inertial>
				«IF link.inertial.mass !== null»
				<mass value="«link.inertial.mass.value»" />
				«ENDIF»
				«IF link.inertial.origin !== null»
				«compile_origin(link.inertial.origin)»
				«ENDIF»
				«IF link.inertial.inertia !== null»
				<inertia ixx="«link.inertial.inertia.ixx»" ixy="«link.inertial.inertia.ixy»" ixz="«link.inertial.inertia.ixz»"
					iyy="«link.inertial.inertia.iyy»" iyz="«link.inertial.inertia.iyz»"
					izz="«link.inertial.inertia.izz»" />
				«ENDIF»
			</inertial>
			«ENDIF»
</link>
	'''

	def compile_config_component(ConfiguredComponent configuredComponent) {
		var component = configuredComponent.type;
		var prefix = "";
		if (configuredComponent.prefix !== null) {
			prefix = configuredComponent.prefix;
		}
		compile_component(component, prefix);
	}

	def compile_connection(Connection connection) {
		val baseAttachment = connection.baseAttachment.eCrossReferences.get(0) as LinkImpl;
		val flangeAttachment = connection.flangeAttachment.eCrossReferences.get(0) as LinkImpl;

		val baseAttachmentComponentName = (connection.baseAttachment.eContainer() as Component).name;
		val flangeAttachmentComponentName = (connection.flangeAttachment.eContainer() as Component).name;

		var flangeAttachmentPrefix = "";
		var baseAttachmentPrefix = "";
		var baseComponentName = "";
		var flangeComponentName = "";
		for (content : connection.eContainer().eContents()) {
			if (content instanceof ConfiguredComponentImpl) {
				// TODO: the qualified name for the attachments in connection should have "name" and not "type"
				val component = content as ConfiguredComponentImpl;
				val name = component.type.name;
				if (flangeAttachmentComponentName.equals(name)) {
					flangeComponentName = component.name;
					if (component.prefix !== null) {
						flangeAttachmentPrefix = component.prefix;
					}
				} else if (baseAttachmentComponentName.equals(name)) {
					baseComponentName = component.name;
					if (component.prefix !== null) {
						baseAttachmentPrefix = component.prefix;
					}
				}
			}
		}

		var jointStr = "<!-- Connection between components " + flangeComponentName + " and " + baseComponentName +
			" -->";
		jointStr += "\n<joint name=\"" + connection.name + "\" type=\"fixed\">";
		jointStr += "\n\t<parent link=\"" + flangeAttachmentPrefix + flangeAttachment.name + "\" />";
		jointStr += "\n\t<child link=\"" + baseAttachmentPrefix + baseAttachment.name + "\" />";

		val origin = get_transform(connection.baseAttachment.origin, connection.flangeAttachment.origin);
		val originStr = compile_origin(origin);
		jointStr += "\n\t" + originStr

		jointStr += "\n</joint>"

		return jointStr;
	}

	private def compile_component(Component component, String prefix) '''
		«FOR configComponent : component.component»
			<!-- Description of component «configComponent.name» of type «configComponent.type.name» -->
			«compile_config_component(configComponent)»
			<!-- End of description of component «configComponent.name» -->
		«ENDFOR»
		«FOR connection : component.connection»
			«compile_connection(connection)»
		«ENDFOR»
		«FOR link : component.link»
			«compile_link(link, prefix)»
		«ENDFOR»
		«FOR joint : component.joint»
			«compile_joint(joint, prefix)»
		«ENDFOR»
	'''

	private def compile(Component component) '''
		<?xml version="1.0"?>
		<robot name="«component.name»" >
			«compile_component(component, "")»
		</robot>
	'''
}
