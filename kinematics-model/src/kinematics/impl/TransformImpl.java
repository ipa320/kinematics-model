/**
 */
package kinematics.impl;

import kinematics.KinematicsPackage;
import kinematics.Rotation;
import kinematics.Transform;
import kinematics.Translation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.TransformImpl#getXYZ <em>XYZ</em>}</li>
 *   <li>{@link kinematics.impl.TransformImpl#getRPY <em>RPY</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformImpl extends MinimalEObjectImpl.Container implements Transform {
	/**
	 * The cached value of the '{@link #getXYZ() <em>XYZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXYZ()
	 * @generated
	 * @ordered
	 */
	protected Translation xyz;

	/**
	 * The cached value of the '{@link #getRPY() <em>RPY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPY()
	 * @generated
	 * @ordered
	 */
	protected Rotation rpy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinematicsPackage.Literals.TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation getXYZ() {
		if (xyz != null && xyz.eIsProxy()) {
			InternalEObject oldXYZ = (InternalEObject)xyz;
			xyz = (Translation)eResolveProxy(oldXYZ);
			if (xyz != oldXYZ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.TRANSFORM__XYZ, oldXYZ, xyz));
			}
		}
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation basicGetXYZ() {
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXYZ(Translation newXYZ) {
		Translation oldXYZ = xyz;
		xyz = newXYZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.TRANSFORM__XYZ, oldXYZ, xyz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation getRPY() {
		if (rpy != null && rpy.eIsProxy()) {
			InternalEObject oldRPY = (InternalEObject)rpy;
			rpy = (Rotation)eResolveProxy(oldRPY);
			if (rpy != oldRPY) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.TRANSFORM__RPY, oldRPY, rpy));
			}
		}
		return rpy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation basicGetRPY() {
		return rpy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPY(Rotation newRPY) {
		Rotation oldRPY = rpy;
		rpy = newRPY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.TRANSFORM__RPY, oldRPY, rpy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinematicsPackage.TRANSFORM__XYZ:
				if (resolve) return getXYZ();
				return basicGetXYZ();
			case KinematicsPackage.TRANSFORM__RPY:
				if (resolve) return getRPY();
				return basicGetRPY();
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
			case KinematicsPackage.TRANSFORM__XYZ:
				setXYZ((Translation)newValue);
				return;
			case KinematicsPackage.TRANSFORM__RPY:
				setRPY((Rotation)newValue);
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
			case KinematicsPackage.TRANSFORM__XYZ:
				setXYZ((Translation)null);
				return;
			case KinematicsPackage.TRANSFORM__RPY:
				setRPY((Rotation)null);
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
			case KinematicsPackage.TRANSFORM__XYZ:
				return xyz != null;
			case KinematicsPackage.TRANSFORM__RPY:
				return rpy != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformImpl
