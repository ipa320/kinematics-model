/**
 */
package xacro;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xacro.XacroPackage
 * @generated
 */
public interface XacroFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XacroFactory eINSTANCE = xacro.impl.XacroFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro</em>'.
	 * @generated
	 */
	Macro createMacro();

	/**
	 * Returns a new object of class '<em>Configured Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configured Macro</em>'.
	 * @generated
	 */
	ConfiguredMacro createConfiguredMacro();

	/**
	 * Returns a new object of class '<em>Configured Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configured Parameter</em>'.
	 * @generated
	 */
	ConfiguredParameter createConfiguredParameter();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	XacroRobot createXacroRobot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XacroPackage getXacroPackage();

} //XacroFactory
