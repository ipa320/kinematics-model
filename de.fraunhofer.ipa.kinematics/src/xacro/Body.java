/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import urdf.Joint;
import urdf.Link;
import urdf.MaterialGlobal;

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
 *   <li>{@link xacro.Body#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Joint}.
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
	 * The list contents are of type {@link urdf.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.MaterialGlobal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see xacro.XacroPackage#getBody_Material()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaterialGlobal> getMaterial();

} // Body
