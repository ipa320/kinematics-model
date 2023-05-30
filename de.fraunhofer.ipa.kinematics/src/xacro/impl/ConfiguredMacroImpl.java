/**
 */
package xacro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xacro.ConfiguredMacro;
import xacro.ConfiguredParameter;
import xacro.Macro;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configured Macro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.ConfiguredMacroImpl#getMacro <em>Macro</em>}</li>
 *   <li>{@link xacro.impl.ConfiguredMacroImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfiguredMacroImpl extends MinimalEObjectImpl.Container implements ConfiguredMacro {
	/**
	 * The cached value of the '{@link #getMacro() <em>Macro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacro()
	 * @generated
	 * @ordered
	 */
	protected Macro macro;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguredMacroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.CONFIGURED_MACRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro getMacro() {
		if (macro != null && macro.eIsProxy()) {
			InternalEObject oldMacro = (InternalEObject)macro;
			macro = (Macro)eResolveProxy(oldMacro);
			if (macro != oldMacro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XacroPackage.CONFIGURED_MACRO__MACRO, oldMacro, macro));
			}
		}
		return macro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Macro basicGetMacro() {
		return macro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacro(Macro newMacro) {
		Macro oldMacro = macro;
		macro = newMacro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.CONFIGURED_MACRO__MACRO, oldMacro, macro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ConfiguredParameter>(ConfiguredParameter.class, this, XacroPackage.CONFIGURED_MACRO__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.CONFIGURED_MACRO__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case XacroPackage.CONFIGURED_MACRO__MACRO:
				if (resolve) return getMacro();
				return basicGetMacro();
			case XacroPackage.CONFIGURED_MACRO__PARAMETERS:
				return getParameters();
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
			case XacroPackage.CONFIGURED_MACRO__MACRO:
				setMacro((Macro)newValue);
				return;
			case XacroPackage.CONFIGURED_MACRO__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ConfiguredParameter>)newValue);
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
			case XacroPackage.CONFIGURED_MACRO__MACRO:
				setMacro((Macro)null);
				return;
			case XacroPackage.CONFIGURED_MACRO__PARAMETERS:
				getParameters().clear();
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
			case XacroPackage.CONFIGURED_MACRO__MACRO:
				return macro != null;
			case XacroPackage.CONFIGURED_MACRO__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfiguredMacroImpl
