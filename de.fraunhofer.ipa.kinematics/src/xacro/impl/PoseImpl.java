/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.ParameterValue;
import xacro.Pose;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.PoseImpl#getXyz <em>Xyz</em>}</li>
 *   <li>{@link xacro.impl.PoseImpl#getRpy <em>Rpy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseImpl extends MinimalEObjectImpl.Container implements Pose {
	/**
	 * The cached value of the '{@link #getXyz() <em>Xyz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue xyz;

	/**
	 * The cached value of the '{@link #getRpy() <em>Rpy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpy()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue rpy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.POSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue getXyz() {
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXyz(ParameterValue newXyz, NotificationChain msgs) {
		ParameterValue oldXyz = xyz;
		xyz = newXyz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.POSE__XYZ, oldXyz, newXyz);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXyz(ParameterValue newXyz) {
		if (newXyz != xyz) {
			NotificationChain msgs = null;
			if (xyz != null)
				msgs = ((InternalEObject)xyz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.POSE__XYZ, null, msgs);
			if (newXyz != null)
				msgs = ((InternalEObject)newXyz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.POSE__XYZ, null, msgs);
			msgs = basicSetXyz(newXyz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.POSE__XYZ, newXyz, newXyz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue getRpy() {
		return rpy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpy(ParameterValue newRpy, NotificationChain msgs) {
		ParameterValue oldRpy = rpy;
		rpy = newRpy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.POSE__RPY, oldRpy, newRpy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpy(ParameterValue newRpy) {
		if (newRpy != rpy) {
			NotificationChain msgs = null;
			if (rpy != null)
				msgs = ((InternalEObject)rpy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.POSE__RPY, null, msgs);
			if (newRpy != null)
				msgs = ((InternalEObject)newRpy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.POSE__RPY, null, msgs);
			msgs = basicSetRpy(newRpy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.POSE__RPY, newRpy, newRpy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.POSE__XYZ:
				return basicSetXyz(null, msgs);
			case XacroPackage.POSE__RPY:
				return basicSetRpy(null, msgs);
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
			case XacroPackage.POSE__XYZ:
				return getXyz();
			case XacroPackage.POSE__RPY:
				return getRpy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XacroPackage.POSE__XYZ:
				setXyz((ParameterValue)newValue);
				return;
			case XacroPackage.POSE__RPY:
				setRpy((ParameterValue)newValue);
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
			case XacroPackage.POSE__XYZ:
				setXyz((ParameterValue)null);
				return;
			case XacroPackage.POSE__RPY:
				setRpy((ParameterValue)null);
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
			case XacroPackage.POSE__XYZ:
				return xyz != null;
			case XacroPackage.POSE__RPY:
				return rpy != null;
		}
		return super.eIsSet(featureID);
	}

} //PoseImpl
