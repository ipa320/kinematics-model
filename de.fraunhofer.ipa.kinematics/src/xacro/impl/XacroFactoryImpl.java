/**
 */
package xacro.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xacro.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XacroFactoryImpl extends EFactoryImpl implements XacroFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XacroFactory init() {
		try {
			XacroFactory theXacroFactory = (XacroFactory)EPackage.Registry.INSTANCE.getEFactory(XacroPackage.eNS_URI);
			if (theXacroFactory != null) {
				return theXacroFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XacroFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XacroFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XacroPackage.ROBOT: return createRobot();
			case XacroPackage.PARAMETER: return createParameter();
			case XacroPackage.BODY: return createBody();
			case XacroPackage.MACRO: return createMacro();
			case XacroPackage.MACRO_CALL: return createMacroCall();
			case XacroPackage.PARAMETER_CALL: return createParameterCall();
			case XacroPackage.PARAMETER_STRING: return createParameterString();
			case XacroPackage.LINK: return createLink();
			case XacroPackage.JOINT: return createJoint();
			case XacroPackage.POSE: return createPose();
			case XacroPackage.VISUAL: return createVisual();
			case XacroPackage.COLLISION: return createCollision();
			case XacroPackage.GEOMETRY: return createGeometry();
			case XacroPackage.BOX: return createBox();
			case XacroPackage.CYLINDER: return createCylinder();
			case XacroPackage.VECTOR3: return createVector3();
			case XacroPackage.LIMIT: return createLimit();
			case XacroPackage.MASS: return createMass();
			case XacroPackage.INERTIAL: return createInertial();
			case XacroPackage.INERTIA: return createInertia();
			case XacroPackage.MESH: return createMesh();
			case XacroPackage.SPHERE: return createSphere();
			case XacroPackage.PARAMETER_POSE: return createParameterPose();
			case XacroPackage.PARAMETER_VALUE: return createParameterValue();
			case XacroPackage.PARAMETER_LINK: return createParameterLink();
			case XacroPackage.LINK_REF: return createLinkRef();
			case XacroPackage.PARAMETER_TYPE: return createParameterType();
			case XacroPackage.PARAMETER_POSE_TYPE: return createParameterPoseType();
			case XacroPackage.PARAMETER_STRING_TYPE: return createParameterStringType();
			case XacroPackage.PARAMETER_LINK_REF_TYPE: return createParameterLinkRefType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro createMacro() {
		MacroImpl macro = new MacroImpl();
		return macro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroCall createMacroCall() {
		MacroCallImpl macroCall = new MacroCallImpl();
		return macroCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCall createParameterCall() {
		ParameterCallImpl parameterCall = new ParameterCallImpl();
		return parameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterString createParameterString() {
		ParameterStringImpl parameterString = new ParameterStringImpl();
		return parameterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJoint() {
		JointImpl joint = new JointImpl();
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose createPose() {
		PoseImpl pose = new PoseImpl();
		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual createVisual() {
		VisualImpl visual = new VisualImpl();
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision createCollision() {
		CollisionImpl collision = new CollisionImpl();
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder() {
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3 createVector3() {
		Vector3Impl vector3 = new Vector3Impl();
		return vector3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mass createMass() {
		MassImpl mass = new MassImpl();
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial createInertial() {
		InertialImpl inertial = new InertialImpl();
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertia createInertia() {
		InertiaImpl inertia = new InertiaImpl();
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere() {
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPose createParameterPose() {
		ParameterPoseImpl parameterPose = new ParameterPoseImpl();
		return parameterPose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLink createParameterLink() {
		ParameterLinkImpl parameterLink = new ParameterLinkImpl();
		return parameterLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRef createLinkRef() {
		LinkRefImpl linkRef = new LinkRefImpl();
		return linkRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPoseType createParameterPoseType() {
		ParameterPoseTypeImpl parameterPoseType = new ParameterPoseTypeImpl();
		return parameterPoseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStringType createParameterStringType() {
		ParameterStringTypeImpl parameterStringType = new ParameterStringTypeImpl();
		return parameterStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLinkRefType createParameterLinkRefType() {
		ParameterLinkRefTypeImpl parameterLinkRefType = new ParameterLinkRefTypeImpl();
		return parameterLinkRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XacroPackage getXacroPackage() {
		return (XacroPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XacroPackage getPackage() {
		return XacroPackage.eINSTANCE;
	}

} //XacroFactoryImpl
