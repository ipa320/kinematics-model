/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Vector3#getXyz <em>Xyz</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getVector3()
 * @model
 * @generated
 */
public interface Vector3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' attribute.
	 * @see #setXyz(String)
	 * @see xacro.XacroPackage#getVector3_Xyz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getXyz();

	/**
	 * Sets the value of the '{@link xacro.Vector3#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz</em>' attribute.
	 * @see #getXyz()
	 * @generated
	 */
	void setXyz(String value);

} // Vector3
