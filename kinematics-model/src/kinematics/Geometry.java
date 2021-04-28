/**
 */
package kinematics;

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
 *   <li>{@link kinematics.Geometry#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' attribute.
	 * @see #setMesh(String)
	 * @see kinematics.KinematicsPackage#getGeometry_Mesh()
	 * @model
	 * @generated
	 */
	String getMesh();

	/**
	 * Sets the value of the '{@link kinematics.Geometry#getMesh <em>Mesh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' attribute.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(String value);

} // Geometry
