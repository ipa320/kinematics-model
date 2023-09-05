/*
 * generated by Xtext 2.26.0
 */
package de.fraunhofer.ipa.kinematics.serializer;

import com.google.inject.Inject;
import component.BaseAttachment;
import component.Component;
import component.ComponentPackage;
import component.ConfiguredComponent;
import component.Connection;
import component.FlangeAttachment;
import component.GitRepo;
import component.Group;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import urdf.Axis;
import urdf.Box;
import urdf.Child;
import urdf.Collision;
import urdf.Cylinder;
import urdf.Geometry;
import urdf.Inertia;
import urdf.Inertial;
import urdf.Joint;
import urdf.Limit;
import urdf.Link;
import urdf.Mass;
import urdf.Mesh;
import urdf.Parent;
import urdf.Pose;
import urdf.Sphere;
import urdf.UrdfPackage;
import urdf.Visual;

@SuppressWarnings("all")
public class KinematicsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KinematicsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentPackage.BASE_ATTACHMENT:
				sequence_BaseAttachment(context, (BaseAttachment) semanticObject); 
				return; 
			case ComponentPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case ComponentPackage.CONFIGURED_COMPONENT:
				sequence_ConfiguredComponent(context, (ConfiguredComponent) semanticObject); 
				return; 
			case ComponentPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case ComponentPackage.FLANGE_ATTACHMENT:
				sequence_FlangeAttachment(context, (FlangeAttachment) semanticObject); 
				return; 
			case ComponentPackage.GIT_REPO:
				sequence_GitRepo(context, (GitRepo) semanticObject); 
				return; 
			case ComponentPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			}
		else if (epackage == UrdfPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UrdfPackage.AXIS:
				sequence_Axis(context, (Axis) semanticObject); 
				return; 
			case UrdfPackage.BOX:
				sequence_Box(context, (Box) semanticObject); 
				return; 
			case UrdfPackage.CHILD:
				sequence_Child(context, (Child) semanticObject); 
				return; 
			case UrdfPackage.COLLISION:
				sequence_Collision(context, (Collision) semanticObject); 
				return; 
			case UrdfPackage.CYLINDER:
				sequence_Cylinder(context, (Cylinder) semanticObject); 
				return; 
			case UrdfPackage.GEOMETRY:
				sequence_Geometry(context, (Geometry) semanticObject); 
				return; 
			case UrdfPackage.INERTIA:
				sequence_Inertia(context, (Inertia) semanticObject); 
				return; 
			case UrdfPackage.INERTIAL:
				sequence_Inertial(context, (Inertial) semanticObject); 
				return; 
			case UrdfPackage.JOINT:
				sequence_Joint(context, (Joint) semanticObject); 
				return; 
			case UrdfPackage.LIMIT:
				sequence_Limit(context, (Limit) semanticObject); 
				return; 
			case UrdfPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case UrdfPackage.MASS:
				sequence_Mass(context, (Mass) semanticObject); 
				return; 
			case UrdfPackage.MESH:
				sequence_Mesh(context, (Mesh) semanticObject); 
				return; 
			case UrdfPackage.PARENT:
				sequence_Parent(context, (Parent) semanticObject); 
				return; 
			case UrdfPackage.POSE:
				sequence_Pose(context, (Pose) semanticObject); 
				return; 
			case UrdfPackage.SPHERE:
				sequence_Sphere(context, (Sphere) semanticObject); 
				return; 
			case UrdfPackage.VISUAL:
				sequence_Visual(context, (Visual) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Axis returns Axis
	 *
	 * Constraint:
	 *     xyz=EString?
	 * </pre>
	 */
	protected void sequence_Axis(ISerializationContext context, Axis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BaseAttachment returns BaseAttachment
	 *
	 * Constraint:
	 *     (name=EString origin=Pose parent=[Link|EString])
	 * </pre>
	 */
	protected void sequence_BaseAttachment(ISerializationContext context, BaseAttachment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__ORIGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__ORIGIN));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__PARENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaseAttachmentAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBaseAttachmentAccess().getOriginPoseParserRuleCall_5_0(), semanticObject.getOrigin());
		feeder.accept(grammarAccess.getBaseAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1(), semanticObject.eGet(ComponentPackage.Literals.ATTACHMENT__PARENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Box returns Box
	 *
	 * Constraint:
	 *     size=EString
	 * </pre>
	 */
	protected void sequence_Box(ISerializationContext context, Box semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.BOX__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.BOX__SIZE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoxAccess().getSizeEStringParserRuleCall_3_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Child returns Child
	 *
	 * Constraint:
	 *     link=EString
	 * </pre>
	 */
	protected void sequence_Child(ISerializationContext context, Child semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.CHILD__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.CHILD__LINK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChildAccess().getLinkEStringParserRuleCall_2_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Collision returns Collision
	 *
	 * Constraint:
	 *     (origin=Pose? geometry=Geometry)
	 * </pre>
	 */
	protected void sequence_Collision(ISerializationContext context, Collision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         version=EString 
	 *         category=CATEGORY? 
	 *         gitRepo=GitRepo? 
	 *         (baseAttachment+=BaseAttachment+ | baseAttachment+=BaseAttachment)? 
	 *         (flangeAttachment+=FlangeAttachment+ | flangeAttachment+=FlangeAttachment)? 
	 *         (component+=ConfiguredComponent+ | component+=ConfiguredComponent)? 
	 *         (connection+=Connection+ | connection+=Connection)? 
	 *         (group+=Group+ | group+=Group)? 
	 *         (link+=Link+ | link+=Link)? 
	 *         (joint+=Joint+ | joint+=Joint)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConfiguredComponent returns ConfiguredComponent
	 *
	 * Constraint:
	 *     (name=EString type=[Component|EString] prefix=EString?)
	 * </pre>
	 */
	protected void sequence_ConfiguredComponent(ISerializationContext context, ConfiguredComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns Connection
	 *
	 * Constraint:
	 *     (name=EString baseAttachment=[BaseAttachment|EString] flangeAttachment=[FlangeAttachment|EString])
	 * </pre>
	 */
	protected void sequence_Connection(ISerializationContext context, Connection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.CONNECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.CONNECTION__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.CONNECTION__BASE_ATTACHMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.CONNECTION__BASE_ATTACHMENT));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.CONNECTION__FLANGE_ATTACHMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.CONNECTION__FLANGE_ATTACHMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConnectionAccess().getBaseAttachmentBaseAttachmentEStringParserRuleCall_5_0_1(), semanticObject.eGet(ComponentPackage.Literals.CONNECTION__BASE_ATTACHMENT, false));
		feeder.accept(grammarAccess.getConnectionAccess().getFlangeAttachmentFlangeAttachmentEStringParserRuleCall_7_0_1(), semanticObject.eGet(ComponentPackage.Literals.CONNECTION__FLANGE_ATTACHMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cylinder returns Cylinder
	 *
	 * Constraint:
	 *     (length=EString radius=EString)
	 * </pre>
	 */
	protected void sequence_Cylinder(ISerializationContext context, Cylinder semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.CYLINDER__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.CYLINDER__LENGTH));
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.CYLINDER__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.CYLINDER__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCylinderAccess().getLengthEStringParserRuleCall_2_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getCylinderAccess().getRadiusEStringParserRuleCall_4_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FlangeAttachment returns FlangeAttachment
	 *
	 * Constraint:
	 *     (name=EString origin=Pose parent=[Link|EString])
	 * </pre>
	 */
	protected void sequence_FlangeAttachment(ISerializationContext context, FlangeAttachment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__ORIGIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__ORIGIN));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.ATTACHMENT__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.ATTACHMENT__PARENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlangeAttachmentAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFlangeAttachmentAccess().getOriginPoseParserRuleCall_5_0(), semanticObject.getOrigin());
		feeder.accept(grammarAccess.getFlangeAttachmentAccess().getParentLinkEStringParserRuleCall_7_0_1(), semanticObject.eGet(ComponentPackage.Literals.ATTACHMENT__PARENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Geometry returns Geometry
	 *
	 * Constraint:
	 *     (box=Box? cylinder=Cylinder? sphere=Sphere? mesh=Mesh?)
	 * </pre>
	 */
	protected void sequence_Geometry(ISerializationContext context, Geometry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GitRepo returns GitRepo
	 *
	 * Constraint:
	 *     (distro=EString repo=EString branch=EString package=EString version=EString)
	 * </pre>
	 */
	protected void sequence_GitRepo(ISerializationContext context, GitRepo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.GIT_REPO__DISTRO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.GIT_REPO__DISTRO));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.GIT_REPO__REPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.GIT_REPO__REPO));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.GIT_REPO__BRANCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.GIT_REPO__BRANCH));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.GIT_REPO__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.GIT_REPO__PACKAGE));
			if (transientValues.isValueTransient(semanticObject, ComponentPackage.Literals.GIT_REPO__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ComponentPackage.Literals.GIT_REPO__VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGitRepoAccess().getDistroEStringParserRuleCall_2_0(), semanticObject.getDistro());
		feeder.accept(grammarAccess.getGitRepoAccess().getRepoEStringParserRuleCall_4_0(), semanticObject.getRepo());
		feeder.accept(grammarAccess.getGitRepoAccess().getBranchEStringParserRuleCall_6_0(), semanticObject.getBranch());
		feeder.accept(grammarAccess.getGitRepoAccess().getPackageEStringParserRuleCall_8_0(), semanticObject.getPackage());
		feeder.accept(grammarAccess.getGitRepoAccess().getVersionEStringParserRuleCall_10_0(), semanticObject.getVersion());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (name=EString baseLink=[Link|EString] endLink=[Link|EString] ros2_control=EString?)
	 * </pre>
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Inertia returns Inertia
	 *
	 * Constraint:
	 *     (
	 *         ixx=DOUBLE? 
	 *         ixy=DOUBLE? 
	 *         ixz=DOUBLE? 
	 *         iyy=DOUBLE? 
	 *         iyz=DOUBLE? 
	 *         izz=DOUBLE?
	 *     )
	 * </pre>
	 */
	protected void sequence_Inertia(ISerializationContext context, Inertia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Inertial returns Inertial
	 *
	 * Constraint:
	 *     (origin=Pose? mass=Mass? inertia=Inertia?)
	 * </pre>
	 */
	protected void sequence_Inertial(ISerializationContext context, Inertial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Joint returns Joint
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         type=JOINTTYPE 
	 *         parent=Parent 
	 *         child=Child 
	 *         origin=Pose 
	 *         axis=Axis? 
	 *         limit=Limit?
	 *     )
	 * </pre>
	 */
	protected void sequence_Joint(ISerializationContext context, Joint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Limit returns Limit
	 *
	 * Constraint:
	 *     (effort=DOUBLE? lower=DOUBLE? upper=DOUBLE? velocity=DOUBLE?)
	 * </pre>
	 */
	protected void sequence_Limit(ISerializationContext context, Limit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=EString inertial=Inertial? visual=Visual? collision=Collision?)
	 * </pre>
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mass returns Mass
	 *
	 * Constraint:
	 *     value=DOUBLE
	 * </pre>
	 */
	protected void sequence_Mass(ISerializationContext context, Mass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.MASS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.MASS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMassAccess().getValueDOUBLETerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mesh returns Mesh
	 *
	 * Constraint:
	 *     (filename=EString (scale+=DOUBLE scale+=DOUBLE*)?)
	 * </pre>
	 */
	protected void sequence_Mesh(ISerializationContext context, Mesh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parent returns Parent
	 *
	 * Constraint:
	 *     link=EString
	 * </pre>
	 */
	protected void sequence_Parent(ISerializationContext context, Parent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.PARENT__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.PARENT__LINK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentAccess().getLinkEStringParserRuleCall_2_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pose returns Pose
	 *
	 * Constraint:
	 *     ((rpy+=DOUBLE rpy+=DOUBLE*)? (xyz+=DOUBLE xyz+=DOUBLE*)?)
	 * </pre>
	 */
	protected void sequence_Pose(ISerializationContext context, Pose semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sphere returns Sphere
	 *
	 * Constraint:
	 *     radius=Double0
	 * </pre>
	 */
	protected void sequence_Sphere(ISerializationContext context, Sphere semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UrdfPackage.Literals.SPHERE__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UrdfPackage.Literals.SPHERE__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_2_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Visual returns Visual
	 *
	 * Constraint:
	 *     (origin=Pose? geometry=Geometry)
	 * </pre>
	 */
	protected void sequence_Visual(ISerializationContext context, Visual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
