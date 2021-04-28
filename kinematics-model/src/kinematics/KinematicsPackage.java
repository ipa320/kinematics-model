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
	String eNS_URI = "http://www.example.org/kinematics";

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
	 * The meta object id for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.LinkImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Visual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VISUAL = 0;

	/**
	 * The feature id for the '<em><b>Collision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COLLISION = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

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
	int JOINT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__AXIS = 4;

	/**
	 * The number of structural features of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.GeometryImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 2;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__MESH = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.TranslationImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__Z = 2;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.RotationImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__R = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__P = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__Y = 2;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.TransformImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 5;

	/**
	 * The feature id for the '<em><b>XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__XYZ = 0;

	/**
	 * The feature id for the '<em><b>RPY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__RPY = 1;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.Vector3dImpl <em>Vector3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.Vector3dImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vector3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3D_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link kinematics.Link#getVisual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual</em>'.
	 * @see kinematics.Link#getVisual()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Visual();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Link#getCollision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collision</em>'.
	 * @see kinematics.Link#getCollision()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Collision();

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
	 * Returns the meta object for the reference list '{@link kinematics.Joint#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see kinematics.Joint#getChild()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Child();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Joint#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see kinematics.Joint#getPrefix()
	 * @see #getJoint()
	 * @generated
	 */
	EAttribute getJoint_Prefix();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Joint#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see kinematics.Joint#getOrigin()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Origin();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Joint#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Axis</em>'.
	 * @see kinematics.Joint#getAxis()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Axis();

	/**
	 * Returns the meta object for class '{@link kinematics.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see kinematics.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Geometry#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mesh</em>'.
	 * @see kinematics.Geometry#getMesh()
	 * @see #getGeometry()
	 * @generated
	 */
	EAttribute getGeometry_Mesh();

	/**
	 * Returns the meta object for class '{@link kinematics.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see kinematics.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Translation#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see kinematics.Translation#getX()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_X();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Translation#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see kinematics.Translation#getY()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Y();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Translation#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see kinematics.Translation#getZ()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Z();

	/**
	 * Returns the meta object for class '{@link kinematics.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see kinematics.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Rotation#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see kinematics.Rotation#getR()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_R();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Rotation#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see kinematics.Rotation#getP()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_P();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Rotation#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see kinematics.Rotation#getY()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Y();

	/**
	 * Returns the meta object for class '{@link kinematics.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see kinematics.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Transform#getXYZ <em>XYZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XYZ</em>'.
	 * @see kinematics.Transform#getXYZ()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_XYZ();

	/**
	 * Returns the meta object for the reference '{@link kinematics.Transform#getRPY <em>RPY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RPY</em>'.
	 * @see kinematics.Transform#getRPY()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_RPY();

	/**
	 * Returns the meta object for class '{@link kinematics.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3d</em>'.
	 * @see kinematics.Vector3d
	 * @generated
	 */
	EClass getVector3d();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Vector3d#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see kinematics.Vector3d#getX()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_X();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Vector3d#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see kinematics.Vector3d#getY()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_Y();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.Vector3d#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see kinematics.Vector3d#getZ()
	 * @see #getVector3d()
	 * @generated
	 */
	EAttribute getVector3d_Z();

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
		 * The meta object literal for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.LinkImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Visual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__VISUAL = eINSTANCE.getLink_Visual();

		/**
		 * The meta object literal for the '<em><b>Collision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__COLLISION = eINSTANCE.getLink_Collision();

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
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__CHILD = eINSTANCE.getJoint_Child();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__PREFIX = eINSTANCE.getJoint_Prefix();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__ORIGIN = eINSTANCE.getJoint_Origin();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__AXIS = eINSTANCE.getJoint_Axis();

		/**
		 * The meta object literal for the '{@link kinematics.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.GeometryImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY__MESH = eINSTANCE.getGeometry_Mesh();

		/**
		 * The meta object literal for the '{@link kinematics.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.TranslationImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__X = eINSTANCE.getTranslation_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__Y = eINSTANCE.getTranslation_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__Z = eINSTANCE.getTranslation_Z();

		/**
		 * The meta object literal for the '{@link kinematics.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.RotationImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__R = eINSTANCE.getRotation_R();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__P = eINSTANCE.getRotation_P();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__Y = eINSTANCE.getRotation_Y();

		/**
		 * The meta object literal for the '{@link kinematics.impl.TransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.TransformImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '<em><b>XYZ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__XYZ = eINSTANCE.getTransform_XYZ();

		/**
		 * The meta object literal for the '<em><b>RPY</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__RPY = eINSTANCE.getTransform_RPY();

		/**
		 * The meta object literal for the '{@link kinematics.impl.Vector3dImpl <em>Vector3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.Vector3dImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getVector3d()
		 * @generated
		 */
		EClass VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__X = eINSTANCE.getVector3d_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__Y = eINSTANCE.getVector3d_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3D__Z = eINSTANCE.getVector3d_Z();

	}

} //KinematicsPackage
