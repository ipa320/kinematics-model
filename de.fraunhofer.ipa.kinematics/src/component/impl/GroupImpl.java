/**
 */
package component.impl;

import component.ComponentPackage;
import component.Group;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import urdf.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link component.impl.GroupImpl#getRos2_control <em>Ros2 control</em>}</li>
 *   <li>{@link component.impl.GroupImpl#getBaseLink <em>Base Link</em>}</li>
 *   <li>{@link component.impl.GroupImpl#getEndLink <em>End Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
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
	 * The default value of the '{@link #getRos2_control() <em>Ros2 control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos2_control()
	 * @generated
	 * @ordered
	 */
	protected static final String ROS2_CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRos2_control() <em>Ros2 control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRos2_control()
	 * @generated
	 * @ordered
	 */
	protected String ros2_control = ROS2_CONTROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseLink() <em>Base Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseLink()
	 * @generated
	 * @ordered
	 */
	protected Link baseLink;

	/**
	 * The cached value of the '{@link #getEndLink() <em>End Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLink()
	 * @generated
	 * @ordered
	 */
	protected Link endLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRos2_control() {
		return ros2_control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRos2_control(String newRos2_control) {
		String oldRos2_control = ros2_control;
		ros2_control = newRos2_control;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GROUP__ROS2_CONTROL, oldRos2_control, ros2_control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getBaseLink() {
		if (baseLink != null && baseLink.eIsProxy()) {
			InternalEObject oldBaseLink = (InternalEObject)baseLink;
			baseLink = (Link)eResolveProxy(oldBaseLink);
			if (baseLink != oldBaseLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.GROUP__BASE_LINK, oldBaseLink, baseLink));
			}
		}
		return baseLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetBaseLink() {
		return baseLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseLink(Link newBaseLink) {
		Link oldBaseLink = baseLink;
		baseLink = newBaseLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GROUP__BASE_LINK, oldBaseLink, baseLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getEndLink() {
		if (endLink != null && endLink.eIsProxy()) {
			InternalEObject oldEndLink = (InternalEObject)endLink;
			endLink = (Link)eResolveProxy(oldEndLink);
			if (endLink != oldEndLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.GROUP__END_LINK, oldEndLink, endLink));
			}
		}
		return endLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetEndLink() {
		return endLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLink(Link newEndLink) {
		Link oldEndLink = endLink;
		endLink = newEndLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GROUP__END_LINK, oldEndLink, endLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.GROUP__NAME:
				return getName();
			case ComponentPackage.GROUP__ROS2_CONTROL:
				return getRos2_control();
			case ComponentPackage.GROUP__BASE_LINK:
				if (resolve) return getBaseLink();
				return basicGetBaseLink();
			case ComponentPackage.GROUP__END_LINK:
				if (resolve) return getEndLink();
				return basicGetEndLink();
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
			case ComponentPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case ComponentPackage.GROUP__ROS2_CONTROL:
				setRos2_control((String)newValue);
				return;
			case ComponentPackage.GROUP__BASE_LINK:
				setBaseLink((Link)newValue);
				return;
			case ComponentPackage.GROUP__END_LINK:
				setEndLink((Link)newValue);
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
			case ComponentPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentPackage.GROUP__ROS2_CONTROL:
				setRos2_control(ROS2_CONTROL_EDEFAULT);
				return;
			case ComponentPackage.GROUP__BASE_LINK:
				setBaseLink((Link)null);
				return;
			case ComponentPackage.GROUP__END_LINK:
				setEndLink((Link)null);
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
			case ComponentPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentPackage.GROUP__ROS2_CONTROL:
				return ROS2_CONTROL_EDEFAULT == null ? ros2_control != null : !ROS2_CONTROL_EDEFAULT.equals(ros2_control);
			case ComponentPackage.GROUP__BASE_LINK:
				return baseLink != null;
			case ComponentPackage.GROUP__END_LINK:
				return endLink != null;
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
		result.append(", ros2_control: ");
		result.append(ros2_control);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
