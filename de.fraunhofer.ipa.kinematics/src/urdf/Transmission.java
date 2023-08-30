/**
 */
package urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Transmission#getLeftActuator <em>Left Actuator</em>}</li>
 *   <li>{@link urdf.Transmission#getRightActuator <em>Right Actuator</em>}</li>
 *   <li>{@link urdf.Transmission#getFlexJoint <em>Flex Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getRollJoint <em>Roll Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getGapJoint <em>Gap Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getPassiveJoint <em>Passive Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getUseSimulatedGripperJoint <em>Use Simulated Gripper Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link urdf.Transmission#getActuator <em>Actuator</em>}</li>
 *   <li>{@link urdf.Transmission#getJoint <em>Joint</em>}</li>
 *   <li>{@link urdf.Transmission#getName <em>Name</em>}</li>
 *   <li>{@link urdf.Transmission#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getTransmission()
 * @model
 * @generated
 */
public interface Transmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Actuator</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_LeftActuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ActuatorTransmission> getLeftActuator();

	/**
	 * Returns the value of the '<em><b>Right Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Actuator</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_RightActuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ActuatorTransmission> getRightActuator();

	/**
	 * Returns the value of the '<em><b>Flex Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flex Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_FlexJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ActuatorTransmission> getFlexJoint();

	/**
	 * Returns the value of the '<em><b>Roll Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_RollJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<ActuatorTransmission> getRollJoint();

	/**
	 * Returns the value of the '<em><b>Gap Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.GapJointTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_GapJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<GapJointTransmission> getGapJoint();

	/**
	 * Returns the value of the '<em><b>Passive Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.PassiveJointTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_PassiveJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<PassiveJointTransmission> getPassiveJoint();

	/**
	 * Returns the value of the '<em><b>Use Simulated Gripper Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.UseSimulatedGripperJointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Simulated Gripper Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_UseSimulatedGripperJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<UseSimulatedGripperJointType> getUseSimulatedGripperJoint();

	/**
	 * Returns the value of the '<em><b>Mechanical Reduction</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Reduction</em>' attribute list.
	 * @see #isSetMechanicalReduction()
	 * @see #unsetMechanicalReduction()
	 * @see urdf.UrdfPackage#getTransmission_MechanicalReduction()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<Double> getMechanicalReduction();

	/**
	 * Unsets the value of the '{@link urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @generated
	 */
	void unsetMechanicalReduction();

	/**
	 * Returns whether the value of the '{@link urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mechanical Reduction</em>' attribute list is set.
	 * @see #unsetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @generated
	 */
	boolean isSetMechanicalReduction();

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Name}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_Actuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Name> getActuator();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Name}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getTransmission_Joint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Name> getJoint();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see urdf.UrdfPackage#getTransmission_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link urdf.Transmission#getName <em>Name</em>}' attribute.
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
	 * @see urdf.UrdfPackage#getTransmission_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link urdf.Transmission#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Transmission
