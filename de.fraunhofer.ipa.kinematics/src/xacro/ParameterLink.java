/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.ParameterLink#getParam <em>Param</em>}</li>
 *   <li>{@link xacro.ParameterLink#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getParameterLink()
 * @model
 * @generated
 */
public interface ParameterLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(Parameter)
	 * @see xacro.XacroPackage#getParameterLink_Param()
	 * @model
	 * @generated
	 */
	Parameter getParam();

	/**
	 * Sets the value of the '{@link xacro.ParameterLink#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(Parameter value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see xacro.XacroPackage#getParameterLink_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link xacro.ParameterLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // ParameterLink
