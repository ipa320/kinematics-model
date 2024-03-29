/**
 */
package urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calibration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Calibration#getFalling <em>Falling</em>}</li>
 *   <li>{@link urdf.Calibration#getReferencePosition <em>Reference Position</em>}</li>
 *   <li>{@link urdf.Calibration#getRising <em>Rising</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getCalibration()
 * @model
 * @generated
 */
public interface Calibration extends EObject {
	/**
	 * Returns the value of the '<em><b>Falling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Falling</em>' attribute.
	 * @see #isSetFalling()
	 * @see #unsetFalling()
	 * @see #setFalling(double)
	 * @see urdf.UrdfPackage#getCalibration_Falling()
	 * @model unsettable="true"
	 * @generated
	 */
	double getFalling();

	/**
	 * Sets the value of the '{@link urdf.Calibration#getFalling <em>Falling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Falling</em>' attribute.
	 * @see #isSetFalling()
	 * @see #unsetFalling()
	 * @see #getFalling()
	 * @generated
	 */
	void setFalling(double value);

	/**
	 * Unsets the value of the '{@link urdf.Calibration#getFalling <em>Falling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFalling()
	 * @see #getFalling()
	 * @see #setFalling(double)
	 * @generated
	 */
	void unsetFalling();

	/**
	 * Returns whether the value of the '{@link urdf.Calibration#getFalling <em>Falling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Falling</em>' attribute is set.
	 * @see #unsetFalling()
	 * @see #getFalling()
	 * @see #setFalling(double)
	 * @generated
	 */
	boolean isSetFalling();

	/**
	 * Returns the value of the '<em><b>Reference Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Position</em>' attribute.
	 * @see #isSetReferencePosition()
	 * @see #unsetReferencePosition()
	 * @see #setReferencePosition(double)
	 * @see urdf.UrdfPackage#getCalibration_ReferencePosition()
	 * @model unsettable="true"
	 * @generated
	 */
	double getReferencePosition();

	/**
	 * Sets the value of the '{@link urdf.Calibration#getReferencePosition <em>Reference Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Position</em>' attribute.
	 * @see #isSetReferencePosition()
	 * @see #unsetReferencePosition()
	 * @see #getReferencePosition()
	 * @generated
	 */
	void setReferencePosition(double value);

	/**
	 * Unsets the value of the '{@link urdf.Calibration#getReferencePosition <em>Reference Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencePosition()
	 * @see #getReferencePosition()
	 * @see #setReferencePosition(double)
	 * @generated
	 */
	void unsetReferencePosition();

	/**
	 * Returns whether the value of the '{@link urdf.Calibration#getReferencePosition <em>Reference Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Position</em>' attribute is set.
	 * @see #unsetReferencePosition()
	 * @see #getReferencePosition()
	 * @see #setReferencePosition(double)
	 * @generated
	 */
	boolean isSetReferencePosition();

	/**
	 * Returns the value of the '<em><b>Rising</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rising</em>' attribute.
	 * @see #isSetRising()
	 * @see #unsetRising()
	 * @see #setRising(double)
	 * @see urdf.UrdfPackage#getCalibration_Rising()
	 * @model unsettable="true"
	 * @generated
	 */
	double getRising();

	/**
	 * Sets the value of the '{@link urdf.Calibration#getRising <em>Rising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rising</em>' attribute.
	 * @see #isSetRising()
	 * @see #unsetRising()
	 * @see #getRising()
	 * @generated
	 */
	void setRising(double value);

	/**
	 * Unsets the value of the '{@link urdf.Calibration#getRising <em>Rising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRising()
	 * @see #getRising()
	 * @see #setRising(double)
	 * @generated
	 */
	void unsetRising();

	/**
	 * Returns whether the value of the '{@link urdf.Calibration#getRising <em>Rising</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rising</em>' attribute is set.
	 * @see #unsetRising()
	 * @see #getRising()
	 * @see #setRising(double)
	 * @generated
	 */
	boolean isSetRising();

} // Calibration
