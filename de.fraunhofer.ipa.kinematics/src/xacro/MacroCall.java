/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.MacroCall#getMacro <em>Macro</em>}</li>
 *   <li>{@link xacro.MacroCall#getParameterCall <em>Parameter Call</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getMacroCall()
 * @model
 * @generated
 */
public interface MacroCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro</em>' reference.
	 * @see #setMacro(Macro)
	 * @see xacro.XacroPackage#getMacroCall_Macro()
	 * @model required="true"
	 * @generated
	 */
	Macro getMacro();

	/**
	 * Sets the value of the '{@link xacro.MacroCall#getMacro <em>Macro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macro</em>' reference.
	 * @see #getMacro()
	 * @generated
	 */
	void setMacro(Macro value);

	/**
	 * Returns the value of the '<em><b>Parameter Call</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.ParameterCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Call</em>' containment reference list.
	 * @see xacro.XacroPackage#getMacroCall_ParameterCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCall> getParameterCall();

} // MacroCall
