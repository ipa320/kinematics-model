/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Joint#getName <em>Name</em>}</li>
 *   <li>{@link xacro.Joint#getParent <em>Parent</em>}</li>
 *   <li>{@link xacro.Joint#getChild <em>Child</em>}</li>
 *   <li>{@link xacro.Joint#getOrigin <em>Origin</em>}</li>
 *   <li>{@link xacro.Joint#getAxis <em>Axis</em>}</li>
 *   <li>{@link xacro.Joint#getLimit <em>Limit</em>}</li>
 *   <li>{@link xacro.Joint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ParameterString)
	 * @see xacro.XacroPackage#getJoint_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterString getName();

	/**
	 * Sets the value of the '{@link xacro.Joint#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ParameterString value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(ParameterLink)
	 * @see xacro.XacroPackage#getJoint_Parent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterLink getParent();

	/**
	 * Sets the value of the '{@link xacro.Joint#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ParameterLink value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(ParameterLink)
	 * @see xacro.XacroPackage#getJoint_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterLink getChild();

	/**
	 * Sets the value of the '{@link xacro.Joint#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(ParameterLink value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(ParameterPose)
	 * @see xacro.XacroPackage#getJoint_Origin()
	 * @model containment="true"
	 * @generated
	 */
	ParameterPose getOrigin();

	/**
	 * Sets the value of the '{@link xacro.Joint#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ParameterPose value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(Vector3)
	 * @see xacro.XacroPackage#getJoint_Axis()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getAxis();

	/**
	 * Sets the value of the '{@link xacro.Joint#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(Limit)
	 * @see xacro.XacroPackage#getJoint_Limit()
	 * @model containment="true"
	 * @generated
	 */
	Limit getLimit();

	/**
	 * Sets the value of the '{@link xacro.Joint#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Limit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see xacro.XacroPackage#getJoint_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link xacro.Joint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Joint
