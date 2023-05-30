/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.ConfiguredMacro#getMacro <em>Macro</em>}</li>
 *   <li>{@link xacro.ConfiguredMacro#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getConfiguredMacro()
 * @model
 * @generated
 */
public interface ConfiguredMacro extends EObject {
	/**
	 * Returns the value of the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro</em>' reference.
	 * @see #setMacro(Macro)
	 * @see xacro.XacroPackage#getConfiguredMacro_Macro()
	 * @model required="true"
	 * @generated
	 */
	Macro getMacro();

	/**
	 * Sets the value of the '{@link xacro.ConfiguredMacro#getMacro <em>Macro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro</em>' reference.
	 * @see #getMacro()
	 * @generated
	 */
	void setMacro(Macro value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.ConfiguredParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see xacro.XacroPackage#getConfiguredMacro_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredParameter> getParameters();

} // ConfiguredMacro
