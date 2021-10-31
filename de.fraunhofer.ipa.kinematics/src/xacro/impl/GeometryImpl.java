/**
 */
package xacro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Box;
import xacro.Cylinder;
import xacro.Geometry;
import xacro.Mesh;
import xacro.Sphere;
import xacro.XacroPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xacro.impl.GeometryImpl#getBox <em>Box</em>}</li>
 *   <li>{@link xacro.impl.GeometryImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link xacro.impl.GeometryImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link xacro.impl.GeometryImpl#getSphere <em>Sphere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometryImpl extends MinimalEObjectImpl.Container implements Geometry {
	/**
	 * The cached value of the '{@link #getBox() <em>Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBox()
	 * @generated
	 * @ordered
	 */
	protected Box box;

	/**
	 * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinder()
	 * @generated
	 * @ordered
	 */
	protected Cylinder cylinder;

	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected Mesh mesh;

	/**
	 * The cached value of the '{@link #getSphere() <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphere()
	 * @generated
	 * @ordered
	 */
	protected Sphere sphere;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XacroPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBox() {
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBox(Box newBox, NotificationChain msgs) {
		Box oldBox = box;
		box = newBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__BOX, oldBox, newBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBox(Box newBox) {
		if (newBox != box) {
			NotificationChain msgs = null;
			if (box != null)
				msgs = ((InternalEObject)box).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__BOX, null, msgs);
			if (newBox != null)
				msgs = ((InternalEObject)newBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__BOX, null, msgs);
			msgs = basicSetBox(newBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__BOX, newBox, newBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder getCylinder() {
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylinder(Cylinder newCylinder, NotificationChain msgs) {
		Cylinder oldCylinder = cylinder;
		cylinder = newCylinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__CYLINDER, oldCylinder, newCylinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylinder(Cylinder newCylinder) {
		if (newCylinder != cylinder) {
			NotificationChain msgs = null;
			if (cylinder != null)
				msgs = ((InternalEObject)cylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__CYLINDER, null, msgs);
			if (newCylinder != null)
				msgs = ((InternalEObject)newCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__CYLINDER, null, msgs);
			msgs = basicSetCylinder(newCylinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__CYLINDER, newCylinder, newCylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh getMesh() {
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMesh(Mesh newMesh, NotificationChain msgs) {
		Mesh oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__MESH, oldMesh, newMesh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesh(Mesh newMesh) {
		if (newMesh != mesh) {
			NotificationChain msgs = null;
			if (mesh != null)
				msgs = ((InternalEObject)mesh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__MESH, null, msgs);
			if (newMesh != null)
				msgs = ((InternalEObject)newMesh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__MESH, null, msgs);
			msgs = basicSetMesh(newMesh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__MESH, newMesh, newMesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere getSphere() {
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(Sphere newSphere, NotificationChain msgs) {
		Sphere oldSphere = sphere;
		sphere = newSphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__SPHERE, oldSphere, newSphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(Sphere newSphere) {
		if (newSphere != sphere) {
			NotificationChain msgs = null;
			if (sphere != null)
				msgs = ((InternalEObject)sphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__SPHERE, null, msgs);
			if (newSphere != null)
				msgs = ((InternalEObject)newSphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XacroPackage.GEOMETRY__SPHERE, null, msgs);
			msgs = basicSetSphere(newSphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XacroPackage.GEOMETRY__SPHERE, newSphere, newSphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XacroPackage.GEOMETRY__BOX:
				return basicSetBox(null, msgs);
			case XacroPackage.GEOMETRY__CYLINDER:
				return basicSetCylinder(null, msgs);
			case XacroPackage.GEOMETRY__MESH:
				return basicSetMesh(null, msgs);
			case XacroPackage.GEOMETRY__SPHERE:
				return basicSetSphere(null, msgs);
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
			case XacroPackage.GEOMETRY__BOX:
				return getBox();
			case XacroPackage.GEOMETRY__CYLINDER:
				return getCylinder();
			case XacroPackage.GEOMETRY__MESH:
				return getMesh();
			case XacroPackage.GEOMETRY__SPHERE:
				return getSphere();
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
			case XacroPackage.GEOMETRY__BOX:
				setBox((Box)newValue);
				return;
			case XacroPackage.GEOMETRY__CYLINDER:
				setCylinder((Cylinder)newValue);
				return;
			case XacroPackage.GEOMETRY__MESH:
				setMesh((Mesh)newValue);
				return;
			case XacroPackage.GEOMETRY__SPHERE:
				setSphere((Sphere)newValue);
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
			case XacroPackage.GEOMETRY__BOX:
				setBox((Box)null);
				return;
			case XacroPackage.GEOMETRY__CYLINDER:
				setCylinder((Cylinder)null);
				return;
			case XacroPackage.GEOMETRY__MESH:
				setMesh((Mesh)null);
				return;
			case XacroPackage.GEOMETRY__SPHERE:
				setSphere((Sphere)null);
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
			case XacroPackage.GEOMETRY__BOX:
				return box != null;
			case XacroPackage.GEOMETRY__CYLINDER:
				return cylinder != null;
			case XacroPackage.GEOMETRY__MESH:
				return mesh != null;
			case XacroPackage.GEOMETRY__SPHERE:
				return sphere != null;
		}
		return super.eIsSet(featureID);
	}

} //GeometryImpl
