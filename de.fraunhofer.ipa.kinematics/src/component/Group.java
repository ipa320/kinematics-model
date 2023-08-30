/**
 */
package component;

import org.eclipse.emf.ecore.EObject;

import urdf.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Group#getName <em>Name</em>}</li>
 *   <li>{@link component.Group#getRos2_control <em>Ros2 control</em>}</li>
 *   <li>{@link component.Group#getBaseLink <em>Base Link</em>}</li>
 *   <li>{@link component.Group#getEndLink <em>End Link</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see component.ComponentPackage#getGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link component.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ros2 control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros2 control</em>' attribute.
	 * @see #setRos2_control(String)
	 * @see component.ComponentPackage#getGroup_Ros2_control()
	 * @model
	 * @generated
	 */
	String getRos2_control();

	/**
	 * Sets the value of the '{@link component.Group#getRos2_control <em>Ros2 control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros2 control</em>' attribute.
	 * @see #getRos2_control()
	 * @generated
	 */
	void setRos2_control(String value);

	/**
	 * Returns the value of the '<em><b>Base Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Link</em>' reference.
	 * @see #setBaseLink(Link)
	 * @see component.ComponentPackage#getGroup_BaseLink()
	 * @model required="true"
	 * @generated
	 */
	Link getBaseLink();

	/**
	 * Sets the value of the '{@link component.Group#getBaseLink <em>Base Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Link</em>' reference.
	 * @see #getBaseLink()
	 * @generated
	 */
	void setBaseLink(Link value);

	/**
	 * Returns the value of the '<em><b>End Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Link</em>' reference.
	 * @see #setEndLink(Link)
	 * @see component.ComponentPackage#getGroup_EndLink()
	 * @model required="true"
	 * @generated
	 */
	Link getEndLink();

	/**
	 * Sets the value of the '{@link component.Group#getEndLink <em>End Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Link</em>' reference.
	 * @see #getEndLink()
	 * @generated
	 */
	void setEndLink(Link value);

} // Group
