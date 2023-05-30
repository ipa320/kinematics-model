/**
 */
package urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Robot#getJoint <em>Joint</em>}</li>
 *   <li>{@link urdf.Robot#getLink <em>Link</em>}</li>
 *   <li>{@link urdf.Robot#getMaterial <em>Material</em>}</li>
 *   <li>{@link urdf.Robot#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link urdf.Robot#getName <em>Name</em>}</li>
 *   <li>{@link urdf.Robot#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see urdf.UrdfPackage#getRobot_Joint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Joint> getJoint();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see urdf.UrdfPackage#getRobot_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.MaterialGlobal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see urdf.UrdfPackage#getRobot_Material()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaterialGlobal> getMaterial();

	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link urdf.Transmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission</em>' containment reference list.
	 * @see urdf.UrdfPackage#getRobot_Transmission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transmission> getTransmission();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see urdf.UrdfPackage#getRobot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link urdf.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see urdf.UrdfPackage#getRobot_Version()
	 * @model default="1.0" unsettable="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link urdf.Robot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link urdf.Robot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link urdf.Robot#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // Robot
