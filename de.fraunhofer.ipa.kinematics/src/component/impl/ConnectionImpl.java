/**
 */
package component.impl;

import component.BaseAttachment;
import component.ComponentPackage;
import component.Connection;
import component.FlangeAttachment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link component.impl.ConnectionImpl#getBaseAttachment <em>Base Attachment</em>}</li>
 *   <li>{@link component.impl.ConnectionImpl#getFlangeAttachment <em>Flange Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
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
	 * The cached value of the '{@link #getBaseAttachment() <em>Base Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAttachment()
	 * @generated
	 * @ordered
	 */
	protected BaseAttachment baseAttachment;

	/**
	 * The cached value of the '{@link #getFlangeAttachment() <em>Flange Attachment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeAttachment()
	 * @generated
	 * @ordered
	 */
	protected FlangeAttachment flangeAttachment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAttachment getBaseAttachment() {
		if (baseAttachment != null && baseAttachment.eIsProxy()) {
			InternalEObject oldBaseAttachment = (InternalEObject)baseAttachment;
			baseAttachment = (BaseAttachment)eResolveProxy(oldBaseAttachment);
			if (baseAttachment != oldBaseAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONNECTION__BASE_ATTACHMENT, oldBaseAttachment, baseAttachment));
			}
		}
		return baseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAttachment basicGetBaseAttachment() {
		return baseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAttachment(BaseAttachment newBaseAttachment) {
		BaseAttachment oldBaseAttachment = baseAttachment;
		baseAttachment = newBaseAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTION__BASE_ATTACHMENT, oldBaseAttachment, baseAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlangeAttachment getFlangeAttachment() {
		if (flangeAttachment != null && flangeAttachment.eIsProxy()) {
			InternalEObject oldFlangeAttachment = (InternalEObject)flangeAttachment;
			flangeAttachment = (FlangeAttachment)eResolveProxy(oldFlangeAttachment);
			if (flangeAttachment != oldFlangeAttachment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONNECTION__FLANGE_ATTACHMENT, oldFlangeAttachment, flangeAttachment));
			}
		}
		return flangeAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlangeAttachment basicGetFlangeAttachment() {
		return flangeAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeAttachment(FlangeAttachment newFlangeAttachment) {
		FlangeAttachment oldFlangeAttachment = flangeAttachment;
		flangeAttachment = newFlangeAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTION__FLANGE_ATTACHMENT, oldFlangeAttachment, flangeAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.CONNECTION__NAME:
				return getName();
			case ComponentPackage.CONNECTION__BASE_ATTACHMENT:
				if (resolve) return getBaseAttachment();
				return basicGetBaseAttachment();
			case ComponentPackage.CONNECTION__FLANGE_ATTACHMENT:
				if (resolve) return getFlangeAttachment();
				return basicGetFlangeAttachment();
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
			case ComponentPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case ComponentPackage.CONNECTION__BASE_ATTACHMENT:
				setBaseAttachment((BaseAttachment)newValue);
				return;
			case ComponentPackage.CONNECTION__FLANGE_ATTACHMENT:
				setFlangeAttachment((FlangeAttachment)newValue);
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
			case ComponentPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentPackage.CONNECTION__BASE_ATTACHMENT:
				setBaseAttachment((BaseAttachment)null);
				return;
			case ComponentPackage.CONNECTION__FLANGE_ATTACHMENT:
				setFlangeAttachment((FlangeAttachment)null);
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
			case ComponentPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentPackage.CONNECTION__BASE_ATTACHMENT:
				return baseAttachment != null;
			case ComponentPackage.CONNECTION__FLANGE_ATTACHMENT:
				return flangeAttachment != null;
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

} //ConnectionImpl
