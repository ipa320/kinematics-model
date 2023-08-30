/**
 */
package component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.GitRepo#getDistro <em>Distro</em>}</li>
 *   <li>{@link component.GitRepo#getRepo <em>Repo</em>}</li>
 *   <li>{@link component.GitRepo#getPackage <em>Package</em>}</li>
 *   <li>{@link component.GitRepo#getVersion <em>Version</em>}</li>
 *   <li>{@link component.GitRepo#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see component.ComponentPackage#getGitRepo()
 * @model
 * @generated
 */
public interface GitRepo extends EObject {
	/**
	 * Returns the value of the '<em><b>Distro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distro</em>' attribute.
	 * @see #setDistro(String)
	 * @see component.ComponentPackage#getGitRepo_Distro()
	 * @model required="true"
	 * @generated
	 */
	String getDistro();

	/**
	 * Sets the value of the '{@link component.GitRepo#getDistro <em>Distro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distro</em>' attribute.
	 * @see #getDistro()
	 * @generated
	 */
	void setDistro(String value);

	/**
	 * Returns the value of the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo</em>' attribute.
	 * @see #setRepo(String)
	 * @see component.ComponentPackage#getGitRepo_Repo()
	 * @model required="true"
	 * @generated
	 */
	String getRepo();

	/**
	 * Sets the value of the '{@link component.GitRepo#getRepo <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo</em>' attribute.
	 * @see #getRepo()
	 * @generated
	 */
	void setRepo(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see component.ComponentPackage#getGitRepo_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link component.GitRepo#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see component.ComponentPackage#getGitRepo_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link component.GitRepo#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see component.ComponentPackage#getGitRepo_Branch()
	 * @model
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link component.GitRepo#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

} // GitRepo
