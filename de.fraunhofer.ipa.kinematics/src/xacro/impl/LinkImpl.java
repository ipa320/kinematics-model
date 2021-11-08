/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Collision;
import xacro.Inertial;
import xacro.Link;
import xacro.ParameterString;
import xacro.Visual;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link xacro.impl.LinkImpl#getVisual <em>Visual</em>}</li>
 *   <li>{@link xacro.impl.LinkImpl#getCollision <em>Collision</em>}</li>
 *   <li>{@link xacro.impl.LinkImpl#getInertial <em>Inertial</em>}</li>
 *   <li>{@link xacro.impl.LinkImpl#getResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected ParameterString name;

	/**
	 * The cached value of the '{@link #getVisual() <em>Visual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisual()
	 * @generated
	 * @ordered
	 */
	protected Visual visual;

	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected Collision collision;

	/**
	 * The cached value of the '{@link #getInertial() <em>Inertial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertial()
	 * @generated
	 * @ordered
	 */
	protected Inertial inertial;

	/**
	 * The default value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected String resolved = RESOLVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterString getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(ParameterString newName, NotificationChain msgs) {
		ParameterString oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ParameterString newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual getVisual() {
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisual(Visual newVisual, NotificationChain msgs) {
		Visual oldVisual = visual;
		visual = newVisual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__VISUAL, oldVisual, newVisual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisual(Visual newVisual) {
		if (newVisual != visual) {
			NotificationChain msgs = null;
			if (visual != null)
				msgs = ((InternalEObject)visual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__VISUAL, null, msgs);
			if (newVisual != null)
				msgs = ((InternalEObject)newVisual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__VISUAL, null, msgs);
			msgs = basicSetVisual(newVisual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__VISUAL, newVisual, newVisual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision getCollision() {
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollision(Collision newCollision, NotificationChain msgs) {
		Collision oldCollision = collision;
		collision = newCollision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__COLLISION, oldCollision, newCollision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollision(Collision newCollision) {
		if (newCollision != collision) {
			NotificationChain msgs = null;
			if (collision != null)
				msgs = ((InternalEObject)collision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__COLLISION, null, msgs);
			if (newCollision != null)
				msgs = ((InternalEObject)newCollision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__COLLISION, null, msgs);
			msgs = basicSetCollision(newCollision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__COLLISION, newCollision, newCollision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial getInertial() {
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInertial(Inertial newInertial, NotificationChain msgs) {
		Inertial oldInertial = inertial;
		inertial = newInertial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__INERTIAL, oldInertial, newInertial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInertial(Inertial newInertial) {
		if (newInertial != inertial) {
			NotificationChain msgs = null;
			if (inertial != null)
				msgs = ((InternalEObject)inertial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__INERTIAL, null, msgs);
			if (newInertial != null)
				msgs = ((InternalEObject)newInertial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.LINK__INERTIAL, null, msgs);
			msgs = basicSetInertial(newInertial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__INERTIAL, newInertial, newInertial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(String newResolved) {
		String oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.LINK__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.LINK__NAME:
				return basicSetName(null, msgs);
			case XacroPackage.LINK__VISUAL:
				return basicSetVisual(null, msgs);
			case XacroPackage.LINK__COLLISION:
				return basicSetCollision(null, msgs);
			case XacroPackage.LINK__INERTIAL:
				return basicSetInertial(null, msgs);
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
			case XacroPackage.LINK__NAME:
				return getName();
			case XacroPackage.LINK__VISUAL:
				return getVisual();
			case XacroPackage.LINK__COLLISION:
				return getCollision();
			case XacroPackage.LINK__INERTIAL:
				return getInertial();
			case XacroPackage.LINK__RESOLVED:
				return getResolved();
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
			case XacroPackage.LINK__NAME:
				setName((ParameterString)newValue);
				return;
			case XacroPackage.LINK__VISUAL:
				setVisual((Visual)newValue);
				return;
			case XacroPackage.LINK__COLLISION:
				setCollision((Collision)newValue);
				return;
			case XacroPackage.LINK__INERTIAL:
				setInertial((Inertial)newValue);
				return;
			case XacroPackage.LINK__RESOLVED:
				setResolved((String)newValue);
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
			case XacroPackage.LINK__NAME:
				setName((ParameterString)null);
				return;
			case XacroPackage.LINK__VISUAL:
				setVisual((Visual)null);
				return;
			case XacroPackage.LINK__COLLISION:
				setCollision((Collision)null);
				return;
			case XacroPackage.LINK__INERTIAL:
				setInertial((Inertial)null);
				return;
			case XacroPackage.LINK__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
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
			case XacroPackage.LINK__NAME:
				return name != null;
			case XacroPackage.LINK__VISUAL:
				return visual != null;
			case XacroPackage.LINK__COLLISION:
				return collision != null;
			case XacroPackage.LINK__INERTIAL:
				return inertial != null;
			case XacroPackage.LINK__RESOLVED:
				return RESOLVED_EDEFAULT == null ? resolved != null : !RESOLVED_EDEFAULT.equals(resolved);
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
		result.append(" (resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
