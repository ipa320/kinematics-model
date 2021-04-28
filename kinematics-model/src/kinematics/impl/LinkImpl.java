/**
 */
package kinematics.impl;

import kinematics.Geometry;
import kinematics.KinematicsPackage;
import kinematics.Link;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematics.impl.LinkImpl#getVisual <em>Visual</em>}</li>
 *   <li>{@link kinematics.impl.LinkImpl#getCollision <em>Collision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getVisual() <em>Visual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisual()
	 * @generated
	 * @ordered
	 */
	protected Geometry visual;

	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected Geometry collision;

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
		return KinematicsPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getVisual() {
		if (visual != null && visual.eIsProxy()) {
			InternalEObject oldVisual = (InternalEObject)visual;
			visual = (Geometry)eResolveProxy(oldVisual);
			if (visual != oldVisual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.LINK__VISUAL, oldVisual, visual));
			}
		}
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry basicGetVisual() {
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisual(Geometry newVisual) {
		Geometry oldVisual = visual;
		visual = newVisual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.LINK__VISUAL, oldVisual, visual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getCollision() {
		if (collision != null && collision.eIsProxy()) {
			InternalEObject oldCollision = (InternalEObject)collision;
			collision = (Geometry)eResolveProxy(oldCollision);
			if (collision != oldCollision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsPackage.LINK__COLLISION, oldCollision, collision));
			}
		}
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry basicGetCollision() {
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollision(Geometry newCollision) {
		Geometry oldCollision = collision;
		collision = newCollision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinematicsPackage.LINK__COLLISION, oldCollision, collision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinematicsPackage.LINK__VISUAL:
				if (resolve) return getVisual();
				return basicGetVisual();
			case KinematicsPackage.LINK__COLLISION:
				if (resolve) return getCollision();
				return basicGetCollision();
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
			case KinematicsPackage.LINK__VISUAL:
				setVisual((Geometry)newValue);
				return;
			case KinematicsPackage.LINK__COLLISION:
				setCollision((Geometry)newValue);
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
			case KinematicsPackage.LINK__VISUAL:
				setVisual((Geometry)null);
				return;
			case KinematicsPackage.LINK__COLLISION:
				setCollision((Geometry)null);
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
			case KinematicsPackage.LINK__VISUAL:
				return visual != null;
			case KinematicsPackage.LINK__COLLISION:
				return collision != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
