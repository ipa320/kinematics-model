/**
 */
package xacro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xacro.XacroFactory
 * @model kind="package"
 * @generated
 */
public interface XacroPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xacro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/xacro";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xacro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XacroPackage eINSTANCE = xacro.impl.XacroPackageImpl.init();

	/**
	 * The meta object id for the '{@link xacro.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.RobotImpl
	 * @see xacro.impl.XacroPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MACRO = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__BODY = 3;

	/**
	 * The feature id for the '<em><b>Macro Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MACRO_CALL = 4;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterImpl
	 * @see xacro.impl.XacroPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.BodyImpl
	 * @see xacro.impl.XacroPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 2;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__JOINT = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LINK = 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MacroImpl
	 * @see xacro.impl.XacroPackageImpl#getMacro()
	 * @generated
	 */
	int MACRO = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__BODY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__NAME = 2;

	/**
	 * The number of structural features of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.MacroCallImpl <em>Macro Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MacroCallImpl
	 * @see xacro.impl.XacroPackageImpl#getMacroCall()
	 * @generated
	 */
	int MACRO_CALL = 4;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__MACRO = 0;

	/**
	 * The feature id for the '<em><b>Parameter Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__PARAMETER_CALL = 1;

	/**
	 * The number of structural features of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterCallImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterCall()
	 * @generated
	 */
	int PARAMETER_CALL = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterStringImpl <em>Parameter String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterStringImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterString()
	 * @generated
	 */
	int PARAMETER_STRING = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING__REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.LinkImpl
	 * @see xacro.impl.XacroPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VISUAL = 1;

	/**
	 * The feature id for the '<em><b>Collision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COLLISION = 2;

	/**
	 * The feature id for the '<em><b>Inertial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INERTIAL = 3;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RESOLVED = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.JointImpl <em>Joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.JointImpl
	 * @see xacro.impl.XacroPackageImpl#getJoint()
	 * @generated
	 */
	int JOINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__AXIS = 4;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterValueImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.PoseImpl <em>Pose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.PoseImpl
	 * @see xacro.impl.XacroPackageImpl#getPose()
	 * @generated
	 */
	int POSE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__VALUE = PARAMETER_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Rpy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__RPY = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__XYZ = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xacro.impl.VisualImpl <em>Visual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.VisualImpl
	 * @see xacro.impl.XacroPackageImpl#getVisual()
	 * @generated
	 */
	int VISUAL = 10;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL__GEOMETRY = 1;

	/**
	 * The number of structural features of the '<em>Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.CollisionImpl <em>Collision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.CollisionImpl
	 * @see xacro.impl.XacroPackageImpl#getCollision()
	 * @generated
	 */
	int COLLISION = 11;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__GEOMETRY = 1;

	/**
	 * The number of structural features of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.GeometryImpl
	 * @see xacro.impl.XacroPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 12;

	/**
	 * The feature id for the '<em><b>Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__BOX = 0;

	/**
	 * The feature id for the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__CYLINDER = 1;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__MESH = 2;

	/**
	 * The feature id for the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__SPHERE = 3;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.BoxImpl
	 * @see xacro.impl.XacroPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 13;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.CylinderImpl
	 * @see xacro.impl.XacroPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 14;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__RADIUS = 1;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.Vector3Impl <em>Vector3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.Vector3Impl
	 * @see xacro.impl.XacroPackageImpl#getVector3()
	 * @generated
	 */
	int VECTOR3 = 15;

	/**
	 * The feature id for the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__XYZ = 0;

	/**
	 * The number of structural features of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.LimitImpl
	 * @see xacro.impl.XacroPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 16;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__UPPER = 1;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__EFFORT = 2;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__VELOCITY = 3;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.MassImpl <em>Mass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MassImpl
	 * @see xacro.impl.XacroPackageImpl#getMass()
	 * @generated
	 */
	int MASS = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Mass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.InertialImpl <em>Inertial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.InertialImpl
	 * @see xacro.impl.XacroPackageImpl#getInertial()
	 * @generated
	 */
	int INERTIAL = 18;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__MASS = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__INERTIA = 2;

	/**
	 * The number of structural features of the '<em>Inertial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inertial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.InertiaImpl <em>Inertia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.InertiaImpl
	 * @see xacro.impl.XacroPackageImpl#getInertia()
	 * @generated
	 */
	int INERTIA = 19;

	/**
	 * The feature id for the '<em><b>Ixx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXX = 0;

	/**
	 * The feature id for the '<em><b>Ixy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXY = 1;

	/**
	 * The feature id for the '<em><b>Ixz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXZ = 2;

	/**
	 * The feature id for the '<em><b>Iyy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IYY = 3;

	/**
	 * The feature id for the '<em><b>Iyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IYZ = 4;

	/**
	 * The feature id for the '<em><b>Izz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IZZ = 5;

	/**
	 * The number of structural features of the '<em>Inertia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Inertia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.MeshImpl <em>Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MeshImpl
	 * @see xacro.impl.XacroPackageImpl#getMesh()
	 * @generated
	 */
	int MESH = 20;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__SCALE = 1;

	/**
	 * The number of structural features of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.SphereImpl <em>Sphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.SphereImpl
	 * @see xacro.impl.XacroPackageImpl#getSphere()
	 * @generated
	 */
	int SPHERE = 21;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__RADIUS = 0;

	/**
	 * The number of structural features of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterPoseImpl <em>Parameter Pose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterPoseImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterPose()
	 * @generated
	 */
	int PARAMETER_POSE = 22;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE__REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterLinkImpl <em>Parameter Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterLinkImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterLink()
	 * @generated
	 */
	int PARAMETER_LINK = 24;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK__PARAM = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK__LINK = 1;

	/**
	 * The number of structural features of the '<em>Parameter Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.LinkRefImpl <em>Link Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.LinkRefImpl
	 * @see xacro.impl.XacroPackageImpl#getLinkRef()
	 * @generated
	 */
	int LINK_REF = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__VALUE = PARAMETER_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__REF = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterTypeImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterPoseTypeImpl <em>Parameter Pose Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterPoseTypeImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterPoseType()
	 * @generated
	 */
	int PARAMETER_POSE_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Parameter Pose Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Pose Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_POSE_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterStringTypeImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterStringType()
	 * @generated
	 */
	int PARAMETER_STRING_TYPE = 28;

	/**
	 * The number of structural features of the '<em>Parameter String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterLinkRefTypeImpl <em>Parameter Link Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterLinkRefTypeImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterLinkRefType()
	 * @generated
	 */
	int PARAMETER_LINK_REF_TYPE = 29;

	/**
	 * The number of structural features of the '<em>Parameter Link Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_REF_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Link Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LINK_REF_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link xacro.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see xacro.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Robot#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro</em>'.
	 * @see xacro.Robot#getMacro()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Macro();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Robot#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see xacro.Robot#getVersion()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Version();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Robot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see xacro.Robot#getBody()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Robot#getMacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro Call</em>'.
	 * @see xacro.Robot#getMacroCall()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_MacroCall();

	/**
	 * Returns the meta object for class '{@link xacro.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see xacro.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xacro.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see xacro.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link xacro.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see xacro.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see xacro.Body#getJoint()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Joint();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see xacro.Body#getLink()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Link();

	/**
	 * Returns the meta object for class '{@link xacro.Macro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro</em>'.
	 * @see xacro.Macro
	 * @generated
	 */
	EClass getMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see xacro.Macro#getParameter()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Macro#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see xacro.Macro#getBody()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Body();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Macro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Macro#getName()
	 * @see #getMacro()
	 * @generated
	 */
	EAttribute getMacro_Name();

	/**
	 * Returns the meta object for class '{@link xacro.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Call</em>'.
	 * @see xacro.MacroCall
	 * @generated
	 */
	EClass getMacroCall();

	/**
	 * Returns the meta object for the reference '{@link xacro.MacroCall#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Macro</em>'.
	 * @see xacro.MacroCall#getMacro()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_Macro();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.MacroCall#getParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Call</em>'.
	 * @see xacro.MacroCall#getParameterCall()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_ParameterCall();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see xacro.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterCall#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see xacro.ParameterCall#getParameter()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.ParameterCall#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xacro.ParameterCall#getValue()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Value();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String</em>'.
	 * @see xacro.ParameterString
	 * @generated
	 */
	EClass getParameterString();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterString#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see xacro.ParameterString#getRef()
	 * @see #getParameterString()
	 * @generated
	 */
	EReference getParameterString_Ref();

	/**
	 * Returns the meta object for the attribute '{@link xacro.ParameterString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.ParameterString#getValue()
	 * @see #getParameterString()
	 * @generated
	 */
	EAttribute getParameterString_Value();

	/**
	 * Returns the meta object for class '{@link xacro.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see xacro.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see xacro.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Link#getVisual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visual</em>'.
	 * @see xacro.Link#getVisual()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Visual();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Link#getCollision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collision</em>'.
	 * @see xacro.Link#getCollision()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Collision();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Link#getInertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inertial</em>'.
	 * @see xacro.Link#getInertial()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Inertial();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Link#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see xacro.Link#getResolved()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Resolved();

	/**
	 * Returns the meta object for class '{@link xacro.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint</em>'.
	 * @see xacro.Joint
	 * @generated
	 */
	EClass getJoint();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see xacro.Joint#getName()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see xacro.Joint#getParent()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see xacro.Joint#getChild()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Child();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see xacro.Joint#getOrigin()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis</em>'.
	 * @see xacro.Joint#getAxis()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Axis();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Joint#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see xacro.Joint#getLimit()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Limit();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Joint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see xacro.Joint#getType()
	 * @see #getJoint()
	 * @generated
	 */
	EAttribute getJoint_Type();

	/**
	 * Returns the meta object for class '{@link xacro.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose</em>'.
	 * @see xacro.Pose
	 * @generated
	 */
	EClass getPose();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Pose#getRpy <em>Rpy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpy</em>'.
	 * @see xacro.Pose#getRpy()
	 * @see #getPose()
	 * @generated
	 */
	EAttribute getPose_Rpy();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Pose#getXyz <em>Xyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xyz</em>'.
	 * @see xacro.Pose#getXyz()
	 * @see #getPose()
	 * @generated
	 */
	EAttribute getPose_Xyz();

	/**
	 * Returns the meta object for class '{@link xacro.Visual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual</em>'.
	 * @see xacro.Visual
	 * @generated
	 */
	EClass getVisual();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Visual#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see xacro.Visual#getOrigin()
	 * @see #getVisual()
	 * @generated
	 */
	EReference getVisual_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Visual#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see xacro.Visual#getGeometry()
	 * @see #getVisual()
	 * @generated
	 */
	EReference getVisual_Geometry();

	/**
	 * Returns the meta object for class '{@link xacro.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision</em>'.
	 * @see xacro.Collision
	 * @generated
	 */
	EClass getCollision();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Collision#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see xacro.Collision#getOrigin()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Collision#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see xacro.Collision#getGeometry()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Geometry();

	/**
	 * Returns the meta object for class '{@link xacro.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see xacro.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Geometry#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Box</em>'.
	 * @see xacro.Geometry#getBox()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Box();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Geometry#getCylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cylinder</em>'.
	 * @see xacro.Geometry#getCylinder()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Cylinder();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Geometry#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see xacro.Geometry#getMesh()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Mesh();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Geometry#getSphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sphere</em>'.
	 * @see xacro.Geometry#getSphere()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Sphere();

	/**
	 * Returns the meta object for class '{@link xacro.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see xacro.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Box#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see xacro.Box#getSize()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Size();

	/**
	 * Returns the meta object for class '{@link xacro.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see xacro.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Cylinder#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see xacro.Cylinder#getLength()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_Length();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Cylinder#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see xacro.Cylinder#getRadius()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_Radius();

	/**
	 * Returns the meta object for class '{@link xacro.Vector3 <em>Vector3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3</em>'.
	 * @see xacro.Vector3
	 * @generated
	 */
	EClass getVector3();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Vector3#getXyz <em>Xyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xyz</em>'.
	 * @see xacro.Vector3#getXyz()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_Xyz();

	/**
	 * Returns the meta object for class '{@link xacro.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see xacro.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Limit#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see xacro.Limit#getLower()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Lower();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Limit#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see xacro.Limit#getUpper()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Upper();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Limit#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see xacro.Limit#getEffort()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Effort();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Limit#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see xacro.Limit#getVelocity()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Velocity();

	/**
	 * Returns the meta object for class '{@link xacro.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mass</em>'.
	 * @see xacro.Mass
	 * @generated
	 */
	EClass getMass();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Mass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.Mass#getValue()
	 * @see #getMass()
	 * @generated
	 */
	EAttribute getMass_Value();

	/**
	 * Returns the meta object for class '{@link xacro.Inertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inertial</em>'.
	 * @see xacro.Inertial
	 * @generated
	 */
	EClass getInertial();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Inertial#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mass</em>'.
	 * @see xacro.Inertial#getMass()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Mass();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Inertial#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see xacro.Inertial#getOrigin()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Inertial#getInertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inertia</em>'.
	 * @see xacro.Inertial#getInertia()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Inertia();

	/**
	 * Returns the meta object for class '{@link xacro.Inertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inertia</em>'.
	 * @see xacro.Inertia
	 * @generated
	 */
	EClass getInertia();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIxx <em>Ixx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixx</em>'.
	 * @see xacro.Inertia#getIxx()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixx();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIxy <em>Ixy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixy</em>'.
	 * @see xacro.Inertia#getIxy()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixy();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIxz <em>Ixz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixz</em>'.
	 * @see xacro.Inertia#getIxz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixz();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIyy <em>Iyy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iyy</em>'.
	 * @see xacro.Inertia#getIyy()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Iyy();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIyz <em>Iyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iyz</em>'.
	 * @see xacro.Inertia#getIyz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Iyz();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Inertia#getIzz <em>Izz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Izz</em>'.
	 * @see xacro.Inertia#getIzz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Izz();

	/**
	 * Returns the meta object for class '{@link xacro.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh</em>'.
	 * @see xacro.Mesh
	 * @generated
	 */
	EClass getMesh();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Mesh#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see xacro.Mesh#getFilename()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Filename();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Mesh#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see xacro.Mesh#getScale()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Scale();

	/**
	 * Returns the meta object for class '{@link xacro.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere</em>'.
	 * @see xacro.Sphere
	 * @generated
	 */
	EClass getSphere();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Sphere#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see xacro.Sphere#getRadius()
	 * @see #getSphere()
	 * @generated
	 */
	EAttribute getSphere_Radius();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterPose <em>Parameter Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Pose</em>'.
	 * @see xacro.ParameterPose
	 * @generated
	 */
	EClass getParameterPose();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterPose#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see xacro.ParameterPose#getRef()
	 * @see #getParameterPose()
	 * @generated
	 */
	EReference getParameterPose_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.ParameterPose#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see xacro.ParameterPose#getValue()
	 * @see #getParameterPose()
	 * @generated
	 */
	EReference getParameterPose_Value();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see xacro.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link xacro.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterLink <em>Parameter Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Link</em>'.
	 * @see xacro.ParameterLink
	 * @generated
	 */
	EClass getParameterLink();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterLink#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see xacro.ParameterLink#getParam()
	 * @see #getParameterLink()
	 * @generated
	 */
	EReference getParameterLink_Param();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see xacro.ParameterLink#getLink()
	 * @see #getParameterLink()
	 * @generated
	 */
	EReference getParameterLink_Link();

	/**
	 * Returns the meta object for class '{@link xacro.LinkRef <em>Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Ref</em>'.
	 * @see xacro.LinkRef
	 * @generated
	 */
	EClass getLinkRef();

	/**
	 * Returns the meta object for the reference '{@link xacro.LinkRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see xacro.LinkRef#getRef()
	 * @see #getLinkRef()
	 * @generated
	 */
	EReference getLinkRef_Ref();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see xacro.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterPoseType <em>Parameter Pose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Pose Type</em>'.
	 * @see xacro.ParameterPoseType
	 * @generated
	 */
	EClass getParameterPoseType();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterStringType <em>Parameter String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String Type</em>'.
	 * @see xacro.ParameterStringType
	 * @generated
	 */
	EClass getParameterStringType();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterLinkRefType <em>Parameter Link Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Link Ref Type</em>'.
	 * @see xacro.ParameterLinkRefType
	 * @generated
	 */
	EClass getParameterLinkRefType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XacroFactory getXacroFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xacro.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.RobotImpl
		 * @see xacro.impl.XacroPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MACRO = eINSTANCE.getRobot_Macro();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__VERSION = eINSTANCE.getRobot_Version();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__BODY = eINSTANCE.getRobot_Body();

		/**
		 * The meta object literal for the '<em><b>Macro Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MACRO_CALL = eINSTANCE.getRobot_MacroCall();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterImpl
		 * @see xacro.impl.XacroPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link xacro.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.BodyImpl
		 * @see xacro.impl.XacroPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__JOINT = eINSTANCE.getBody_Joint();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LINK = eINSTANCE.getBody_Link();

		/**
		 * The meta object literal for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MacroImpl
		 * @see xacro.impl.XacroPackageImpl#getMacro()
		 * @generated
		 */
		EClass MACRO = eINSTANCE.getMacro();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__PARAMETER = eINSTANCE.getMacro_Parameter();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__BODY = eINSTANCE.getMacro_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO__NAME = eINSTANCE.getMacro_Name();

		/**
		 * The meta object literal for the '{@link xacro.impl.MacroCallImpl <em>Macro Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MacroCallImpl
		 * @see xacro.impl.XacroPackageImpl#getMacroCall()
		 * @generated
		 */
		EClass MACRO_CALL = eINSTANCE.getMacroCall();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_CALL__MACRO = eINSTANCE.getMacroCall_Macro();

		/**
		 * The meta object literal for the '<em><b>Parameter Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_CALL__PARAMETER_CALL = eINSTANCE.getMacroCall_ParameterCall();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterCallImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterCall()
		 * @generated
		 */
		EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__PARAMETER = eINSTANCE.getParameterCall_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__VALUE = eINSTANCE.getParameterCall_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterStringImpl <em>Parameter String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterStringImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterString()
		 * @generated
		 */
		EClass PARAMETER_STRING = eINSTANCE.getParameterString();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRING__REF = eINSTANCE.getParameterString_Ref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRING__VALUE = eINSTANCE.getParameterString_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.LinkImpl
		 * @see xacro.impl.XacroPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Visual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__VISUAL = eINSTANCE.getLink_Visual();

		/**
		 * The meta object literal for the '<em><b>Collision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__COLLISION = eINSTANCE.getLink_Collision();

		/**
		 * The meta object literal for the '<em><b>Inertial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INERTIAL = eINSTANCE.getLink_Inertial();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__RESOLVED = eINSTANCE.getLink_Resolved();

		/**
		 * The meta object literal for the '{@link xacro.impl.JointImpl <em>Joint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.JointImpl
		 * @see xacro.impl.XacroPackageImpl#getJoint()
		 * @generated
		 */
		EClass JOINT = eINSTANCE.getJoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__NAME = eINSTANCE.getJoint_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__PARENT = eINSTANCE.getJoint_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__CHILD = eINSTANCE.getJoint_Child();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__ORIGIN = eINSTANCE.getJoint_Origin();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__AXIS = eINSTANCE.getJoint_Axis();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__LIMIT = eINSTANCE.getJoint_Limit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__TYPE = eINSTANCE.getJoint_Type();

		/**
		 * The meta object literal for the '{@link xacro.impl.PoseImpl <em>Pose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.PoseImpl
		 * @see xacro.impl.XacroPackageImpl#getPose()
		 * @generated
		 */
		EClass POSE = eINSTANCE.getPose();

		/**
		 * The meta object literal for the '<em><b>Rpy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE__RPY = eINSTANCE.getPose_Rpy();

		/**
		 * The meta object literal for the '<em><b>Xyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE__XYZ = eINSTANCE.getPose_Xyz();

		/**
		 * The meta object literal for the '{@link xacro.impl.VisualImpl <em>Visual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.VisualImpl
		 * @see xacro.impl.XacroPackageImpl#getVisual()
		 * @generated
		 */
		EClass VISUAL = eINSTANCE.getVisual();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL__ORIGIN = eINSTANCE.getVisual_Origin();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL__GEOMETRY = eINSTANCE.getVisual_Geometry();

		/**
		 * The meta object literal for the '{@link xacro.impl.CollisionImpl <em>Collision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.CollisionImpl
		 * @see xacro.impl.XacroPackageImpl#getCollision()
		 * @generated
		 */
		EClass COLLISION = eINSTANCE.getCollision();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__ORIGIN = eINSTANCE.getCollision_Origin();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__GEOMETRY = eINSTANCE.getCollision_Geometry();

		/**
		 * The meta object literal for the '{@link xacro.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.GeometryImpl
		 * @see xacro.impl.XacroPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__BOX = eINSTANCE.getGeometry_Box();

		/**
		 * The meta object literal for the '<em><b>Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__CYLINDER = eINSTANCE.getGeometry_Cylinder();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__MESH = eINSTANCE.getGeometry_Mesh();

		/**
		 * The meta object literal for the '<em><b>Sphere</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__SPHERE = eINSTANCE.getGeometry_Sphere();

		/**
		 * The meta object literal for the '{@link xacro.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.BoxImpl
		 * @see xacro.impl.XacroPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__SIZE = eINSTANCE.getBox_Size();

		/**
		 * The meta object literal for the '{@link xacro.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.CylinderImpl
		 * @see xacro.impl.XacroPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__LENGTH = eINSTANCE.getCylinder_Length();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__RADIUS = eINSTANCE.getCylinder_Radius();

		/**
		 * The meta object literal for the '{@link xacro.impl.Vector3Impl <em>Vector3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.Vector3Impl
		 * @see xacro.impl.XacroPackageImpl#getVector3()
		 * @generated
		 */
		EClass VECTOR3 = eINSTANCE.getVector3();

		/**
		 * The meta object literal for the '<em><b>Xyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__XYZ = eINSTANCE.getVector3_Xyz();

		/**
		 * The meta object literal for the '{@link xacro.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.LimitImpl
		 * @see xacro.impl.XacroPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__LOWER = eINSTANCE.getLimit_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__UPPER = eINSTANCE.getLimit_Upper();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__EFFORT = eINSTANCE.getLimit_Effort();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__VELOCITY = eINSTANCE.getLimit_Velocity();

		/**
		 * The meta object literal for the '{@link xacro.impl.MassImpl <em>Mass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MassImpl
		 * @see xacro.impl.XacroPackageImpl#getMass()
		 * @generated
		 */
		EClass MASS = eINSTANCE.getMass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASS__VALUE = eINSTANCE.getMass_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.InertialImpl <em>Inertial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.InertialImpl
		 * @see xacro.impl.XacroPackageImpl#getInertial()
		 * @generated
		 */
		EClass INERTIAL = eINSTANCE.getInertial();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__MASS = eINSTANCE.getInertial_Mass();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__ORIGIN = eINSTANCE.getInertial_Origin();

		/**
		 * The meta object literal for the '<em><b>Inertia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__INERTIA = eINSTANCE.getInertial_Inertia();

		/**
		 * The meta object literal for the '{@link xacro.impl.InertiaImpl <em>Inertia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.InertiaImpl
		 * @see xacro.impl.XacroPackageImpl#getInertia()
		 * @generated
		 */
		EClass INERTIA = eINSTANCE.getInertia();

		/**
		 * The meta object literal for the '<em><b>Ixx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXX = eINSTANCE.getInertia_Ixx();

		/**
		 * The meta object literal for the '<em><b>Ixy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXY = eINSTANCE.getInertia_Ixy();

		/**
		 * The meta object literal for the '<em><b>Ixz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXZ = eINSTANCE.getInertia_Ixz();

		/**
		 * The meta object literal for the '<em><b>Iyy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IYY = eINSTANCE.getInertia_Iyy();

		/**
		 * The meta object literal for the '<em><b>Iyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IYZ = eINSTANCE.getInertia_Iyz();

		/**
		 * The meta object literal for the '<em><b>Izz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IZZ = eINSTANCE.getInertia_Izz();

		/**
		 * The meta object literal for the '{@link xacro.impl.MeshImpl <em>Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MeshImpl
		 * @see xacro.impl.XacroPackageImpl#getMesh()
		 * @generated
		 */
		EClass MESH = eINSTANCE.getMesh();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__FILENAME = eINSTANCE.getMesh_Filename();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__SCALE = eINSTANCE.getMesh_Scale();

		/**
		 * The meta object literal for the '{@link xacro.impl.SphereImpl <em>Sphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.SphereImpl
		 * @see xacro.impl.XacroPackageImpl#getSphere()
		 * @generated
		 */
		EClass SPHERE = eINSTANCE.getSphere();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE__RADIUS = eINSTANCE.getSphere_Radius();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterPoseImpl <em>Parameter Pose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterPoseImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterPose()
		 * @generated
		 */
		EClass PARAMETER_POSE = eINSTANCE.getParameterPose();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_POSE__REF = eINSTANCE.getParameterPose_Ref();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_POSE__VALUE = eINSTANCE.getParameterPose_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterValueImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterLinkImpl <em>Parameter Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterLinkImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterLink()
		 * @generated
		 */
		EClass PARAMETER_LINK = eINSTANCE.getParameterLink();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LINK__PARAM = eINSTANCE.getParameterLink_Param();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LINK__LINK = eINSTANCE.getParameterLink_Link();

		/**
		 * The meta object literal for the '{@link xacro.impl.LinkRefImpl <em>Link Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.LinkRefImpl
		 * @see xacro.impl.XacroPackageImpl#getLinkRef()
		 * @generated
		 */
		EClass LINK_REF = eINSTANCE.getLinkRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_REF__REF = eINSTANCE.getLinkRef_Ref();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterTypeImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterPoseTypeImpl <em>Parameter Pose Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterPoseTypeImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterPoseType()
		 * @generated
		 */
		EClass PARAMETER_POSE_TYPE = eINSTANCE.getParameterPoseType();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterStringTypeImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterStringType()
		 * @generated
		 */
		EClass PARAMETER_STRING_TYPE = eINSTANCE.getParameterStringType();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterLinkRefTypeImpl <em>Parameter Link Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterLinkRefTypeImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterLinkRefType()
		 * @generated
		 */
		EClass PARAMETER_LINK_REF_TYPE = eINSTANCE.getParameterLinkRefType();

	}

} //XacroPackage
