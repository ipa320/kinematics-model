/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Joint;
import xacro.Limit;
import xacro.Link;
import xacro.ParameterValue;
import xacro.Pose;
import xacro.Vector3;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.JointImpl#getName <em>Name</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getChild <em>Child</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link xacro.impl.JointImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends MinimalEObjectImpl.Container implements Joint {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue name;

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
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Link child;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Pose origin;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Vector3 axis;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected Limit limit;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
		return XacroPackage.Literals.JOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(ParameterValue newName, NotificationChain msgs) {
		ParameterValue oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ParameterValue newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__NAME, newName, newName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XacroPackage.JOINT__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (Link)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XacroPackage.JOINT__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Link newChild) {
		Link oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Pose newOrigin, NotificationChain msgs) {
		Pose oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Pose newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3 getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(Vector3 newAxis, NotificationChain msgs) {
		Vector3 oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Vector3 newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(Limit newLimit, NotificationChain msgs) {
		Limit oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__LIMIT, oldLimit, newLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(Limit newLimit) {
		if (newLimit != limit) {
			NotificationChain msgs = null;
			if (limit != null)
				msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__LIMIT, null, msgs);
			if (newLimit != null)
				msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.JOINT__LIMIT, null, msgs);
			msgs = basicSetLimit(newLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__LIMIT, newLimit, newLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.JOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.JOINT__NAME:
				return basicSetName(null, msgs);
			case XacroPackage.JOINT__ORIGIN:
				return basicSetOrigin(null, msgs);
			case XacroPackage.JOINT__AXIS:
				return basicSetAxis(null, msgs);
			case XacroPackage.JOINT__LIMIT:
				return basicSetLimit(null, msgs);
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
			case XacroPackage.JOINT__NAME:
				return getName();
			case XacroPackage.JOINT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case XacroPackage.JOINT__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case XacroPackage.JOINT__ORIGIN:
				return getOrigin();
			case XacroPackage.JOINT__AXIS:
				return getAxis();
			case XacroPackage.JOINT__LIMIT:
				return getLimit();
			case XacroPackage.JOINT__TYPE:
				return getType();
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
			case XacroPackage.JOINT__NAME:
				setName((ParameterValue)newValue);
				return;
			case XacroPackage.JOINT__PARENT:
				setParent((Link)newValue);
				return;
			case XacroPackage.JOINT__CHILD:
				setChild((Link)newValue);
				return;
			case XacroPackage.JOINT__ORIGIN:
				setOrigin((Pose)newValue);
				return;
			case XacroPackage.JOINT__AXIS:
				setAxis((Vector3)newValue);
				return;
			case XacroPackage.JOINT__LIMIT:
				setLimit((Limit)newValue);
				return;
			case XacroPackage.JOINT__TYPE:
				setType((String)newValue);
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
			case XacroPackage.JOINT__NAME:
				setName((ParameterValue)null);
				return;
			case XacroPackage.JOINT__PARENT:
				setParent((Link)null);
				return;
			case XacroPackage.JOINT__CHILD:
				setChild((Link)null);
				return;
			case XacroPackage.JOINT__ORIGIN:
				setOrigin((Pose)null);
				return;
			case XacroPackage.JOINT__AXIS:
				setAxis((Vector3)null);
				return;
			case XacroPackage.JOINT__LIMIT:
				setLimit((Limit)null);
				return;
			case XacroPackage.JOINT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XacroPackage.JOINT__NAME:
				return name != null;
			case XacroPackage.JOINT__PARENT:
				return parent != null;
			case XacroPackage.JOINT__CHILD:
				return child != null;
			case XacroPackage.JOINT__ORIGIN:
				return origin != null;
			case XacroPackage.JOINT__AXIS:
				return axis != null;
			case XacroPackage.JOINT__LIMIT:
				return limit != null;
			case XacroPackage.JOINT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //JointImpl
