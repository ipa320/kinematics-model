/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Vector3;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.Vector3Impl#getXyz <em>Xyz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vector3Impl extends MinimalEObjectImpl.Container implements Vector3 {
	/**
	 * The default value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected static final String XYZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected String xyz = XYZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vector3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.VECTOR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXyz() {
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXyz(String newXyz) {
		String oldXyz = xyz;
		xyz = newXyz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.VECTOR3__XYZ, oldXyz, xyz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XacroPackage.VECTOR3__XYZ:
				return getXyz();
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
			case XacroPackage.VECTOR3__XYZ:
				setXyz((String)newValue);
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
			case XacroPackage.VECTOR3__XYZ:
				setXyz(XYZ_EDEFAULT);
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
			case XacroPackage.VECTOR3__XYZ:
				return XYZ_EDEFAULT == null ? xyz != null : !XYZ_EDEFAULT.equals(xyz);
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
		result.append(" (xyz: ");
		result.append(xyz);
		result.append(')');
		return result.toString();
	}

} //Vector3Impl
