/*
 * generated by Xtext 2.26.0
 */
package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.internal.InternalKinematicsParser;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class KinematicsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(KinematicsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, KinematicsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComponentAccess().getAlternatives_9(), "rule__Component__Alternatives_9");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_10(), "rule__Component__Alternatives_10");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_11(), "rule__Component__Alternatives_11");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_12(), "rule__Component__Alternatives_12");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_13(), "rule__Component__Alternatives_13");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_14(), "rule__Component__Alternatives_14");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_15(), "rule__Component__Alternatives_15");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_8(), "rule__Component__Group_8__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_9_0(), "rule__Component__Group_9_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_10_0(), "rule__Component__Group_10_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_11_0(), "rule__Component__Group_11_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_12_0(), "rule__Component__Group_12_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_13_0(), "rule__Component__Group_13_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_14_0(), "rule__Component__Group_14_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_15_0(), "rule__Component__Group_15_0__0");
			builder.put(grammarAccess.getConfiguredComponentAccess().getGroup(), "rule__ConfiguredComponent__Group__0");
			builder.put(grammarAccess.getConfiguredComponentAccess().getGroup_6(), "rule__ConfiguredComponent__Group_6__0");
			builder.put(grammarAccess.getGitRepoAccess().getGroup(), "rule__GitRepo__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_8(), "rule__Group__Group_8__0");
			builder.put(grammarAccess.getBaseAttachmentAccess().getGroup(), "rule__BaseAttachment__Group__0");
			builder.put(grammarAccess.getFlangeAttachmentAccess().getGroup(), "rule__FlangeAttachment__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getJointAccess().getGroup(), "rule__Joint__Group__0");
			builder.put(grammarAccess.getJointAccess().getGroup_4(), "rule__Joint__Group_4__0");
			builder.put(grammarAccess.getJointAccess().getGroup_5(), "rule__Joint__Group_5__0");
			builder.put(grammarAccess.getJointAccess().getGroup_6(), "rule__Joint__Group_6__0");
			builder.put(grammarAccess.getJointAccess().getGroup_7(), "rule__Joint__Group_7__0");
			builder.put(grammarAccess.getJointAccess().getGroup_8(), "rule__Joint__Group_8__0");
			builder.put(grammarAccess.getJointAccess().getGroup_9(), "rule__Joint__Group_9__0");
			builder.put(grammarAccess.getParentAccess().getGroup(), "rule__Parent__Group__0");
			builder.put(grammarAccess.getChildAccess().getGroup(), "rule__Child__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3(), "rule__Link__Group_3__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3_1(), "rule__Link__Group_3_1__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3_2(), "rule__Link__Group_3_2__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_3_3(), "rule__Link__Group_3_3__0");
			builder.put(grammarAccess.getPoseAccess().getGroup(), "rule__Pose__Group__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_2(), "rule__Pose__Group_2__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_2_3(), "rule__Pose__Group_2_3__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_3(), "rule__Pose__Group_3__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_3_3(), "rule__Pose__Group_3_3__0");
			builder.put(grammarAccess.getAxisAccess().getGroup(), "rule__Axis__Group__0");
			builder.put(grammarAccess.getAxisAccess().getGroup_2(), "rule__Axis__Group_2__0");
			builder.put(grammarAccess.getLimitAccess().getGroup(), "rule__Limit__Group__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_2(), "rule__Limit__Group_2__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_3(), "rule__Limit__Group_3__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_4(), "rule__Limit__Group_4__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_5(), "rule__Limit__Group_5__0");
			builder.put(grammarAccess.getInertialAccess().getGroup(), "rule__Inertial__Group__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_2(), "rule__Inertial__Group_2__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_3(), "rule__Inertial__Group_3__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_4(), "rule__Inertial__Group_4__0");
			builder.put(grammarAccess.getVisualAccess().getGroup(), "rule__Visual__Group__0");
			builder.put(grammarAccess.getVisualAccess().getGroup_1(), "rule__Visual__Group_1__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup(), "rule__Collision__Group__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup_1(), "rule__Collision__Group_1__0");
			builder.put(grammarAccess.getMassAccess().getGroup(), "rule__Mass__Group__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup(), "rule__Inertia__Group__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_2(), "rule__Inertia__Group_2__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_3(), "rule__Inertia__Group_3__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_4(), "rule__Inertia__Group_4__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_5(), "rule__Inertia__Group_5__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_6(), "rule__Inertia__Group_6__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_7(), "rule__Inertia__Group_7__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup(), "rule__Geometry__Group__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_2(), "rule__Geometry__Group_2__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_3(), "rule__Geometry__Group_3__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_4(), "rule__Geometry__Group_4__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_5(), "rule__Geometry__Group_5__0");
			builder.put(grammarAccess.getBoxAccess().getGroup(), "rule__Box__Group__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup(), "rule__Cylinder__Group__0");
			builder.put(grammarAccess.getSphereAccess().getGroup(), "rule__Sphere__Group__0");
			builder.put(grammarAccess.getMeshAccess().getGroup(), "rule__Mesh__Group__0");
			builder.put(grammarAccess.getMeshAccess().getGroup_3(), "rule__Mesh__Group_3__0");
			builder.put(grammarAccess.getMeshAccess().getGroup_3_3(), "rule__Mesh__Group_3_3__0");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_4(), "rule__Component__NameAssignment_4");
			builder.put(grammarAccess.getComponentAccess().getVersionAssignment_6(), "rule__Component__VersionAssignment_6");
			builder.put(grammarAccess.getComponentAccess().getCategoryAssignment_7_1(), "rule__Component__CategoryAssignment_7_1");
			builder.put(grammarAccess.getComponentAccess().getGitRepoAssignment_8_1(), "rule__Component__GitRepoAssignment_8_1");
			builder.put(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_0_1(), "rule__Component__BaseAttachmentAssignment_9_0_1");
			builder.put(grammarAccess.getComponentAccess().getBaseAttachmentAssignment_9_1(), "rule__Component__BaseAttachmentAssignment_9_1");
			builder.put(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_0_1(), "rule__Component__FlangeAttachmentAssignment_10_0_1");
			builder.put(grammarAccess.getComponentAccess().getFlangeAttachmentAssignment_10_1(), "rule__Component__FlangeAttachmentAssignment_10_1");
			builder.put(grammarAccess.getComponentAccess().getComponentAssignment_11_0_1(), "rule__Component__ComponentAssignment_11_0_1");
			builder.put(grammarAccess.getComponentAccess().getComponentAssignment_11_1(), "rule__Component__ComponentAssignment_11_1");
			builder.put(grammarAccess.getComponentAccess().getConnectionAssignment_12_0_1(), "rule__Component__ConnectionAssignment_12_0_1");
			builder.put(grammarAccess.getComponentAccess().getConnectionAssignment_12_1(), "rule__Component__ConnectionAssignment_12_1");
			builder.put(grammarAccess.getComponentAccess().getGroupAssignment_13_0_1(), "rule__Component__GroupAssignment_13_0_1");
			builder.put(grammarAccess.getComponentAccess().getGroupAssignment_13_1(), "rule__Component__GroupAssignment_13_1");
			builder.put(grammarAccess.getComponentAccess().getLinkAssignment_14_0_1(), "rule__Component__LinkAssignment_14_0_1");
			builder.put(grammarAccess.getComponentAccess().getLinkAssignment_14_1(), "rule__Component__LinkAssignment_14_1");
			builder.put(grammarAccess.getComponentAccess().getJointAssignment_15_0_1(), "rule__Component__JointAssignment_15_0_1");
			builder.put(grammarAccess.getComponentAccess().getJointAssignment_15_1(), "rule__Component__JointAssignment_15_1");
			builder.put(grammarAccess.getConfiguredComponentAccess().getNameAssignment_2(), "rule__ConfiguredComponent__NameAssignment_2");
			builder.put(grammarAccess.getConfiguredComponentAccess().getTypeAssignment_5(), "rule__ConfiguredComponent__TypeAssignment_5");
			builder.put(grammarAccess.getConfiguredComponentAccess().getPrefixAssignment_6_1(), "rule__ConfiguredComponent__PrefixAssignment_6_1");
			builder.put(grammarAccess.getGitRepoAccess().getDistroAssignment_2(), "rule__GitRepo__DistroAssignment_2");
			builder.put(grammarAccess.getGitRepoAccess().getRepoAssignment_4(), "rule__GitRepo__RepoAssignment_4");
			builder.put(grammarAccess.getGitRepoAccess().getBranchAssignment_6(), "rule__GitRepo__BranchAssignment_6");
			builder.put(grammarAccess.getGitRepoAccess().getPackageAssignment_8(), "rule__GitRepo__PackageAssignment_8");
			builder.put(grammarAccess.getGitRepoAccess().getVersionAssignment_10(), "rule__GitRepo__VersionAssignment_10");
			builder.put(grammarAccess.getGroupAccess().getNameAssignment_2(), "rule__Group__NameAssignment_2");
			builder.put(grammarAccess.getGroupAccess().getBaseLinkAssignment_5(), "rule__Group__BaseLinkAssignment_5");
			builder.put(grammarAccess.getGroupAccess().getEndLinkAssignment_7(), "rule__Group__EndLinkAssignment_7");
			builder.put(grammarAccess.getGroupAccess().getRos2_controlAssignment_8_1(), "rule__Group__Ros2_controlAssignment_8_1");
			builder.put(grammarAccess.getBaseAttachmentAccess().getNameAssignment_2(), "rule__BaseAttachment__NameAssignment_2");
			builder.put(grammarAccess.getBaseAttachmentAccess().getOriginAssignment_5(), "rule__BaseAttachment__OriginAssignment_5");
			builder.put(grammarAccess.getBaseAttachmentAccess().getParentAssignment_7(), "rule__BaseAttachment__ParentAssignment_7");
			builder.put(grammarAccess.getFlangeAttachmentAccess().getNameAssignment_2(), "rule__FlangeAttachment__NameAssignment_2");
			builder.put(grammarAccess.getFlangeAttachmentAccess().getOriginAssignment_5(), "rule__FlangeAttachment__OriginAssignment_5");
			builder.put(grammarAccess.getFlangeAttachmentAccess().getParentAssignment_7(), "rule__FlangeAttachment__ParentAssignment_7");
			builder.put(grammarAccess.getConnectionAccess().getNameAssignment_2(), "rule__Connection__NameAssignment_2");
			builder.put(grammarAccess.getConnectionAccess().getBaseAttachmentAssignment_5(), "rule__Connection__BaseAttachmentAssignment_5");
			builder.put(grammarAccess.getConnectionAccess().getFlangeAttachmentAssignment_7(), "rule__Connection__FlangeAttachmentAssignment_7");
			builder.put(grammarAccess.getJointAccess().getNameAssignment_2(), "rule__Joint__NameAssignment_2");
			builder.put(grammarAccess.getJointAccess().getTypeAssignment_4_1(), "rule__Joint__TypeAssignment_4_1");
			builder.put(grammarAccess.getJointAccess().getParentAssignment_5_1(), "rule__Joint__ParentAssignment_5_1");
			builder.put(grammarAccess.getJointAccess().getChildAssignment_6_1(), "rule__Joint__ChildAssignment_6_1");
			builder.put(grammarAccess.getJointAccess().getOriginAssignment_7_1(), "rule__Joint__OriginAssignment_7_1");
			builder.put(grammarAccess.getJointAccess().getAxisAssignment_8_1(), "rule__Joint__AxisAssignment_8_1");
			builder.put(grammarAccess.getJointAccess().getLimitAssignment_9_1(), "rule__Joint__LimitAssignment_9_1");
			builder.put(grammarAccess.getParentAccess().getLinkAssignment_2(), "rule__Parent__LinkAssignment_2");
			builder.put(grammarAccess.getChildAccess().getLinkAssignment_2(), "rule__Child__LinkAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_2(), "rule__Link__NameAssignment_2");
			builder.put(grammarAccess.getLinkAccess().getInertialAssignment_3_1_1(), "rule__Link__InertialAssignment_3_1_1");
			builder.put(grammarAccess.getLinkAccess().getVisualAssignment_3_2_1(), "rule__Link__VisualAssignment_3_2_1");
			builder.put(grammarAccess.getLinkAccess().getCollisionAssignment_3_3_1(), "rule__Link__CollisionAssignment_3_3_1");
			builder.put(grammarAccess.getPoseAccess().getRpyAssignment_2_2(), "rule__Pose__RpyAssignment_2_2");
			builder.put(grammarAccess.getPoseAccess().getRpyAssignment_2_3_1(), "rule__Pose__RpyAssignment_2_3_1");
			builder.put(grammarAccess.getPoseAccess().getXyzAssignment_3_2(), "rule__Pose__XyzAssignment_3_2");
			builder.put(grammarAccess.getPoseAccess().getXyzAssignment_3_3_1(), "rule__Pose__XyzAssignment_3_3_1");
			builder.put(grammarAccess.getAxisAccess().getXyzAssignment_2_1(), "rule__Axis__XyzAssignment_2_1");
			builder.put(grammarAccess.getLimitAccess().getEffortAssignment_2_1(), "rule__Limit__EffortAssignment_2_1");
			builder.put(grammarAccess.getLimitAccess().getLowerAssignment_3_1(), "rule__Limit__LowerAssignment_3_1");
			builder.put(grammarAccess.getLimitAccess().getUpperAssignment_4_1(), "rule__Limit__UpperAssignment_4_1");
			builder.put(grammarAccess.getLimitAccess().getVelocityAssignment_5_1(), "rule__Limit__VelocityAssignment_5_1");
			builder.put(grammarAccess.getInertialAccess().getOriginAssignment_2_1(), "rule__Inertial__OriginAssignment_2_1");
			builder.put(grammarAccess.getInertialAccess().getMassAssignment_3_1(), "rule__Inertial__MassAssignment_3_1");
			builder.put(grammarAccess.getInertialAccess().getInertiaAssignment_4_1(), "rule__Inertial__InertiaAssignment_4_1");
			builder.put(grammarAccess.getVisualAccess().getOriginAssignment_1_1(), "rule__Visual__OriginAssignment_1_1");
			builder.put(grammarAccess.getVisualAccess().getGeometryAssignment_3(), "rule__Visual__GeometryAssignment_3");
			builder.put(grammarAccess.getCollisionAccess().getOriginAssignment_1_1(), "rule__Collision__OriginAssignment_1_1");
			builder.put(grammarAccess.getCollisionAccess().getGeometryAssignment_3(), "rule__Collision__GeometryAssignment_3");
			builder.put(grammarAccess.getMassAccess().getValueAssignment_3(), "rule__Mass__ValueAssignment_3");
			builder.put(grammarAccess.getInertiaAccess().getIxxAssignment_2_1(), "rule__Inertia__IxxAssignment_2_1");
			builder.put(grammarAccess.getInertiaAccess().getIxyAssignment_3_1(), "rule__Inertia__IxyAssignment_3_1");
			builder.put(grammarAccess.getInertiaAccess().getIxzAssignment_4_1(), "rule__Inertia__IxzAssignment_4_1");
			builder.put(grammarAccess.getInertiaAccess().getIyyAssignment_5_1(), "rule__Inertia__IyyAssignment_5_1");
			builder.put(grammarAccess.getInertiaAccess().getIyzAssignment_6_1(), "rule__Inertia__IyzAssignment_6_1");
			builder.put(grammarAccess.getInertiaAccess().getIzzAssignment_7_1(), "rule__Inertia__IzzAssignment_7_1");
			builder.put(grammarAccess.getGeometryAccess().getBoxAssignment_2_1(), "rule__Geometry__BoxAssignment_2_1");
			builder.put(grammarAccess.getGeometryAccess().getCylinderAssignment_3_1(), "rule__Geometry__CylinderAssignment_3_1");
			builder.put(grammarAccess.getGeometryAccess().getSphereAssignment_4_1(), "rule__Geometry__SphereAssignment_4_1");
			builder.put(grammarAccess.getGeometryAccess().getMeshAssignment_5_1(), "rule__Geometry__MeshAssignment_5_1");
			builder.put(grammarAccess.getBoxAccess().getSizeAssignment_3(), "rule__Box__SizeAssignment_3");
			builder.put(grammarAccess.getCylinderAccess().getLengthAssignment_2(), "rule__Cylinder__LengthAssignment_2");
			builder.put(grammarAccess.getCylinderAccess().getRadiusAssignment_4(), "rule__Cylinder__RadiusAssignment_4");
			builder.put(grammarAccess.getSphereAccess().getRadiusAssignment_2(), "rule__Sphere__RadiusAssignment_2");
			builder.put(grammarAccess.getMeshAccess().getFilenameAssignment_2(), "rule__Mesh__FilenameAssignment_2");
			builder.put(grammarAccess.getMeshAccess().getScaleAssignment_3_2(), "rule__Mesh__ScaleAssignment_3_2");
			builder.put(grammarAccess.getMeshAccess().getScaleAssignment_3_3_1(), "rule__Mesh__ScaleAssignment_3_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private KinematicsGrammarAccess grammarAccess;

	@Override
	protected InternalKinematicsParser createParser() {
		InternalKinematicsParser result = new InternalKinematicsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new KinematicsTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KinematicsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KinematicsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
