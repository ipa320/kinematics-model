/**
 */
package kinematics;

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
 * @see kinematics.KinematicsFactory
 * @model kind="package"
 * @generated
 */
public interface KinematicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kinematics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/kinematics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kinematics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KinematicsPackage eINSTANCE = kinematics.impl.KinematicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link kinematics.impl.robotImpl <em>robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.robotImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getrobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Root link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ROOT_LINK = 0;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__JOINTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ROBOTS = 4;

	/**
	 * The number of structural features of the '<em>robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.LinkImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.JointImpl <em>Joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.JointImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getJoint()
	 * @generated
	 */
	int JOINT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link kinematics.impl.ref_robotImpl <em>ref robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.ref_robotImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getref_robot()
	 * @generated
	 */
	int REF_ROBOT = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ROBOT__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ROBOT__ROBOT = 1;

	/**
	 * The number of structural features of the '<em>ref robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ROBOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ref robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ROBOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kinematics.robot <em>robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>robot</em>'.
	 * @see kinematics.robot
	 * @generated
	 */
	EClass getrobot();

	/**
	 * Returns the meta object for the containment reference '{@link kinematics.robot#getRoot_link <em>Root link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root link</em>'.
	 * @see kinematics.robot#getRoot_link()
	 * @see #getrobot()
	 * @generated
	 */
	EReference getrobot_Root_link();

	/**
	 * Returns the meta object for the containment reference list '{@link kinematics.robot#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joints</em>'.
	 * @see kinematics.robot#getJoints()
	 * @see #getrobot()
	 * @generated
	 */
	EReference getrobot_Joints();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.robot#getName()
	 * @see #getrobot()
	 * @generated
	 */
	EAttribute getrobot_Name();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.robot#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see kinematics.robot#getPrefix()
	 * @see #getrobot()
	 * @generated
	 */
	EAttribute getrobot_Prefix();

	/**
	 * Returns the meta object for the containment reference list '{@link kinematics.robot#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see kinematics.robot#getRobots()
	 * @see #getrobot()
	 * @generated
	 */
	EReference getrobot_Robots();

	/**
	 * Returns the meta object for class '{@link kinematics.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see kinematics.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for class '{@link kinematics.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint</em>'.
	 * @see kinematics.Joint
	 * @generated
	 */
	EClass getJoint();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Joint#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see kinematics.Joint#getParent()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link kinematics.Joint#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see kinematics.Joint#getChild()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Child();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Joint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.Joint#getName()
	 * @see #getJoint()
	 * @generated
	 */
	EAttribute getJoint_Name();

	/**
	 * Returns the meta object for class '{@link kinematics.ref_robot <em>ref robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ref robot</em>'.
	 * @see kinematics.ref_robot
	 * @generated
	 */
	EClass getref_robot();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.ref_robot#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see kinematics.ref_robot#getPrefix()
	 * @see #getref_robot()
	 * @generated
	 */
	EAttribute getref_robot_Prefix();

	/**
	 * Returns the meta object for the reference '{@link kinematics.ref_robot#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Robot</em>'.
	 * @see kinematics.ref_robot#getRobot()
	 * @see #getref_robot()
	 * @generated
	 */
	EReference getref_robot_Robot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KinematicsFactory getKinematicsFactory();

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
		 * The meta object literal for the '{@link kinematics.impl.robotImpl <em>robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.robotImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getrobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getrobot();

		/**
		 * The meta object literal for the '<em><b>Root link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ROOT_LINK = eINSTANCE.getrobot_Root_link();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__JOINTS = eINSTANCE.getrobot_Joints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getrobot_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__PREFIX = eINSTANCE.getrobot_Prefix();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ROBOTS = eINSTANCE.getrobot_Robots();

		/**
		 * The meta object literal for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.LinkImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '{@link kinematics.impl.JointImpl <em>Joint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.JointImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getJoint()
		 * @generated
		 */
		EClass JOINT = eINSTANCE.getJoint();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__NAME = eINSTANCE.getJoint_Name();

		/**
		 * The meta object literal for the '{@link kinematics.impl.ref_robotImpl <em>ref robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.ref_robotImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getref_robot()
		 * @generated
		 */
		EClass REF_ROBOT = eINSTANCE.getref_robot();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_ROBOT__PREFIX = eINSTANCE.getref_robot_Prefix();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ROBOT__ROBOT = eINSTANCE.getref_robot_Robot();

	}

} //KinematicsPackage
