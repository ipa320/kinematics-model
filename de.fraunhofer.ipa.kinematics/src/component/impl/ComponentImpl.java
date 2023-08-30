/**
 */
package component.impl;

import component.BaseAttachment;
import component.Component;
import component.ComponentPackage;
import component.ConfiguredComponent;
import component.Connection;
import component.FlangeAttachment;
import component.GitRepo;
import component.Group;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getGitRepo <em>Git Repo</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getBaseAttachment <em>Base Attachment</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getFlangeAttachment <em>Flange Attachment</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getLink <em>Link</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getJoint <em>Joint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	protected static final String VERSION_EDEFAULT = null;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGitRepo() <em>Git Repo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitRepo()
	 * @generated
	 * @ordered
	 */
	protected GitRepo gitRepo;

	/**
	 * The cached value of the '{@link #getBaseAttachment() <em>Base Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseAttachment> baseAttachment;

	/**
	 * The cached value of the '{@link #getFlangeAttachment() <em>Flange Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<FlangeAttachment> flangeAttachment;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredComponent> component;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__NAME, oldName, name));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitRepo getGitRepo() {
		return gitRepo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGitRepo(GitRepo newGitRepo, NotificationChain msgs) {
		GitRepo oldGitRepo = gitRepo;
		gitRepo = newGitRepo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__GIT_REPO, oldGitRepo, newGitRepo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGitRepo(GitRepo newGitRepo) {
		if (newGitRepo != gitRepo) {
			NotificationChain msgs = null;
			if (gitRepo != null)
				msgs = ((InternalEObject)gitRepo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT__GIT_REPO, null, msgs);
			if (newGitRepo != null)
				msgs = ((InternalEObject)newGitRepo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.COMPONENT__GIT_REPO, null, msgs);
			msgs = basicSetGitRepo(newGitRepo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.COMPONENT__GIT_REPO, newGitRepo, newGitRepo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseAttachment> getBaseAttachment() {
		if (baseAttachment == null) {
			baseAttachment = new EObjectContainmentEList<BaseAttachment>(BaseAttachment.class, this, ComponentPackage.COMPONENT__BASE_ATTACHMENT);
		}
		return baseAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlangeAttachment> getFlangeAttachment() {
		if (flangeAttachment == null) {
			flangeAttachment = new EObjectContainmentEList<FlangeAttachment>(FlangeAttachment.class, this, ComponentPackage.COMPONENT__FLANGE_ATTACHMENT);
		}
		return flangeAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, ComponentPackage.COMPONENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ConfiguredComponent>(ConfiguredComponent.class, this, ComponentPackage.COMPONENT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, ComponentPackage.COMPONENT__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, ComponentPackage.COMPONENT__LINK);
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
			joint = new EObjectContainmentEList<Joint>(Joint.class, this, ComponentPackage.COMPONENT__JOINT);
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
			case ComponentPackage.COMPONENT__GIT_REPO:
				return basicSetGitRepo(null, msgs);
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
				return ((InternalEList<?>)getBaseAttachment()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
				return ((InternalEList<?>)getFlangeAttachment()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case ComponentPackage.COMPONENT__JOINT:
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
			case ComponentPackage.COMPONENT__NAME:
				return getName();
			case ComponentPackage.COMPONENT__VERSION:
				return getVersion();
			case ComponentPackage.COMPONENT__CATEGORY:
				return getCategory();
			case ComponentPackage.COMPONENT__GIT_REPO:
				return getGitRepo();
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
				return getBaseAttachment();
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
				return getFlangeAttachment();
			case ComponentPackage.COMPONENT__GROUP:
				return getGroup();
			case ComponentPackage.COMPONENT__COMPONENT:
				return getComponent();
			case ComponentPackage.COMPONENT__CONNECTION:
				return getConnection();
			case ComponentPackage.COMPONENT__LINK:
				return getLink();
			case ComponentPackage.COMPONENT__JOINT:
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
			case ComponentPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ComponentPackage.COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case ComponentPackage.COMPONENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case ComponentPackage.COMPONENT__GIT_REPO:
				setGitRepo((GitRepo)newValue);
				return;
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
				getBaseAttachment().clear();
				getBaseAttachment().addAll((Collection<? extends BaseAttachment>)newValue);
				return;
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
				getFlangeAttachment().clear();
				getFlangeAttachment().addAll((Collection<? extends FlangeAttachment>)newValue);
				return;
			case ComponentPackage.COMPONENT__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case ComponentPackage.COMPONENT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ConfiguredComponent>)newValue);
				return;
			case ComponentPackage.COMPONENT__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case ComponentPackage.COMPONENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case ComponentPackage.COMPONENT__JOINT:
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
			case ComponentPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case ComponentPackage.COMPONENT__GIT_REPO:
				setGitRepo((GitRepo)null);
				return;
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
				getBaseAttachment().clear();
				return;
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
				getFlangeAttachment().clear();
				return;
			case ComponentPackage.COMPONENT__GROUP:
				getGroup().clear();
				return;
			case ComponentPackage.COMPONENT__COMPONENT:
				getComponent().clear();
				return;
			case ComponentPackage.COMPONENT__CONNECTION:
				getConnection().clear();
				return;
			case ComponentPackage.COMPONENT__LINK:
				getLink().clear();
				return;
			case ComponentPackage.COMPONENT__JOINT:
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
			case ComponentPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentPackage.COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ComponentPackage.COMPONENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case ComponentPackage.COMPONENT__GIT_REPO:
				return gitRepo != null;
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
				return baseAttachment != null && !baseAttachment.isEmpty();
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
				return flangeAttachment != null && !flangeAttachment.isEmpty();
			case ComponentPackage.COMPONENT__GROUP:
				return group != null && !group.isEmpty();
			case ComponentPackage.COMPONENT__COMPONENT:
				return component != null && !component.isEmpty();
			case ComponentPackage.COMPONENT__CONNECTION:
				return connection != null && !connection.isEmpty();
			case ComponentPackage.COMPONENT__LINK:
				return link != null && !link.isEmpty();
			case ComponentPackage.COMPONENT__JOINT:
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
		result.append(", version: ");
		result.append(version);
		result.append(", category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
