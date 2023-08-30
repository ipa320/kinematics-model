/**
 */
package urdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

import urdf.Pose;
import urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link urdf.impl.PoseImpl#getRpy <em>Rpy</em>}</li>
 *   <li>{@link urdf.impl.PoseImpl#getXyz <em>Xyz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseImpl extends MinimalEObjectImpl.Container implements Pose {
	/**
	 * The cached value of the '{@link #getRpy() <em>Rpy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpy()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> rpy;

	/**
	 * The cached value of the '{@link #getXyz() <em>Xyz</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> xyz;

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
		return UrdfPackage.Literals.POSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getRpy() {
		if (rpy == null) {
			rpy = new EDataTypeEList.Unsettable<Double>(Double.class, this, UrdfPackage.POSE__RPY);
		}
		return rpy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRpy() {
		if (rpy != null) ((InternalEList.Unsettable<?>)rpy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRpy() {
		return rpy != null && ((InternalEList.Unsettable<?>)rpy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getXyz() {
		if (xyz == null) {
			xyz = new EDataTypeEList.Unsettable<Double>(Double.class, this, UrdfPackage.POSE__XYZ);
		}
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXyz() {
		if (xyz != null) ((InternalEList.Unsettable<?>)xyz).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXyz() {
		return xyz != null && ((InternalEList.Unsettable<?>)xyz).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.POSE__RPY:
				return getRpy();
			case UrdfPackage.POSE__XYZ:
				return getXyz();
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
			case UrdfPackage.POSE__RPY:
				getRpy().clear();
				getRpy().addAll((Collection<? extends Double>)newValue);
				return;
			case UrdfPackage.POSE__XYZ:
				getXyz().clear();
				getXyz().addAll((Collection<? extends Double>)newValue);
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
			case UrdfPackage.POSE__RPY:
				unsetRpy();
				return;
			case UrdfPackage.POSE__XYZ:
				unsetXyz();
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
			case UrdfPackage.POSE__RPY:
				return isSetRpy();
			case UrdfPackage.POSE__XYZ:
				return isSetXyz();
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
		result.append(" (rpy: ");
		result.append(rpy);
		result.append(", xyz: ");
		result.append(xyz);
		result.append(')');
		return result.toString();
	}

} //PoseImpl
