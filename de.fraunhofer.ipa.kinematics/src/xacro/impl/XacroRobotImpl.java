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
import xacro.Macro;
import xacro.XacroPackage;
import xacro.XacroRobot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.XacroRobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link xacro.impl.XacroRobotImpl#getMacros <em>Macros</em>}</li>
 *   <li>{@link xacro.impl.XacroRobotImpl#getConfiguredMacros <em>Configured Macros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XacroRobotImpl extends MinimalEObjectImpl.Container implements XacroRobot {
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
	 * The cached value of the '{@link #getMacros() <em>Macros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacros()
	 * @generated
	 * @ordered
	 */
	protected EList<Macro> macros;

	/**
	 * The cached value of the '{@link #getConfiguredMacros() <em>Configured Macros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredMacros()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredMacro> configuredMacros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XacroRobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.XACRO_ROBOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.XACRO_ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getMacros() {
		if (macros == null) {
			macros = new EObjectContainmentEList<Macro>(Macro.class, this, XacroPackage.XACRO_ROBOT__MACROS);
		}
		return macros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredMacro> getConfiguredMacros() {
		if (configuredMacros == null) {
			configuredMacros = new EObjectContainmentEList<ConfiguredMacro>(ConfiguredMacro.class, this, XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS);
		}
		return configuredMacros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.XACRO_ROBOT__MACROS:
				return ((InternalEList<?>)getMacros()).basicRemove(otherEnd, msgs);
			case XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS:
				return ((InternalEList<?>)getConfiguredMacros()).basicRemove(otherEnd, msgs);
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
			case XacroPackage.XACRO_ROBOT__NAME:
				return getName();
			case XacroPackage.XACRO_ROBOT__MACROS:
				return getMacros();
			case XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS:
				return getConfiguredMacros();
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
			case XacroPackage.XACRO_ROBOT__NAME:
				setName((String)newValue);
				return;
			case XacroPackage.XACRO_ROBOT__MACROS:
				getMacros().clear();
				getMacros().addAll((Collection<? extends Macro>)newValue);
				return;
			case XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS:
				getConfiguredMacros().clear();
				getConfiguredMacros().addAll((Collection<? extends ConfiguredMacro>)newValue);
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
			case XacroPackage.XACRO_ROBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XacroPackage.XACRO_ROBOT__MACROS:
				getMacros().clear();
				return;
			case XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS:
				getConfiguredMacros().clear();
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
			case XacroPackage.XACRO_ROBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XacroPackage.XACRO_ROBOT__MACROS:
				return macros != null && !macros.isEmpty();
			case XacroPackage.XACRO_ROBOT__CONFIGURED_MACROS:
				return configuredMacros != null && !configuredMacros.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //XacroRobotImpl
