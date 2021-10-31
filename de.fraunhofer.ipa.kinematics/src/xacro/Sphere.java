/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Sphere#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getSphere()
 * @model
 * @generated
 */
public interface Sphere extends EObject {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see xacro.XacroPackage#getSphere_Radius()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link xacro.Sphere#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // Sphere
