/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Geometry#getBox <em>Box</em>}</li>
 *   <li>{@link xacro.Geometry#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link xacro.Geometry#getMesh <em>Mesh</em>}</li>
 *   <li>{@link xacro.Geometry#getSphere <em>Sphere</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' containment reference.
	 * @see #setBox(Box)
	 * @see xacro.XacroPackage#getGeometry_Box()
	 * @model containment="true"
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link xacro.Geometry#getBox <em>Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' containment reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(Cylinder)
	 * @see xacro.XacroPackage#getGeometry_Cylinder()
	 * @model containment="true"
	 * @generated
	 */
	Cylinder getCylinder();

	/**
	 * Sets the value of the '{@link xacro.Geometry#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Cylinder value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(Mesh)
	 * @see xacro.XacroPackage#getGeometry_Mesh()
	 * @model containment="true"
	 * @generated
	 */
	Mesh getMesh();

	/**
	 * Sets the value of the '{@link xacro.Geometry#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(Sphere)
	 * @see xacro.XacroPackage#getGeometry_Sphere()
	 * @model containment="true"
	 * @generated
	 */
	Sphere getSphere();

	/**
	 * Sets the value of the '{@link xacro.Geometry#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Sphere value);

} // Geometry
