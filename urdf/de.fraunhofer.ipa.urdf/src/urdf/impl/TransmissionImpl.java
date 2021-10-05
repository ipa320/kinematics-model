/**
 */
package urdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import urdf.ActuatorTransmission;
import urdf.GapJointTransmission;
import urdf.Name;
import urdf.PassiveJointTransmission;
import urdf.Transmission;
import urdf.UrdfPackage;
import urdf.UseSimulatedGripperJointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link urdf.impl.TransmissionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getLeftActuator <em>Left Actuator</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getRightActuator <em>Right Actuator</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getFlexJoint <em>Flex Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getRollJoint <em>Roll Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getGapJoint <em>Gap Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getPassiveJoint <em>Passive Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getUseSimulatedGripperJoint <em>Use Simulated Gripper Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link urdf.impl.TransmissionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionImpl extends MinimalEObjectImpl.Container implements Transmission {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getLeftActuator() <em>Left Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorTransmission> leftActuator;

	/**
	 * The cached value of the '{@link #getRightActuator() <em>Right Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorTransmission> rightActuator;

	/**
	 * The cached value of the '{@link #getFlexJoint() <em>Flex Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorTransmission> flexJoint;

	/**
	 * The cached value of the '{@link #getRollJoint() <em>Roll Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorTransmission> rollJoint;

	/**
	 * The cached value of the '{@link #getGapJoint() <em>Gap Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGapJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<GapJointTransmission> gapJoint;

	/**
	 * The cached value of the '{@link #getPassiveJoint() <em>Passive Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<PassiveJointTransmission> passiveJoint;

	/**
	 * The cached value of the '{@link #getUseSimulatedGripperJoint() <em>Use Simulated Gripper Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSimulatedGripperJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<UseSimulatedGripperJointType> useSimulatedGripperJoint;

	/**
	 * The cached value of the '{@link #getMechanicalReduction() <em>Mechanical Reduction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalReduction()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> mechanicalReduction;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Name> actuator;

	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Name> joint;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UrdfPackage.TRANSMISSION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getLeftActuator() {
		if (leftActuator == null) {
			leftActuator = new EObjectContainmentEList<ActuatorTransmission>(ActuatorTransmission.class, this, UrdfPackage.TRANSMISSION__LEFT_ACTUATOR);
		}
		return leftActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getRightActuator() {
		if (rightActuator == null) {
			rightActuator = new EObjectContainmentEList<ActuatorTransmission>(ActuatorTransmission.class, this, UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR);
		}
		return rightActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getFlexJoint() {
		if (flexJoint == null) {
			flexJoint = new EObjectContainmentEList<ActuatorTransmission>(ActuatorTransmission.class, this, UrdfPackage.TRANSMISSION__FLEX_JOINT);
		}
		return flexJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getRollJoint() {
		if (rollJoint == null) {
			rollJoint = new EObjectContainmentEList<ActuatorTransmission>(ActuatorTransmission.class, this, UrdfPackage.TRANSMISSION__ROLL_JOINT);
		}
		return rollJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GapJointTransmission> getGapJoint() {
		if (gapJoint == null) {
			gapJoint = new EObjectContainmentEList<GapJointTransmission>(GapJointTransmission.class, this, UrdfPackage.TRANSMISSION__GAP_JOINT);
		}
		return gapJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassiveJointTransmission> getPassiveJoint() {
		if (passiveJoint == null) {
			passiveJoint = new EObjectContainmentEList<PassiveJointTransmission>(PassiveJointTransmission.class, this, UrdfPackage.TRANSMISSION__PASSIVE_JOINT);
		}
		return passiveJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseSimulatedGripperJointType> getUseSimulatedGripperJoint() {
		if (useSimulatedGripperJoint == null) {
			useSimulatedGripperJoint = new EObjectContainmentEList<UseSimulatedGripperJointType>(UseSimulatedGripperJointType.class, this, UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT);
		}
		return useSimulatedGripperJoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getMechanicalReduction() {
		if (mechanicalReduction == null) {
			mechanicalReduction = new EDataTypeEList<Double>(Double.class, this, UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION);
		}
		return mechanicalReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Name> getActuator() {
		if (actuator == null) {
			actuator = new EObjectContainmentEList<Name>(Name.class, this, UrdfPackage.TRANSMISSION__ACTUATOR);
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Name> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<Name>(Name.class, this, UrdfPackage.TRANSMISSION__JOINT);
		}
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.TRANSMISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.TRANSMISSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return ((InternalEList<?>)getLeftActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return ((InternalEList<?>)getRightActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return ((InternalEList<?>)getFlexJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return ((InternalEList<?>)getRollJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return ((InternalEList<?>)getGapJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return ((InternalEList<?>)getPassiveJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return ((InternalEList<?>)getUseSimulatedGripperJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return ((InternalEList<?>)getActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return getLeftActuator();
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return getRightActuator();
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return getFlexJoint();
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return getRollJoint();
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return getGapJoint();
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return getPassiveJoint();
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return getUseSimulatedGripperJoint();
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				return getMechanicalReduction();
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return getActuator();
			case UrdfPackage.TRANSMISSION__JOINT:
				return getJoint();
			case UrdfPackage.TRANSMISSION__NAME:
				return getName();
			case UrdfPackage.TRANSMISSION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				getLeftActuator().clear();
				getLeftActuator().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				getRightActuator().clear();
				getRightActuator().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				getFlexJoint().clear();
				getFlexJoint().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				getRollJoint().clear();
				getRollJoint().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				getGapJoint().clear();
				getGapJoint().addAll((Collection<? extends GapJointTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				getPassiveJoint().clear();
				getPassiveJoint().addAll((Collection<? extends PassiveJointTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				getUseSimulatedGripperJoint().clear();
				getUseSimulatedGripperJoint().addAll((Collection<? extends UseSimulatedGripperJointType>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				getMechanicalReduction().clear();
				getMechanicalReduction().addAll((Collection<? extends Double>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				getActuator().clear();
				getActuator().addAll((Collection<? extends Name>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Name>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.TRANSMISSION__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				getGroup().clear();
				return;
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				getLeftActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				getRightActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				getFlexJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				getRollJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				getGapJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				getPassiveJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				getUseSimulatedGripperJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				getMechanicalReduction().clear();
				return;
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				getActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__JOINT:
				getJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.TRANSMISSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				return group != null && !group.isEmpty();
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return leftActuator != null && !leftActuator.isEmpty();
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return rightActuator != null && !rightActuator.isEmpty();
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return flexJoint != null && !flexJoint.isEmpty();
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return rollJoint != null && !rollJoint.isEmpty();
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return gapJoint != null && !gapJoint.isEmpty();
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return passiveJoint != null && !passiveJoint.isEmpty();
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return useSimulatedGripperJoint != null && !useSimulatedGripperJoint.isEmpty();
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				return mechanicalReduction != null && !mechanicalReduction.isEmpty();
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return actuator != null && !actuator.isEmpty();
			case UrdfPackage.TRANSMISSION__JOINT:
				return joint != null && !joint.isEmpty();
			case UrdfPackage.TRANSMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.TRANSMISSION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", mechanicalReduction: ");
		result.append(mechanicalReduction);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TransmissionImpl
