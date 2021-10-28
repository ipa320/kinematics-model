/**
 */
package xacro;

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
 * @see xacro.XacroFactory
 * @model kind="package"
 * @generated
 */
public interface XacroPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xacro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/xacro";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xacro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XacroPackage eINSTANCE = xacro.impl.XacroPackageImpl.init();

	/**
	 * The meta object id for the '{@link xacro.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.RobotImpl
	 * @see xacro.impl.XacroPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MACRO = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__BODY = 3;

	/**
	 * The feature id for the '<em><b>Macro Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__MACRO_CALL = 4;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterImpl
	 * @see xacro.impl.XacroPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.BodyImpl
	 * @see xacro.impl.XacroPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 2;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__JOINT = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LINK = 1;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MATERIAL = 2;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__TRANSMISSION = 3;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MacroImpl
	 * @see xacro.impl.XacroPackageImpl#getMacro()
	 * @generated
	 */
	int MACRO = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__BODY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__NAME = 2;

	/**
	 * The number of structural features of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link xacro.impl.MacroCallImpl <em>Macro Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MacroCallImpl
	 * @see xacro.impl.XacroPackageImpl#getMacroCall()
	 * @generated
	 */
	int MACRO_CALL = 4;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__MACRO = 0;

	/**
	 * The feature id for the '<em><b>Parameter Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__PARAMETER_CALL = 1;

	/**
	 * The number of structural features of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterCallImpl
	 * @see xacro.impl.XacroPackageImpl#getParameterCall()
	 * @generated
	 */
	int PARAMETER_CALL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CALL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link xacro.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see xacro.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Robot#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro</em>'.
	 * @see xacro.Robot#getMacro()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Macro();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Robot#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see xacro.Robot#getVersion()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Version();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Robot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see xacro.Robot#getBody()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Robot#getMacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro Call</em>'.
	 * @see xacro.Robot#getMacroCall()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_MacroCall();

	/**
	 * Returns the meta object for class '{@link xacro.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see xacro.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link xacro.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see xacro.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see xacro.Body#getJoint()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Joint();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see xacro.Body#getLink()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material</em>'.
	 * @see xacro.Body#getMaterial()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Material();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Body#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmission</em>'.
	 * @see xacro.Body#getTransmission()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Transmission();

	/**
	 * Returns the meta object for class '{@link xacro.Macro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro</em>'.
	 * @see xacro.Macro
	 * @generated
	 */
	EClass getMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see xacro.Macro#getParameter()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link xacro.Macro#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see xacro.Macro#getBody()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Body();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Macro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.Macro#getName()
	 * @see #getMacro()
	 * @generated
	 */
	EAttribute getMacro_Name();

	/**
	 * Returns the meta object for class '{@link xacro.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Call</em>'.
	 * @see xacro.MacroCall
	 * @generated
	 */
	EClass getMacroCall();

	/**
	 * Returns the meta object for the reference '{@link xacro.MacroCall#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Macro</em>'.
	 * @see xacro.MacroCall#getMacro()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_Macro();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.MacroCall#getParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Call</em>'.
	 * @see xacro.MacroCall#getParameterCall()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_ParameterCall();

	/**
	 * Returns the meta object for class '{@link xacro.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Call</em>'.
	 * @see xacro.ParameterCall
	 * @generated
	 */
	EClass getParameterCall();

	/**
	 * Returns the meta object for the attribute '{@link xacro.ParameterCall#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.ParameterCall#getValue()
	 * @see #getParameterCall()
	 * @generated
	 */
	EAttribute getParameterCall_Value();

	/**
	 * Returns the meta object for the reference '{@link xacro.ParameterCall#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see xacro.ParameterCall#getParameter()
	 * @see #getParameterCall()
	 * @generated
	 */
	EReference getParameterCall_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XacroFactory getXacroFactory();

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
		 * The meta object literal for the '{@link xacro.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.RobotImpl
		 * @see xacro.impl.XacroPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MACRO = eINSTANCE.getRobot_Macro();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__VERSION = eINSTANCE.getRobot_Version();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__BODY = eINSTANCE.getRobot_Body();

		/**
		 * The meta object literal for the '<em><b>Macro Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__MACRO_CALL = eINSTANCE.getRobot_MacroCall();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterImpl
		 * @see xacro.impl.XacroPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.BodyImpl
		 * @see xacro.impl.XacroPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__JOINT = eINSTANCE.getBody_Joint();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LINK = eINSTANCE.getBody_Link();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__MATERIAL = eINSTANCE.getBody_Material();

		/**
		 * The meta object literal for the '<em><b>Transmission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__TRANSMISSION = eINSTANCE.getBody_Transmission();

		/**
		 * The meta object literal for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MacroImpl
		 * @see xacro.impl.XacroPackageImpl#getMacro()
		 * @generated
		 */
		EClass MACRO = eINSTANCE.getMacro();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__PARAMETER = eINSTANCE.getMacro_Parameter();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__BODY = eINSTANCE.getMacro_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO__NAME = eINSTANCE.getMacro_Name();

		/**
		 * The meta object literal for the '{@link xacro.impl.MacroCallImpl <em>Macro Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MacroCallImpl
		 * @see xacro.impl.XacroPackageImpl#getMacroCall()
		 * @generated
		 */
		EClass MACRO_CALL = eINSTANCE.getMacroCall();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_CALL__MACRO = eINSTANCE.getMacroCall_Macro();

		/**
		 * The meta object literal for the '<em><b>Parameter Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_CALL__PARAMETER_CALL = eINSTANCE.getMacroCall_ParameterCall();

		/**
		 * The meta object literal for the '{@link xacro.impl.ParameterCallImpl <em>Parameter Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ParameterCallImpl
		 * @see xacro.impl.XacroPackageImpl#getParameterCall()
		 * @generated
		 */
		EClass PARAMETER_CALL = eINSTANCE.getParameterCall();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_CALL__VALUE = eINSTANCE.getParameterCall_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CALL__PARAMETER = eINSTANCE.getParameterCall_Parameter();

	}

} //XacroPackage
