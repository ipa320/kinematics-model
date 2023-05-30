/**
 */
package urdf;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urdf.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link urdf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link urdf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link urdf.DocumentRoot#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see urdf.UrdfPackage#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see urdf.UrdfPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see urdf.UrdfPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="ecore.EStringToStringMapEntry&lt;ecore.EString, ecore.EString&gt;" transient="true"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see urdf.UrdfPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="ecore.EStringToStringMapEntry&lt;ecore.EString, ecore.EString&gt;" transient="true"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robot</em>' containment reference.
	 * @see #setRobot(Robot)
	 * @see urdf.UrdfPackage#getDocumentRoot_Robot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Robot getRobot();

	/**
	 * Sets the value of the '{@link urdf.DocumentRoot#getRobot <em>Robot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robot</em>' containment reference.
	 * @see #getRobot()
	 * @generated
	 */
	void setRobot(Robot value);

} // DocumentRoot
