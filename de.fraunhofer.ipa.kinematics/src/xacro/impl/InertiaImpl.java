/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Inertia;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.InertiaImpl#getIxx <em>Ixx</em>}</li>
 *   <li>{@link xacro.impl.InertiaImpl#getIxy <em>Ixy</em>}</li>
 *   <li>{@link xacro.impl.InertiaImpl#getIxz <em>Ixz</em>}</li>
 *   <li>{@link xacro.impl.InertiaImpl#getIyy <em>Iyy</em>}</li>
 *   <li>{@link xacro.impl.InertiaImpl#getIyz <em>Iyz</em>}</li>
 *   <li>{@link xacro.impl.InertiaImpl#getIzz <em>Izz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertiaImpl extends MinimalEObjectImpl.Container implements Inertia {
	/**
	 * The default value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxx()
	 * @generated
	 * @ordered
	 */
	protected static final double IXX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxx()
	 * @generated
	 * @ordered
	 */
	protected double ixx = IXX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxy()
	 * @generated
	 * @ordered
	 */
	protected static final double IXY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxy()
	 * @generated
	 * @ordered
	 */
	protected double ixy = IXY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxz()
	 * @generated
	 * @ordered
	 */
	protected static final double IXZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxz()
	 * @generated
	 * @ordered
	 */
	protected double ixz = IXZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyy()
	 * @generated
	 * @ordered
	 */
	protected static final double IYY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyy()
	 * @generated
	 * @ordered
	 */
	protected double iyy = IYY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyz()
	 * @generated
	 * @ordered
	 */
	protected static final double IYZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyz()
	 * @generated
	 * @ordered
	 */
	protected double iyz = IYZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIzz() <em>Izz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIzz()
	 * @generated
	 * @ordered
	 */
	protected static final double IZZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIzz() <em>Izz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIzz()
	 * @generated
	 * @ordered
	 */
	protected double izz = IZZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.INERTIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxx() {
		return ixx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxx(double newIxx) {
		double oldIxx = ixx;
		ixx = newIxx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IXX, oldIxx, ixx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxy() {
		return ixy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxy(double newIxy) {
		double oldIxy = ixy;
		ixy = newIxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IXY, oldIxy, ixy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxz() {
		return ixz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxz(double newIxz) {
		double oldIxz = ixz;
		ixz = newIxz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IXZ, oldIxz, ixz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIyy() {
		return iyy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIyy(double newIyy) {
		double oldIyy = iyy;
		iyy = newIyy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IYY, oldIyy, iyy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIyz() {
		return iyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIyz(double newIyz) {
		double oldIyz = iyz;
		iyz = newIyz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IYZ, oldIyz, iyz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIzz() {
		return izz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIzz(double newIzz) {
		double oldIzz = izz;
		izz = newIzz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.INERTIA__IZZ, oldIzz, izz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XacroPackage.INERTIA__IXX:
				return getIxx();
			case XacroPackage.INERTIA__IXY:
				return getIxy();
			case XacroPackage.INERTIA__IXZ:
				return getIxz();
			case XacroPackage.INERTIA__IYY:
				return getIyy();
			case XacroPackage.INERTIA__IYZ:
				return getIyz();
			case XacroPackage.INERTIA__IZZ:
				return getIzz();
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
			case XacroPackage.INERTIA__IXX:
				setIxx((Double)newValue);
				return;
			case XacroPackage.INERTIA__IXY:
				setIxy((Double)newValue);
				return;
			case XacroPackage.INERTIA__IXZ:
				setIxz((Double)newValue);
				return;
			case XacroPackage.INERTIA__IYY:
				setIyy((Double)newValue);
				return;
			case XacroPackage.INERTIA__IYZ:
				setIyz((Double)newValue);
				return;
			case XacroPackage.INERTIA__IZZ:
				setIzz((Double)newValue);
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
			case XacroPackage.INERTIA__IXX:
				setIxx(IXX_EDEFAULT);
				return;
			case XacroPackage.INERTIA__IXY:
				setIxy(IXY_EDEFAULT);
				return;
			case XacroPackage.INERTIA__IXZ:
				setIxz(IXZ_EDEFAULT);
				return;
			case XacroPackage.INERTIA__IYY:
				setIyy(IYY_EDEFAULT);
				return;
			case XacroPackage.INERTIA__IYZ:
				setIyz(IYZ_EDEFAULT);
				return;
			case XacroPackage.INERTIA__IZZ:
				setIzz(IZZ_EDEFAULT);
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
			case XacroPackage.INERTIA__IXX:
				return ixx != IXX_EDEFAULT;
			case XacroPackage.INERTIA__IXY:
				return ixy != IXY_EDEFAULT;
			case XacroPackage.INERTIA__IXZ:
				return ixz != IXZ_EDEFAULT;
			case XacroPackage.INERTIA__IYY:
				return iyy != IYY_EDEFAULT;
			case XacroPackage.INERTIA__IYZ:
				return iyz != IYZ_EDEFAULT;
			case XacroPackage.INERTIA__IZZ:
				return izz != IZZ_EDEFAULT;
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
		result.append(" (ixx: ");
		result.append(ixx);
		result.append(", ixy: ");
		result.append(ixy);
		result.append(", ixz: ");
		result.append(ixz);
		result.append(", iyy: ");
		result.append(iyy);
		result.append(", iyz: ");
		result.append(iyz);
		result.append(", izz: ");
		result.append(izz);
		result.append(')');
		return result.toString();
	}

} //InertiaImpl
