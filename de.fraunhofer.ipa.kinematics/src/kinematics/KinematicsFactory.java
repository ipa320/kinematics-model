/**
 */
package kinematics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kinematics.KinematicsPackage
 * @generated
 */
public interface KinematicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KinematicsFactory eINSTANCE = kinematics.impl.KinematicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>robot</em>'.
	 * @generated
	 */
	robot createrobot();

	/**
	 * Returns a new object of class '<em>link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>link</em>'.
	 * @generated
	 */
	link createlink();

	/**
	 * Returns a new object of class '<em>joint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>joint</em>'.
	 * @generated
	 */
	joint createjoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KinematicsPackage getKinematicsPackage();

} //KinematicsFactory
