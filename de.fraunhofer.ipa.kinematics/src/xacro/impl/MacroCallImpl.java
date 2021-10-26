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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import xacro.Macro;
import xacro.MacroCall;
import xacro.ParameterCall;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.MacroCallImpl#getMacro <em>Macro</em>}</li>
 *   <li>{@link xacro.impl.MacroCallImpl#getParameterCall <em>Parameter Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacroCallImpl extends MinimalEObjectImpl.Container implements MacroCall {
	/**
	 * The cached value of the '{@link #getMacro() <em>Macro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacro()
	 * @generated
	 * @ordered
	 */
	protected EList<Macro> macro;

	/**
	 * The cached value of the '{@link #getParameterCall() <em>Parameter Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCall()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCall> parameterCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacroCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.MACRO_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Macro> getMacro() {
		if (macro == null) {
			macro = new EObjectResolvingEList<Macro>(Macro.class, this, XacroPackage.MACRO_CALL__MACRO);
		}
		return macro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCall> getParameterCall() {
		if (parameterCall == null) {
			parameterCall = new EObjectContainmentEList<ParameterCall>(ParameterCall.class, this, XacroPackage.MACRO_CALL__PARAMETER_CALL);
		}
		return parameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.MACRO_CALL__PARAMETER_CALL:
				return ((InternalEList<?>)getParameterCall()).basicRemove(otherEnd, msgs);
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
			case XacroPackage.MACRO_CALL__MACRO:
				return getMacro();
			case XacroPackage.MACRO_CALL__PARAMETER_CALL:
				return getParameterCall();
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
			case XacroPackage.MACRO_CALL__MACRO:
				getMacro().clear();
				getMacro().addAll((Collection<? extends Macro>)newValue);
				return;
			case XacroPackage.MACRO_CALL__PARAMETER_CALL:
				getParameterCall().clear();
				getParameterCall().addAll((Collection<? extends ParameterCall>)newValue);
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
			case XacroPackage.MACRO_CALL__MACRO:
				getMacro().clear();
				return;
			case XacroPackage.MACRO_CALL__PARAMETER_CALL:
				getParameterCall().clear();
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
			case XacroPackage.MACRO_CALL__MACRO:
				return macro != null && !macro.isEmpty();
			case XacroPackage.MACRO_CALL__PARAMETER_CALL:
				return parameterCall != null && !parameterCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MacroCallImpl
