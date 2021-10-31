/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;
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
import xacro.Body;
import xacro.Box;
import xacro.Collision;
import xacro.Cylinder;
import xacro.Geometry;
import xacro.Inertia;
import xacro.Inertial;
import xacro.Joint;
import xacro.Limit;
import xacro.Link;
import xacro.Macro;
import xacro.MacroCall;
import xacro.Mass;
import xacro.Mesh;
import xacro.ParameterCall;
import xacro.ParameterValue;
import xacro.Pose;
import xacro.Robot;
import xacro.Sphere;
import xacro.Vector3;
import xacro.Visual;
import xacro.XacroPackage;

@SuppressWarnings("all")
public class XacroSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XacroGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XacroPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XacroPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case XacroPackage.BOX:
				sequence_Box(context, (Box) semanticObject); 
				return; 
			case XacroPackage.COLLISION:
				sequence_Collision(context, (Collision) semanticObject); 
				return; 
			case XacroPackage.CYLINDER:
				sequence_Cylinder(context, (Cylinder) semanticObject); 
				return; 
			case XacroPackage.GEOMETRY:
				sequence_Geometry(context, (Geometry) semanticObject); 
				return; 
			case XacroPackage.INERTIA:
				sequence_Inertia(context, (Inertia) semanticObject); 
				return; 
			case XacroPackage.INERTIAL:
				sequence_Inertial(context, (Inertial) semanticObject); 
				return; 
			case XacroPackage.JOINT:
				sequence_Joint(context, (Joint) semanticObject); 
				return; 
			case XacroPackage.LIMIT:
				sequence_Limit(context, (Limit) semanticObject); 
				return; 
			case XacroPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case XacroPackage.MACRO:
				sequence_Macro(context, (Macro) semanticObject); 
				return; 
			case XacroPackage.MACRO_CALL:
				sequence_MacroCall(context, (MacroCall) semanticObject); 
				return; 
			case XacroPackage.MASS:
				sequence_Mass(context, (Mass) semanticObject); 
				return; 
			case XacroPackage.MESH:
				sequence_Mesh(context, (Mesh) semanticObject); 
				return; 
			case XacroPackage.PARAMETER:
				sequence_Parameter(context, (xacro.Parameter) semanticObject); 
				return; 
			case XacroPackage.PARAMETER_CALL:
				sequence_ParameterCall(context, (ParameterCall) semanticObject); 
				return; 
			case XacroPackage.PARAMETER_VALUE:
				sequence_ParameterValue(context, (ParameterValue) semanticObject); 
				return; 
			case XacroPackage.POSE:
				sequence_Pose(context, (Pose) semanticObject); 
				return; 
			case XacroPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case XacroPackage.SPHERE:
				sequence_Sphere(context, (Sphere) semanticObject); 
				return; 
			case XacroPackage.VECTOR3:
				sequence_Vector3(context, (Vector3) semanticObject); 
				return; 
			case XacroPackage.VISUAL:
				sequence_Visual(context, (Visual) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     ((link+=Link link+=Link*)? (joint+=Joint joint+=Joint*)?)
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Box returns Box
	 *
	 * Constraint:
	 *     size=ParameterValue?
	 */
	protected void sequence_Box(ISerializationContext context, Box semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Collision returns Collision
	 *
	 * Constraint:
	 *     (origin=Pose? geometry=Geometry)
	 */
	protected void sequence_Collision(ISerializationContext context, Collision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cylinder returns Cylinder
	 *
	 * Constraint:
	 *     (length=Double0 radius=Double0)
	 */
	protected void sequence_Cylinder(ISerializationContext context, Cylinder semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XacroPackage.Literals.CYLINDER__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XacroPackage.Literals.CYLINDER__LENGTH));
			if (transientValues.isValueTransient(semanticObject, XacroPackage.Literals.CYLINDER__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XacroPackage.Literals.CYLINDER__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCylinderAccess().getLengthDouble0ParserRuleCall_3_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getCylinderAccess().getRadiusDouble0ParserRuleCall_5_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Geometry returns Geometry
	 *
	 * Constraint:
	 *     (box=Box? cylinder=Cylinder? sphere=Sphere? mesh=Mesh?)
	 */
	protected void sequence_Geometry(ISerializationContext context, Geometry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inertia returns Inertia
	 *
	 * Constraint:
	 *     (
	 *         ixx=Double0? 
	 *         ixy=Double0? 
	 *         ixz=Double0? 
	 *         iyy=Double0? 
	 *         iyz=Double0? 
	 *         izz=Double0?
	 *     )
	 */
	protected void sequence_Inertia(ISerializationContext context, Inertia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inertial returns Inertial
	 *
	 * Constraint:
	 *     (origin=Pose? mass=Mass? inertia=Inertia?)
	 */
	protected void sequence_Inertial(ISerializationContext context, Inertial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Joint returns Joint
	 *
	 * Constraint:
	 *     (
	 *         name=ParameterValue 
	 *         type=JOINTTYPE 
	 *         parent=[Link|STRING] 
	 *         child=[Link|STRING] 
	 *         origin=Pose? 
	 *         axis=Vector3? 
	 *         limit=Limit?
	 *     )
	 */
	protected void sequence_Joint(ISerializationContext context, Joint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Limit returns Limit
	 *
	 * Constraint:
	 *     (effort=Double0? lower=Double0? upper=Double0? velocity=Double0?)
	 */
	protected void sequence_Limit(ISerializationContext context, Limit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (name=ParameterValue inertial=Inertial? visual=Visual? collision=Collision?)
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MacroCall returns MacroCall
	 *
	 * Constraint:
	 *     (macro=[Macro|ID] (parameterCall+=ParameterCall parameterCall+=ParameterCall*)?)
	 */
	protected void sequence_MacroCall(ISerializationContext context, MacroCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Macro returns Macro
	 *
	 * Constraint:
	 *     (name=ID (parameter+=Parameter parameter+=Parameter*)? body=Body?)
	 */
	protected void sequence_Macro(ISerializationContext context, Macro semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mass returns Mass
	 *
	 * Constraint:
	 *     value=Double0?
	 */
	protected void sequence_Mass(ISerializationContext context, Mass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mesh returns Mesh
	 *
	 * Constraint:
	 *     (filename=AnyURI scale=Double0?)
	 */
	protected void sequence_Mesh(ISerializationContext context, Mesh semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterCall returns ParameterCall
	 *
	 * Constraint:
	 *     (parameter=[Parameter|ID] value=STRING)
	 */
	protected void sequence_ParameterCall(ISerializationContext context, ParameterCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XacroPackage.Literals.PARAMETER_CALL__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XacroPackage.Literals.PARAMETER_CALL__PARAMETER));
			if (transientValues.isValueTransient(semanticObject, XacroPackage.Literals.PARAMETER_CALL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XacroPackage.Literals.PARAMETER_CALL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterCallAccess().getParameterParameterIDTerminalRuleCall_4_0_1(), semanticObject.eGet(XacroPackage.Literals.PARAMETER_CALL__PARAMETER, false));
		feeder.accept(grammarAccess.getParameterCallAccess().getValueSTRINGTerminalRuleCall_6_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterValue
	 *
	 * Constraint:
	 *     (ref=[Parameter|STRING] | value=ID)
	 */
	protected void sequence_ParameterValue(ISerializationContext context, ParameterValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID value=STRING?)
	 */
	protected void sequence_Parameter(ISerializationContext context, xacro.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pose returns Pose
	 *
	 * Constraint:
	 *     (rpy=ParameterValue? xyz=ParameterValue?)
	 */
	protected void sequence_Pose(ISerializationContext context, Pose semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (name=ID version=STRING? (macro+=Macro macro+=Macro*)? (macroCall+=MacroCall macroCall+=MacroCall*)? body=Body?)
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sphere returns Sphere
	 *
	 * Constraint:
	 *     radius=Double0
	 */
	protected void sequence_Sphere(ISerializationContext context, Sphere semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XacroPackage.Literals.SPHERE__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XacroPackage.Literals.SPHERE__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSphereAccess().getRadiusDouble0ParserRuleCall_3_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vector3 returns Vector3
	 *
	 * Constraint:
	 *     xyz=STRING?
	 */
	protected void sequence_Vector3(ISerializationContext context, Vector3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Visual returns Visual
	 *
	 * Constraint:
	 *     (origin=Pose? geometry=Geometry)
	 */
	protected void sequence_Visual(ISerializationContext context, Visual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
