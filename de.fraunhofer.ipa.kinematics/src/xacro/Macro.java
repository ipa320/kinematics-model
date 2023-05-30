/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import urdf.Joint;
import urdf.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Macro#getName <em>Name</em>}</li>
 *   <li>{@link xacro.Macro#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xacro.Macro#getConfiguredMacros <em>Configured Macros</em>}</li>
 *   <li>{@link xacro.Macro#getLink <em>Link</em>}</li>
 *   <li>{@link xacro.Macro#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getMacro()
 * @model
 * @generated
 */
public interface Macro extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xacro.XacroPackage#getMacro_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xacro.Macro#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see xacro.XacroPackage#getMacro_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Configured Macros</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.ConfiguredMacro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Macros</em>' containment reference list.
	 * @see xacro.XacroPackage#getMacro_ConfiguredMacros()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredMacro> getConfiguredMacros();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see xacro.XacroPackage#getMacro_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see xacro.XacroPackage#getMacro_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

} // Macro
