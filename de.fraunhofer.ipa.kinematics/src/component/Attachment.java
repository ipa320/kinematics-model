/**
 */
package component;

import org.eclipse.emf.ecore.EObject;

import urdf.Link;
import urdf.Pose;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Attachment#getName <em>Name</em>}</li>
 *   <li>{@link component.Attachment#getOrigin <em>Origin</em>}</li>
 *   <li>{@link component.Attachment#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getAttachment()
 * @model abstract="true"
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see component.ComponentPackage#getAttachment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link component.Attachment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see component.ComponentPackage#getAttachment_Origin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link component.Attachment#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Link)
	 * @see component.ComponentPackage#getAttachment_Parent()
	 * @model required="true"
	 * @generated
	 */
	Link getParent();

	/**
	 * Sets the value of the '{@link component.Attachment#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Link value);

} // Attachment
