/**
 */
package urdf;

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
 *   <li>{@link urdf.Joint#getOrigin <em>Origin</em>}</li>
 *   <li>{@link urdf.Joint#getParent <em>Parent</em>}</li>
 *   <li>{@link urdf.Joint#getChild <em>Child</em>}</li>
 *   <li>{@link urdf.Joint#getAxis <em>Axis</em>}</li>
 *   <li>{@link urdf.Joint#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link urdf.Joint#getDynamics <em>Dynamics</em>}</li>
 *   <li>{@link urdf.Joint#getLimit <em>Limit</em>}</li>
 *   <li>{@link urdf.Joint#getSafetyController <em>Safety Controller</em>}</li>
 *   <li>{@link urdf.Joint#getMimic <em>Mimic</em>}</li>
 *   <li>{@link urdf.Joint#getName <em>Name</em>}</li>
 *   <li>{@link urdf.Joint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see urdf.UrdfPackage#getJoint_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link urdf.Joint#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Link)
	 * @see urdf.UrdfPackage#getJoint_Parent()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Link getParent();

	/**
	 * Sets the value of the '{@link urdf.Joint#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Link value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Link)
	 * @see urdf.UrdfPackage#getJoint_Child()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	Link getChild();

	/**
	 * Sets the value of the '{@link urdf.Joint#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Link value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(Axis)
	 * @see urdf.UrdfPackage#getJoint_Axis()
	 * @model containment="true"
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link urdf.Joint#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(Calibration)
	 * @see urdf.UrdfPackage#getJoint_Calibration()
	 * @model containment="true"
	 * @generated
	 */
	Calibration getCalibration();

	/**
	 * Sets the value of the '{@link urdf.Joint#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(Calibration value);

	/**
	 * Returns the value of the '<em><b>Dynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamics</em>' containment reference.
	 * @see #setDynamics(Dynamics)
	 * @see urdf.UrdfPackage#getJoint_Dynamics()
	 * @model containment="true"
	 * @generated
	 */
	Dynamics getDynamics();

	/**
	 * Sets the value of the '{@link urdf.Joint#getDynamics <em>Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamics</em>' containment reference.
	 * @see #getDynamics()
	 * @generated
	 */
	void setDynamics(Dynamics value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(Limit)
	 * @see urdf.UrdfPackage#getJoint_Limit()
	 * @model containment="true"
	 * @generated
	 */
	Limit getLimit();

	/**
	 * Sets the value of the '{@link urdf.Joint#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Limit value);

	/**
	 * Returns the value of the '<em><b>Safety Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Controller</em>' containment reference.
	 * @see #setSafetyController(SafetyController)
	 * @see urdf.UrdfPackage#getJoint_SafetyController()
	 * @model containment="true"
	 * @generated
	 */
	SafetyController getSafetyController();

	/**
	 * Sets the value of the '{@link urdf.Joint#getSafetyController <em>Safety Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Controller</em>' containment reference.
	 * @see #getSafetyController()
	 * @generated
	 */
	void setSafetyController(SafetyController value);

	/**
	 * Returns the value of the '<em><b>Mimic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimic</em>' containment reference.
	 * @see #setMimic(Mimic)
	 * @see urdf.UrdfPackage#getJoint_Mimic()
	 * @model containment="true"
	 * @generated
	 */
	Mimic getMimic();

	/**
	 * Sets the value of the '{@link urdf.Joint#getMimic <em>Mimic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimic</em>' containment reference.
	 * @see #getMimic()
	 * @generated
	 */
	void setMimic(Mimic value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see urdf.UrdfPackage#getJoint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link urdf.Joint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see urdf.UrdfPackage#getJoint_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link urdf.Joint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Joint
