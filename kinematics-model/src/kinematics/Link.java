/**
 */
package kinematics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Link#getVisual <em>Visual</em>}</li>
 *   <li>{@link kinematics.Link#getCollision <em>Collision</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Visual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual</em>' reference.
	 * @see #setVisual(Geometry)
	 * @see kinematics.KinematicsPackage#getLink_Visual()
	 * @model
	 * @generated
	 */
	Geometry getVisual();

	/**
	 * Sets the value of the '{@link kinematics.Link#getVisual <em>Visual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual</em>' reference.
	 * @see #getVisual()
	 * @generated
	 */
	void setVisual(Geometry value);

	/**
	 * Returns the value of the '<em><b>Collision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision</em>' reference.
	 * @see #setCollision(Geometry)
	 * @see kinematics.KinematicsPackage#getLink_Collision()
	 * @model
	 * @generated
	 */
	Geometry getCollision();

	/**
	 * Sets the value of the '{@link kinematics.Link#getCollision <em>Collision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision</em>' reference.
	 * @see #getCollision()
	 * @generated
	 */
	void setCollision(Geometry value);

} // Link
