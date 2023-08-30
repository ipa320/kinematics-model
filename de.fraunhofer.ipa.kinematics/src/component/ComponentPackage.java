/**
 */
package component;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see component.ComponentFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/component";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentPackage eINSTANCE = component.impl.ComponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link component.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.AttachmentImpl
	 * @see component.impl.ComponentPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link component.impl.BaseAttachmentImpl <em>Base Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.BaseAttachmentImpl
	 * @see component.impl.ComponentPackageImpl#getBaseAttachment()
	 * @generated
	 */
	int BASE_ATTACHMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ATTACHMENT__NAME = ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ATTACHMENT__ORIGIN = ATTACHMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ATTACHMENT__PARENT = ATTACHMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Base Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ATTACHMENT_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ATTACHMENT_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ComponentImpl
	 * @see component.impl.ComponentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Git Repo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GIT_REPO = 3;

	/**
	 * The feature id for the '<em><b>Base Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_ATTACHMENT = 4;

	/**
	 * The feature id for the '<em><b>Flange Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FLANGE_ATTACHMENT = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GROUP = 6;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LINK = 9;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__JOINT = 10;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link component.impl.ConfiguredComponentImpl <em>Configured Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ConfiguredComponentImpl
	 * @see component.impl.ComponentPackageImpl#getConfiguredComponent()
	 * @generated
	 */
	int CONFIGURED_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_COMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_COMPONENT__PREFIX = 2;

	/**
	 * The number of structural features of the '<em>Configured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configured Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link component.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.ConnectionImpl
	 * @see component.impl.ComponentPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BASE_ATTACHMENT = 1;

	/**
	 * The feature id for the '<em><b>Flange Attachment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FLANGE_ATTACHMENT = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link component.impl.FlangeAttachmentImpl <em>Flange Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.FlangeAttachmentImpl
	 * @see component.impl.ComponentPackageImpl#getFlangeAttachment()
	 * @generated
	 */
	int FLANGE_ATTACHMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLANGE_ATTACHMENT__NAME = ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLANGE_ATTACHMENT__ORIGIN = ATTACHMENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLANGE_ATTACHMENT__PARENT = ATTACHMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Flange Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLANGE_ATTACHMENT_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flange Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLANGE_ATTACHMENT_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link component.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.GroupImpl
	 * @see component.impl.ComponentPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ros2 control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ROS2_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Base Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BASE_LINK = 2;

	/**
	 * The feature id for the '<em><b>End Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__END_LINK = 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link component.impl.GitRepoImpl <em>Git Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see component.impl.GitRepoImpl
	 * @see component.impl.ComponentPackageImpl#getGitRepo()
	 * @generated
	 */
	int GIT_REPO = 7;

	/**
	 * The feature id for the '<em><b>Distro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO__DISTRO = 0;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO__REPO = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO__BRANCH = 4;

	/**
	 * The number of structural features of the '<em>Git Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Git Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link component.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see component.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the attribute '{@link component.Attachment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see component.Attachment#getName()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link component.Attachment#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see component.Attachment#getOrigin()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Origin();

	/**
	 * Returns the meta object for the reference '{@link component.Attachment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see component.Attachment#getParent()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Parent();

	/**
	 * Returns the meta object for class '{@link component.BaseAttachment <em>Base Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Attachment</em>'.
	 * @see component.BaseAttachment
	 * @generated
	 */
	EClass getBaseAttachment();

	/**
	 * Returns the meta object for class '{@link component.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see component.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see component.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see component.Component#getVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link component.Component#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see component.Component#getCategory()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Category();

	/**
	 * Returns the meta object for the containment reference '{@link component.Component#getGitRepo <em>Git Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Git Repo</em>'.
	 * @see component.Component#getGitRepo()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_GitRepo();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getBaseAttachment <em>Base Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Attachment</em>'.
	 * @see component.Component#getBaseAttachment()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_BaseAttachment();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getFlangeAttachment <em>Flange Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flange Attachment</em>'.
	 * @see component.Component#getFlangeAttachment()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FlangeAttachment();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see component.Component#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see component.Component#getComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see component.Component#getConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see component.Component#getLink()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link component.Component#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see component.Component#getJoint()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Joint();

	/**
	 * Returns the meta object for class '{@link component.ConfiguredComponent <em>Configured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Component</em>'.
	 * @see component.ConfiguredComponent
	 * @generated
	 */
	EClass getConfiguredComponent();

	/**
	 * Returns the meta object for the attribute '{@link component.ConfiguredComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see component.ConfiguredComponent#getName()
	 * @see #getConfiguredComponent()
	 * @generated
	 */
	EAttribute getConfiguredComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link component.ConfiguredComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see component.ConfiguredComponent#getType()
	 * @see #getConfiguredComponent()
	 * @generated
	 */
	EReference getConfiguredComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link component.ConfiguredComponent#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see component.ConfiguredComponent#getPrefix()
	 * @see #getConfiguredComponent()
	 * @generated
	 */
	EAttribute getConfiguredComponent_Prefix();

	/**
	 * Returns the meta object for class '{@link component.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see component.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link component.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see component.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the reference '{@link component.Connection#getBaseAttachment <em>Base Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Attachment</em>'.
	 * @see component.Connection#getBaseAttachment()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_BaseAttachment();

	/**
	 * Returns the meta object for the reference '{@link component.Connection#getFlangeAttachment <em>Flange Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flange Attachment</em>'.
	 * @see component.Connection#getFlangeAttachment()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FlangeAttachment();

	/**
	 * Returns the meta object for class '{@link component.FlangeAttachment <em>Flange Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flange Attachment</em>'.
	 * @see component.FlangeAttachment
	 * @generated
	 */
	EClass getFlangeAttachment();

	/**
	 * Returns the meta object for class '{@link component.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see component.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link component.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see component.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link component.Group#getRos2_control <em>Ros2 control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ros2 control</em>'.
	 * @see component.Group#getRos2_control()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Ros2_control();

	/**
	 * Returns the meta object for the reference '{@link component.Group#getBaseLink <em>Base Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Link</em>'.
	 * @see component.Group#getBaseLink()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_BaseLink();

	/**
	 * Returns the meta object for the reference '{@link component.Group#getEndLink <em>End Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Link</em>'.
	 * @see component.Group#getEndLink()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_EndLink();

	/**
	 * Returns the meta object for class '{@link component.GitRepo <em>Git Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Repo</em>'.
	 * @see component.GitRepo
	 * @generated
	 */
	EClass getGitRepo();

	/**
	 * Returns the meta object for the attribute '{@link component.GitRepo#getDistro <em>Distro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distro</em>'.
	 * @see component.GitRepo#getDistro()
	 * @see #getGitRepo()
	 * @generated
	 */
	EAttribute getGitRepo_Distro();

	/**
	 * Returns the meta object for the attribute '{@link component.GitRepo#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo</em>'.
	 * @see component.GitRepo#getRepo()
	 * @see #getGitRepo()
	 * @generated
	 */
	EAttribute getGitRepo_Repo();

	/**
	 * Returns the meta object for the attribute '{@link component.GitRepo#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see component.GitRepo#getPackage()
	 * @see #getGitRepo()
	 * @generated
	 */
	EAttribute getGitRepo_Package();

	/**
	 * Returns the meta object for the attribute '{@link component.GitRepo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see component.GitRepo#getVersion()
	 * @see #getGitRepo()
	 * @generated
	 */
	EAttribute getGitRepo_Version();

	/**
	 * Returns the meta object for the attribute '{@link component.GitRepo#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see component.GitRepo#getBranch()
	 * @see #getGitRepo()
	 * @generated
	 */
	EAttribute getGitRepo_Branch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentFactory getComponentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link component.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.AttachmentImpl
		 * @see component.impl.ComponentPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__NAME = eINSTANCE.getAttachment_Name();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__ORIGIN = eINSTANCE.getAttachment_Origin();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PARENT = eINSTANCE.getAttachment_Parent();

		/**
		 * The meta object literal for the '{@link component.impl.BaseAttachmentImpl <em>Base Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.BaseAttachmentImpl
		 * @see component.impl.ComponentPackageImpl#getBaseAttachment()
		 * @generated
		 */
		EClass BASE_ATTACHMENT = eINSTANCE.getBaseAttachment();

		/**
		 * The meta object literal for the '{@link component.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ComponentImpl
		 * @see component.impl.ComponentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VERSION = eINSTANCE.getComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CATEGORY = eINSTANCE.getComponent_Category();

		/**
		 * The meta object literal for the '<em><b>Git Repo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__GIT_REPO = eINSTANCE.getComponent_GitRepo();

		/**
		 * The meta object literal for the '<em><b>Base Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BASE_ATTACHMENT = eINSTANCE.getComponent_BaseAttachment();

		/**
		 * The meta object literal for the '<em><b>Flange Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FLANGE_ATTACHMENT = eINSTANCE.getComponent_FlangeAttachment();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__GROUP = eINSTANCE.getComponent_Group();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT = eINSTANCE.getComponent_Component();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTION = eINSTANCE.getComponent_Connection();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LINK = eINSTANCE.getComponent_Link();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__JOINT = eINSTANCE.getComponent_Joint();

		/**
		 * The meta object literal for the '{@link component.impl.ConfiguredComponentImpl <em>Configured Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ConfiguredComponentImpl
		 * @see component.impl.ComponentPackageImpl#getConfiguredComponent()
		 * @generated
		 */
		EClass CONFIGURED_COMPONENT = eINSTANCE.getConfiguredComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURED_COMPONENT__NAME = eINSTANCE.getConfiguredComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_COMPONENT__TYPE = eINSTANCE.getConfiguredComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURED_COMPONENT__PREFIX = eINSTANCE.getConfiguredComponent_Prefix();

		/**
		 * The meta object literal for the '{@link component.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.ConnectionImpl
		 * @see component.impl.ComponentPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Base Attachment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BASE_ATTACHMENT = eINSTANCE.getConnection_BaseAttachment();

		/**
		 * The meta object literal for the '<em><b>Flange Attachment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FLANGE_ATTACHMENT = eINSTANCE.getConnection_FlangeAttachment();

		/**
		 * The meta object literal for the '{@link component.impl.FlangeAttachmentImpl <em>Flange Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.FlangeAttachmentImpl
		 * @see component.impl.ComponentPackageImpl#getFlangeAttachment()
		 * @generated
		 */
		EClass FLANGE_ATTACHMENT = eINSTANCE.getFlangeAttachment();

		/**
		 * The meta object literal for the '{@link component.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.GroupImpl
		 * @see component.impl.ComponentPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Ros2 control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ROS2_CONTROL = eINSTANCE.getGroup_Ros2_control();

		/**
		 * The meta object literal for the '<em><b>Base Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__BASE_LINK = eINSTANCE.getGroup_BaseLink();

		/**
		 * The meta object literal for the '<em><b>End Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__END_LINK = eINSTANCE.getGroup_EndLink();

		/**
		 * The meta object literal for the '{@link component.impl.GitRepoImpl <em>Git Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see component.impl.GitRepoImpl
		 * @see component.impl.ComponentPackageImpl#getGitRepo()
		 * @generated
		 */
		EClass GIT_REPO = eINSTANCE.getGitRepo();

		/**
		 * The meta object literal for the '<em><b>Distro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO__DISTRO = eINSTANCE.getGitRepo_Distro();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO__REPO = eINSTANCE.getGitRepo_Repo();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO__PACKAGE = eINSTANCE.getGitRepo_Package();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO__VERSION = eINSTANCE.getGitRepo_Version();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO__BRANCH = eINSTANCE.getGitRepo_Branch();

	}

} //ComponentPackage
