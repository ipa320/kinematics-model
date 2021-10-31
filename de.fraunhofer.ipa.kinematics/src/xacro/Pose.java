/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Pose#getXyz <em>Xyz</em>}</li>
 *   <li>{@link xacro.Pose#getRpy <em>Rpy</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getPose()
 * @model
 * @generated
 */
public interface Pose extends EObject {
	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' containment reference.
	 * @see #setXyz(ParameterValue)
	 * @see xacro.XacroPackage#getPose_Xyz()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterValue getXyz();

	/**
	 * Sets the value of the '{@link xacro.Pose#getXyz <em>Xyz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz</em>' containment reference.
	 * @see #getXyz()
	 * @generated
	 */
	void setXyz(ParameterValue value);

	/**
	 * Returns the value of the '<em><b>Rpy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpy</em>' containment reference.
	 * @see #setRpy(ParameterValue)
	 * @see xacro.XacroPackage#getPose_Rpy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterValue getRpy();

	/**
	 * Sets the value of the '{@link xacro.Pose#getRpy <em>Rpy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpy</em>' containment reference.
	 * @see #getRpy()
	 * @generated
	 */
	void setRpy(ParameterValue value);

} // Pose
