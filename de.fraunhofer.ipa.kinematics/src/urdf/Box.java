/**
 */
package urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Box#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getBox()
 * @model extendedMetaData="name='box' kind='empty'"
 * @generated
 */
public interface Box extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(String)
	 * @see urdf.UrdfPackage#getBox_Size()
	 * @model default="0 0 0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link urdf.Box#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Unsets the value of the '{@link urdf.Box#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link urdf.Box#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	boolean isSetSize();

} // Box
