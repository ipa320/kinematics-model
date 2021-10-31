/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Visual#getOrigin <em>Origin</em>}</li>
 *   <li>{@link xacro.Visual#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getVisual()
 * @model
 * @generated
 */
public interface Visual extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see xacro.XacroPackage#getVisual_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link xacro.Visual#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(Geometry)
	 * @see xacro.XacroPackage#getVisual_Geometry()
	 * @model containment="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link xacro.Visual#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

} // Visual
