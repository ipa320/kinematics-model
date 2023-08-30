/**
 */
package urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Cylinder#getLength <em>Length</em>}</li>
 *   <li>{@link urdf.Cylinder#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getCylinder()
 * @model
 * @generated
 */
public interface Cylinder extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(String)
	 * @see urdf.UrdfPackage#getCylinder_Length()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link urdf.Cylinder#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Unsets the value of the '{@link urdf.Cylinder#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(String)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link urdf.Cylinder#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(String)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(String)
	 * @see urdf.UrdfPackage#getCylinder_Radius()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getRadius();

	/**
	 * Sets the value of the '{@link urdf.Cylinder#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(String value);

	/**
	 * Unsets the value of the '{@link urdf.Cylinder#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(String)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link urdf.Cylinder#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(String)
	 * @generated
	 */
	boolean isSetRadius();

} // Cylinder
