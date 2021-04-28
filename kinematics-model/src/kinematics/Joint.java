/**
 */
package kinematics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Joint#getParent <em>Parent</em>}</li>
 *   <li>{@link kinematics.Joint#getChild <em>Child</em>}</li>
 *   <li>{@link kinematics.Joint#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link kinematics.Joint#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kinematics.Joint#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Link)
	 * @see kinematics.KinematicsPackage#getJoint_Parent()
	 * @model
	 * @generated
	 */
	Link getParent();

	/**
	 * Sets the value of the '{@link kinematics.Joint#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Link value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link kinematics.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see kinematics.KinematicsPackage#getJoint_Child()
	 * @model required="true"
	 * @generated
	 */
	EList<Link> getChild();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see kinematics.KinematicsPackage#getJoint_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link kinematics.Joint#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Transform)
	 * @see kinematics.KinematicsPackage#getJoint_Origin()
	 * @model required="true"
	 * @generated
	 */
	Transform getOrigin();

	/**
	 * Sets the value of the '{@link kinematics.Joint#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Transform value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(Vector3d)
	 * @see kinematics.KinematicsPackage#getJoint_Axis()
	 * @model required="true"
	 * @generated
	 */
	Vector3d getAxis();

	/**
	 * Sets the value of the '{@link kinematics.Joint#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Vector3d value);

} // Joint
