/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Body#getJoints <em>Joints</em>}</li>
 *   <li>{@link xacro.Body#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Joints</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joints</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Joints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Joint> getJoints();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Links()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Body
