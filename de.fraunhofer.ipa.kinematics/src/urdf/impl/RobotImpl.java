/**
 */
package urdf.impl;

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
import urdf.MaterialGlobal;
import urdf.Robot;
import urdf.Transmission;
import urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link urdf.impl.RobotImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link urdf.impl.RobotImpl#getLink <em>Link</em>}</li>
 *   <li>{@link urdf.impl.RobotImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link urdf.impl.RobotImpl#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link urdf.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link urdf.impl.RobotImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoint() {
		if (joint == null) {
			joint = new EObjectContainmentEList<Joint>(Joint.class, this, UrdfPackage.ROBOT__JOINT);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, UrdfPackage.ROBOT__LINK);
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
			material = new EObjectContainmentEList<MaterialGlobal>(MaterialGlobal.class, this, UrdfPackage.ROBOT__MATERIAL);
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
			transmission = new EObjectContainmentEList<Transmission>(Transmission.class, this, UrdfPackage.ROBOT__TRANSMISSION);
		}
		return transmission;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.ROBOT__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.ROBOT__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.ROBOT__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT__TRANSMISSION:
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
			case UrdfPackage.ROBOT__JOINT:
				return getJoint();
			case UrdfPackage.ROBOT__LINK:
				return getLink();
			case UrdfPackage.ROBOT__MATERIAL:
				return getMaterial();
			case UrdfPackage.ROBOT__TRANSMISSION:
				return getTransmission();
			case UrdfPackage.ROBOT__NAME:
				return getName();
			case UrdfPackage.ROBOT__VERSION:
				return getVersion();
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
			case UrdfPackage.ROBOT__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Joint>)newValue);
				return;
			case UrdfPackage.ROBOT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case UrdfPackage.ROBOT__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends MaterialGlobal>)newValue);
				return;
			case UrdfPackage.ROBOT__TRANSMISSION:
				getTransmission().clear();
				getTransmission().addAll((Collection<? extends Transmission>)newValue);
				return;
			case UrdfPackage.ROBOT__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.ROBOT__VERSION:
				setVersion((String)newValue);
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
			case UrdfPackage.ROBOT__JOINT:
				getJoint().clear();
				return;
			case UrdfPackage.ROBOT__LINK:
				getLink().clear();
				return;
			case UrdfPackage.ROBOT__MATERIAL:
				getMaterial().clear();
				return;
			case UrdfPackage.ROBOT__TRANSMISSION:
				getTransmission().clear();
				return;
			case UrdfPackage.ROBOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.ROBOT__VERSION:
				unsetVersion();
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
			case UrdfPackage.ROBOT__JOINT:
				return joint != null && !joint.isEmpty();
			case UrdfPackage.ROBOT__LINK:
				return link != null && !link.isEmpty();
			case UrdfPackage.ROBOT__MATERIAL:
				return material != null && !material.isEmpty();
			case UrdfPackage.ROBOT__TRANSMISSION:
				return transmission != null && !transmission.isEmpty();
			case UrdfPackage.ROBOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.ROBOT__VERSION:
				return isSetVersion();
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
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RobotImpl
