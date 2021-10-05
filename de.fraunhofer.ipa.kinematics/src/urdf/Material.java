/**
 */
package urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Material#getColor <em>Color</em>}</li>
 *   <li>{@link urdf.Material#getTexture <em>Texture</em>}</li>
 *   <li>{@link urdf.Material#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getMaterial()
 * @model extendedMetaData="name='material' kind='elementOnly'"
 * @generated
 */
public interface Material extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Color)
	 * @see urdf.UrdfPackage#getMaterial_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link urdf.Material#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference.
	 * @see #setTexture(Texture)
	 * @see urdf.UrdfPackage#getMaterial_Texture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
	 * @generated
	 */
	Texture getTexture();

	/**
	 * Sets the value of the '{@link urdf.Material#getTexture <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' containment reference.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(Texture value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see urdf.UrdfPackage#getMaterial_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link urdf.Material#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Material
