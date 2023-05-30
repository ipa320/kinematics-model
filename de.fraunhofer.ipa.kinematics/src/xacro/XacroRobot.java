/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.XacroRobot#getName <em>Name</em>}</li>
 *   <li>{@link xacro.XacroRobot#getMacros <em>Macros</em>}</li>
 *   <li>{@link xacro.XacroRobot#getConfiguredMacros <em>Configured Macros</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getXacroRobot()
 * @model
 * @generated
 */
public interface XacroRobot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xacro.XacroPackage#getXacroRobot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xacro.XacroRobot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Macros</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Macro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macros</em>' containment reference list.
	 * @see xacro.XacroPackage#getXacroRobot_Macros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Macro> getMacros();

	/**
	 * Returns the value of the '<em><b>Configured Macros</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.ConfiguredMacro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Macros</em>' containment reference list.
	 * @see xacro.XacroPackage#getXacroRobot_ConfiguredMacros()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredMacro> getConfiguredMacros();

} // XacroRobot
