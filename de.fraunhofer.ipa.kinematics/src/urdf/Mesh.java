/**
 */
package urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Mesh#getFilename <em>Filename</em>}</li>
 *   <li>{@link urdf.Mesh#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getMesh()
 * @model
 * @generated
 */
public interface Mesh extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see urdf.UrdfPackage#getMesh_Filename()
	 * @model required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link urdf.Mesh#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute list.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see urdf.UrdfPackage#getMesh_Scale()
	 * @model default="1" unique="false" unsettable="true" upper="3"
	 * @generated
	 */
	EList<Double> getScale();

	/**
	 * Unsets the value of the '{@link urdf.Mesh#getScale <em>Scale</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link urdf.Mesh#getScale <em>Scale</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute list is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	boolean isSetScale();

} // Mesh
