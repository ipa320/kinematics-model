/**
 */
package kinematics.impl;

import kinematics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KinematicsFactoryImpl extends EFactoryImpl implements KinematicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KinematicsFactory init() {
		try {
			KinematicsFactory theKinematicsFactory = (KinematicsFactory)EPackage.Registry.INSTANCE.getEFactory(KinematicsPackage.eNS_URI);
			if (theKinematicsFactory != null) {
				return theKinematicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KinematicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicsFactoryImpl() {
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
			case KinematicsPackage.LINK: return createLink();
			case KinematicsPackage.JOINT: return createJoint();
			case KinematicsPackage.GEOMETRY: return createGeometry();
			case KinematicsPackage.TRANSLATION: return createTranslation();
			case KinematicsPackage.ROTATION: return createRotation();
			case KinematicsPackage.TRANSFORM: return createTransform();
			case KinematicsPackage.VECTOR3D: return createVector3d();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform createTransform() {
		TransformImpl transform = new TransformImpl();
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3d() {
		Vector3dImpl vector3d = new Vector3dImpl();
		return vector3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicsPackage getKinematicsPackage() {
		return (KinematicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KinematicsPackage getPackage() {
		return KinematicsPackage.eINSTANCE;
	}

} //KinematicsFactoryImpl
