/**
 */
package urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.Collision#getOrigin <em>Origin</em>}</li>
 *   <li>{@link urdf.Collision#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link urdf.Collision#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link urdf.Collision#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getCollision()
 * @model
 * @generated
 */
public interface Collision extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see urdf.UrdfPackage#getCollision_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link urdf.Collision#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(Geometry)
	 * @see urdf.UrdfPackage#getCollision_Geometry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link urdf.Collision#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' containment reference.
	 * @see #setVerbose(Verbose)
	 * @see urdf.UrdfPackage#getCollision_Verbose()
	 * @model containment="true"
	 * @generated
	 */
	Verbose getVerbose();

	/**
	 * Sets the value of the '{@link urdf.Collision#getVerbose <em>Verbose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' containment reference.
	 * @see #getVerbose()
	 * @generated
	 */
	void setVerbose(Verbose value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see urdf.UrdfPackage#getCollision_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link urdf.Collision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Collision
