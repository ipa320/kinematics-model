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

import urdf.Joint;
import urdf.Link;

import xacro.ConfiguredMacro;
import xacro.Macro;
import xacro.Parameter;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.MacroImpl#getName <em>Name</em>}</li>
 *   <li>{@link xacro.impl.MacroImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xacro.impl.MacroImpl#getConfiguredMacros <em>Configured Macros</em>}</li>
 *   <li>{@link xacro.impl.MacroImpl#getLink <em>Link</em>}</li>
 *   <li>{@link xacro.impl.MacroImpl#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacroImpl extends MinimalEObjectImpl.Container implements Macro {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.MACRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.MACRO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, XacroPackage.MACRO__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredMacro> getConfiguredMacros() {
		if (configuredMacros == null) {
			configuredMacros = new EObjectContainmentEList<ConfiguredMacro>(ConfiguredMacro.class, this, XacroPackage.MACRO__CONFIGURED_MACROS);
		}
		return configuredMacros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, XacroPackage.MACRO__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<Joint>(Joint.class, this, XacroPackage.MACRO__JOINT);
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
			case XacroPackage.MACRO__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case XacroPackage.MACRO__CONFIGURED_MACROS:
				return ((InternalEList<?>)getConfiguredMacros()).basicRemove(otherEnd, msgs);
			case XacroPackage.MACRO__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case XacroPackage.MACRO__JOINT:
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
			case XacroPackage.MACRO__NAME:
				return getName();
			case XacroPackage.MACRO__PARAMETERS:
				return getParameters();
			case XacroPackage.MACRO__CONFIGURED_MACROS:
				return getConfiguredMacros();
			case XacroPackage.MACRO__LINK:
				return getLink();
			case XacroPackage.MACRO__JOINT:
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
			case XacroPackage.MACRO__NAME:
				setName((String)newValue);
				return;
			case XacroPackage.MACRO__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case XacroPackage.MACRO__CONFIGURED_MACROS:
				getConfiguredMacros().clear();
				getConfiguredMacros().addAll((Collection<? extends ConfiguredMacro>)newValue);
				return;
			case XacroPackage.MACRO__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case XacroPackage.MACRO__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Joint>)newValue);
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
			case XacroPackage.MACRO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XacroPackage.MACRO__PARAMETERS:
				getParameters().clear();
				return;
			case XacroPackage.MACRO__CONFIGURED_MACROS:
				getConfiguredMacros().clear();
				return;
			case XacroPackage.MACRO__LINK:
				getLink().clear();
				return;
			case XacroPackage.MACRO__JOINT:
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
			case XacroPackage.MACRO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XacroPackage.MACRO__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XacroPackage.MACRO__CONFIGURED_MACROS:
				return configuredMacros != null && !configuredMacros.isEmpty();
			case XacroPackage.MACRO__LINK:
				return link != null && !link.isEmpty();
			case XacroPackage.MACRO__JOINT:
				return joint != null && !joint.isEmpty();
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

} //MacroImpl
