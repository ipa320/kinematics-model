/**
 */
package urdf;

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
 *   <li>{@link urdf.Pose#getRpy <em>Rpy</em>}</li>
 *   <li>{@link urdf.Pose#getXyz <em>Xyz</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getPose()
 * @model extendedMetaData="name='pose' kind='empty'"
 * @generated
 */
public interface Pose extends EObject {
	/**
	 * Returns the value of the '<em><b>Rpy</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpy</em>' attribute.
	 * @see #isSetRpy()
	 * @see #unsetRpy()
	 * @see #setRpy(String)
	 * @see urdf.UrdfPackage#getPose_Rpy()
	 * @model default="0 0 0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rpy'"
	 * @generated
	 */
	String getRpy();

	/**
	 * Sets the value of the '{@link urdf.Pose#getRpy <em>Rpy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpy</em>' attribute.
	 * @see #isSetRpy()
	 * @see #unsetRpy()
	 * @see #getRpy()
	 * @generated
	 */
	void setRpy(String value);

	/**
	 * Unsets the value of the '{@link urdf.Pose#getRpy <em>Rpy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRpy()
	 * @see #getRpy()
	 * @see #setRpy(String)
	 * @generated
	 */
	void unsetRpy();

	/**
	 * Returns whether the value of the '{@link urdf.Pose#getRpy <em>Rpy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rpy</em>' attribute is set.
	 * @see #unsetRpy()
	 * @see #getRpy()
	 * @see #setRpy(String)
	 * @generated
	 */
	boolean isSetRpy();

	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' attribute.
	 * @see #isSetXyz()
	 * @see #unsetXyz()
	 * @see #setXyz(String)
	 * @see urdf.UrdfPackage#getPose_Xyz()
	 * @model default="0 0 0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xyz'"
	 * @generated
	 */
	String getXyz();

	/**
	 * Sets the value of the '{@link urdf.Pose#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz</em>' attribute.
	 * @see #isSetXyz()
	 * @see #unsetXyz()
	 * @see #getXyz()
	 * @generated
	 */
	void setXyz(String value);

	/**
	 * Unsets the value of the '{@link urdf.Pose#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXyz()
	 * @see #getXyz()
	 * @see #setXyz(String)
	 * @generated
	 */
	void unsetXyz();

	/**
	 * Returns whether the value of the '{@link urdf.Pose#getXyz <em>Xyz</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xyz</em>' attribute is set.
	 * @see #unsetXyz()
	 * @see #getXyz()
	 * @see #setXyz(String)
	 * @generated
	 */
	boolean isSetXyz();

} // Pose
