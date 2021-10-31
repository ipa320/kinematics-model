/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Box#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(ParameterValue)
	 * @see xacro.XacroPackage#getBox_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterValue getSize();

	/**
	 * Sets the value of the '{@link xacro.Box#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(ParameterValue value);

} // Box
