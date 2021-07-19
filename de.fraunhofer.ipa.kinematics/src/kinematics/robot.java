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
 *   <li>{@link kinematics.robot#getJoints <em>Joints</em>}</li>
 *   <li>{@link kinematics.robot#getName <em>Name</em>}</li>
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
	 * @see #setRoot_link(Link)
	 * @see kinematics.KinematicsPackage#getrobot_Root_link()
	 * @model containment="true"
	 * @generated
	 */
	Link getRoot_link();

	/**
	 * Sets the value of the '{@link kinematics.robot#getRoot_link <em>Root link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root link</em>' containment reference.
	 * @see #getRoot_link()
	 * @generated
	 */
	void setRoot_link(Link value);

	/**
	 * Returns the value of the '<em><b>Joints</b></em>' containment reference list.
	 * The list contents are of type {@link kinematics.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joints</em>' containment reference list.
	 * @see kinematics.KinematicsPackage#getrobot_Joints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoints();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kinematics.KinematicsPackage#getrobot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kinematics.robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // robot
