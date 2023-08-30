/**
 */
package component.impl;

import component.ComponentPackage;
import component.GitRepo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Repo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.GitRepoImpl#getDistro <em>Distro</em>}</li>
 *   <li>{@link component.impl.GitRepoImpl#getRepo <em>Repo</em>}</li>
 *   <li>{@link component.impl.GitRepoImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link component.impl.GitRepoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link component.impl.GitRepoImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitRepoImpl extends MinimalEObjectImpl.Container implements GitRepo {
	/**
	 * The default value of the '{@link #getDistro() <em>Distro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistro()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistro() <em>Distro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistro()
	 * @generated
	 * @ordered
	 */
	protected String distro = DISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepo() <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepo()
	 * @generated
	 * @ordered
	 */
	protected static final String REPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepo() <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepo()
	 * @generated
	 * @ordered
	 */
	protected String repo = REPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

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
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected String branch = BRANCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitRepoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.GIT_REPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistro() {
		return distro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistro(String newDistro) {
		String oldDistro = distro;
		distro = newDistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GIT_REPO__DISTRO, oldDistro, distro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepo() {
		return repo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepo(String newRepo) {
		String oldRepo = repo;
		repo = newRepo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GIT_REPO__REPO, oldRepo, repo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GIT_REPO__PACKAGE, oldPackage, package_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GIT_REPO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(String newBranch) {
		String oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.GIT_REPO__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentPackage.GIT_REPO__DISTRO:
				return getDistro();
			case ComponentPackage.GIT_REPO__REPO:
				return getRepo();
			case ComponentPackage.GIT_REPO__PACKAGE:
				return getPackage();
			case ComponentPackage.GIT_REPO__VERSION:
				return getVersion();
			case ComponentPackage.GIT_REPO__BRANCH:
				return getBranch();
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
			case ComponentPackage.GIT_REPO__DISTRO:
				setDistro((String)newValue);
				return;
			case ComponentPackage.GIT_REPO__REPO:
				setRepo((String)newValue);
				return;
			case ComponentPackage.GIT_REPO__PACKAGE:
				setPackage((String)newValue);
				return;
			case ComponentPackage.GIT_REPO__VERSION:
				setVersion((String)newValue);
				return;
			case ComponentPackage.GIT_REPO__BRANCH:
				setBranch((String)newValue);
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
			case ComponentPackage.GIT_REPO__DISTRO:
				setDistro(DISTRO_EDEFAULT);
				return;
			case ComponentPackage.GIT_REPO__REPO:
				setRepo(REPO_EDEFAULT);
				return;
			case ComponentPackage.GIT_REPO__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case ComponentPackage.GIT_REPO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ComponentPackage.GIT_REPO__BRANCH:
				setBranch(BRANCH_EDEFAULT);
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
			case ComponentPackage.GIT_REPO__DISTRO:
				return DISTRO_EDEFAULT == null ? distro != null : !DISTRO_EDEFAULT.equals(distro);
			case ComponentPackage.GIT_REPO__REPO:
				return REPO_EDEFAULT == null ? repo != null : !REPO_EDEFAULT.equals(repo);
			case ComponentPackage.GIT_REPO__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case ComponentPackage.GIT_REPO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ComponentPackage.GIT_REPO__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
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
		result.append(" (distro: ");
		result.append(distro);
		result.append(", repo: ");
		result.append(repo);
		result.append(", package: ");
		result.append(package_);
		result.append(", version: ");
		result.append(version);
		result.append(", branch: ");
		result.append(branch);
		result.append(')');
		return result.toString();
	}

} //GitRepoImpl
