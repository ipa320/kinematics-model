/**
 */
package kinematics.impl;

import java.util.Collection;

import kinematics.Joint;
import kinematics.KinematicsPackage;
import kinematics.Link;
import kinematics.Transform;
import kinematics.Vector3d;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.JointImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getChild <em>Child</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kinematics.impl.JointImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends MinimalEObjectImpl.Container implements Joint {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Link parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> child;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Transform origin;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Vector3d axis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinematicsPackage.Literals.JOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Link)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.JOINT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Link newParent) {
		Link oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getChild() {
		if (child == null) {
			child = new EObjectResolvingEList<Link>(Link.class, this, KinematicsPackage.JOINT__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (Transform)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.JOINT__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Transform newOrigin) {
		Transform oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (Vector3d)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.JOINT__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Vector3d newAxis) {
		Vector3d oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.JOINT__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinematicsPackage.JOINT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case KinematicsPackage.JOINT__CHILD:
				return getChild();
			case KinematicsPackage.JOINT__PREFIX:
				return getPrefix();
			case KinematicsPackage.JOINT__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case KinematicsPackage.JOINT__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
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
			case KinematicsPackage.JOINT__PARENT:
				setParent((Link)newValue);
				return;
			case KinematicsPackage.JOINT__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends Link>)newValue);
				return;
			case KinematicsPackage.JOINT__PREFIX:
				setPrefix((String)newValue);
				return;
			case KinematicsPackage.JOINT__ORIGIN:
				setOrigin((Transform)newValue);
				return;
			case KinematicsPackage.JOINT__AXIS:
				setAxis((Vector3d)newValue);
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
			case KinematicsPackage.JOINT__PARENT:
				setParent((Link)null);
				return;
			case KinematicsPackage.JOINT__CHILD:
				getChild().clear();
				return;
			case KinematicsPackage.JOINT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case KinematicsPackage.JOINT__ORIGIN:
				setOrigin((Transform)null);
				return;
			case KinematicsPackage.JOINT__AXIS:
				setAxis((Vector3d)null);
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
			case KinematicsPackage.JOINT__PARENT:
				return parent != null;
			case KinematicsPackage.JOINT__CHILD:
				return child != null && !child.isEmpty();
			case KinematicsPackage.JOINT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case KinematicsPackage.JOINT__ORIGIN:
				return origin != null;
			case KinematicsPackage.JOINT__AXIS:
				return axis != null;
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
		result.append(" (Prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //JointImpl
