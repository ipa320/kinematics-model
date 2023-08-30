/**
 */
package component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Connection#getName <em>Name</em>}</li>
 *   <li>{@link component.Connection#getBaseAttachment <em>Base Attachment</em>}</li>
 *   <li>{@link component.Connection#getFlangeAttachment <em>Flange Attachment</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see component.ComponentPackage#getConnection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link component.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Attachment</em>' reference.
	 * @see #setBaseAttachment(BaseAttachment)
	 * @see component.ComponentPackage#getConnection_BaseAttachment()
	 * @model required="true"
	 * @generated
	 */
	BaseAttachment getBaseAttachment();

	/**
	 * Sets the value of the '{@link component.Connection#getBaseAttachment <em>Base Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Attachment</em>' reference.
	 * @see #getBaseAttachment()
	 * @generated
	 */
	void setBaseAttachment(BaseAttachment value);

	/**
	 * Returns the value of the '<em><b>Flange Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Attachment</em>' reference.
	 * @see #setFlangeAttachment(FlangeAttachment)
	 * @see component.ComponentPackage#getConnection_FlangeAttachment()
	 * @model required="true"
	 * @generated
	 */
	FlangeAttachment getFlangeAttachment();

	/**
	 * Sets the value of the '{@link component.Connection#getFlangeAttachment <em>Flange Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Attachment</em>' reference.
	 * @see #getFlangeAttachment()
	 * @generated
	 */
	void setFlangeAttachment(FlangeAttachment value);

} // Connection
