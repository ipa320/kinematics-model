/**
 */
package kinematics.impl;

import java.util.Collection;

import kinematics.Joint;
import kinematics.KinematicsPackage;
import kinematics.Link;
import kinematics.ref_robot;
import kinematics.robot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.robotImpl#getRoot_link <em>Root link</em>}</li>
 *   <li>{@link kinematics.impl.robotImpl#getJoints <em>Joints</em>}</li>
 *   <li>{@link kinematics.impl.robotImpl#getName <em>Name</em>}</li>
 *   <li>{@link kinematics.impl.robotImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link kinematics.impl.robotImpl#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class robotImpl extends MinimalEObjectImpl.Container implements robot {
	/**
	 * The cached value of the '{@link #getRoot_link() <em>Root link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_link()
	 * @generated
	 * @ordered
	 */
	protected Link root_link;

	/**
	 * The cached value of the '{@link #getJoints() <em>Joints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Joint> joints;

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
	protected EList<ref_robot> robots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected robotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinematicsPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getRoot_link() {
		return root_link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot_link(Link newRoot_link, NotificationChain msgs) {
		Link oldRoot_link = root_link;
		root_link = newRoot_link;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__ROOT_LINK, oldRoot_link, newRoot_link);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot_link(Link newRoot_link) {
		if (newRoot_link != root_link) {
			NotificationChain msgs = null;
			if (root_link != null)
				msgs = ((InternalEObject)root_link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.ROBOT__ROOT_LINK, null, msgs);
			if (newRoot_link != null)
				msgs = ((InternalEObject)newRoot_link).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsPackage.ROBOT__ROOT_LINK, null, msgs);
			msgs = basicSetRoot_link(newRoot_link, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__ROOT_LINK, newRoot_link, newRoot_link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoints() {
		if (joints == null) {
			joints = new EObjectContainmentEList<Joint>(Joint.class, this, KinematicsPackage.ROBOT__JOINTS);
		}
		return joints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.ROBOT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ref_robot> getRobots() {
		if (robots == null) {
			robots = new EObjectContainmentEList<ref_robot>(ref_robot.class, this, KinematicsPackage.ROBOT__ROBOTS);
		}
		return robots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinematicsPackage.ROBOT__ROOT_LINK:
				return basicSetRoot_link(null, msgs);
			case KinematicsPackage.ROBOT__JOINTS:
				return ((InternalEList<?>)getJoints()).basicRemove(otherEnd, msgs);
			case KinematicsPackage.ROBOT__ROBOTS:
				return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
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
			case KinematicsPackage.ROBOT__ROOT_LINK:
				return getRoot_link();
			case KinematicsPackage.ROBOT__JOINTS:
				return getJoints();
			case KinematicsPackage.ROBOT__NAME:
				return getName();
			case KinematicsPackage.ROBOT__PREFIX:
				return getPrefix();
			case KinematicsPackage.ROBOT__ROBOTS:
				return getRobots();
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
			case KinematicsPackage.ROBOT__ROOT_LINK:
				setRoot_link((Link)newValue);
				return;
			case KinematicsPackage.ROBOT__JOINTS:
				getJoints().clear();
				getJoints().addAll((Collection<? extends Joint>)newValue);
				return;
			case KinematicsPackage.ROBOT__NAME:
				setName((String)newValue);
				return;
			case KinematicsPackage.ROBOT__PREFIX:
				setPrefix((String)newValue);
				return;
			case KinematicsPackage.ROBOT__ROBOTS:
				getRobots().clear();
				getRobots().addAll((Collection<? extends ref_robot>)newValue);
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
			case KinematicsPackage.ROBOT__ROOT_LINK:
				setRoot_link((Link)null);
				return;
			case KinematicsPackage.ROBOT__JOINTS:
				getJoints().clear();
				return;
			case KinematicsPackage.ROBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KinematicsPackage.ROBOT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case KinematicsPackage.ROBOT__ROBOTS:
				getRobots().clear();
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
			case KinematicsPackage.ROBOT__ROOT_LINK:
				return root_link != null;
			case KinematicsPackage.ROBOT__JOINTS:
				return joints != null && !joints.isEmpty();
			case KinematicsPackage.ROBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KinematicsPackage.ROBOT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case KinematicsPackage.ROBOT__ROBOTS:
				return robots != null && !robots.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //robotImpl
