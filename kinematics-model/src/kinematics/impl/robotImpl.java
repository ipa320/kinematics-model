/**
 */
package kinematics.impl;

import java.util.Collection;
import kinematics.KinematicsPackage;
import kinematics.joint;
import kinematics.link;
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
 *   <li>{@link kinematics.impl.robotImpl#getJoint <em>Joint</em>}</li>
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
	protected link root_link;

	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<joint> joint;

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
	public link getRoot_link() {
		return root_link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot_link(link newRoot_link, NotificationChain msgs) {
		link oldRoot_link = root_link;
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
	public void setRoot_link(link newRoot_link) {
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
	public EList<joint> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<joint>(joint.class, this, KinematicsPackage.ROBOT__JOINT);
		}
		return joint;
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
			case KinematicsPackage.ROBOT__JOINT:
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
			case KinematicsPackage.ROBOT__ROOT_LINK:
				return getRoot_link();
			case KinematicsPackage.ROBOT__JOINT:
				return getJoint();
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
				setRoot_link((link)newValue);
				return;
			case KinematicsPackage.ROBOT__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends joint>)newValue);
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
				setRoot_link((link)null);
				return;
			case KinematicsPackage.ROBOT__JOINT:
				getJoint().clear();
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
			case KinematicsPackage.ROBOT__JOINT:
				return joint != null && !joint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //robotImpl
