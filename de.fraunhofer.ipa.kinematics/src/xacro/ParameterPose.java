/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Pose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.ParameterPose#getRef <em>Ref</em>}</li>
 *   <li>{@link xacro.ParameterPose#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getParameterPose()
 * @model
 * @generated
 */
public interface ParameterPose extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Parameter)
	 * @see xacro.XacroPackage#getParameterPose_Ref()
	 * @model
	 * @generated
	 */
	Parameter getRef();

	/**
	 * Sets the value of the '{@link xacro.ParameterPose#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Pose)
	 * @see xacro.XacroPackage#getParameterPose_Value()
	 * @model containment="true"
	 * @generated
	 */
	Pose getValue();

	/**
	 * Sets the value of the '{@link xacro.ParameterPose#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Pose value);

} // ParameterPose
