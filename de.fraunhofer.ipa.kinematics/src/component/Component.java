/**
 */
package component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import urdf.Joint;
import urdf.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Component#getName <em>Name</em>}</li>
 *   <li>{@link component.Component#getVersion <em>Version</em>}</li>
 *   <li>{@link component.Component#getCategory <em>Category</em>}</li>
 *   <li>{@link component.Component#getGitRepo <em>Git Repo</em>}</li>
 *   <li>{@link component.Component#getBaseAttachment <em>Base Attachment</em>}</li>
 *   <li>{@link component.Component#getFlangeAttachment <em>Flange Attachment</em>}</li>
 *   <li>{@link component.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link component.Component#getComponent <em>Component</em>}</li>
 *   <li>{@link component.Component#getConnection <em>Connection</em>}</li>
 *   <li>{@link component.Component#getLink <em>Link</em>}</li>
 *   <li>{@link component.Component#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see component.ComponentPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link component.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see component.ComponentPackage#getComponent_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link component.Component#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see component.ComponentPackage#getComponent_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link component.Component#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Git Repo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git Repo</em>' containment reference.
	 * @see #setGitRepo(GitRepo)
	 * @see component.ComponentPackage#getComponent_GitRepo()
	 * @model containment="true"
	 * @generated
	 */
	GitRepo getGitRepo();

	/**
	 * Sets the value of the '{@link component.Component#getGitRepo <em>Git Repo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git Repo</em>' containment reference.
	 * @see #getGitRepo()
	 * @generated
	 */
	void setGitRepo(GitRepo value);

	/**
	 * Returns the value of the '<em><b>Base Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link component.BaseAttachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Attachment</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_BaseAttachment()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseAttachment> getBaseAttachment();

	/**
	 * Returns the value of the '<em><b>Flange Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link component.FlangeAttachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Attachment</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_FlangeAttachment()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlangeAttachment> getFlangeAttachment();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link component.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link component.ConfiguredComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link component.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see component.ComponentPackage#getComponent_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

} // Component
