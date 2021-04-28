/**
 */
package kinematics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Transform#getXYZ <em>XYZ</em>}</li>
 *   <li>{@link kinematics.Transform#getRPY <em>RPY</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getTransform()
 * @model
 * @generated
 */
public interface Transform extends EObject {
	/**
	 * Returns the value of the '<em><b>XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XYZ</em>' reference.
	 * @see #setXYZ(Translation)
	 * @see kinematics.KinematicsPackage#getTransform_XYZ()
	 * @model required="true"
	 * @generated
	 */
	Translation getXYZ();

	/**
	 * Sets the value of the '{@link kinematics.Transform#getXYZ <em>XYZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XYZ</em>' reference.
	 * @see #getXYZ()
	 * @generated
	 */
	void setXYZ(Translation value);

	/**
	 * Returns the value of the '<em><b>RPY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RPY</em>' reference.
	 * @see #setRPY(Rotation)
	 * @see kinematics.KinematicsPackage#getTransform_RPY()
	 * @model required="true"
	 * @generated
	 */
	Rotation getRPY();

	/**
	 * Sets the value of the '{@link kinematics.Transform#getRPY <em>RPY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPY</em>' reference.
	 * @see #getRPY()
	 * @generated
	 */
	void setRPY(Rotation value);

} // Transform
