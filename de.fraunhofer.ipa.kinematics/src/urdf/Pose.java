/**
 */
package urdf;

import org.eclipse.emf.common.util.EList;

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
 * @model
 * @generated
 */
public interface Pose extends EObject {
	/**
	 * Returns the value of the '<em><b>Rpy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpy</em>' attribute list.
	 * @see #isSetRpy()
	 * @see #unsetRpy()
	 * @see urdf.UrdfPackage#getPose_Rpy()
	 * @model default="0" unique="false" unsettable="true" upper="3"
	 * @generated
	 */
	EList<Double> getRpy();

	/**
	 * Unsets the value of the '{@link urdf.Pose#getRpy <em>Rpy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRpy()
	 * @see #getRpy()
	 * @generated
	 */
	void unsetRpy();

	/**
	 * Returns whether the value of the '{@link urdf.Pose#getRpy <em>Rpy</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rpy</em>' attribute list is set.
	 * @see #unsetRpy()
	 * @see #getRpy()
	 * @generated
	 */
	boolean isSetRpy();

	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' attribute list.
	 * @see #isSetXyz()
	 * @see #unsetXyz()
	 * @see urdf.UrdfPackage#getPose_Xyz()
	 * @model default="0" unique="false" unsettable="true" upper="3"
	 * @generated
	 */
	EList<Double> getXyz();

	/**
	 * Unsets the value of the '{@link urdf.Pose#getXyz <em>Xyz</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXyz()
	 * @see #getXyz()
	 * @generated
	 */
	void unsetXyz();

	/**
	 * Returns whether the value of the '{@link urdf.Pose#getXyz <em>Xyz</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xyz</em>' attribute list is set.
	 * @see #unsetXyz()
	 * @see #getXyz()
	 * @generated
	 */
	boolean isSetXyz();

} // Pose
