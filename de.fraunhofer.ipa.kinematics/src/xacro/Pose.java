/**
 */
package xacro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Pose#getRpy <em>Rpy</em>}</li>
 *   <li>{@link xacro.Pose#getXyz <em>Xyz</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getPose()
 * @model
 * @generated
 */
public interface Pose extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Rpy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpy</em>' attribute.
	 * @see #setRpy(String)
	 * @see xacro.XacroPackage#getPose_Rpy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRpy();

	/**
	 * Sets the value of the '{@link xacro.Pose#getRpy <em>Rpy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpy</em>' attribute.
	 * @see #getRpy()
	 * @generated
	 */
	void setRpy(String value);

	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' attribute.
	 * @see #setXyz(String)
	 * @see xacro.XacroPackage#getPose_Xyz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getXyz();

	/**
	 * Sets the value of the '{@link xacro.Pose#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz</em>' attribute.
	 * @see #getXyz()
	 * @generated
	 */
	void setXyz(String value);

} // Pose
