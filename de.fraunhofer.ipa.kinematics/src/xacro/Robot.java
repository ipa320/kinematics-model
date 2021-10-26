/**
 */
package xacro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Robot#getName <em>Name</em>}</li>
 *   <li>{@link xacro.Robot#getMacro <em>Macro</em>}</li>
 *   <li>{@link xacro.Robot#getVersion <em>Version</em>}</li>
 *   <li>{@link xacro.Robot#getBody <em>Body</em>}</li>
 *   <li>{@link xacro.Robot#getMacroCall <em>Macro Call</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xacro.XacroPackage#getRobot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xacro.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Macro</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.Macro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro</em>' containment reference list.
	 * @see xacro.XacroPackage#getRobot_Macro()
	 * @model containment="true"
	 * @generated
	 */
	EList<Macro> getMacro();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see xacro.XacroPackage#getRobot_Version()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link xacro.Robot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see xacro.XacroPackage#getRobot_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link xacro.Robot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Macro Call</b></em>' containment reference list.
	 * The list contents are of type {@link xacro.MacroCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Call</em>' containment reference list.
	 * @see xacro.XacroPackage#getRobot_MacroCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<MacroCall> getMacroCall();

} // Robot
