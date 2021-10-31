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
 *   <li>{@link xacro.Body#getJoint <em>Joint</em>}</li>
 *   <li>{@link xacro.Body#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Body
