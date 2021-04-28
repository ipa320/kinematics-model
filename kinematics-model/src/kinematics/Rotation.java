/**
 */
package kinematics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Rotation#getR <em>R</em>}</li>
 *   <li>{@link kinematics.Rotation#getP <em>P</em>}</li>
 *   <li>{@link kinematics.Rotation#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getRotation()
 * @model
 * @generated
 */
public interface Rotation extends EObject {
	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(float)
	 * @see kinematics.KinematicsPackage#getRotation_R()
	 * @model required="true"
	 * @generated
	 */
	float getR();

	/**
	 * Sets the value of the '{@link kinematics.Rotation#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(float value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(float)
	 * @see kinematics.KinematicsPackage#getRotation_P()
	 * @model required="true"
	 * @generated
	 */
	float getP();

	/**
	 * Sets the value of the '{@link kinematics.Rotation#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see kinematics.KinematicsPackage#getRotation_Y()
	 * @model required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link kinematics.Rotation#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // Rotation
