/**
 */
package kinematics;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.robot#getRoot_link <em>Root link</em>}</li>
 *   <li>{@link kinematics.robot#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getrobot()
 * @model
 * @generated
 */
public interface robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Root link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root link</em>' containment reference.
	 * @see #setRoot_link(link)
	 * @see kinematics.KinematicsPackage#getrobot_Root_link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	link getRoot_link();

	/**
	 * Sets the value of the '{@link kinematics.robot#getRoot_link <em>Root link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root link</em>' containment reference.
	 * @see #getRoot_link()
	 * @generated
	 */
	void setRoot_link(link value);

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link kinematics.joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see kinematics.KinematicsPackage#getrobot_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<joint> getJoint();

} // robot
