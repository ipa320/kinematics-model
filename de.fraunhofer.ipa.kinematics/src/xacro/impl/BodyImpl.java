/**
 */
package xacro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import urdf.Joint;
import urdf.Link;
import urdf.MaterialGlobal;
import urdf.Transmission;
import xacro.Body;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.BodyImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link xacro.impl.BodyImpl#getLink <em>Link</em>}</li>
 *   <li>{@link xacro.impl.BodyImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link xacro.impl.BodyImpl#getTransmission <em>Transmission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends MinimalEObjectImpl.Container implements Body {
	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Joint> joint;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialGlobal> material;

	/**
	 * The cached value of the '{@link #getTransmission() <em>Transmission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected EList<Transmission> transmission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<Joint>(Joint.class, this, XacroPackage.BODY__JOINT);
		}
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, XacroPackage.BODY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialGlobal> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<MaterialGlobal>(MaterialGlobal.class, this, XacroPackage.BODY__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transmission> getTransmission() {
		if (transmission == null) {
			transmission = new EObjectContainmentEList<Transmission>(Transmission.class, this, XacroPackage.BODY__TRANSMISSION);
		}
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.BODY__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
			case XacroPackage.BODY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case XacroPackage.BODY__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case XacroPackage.BODY__TRANSMISSION:
				return ((InternalEList<?>)getTransmission()).basicRemove(otherEnd, msgs);
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
			case XacroPackage.BODY__JOINT:
				return getJoint();
			case XacroPackage.BODY__LINK:
				return getLink();
			case XacroPackage.BODY__MATERIAL:
				return getMaterial();
			case XacroPackage.BODY__TRANSMISSION:
				return getTransmission();
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
			case XacroPackage.BODY__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Joint>)newValue);
				return;
			case XacroPackage.BODY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case XacroPackage.BODY__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends MaterialGlobal>)newValue);
				return;
			case XacroPackage.BODY__TRANSMISSION:
				getTransmission().clear();
				getTransmission().addAll((Collection<? extends Transmission>)newValue);
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
			case XacroPackage.BODY__JOINT:
				getJoint().clear();
				return;
			case XacroPackage.BODY__LINK:
				getLink().clear();
				return;
			case XacroPackage.BODY__MATERIAL:
				getMaterial().clear();
				return;
			case XacroPackage.BODY__TRANSMISSION:
				getTransmission().clear();
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
			case XacroPackage.BODY__JOINT:
				return joint != null && !joint.isEmpty();
			case XacroPackage.BODY__LINK:
				return link != null && !link.isEmpty();
			case XacroPackage.BODY__MATERIAL:
				return material != null && !material.isEmpty();
			case XacroPackage.BODY__TRANSMISSION:
				return transmission != null && !transmission.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
