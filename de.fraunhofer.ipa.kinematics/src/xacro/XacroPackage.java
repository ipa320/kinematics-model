/**
 */
package xacro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.MacroImpl
	 * @see xacro.impl.XacroPackageImpl#getMacro()
	 * @generated
	 */
	int MACRO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Configured Macros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__CONFIGURED_MACROS = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__LINK = 3;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO__JOINT = 4;

	/**
	 * The number of structural features of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ConfiguredMacroImpl <em>Configured Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ConfiguredMacroImpl
	 * @see xacro.impl.XacroPackageImpl#getConfiguredMacro()
	 * @generated
	 */
	int CONFIGURED_MACRO = 1;

	/**
	 * The feature id for the '<em><b>Macro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_MACRO__MACRO = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_MACRO__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Configured Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_MACRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configured Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_MACRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ConfiguredParameterImpl <em>Configured Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ConfiguredParameterImpl
	 * @see xacro.impl.XacroPackageImpl#getConfiguredParameter()
	 * @generated
	 */
	int CONFIGURED_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Configured Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configured Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.ParameterImpl
	 * @see xacro.impl.XacroPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.impl.XacroRobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.impl.XacroRobotImpl
	 * @see xacro.impl.XacroPackageImpl#getXacroRobot()
	 * @generated
	 */
	int XACRO_ROBOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACRO_ROBOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Macros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACRO_ROBOT__MACROS = 1;

	/**
	 * The feature id for the '<em><b>Configured Macros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACRO_ROBOT__CONFIGURED_MACROS = 2;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACRO_ROBOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XACRO_ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xacro.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xacro.ParameterType
	 * @see xacro.impl.XacroPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 5;


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
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see xacro.Macro#getParameters()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getConfiguredMacros <em>Configured Macros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configured Macros</em>'.
	 * @see xacro.Macro#getConfiguredMacros()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_ConfiguredMacros();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see xacro.Macro#getLink()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.Macro#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see xacro.Macro#getJoint()
	 * @see #getMacro()
	 * @generated
	 */
	EReference getMacro_Joint();

	/**
	 * Returns the meta object for class '{@link xacro.ConfiguredMacro <em>Configured Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Macro</em>'.
	 * @see xacro.ConfiguredMacro
	 * @generated
	 */
	EClass getConfiguredMacro();

	/**
	 * Returns the meta object for the reference '{@link xacro.ConfiguredMacro#getMacro <em>Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Macro</em>'.
	 * @see xacro.ConfiguredMacro#getMacro()
	 * @see #getConfiguredMacro()
	 * @generated
	 */
	EReference getConfiguredMacro_Macro();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.ConfiguredMacro#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see xacro.ConfiguredMacro#getParameters()
	 * @see #getConfiguredMacro()
	 * @generated
	 */
	EReference getConfiguredMacro_Parameters();

	/**
	 * Returns the meta object for class '{@link xacro.ConfiguredParameter <em>Configured Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Parameter</em>'.
	 * @see xacro.ConfiguredParameter
	 * @generated
	 */
	EClass getConfiguredParameter();

	/**
	 * Returns the meta object for the reference '{@link xacro.ConfiguredParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see xacro.ConfiguredParameter#getParameter()
	 * @see #getConfiguredParameter()
	 * @generated
	 */
	EReference getConfiguredParameter_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link xacro.ConfiguredParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xacro.ConfiguredParameter#getValue()
	 * @see #getConfiguredParameter()
	 * @generated
	 */
	EAttribute getConfiguredParameter_Value();

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
	 * Returns the meta object for the attribute '{@link xacro.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see xacro.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link xacro.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see xacro.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

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
	 * Returns the meta object for class '{@link xacro.XacroRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see xacro.XacroRobot
	 * @generated
	 */
	EClass getXacroRobot();

	/**
	 * Returns the meta object for the attribute '{@link xacro.XacroRobot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xacro.XacroRobot#getName()
	 * @see #getXacroRobot()
	 * @generated
	 */
	EAttribute getXacroRobot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.XacroRobot#getMacros <em>Macros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macros</em>'.
	 * @see xacro.XacroRobot#getMacros()
	 * @see #getXacroRobot()
	 * @generated
	 */
	EReference getXacroRobot_Macros();

	/**
	 * Returns the meta object for the containment reference list '{@link xacro.XacroRobot#getConfiguredMacros <em>Configured Macros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configured Macros</em>'.
	 * @see xacro.XacroRobot#getConfiguredMacros()
	 * @see #getXacroRobot()
	 * @generated
	 */
	EReference getXacroRobot_ConfiguredMacros();

	/**
	 * Returns the meta object for enum '{@link xacro.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see xacro.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

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
		 * The meta object literal for the '{@link xacro.impl.MacroImpl <em>Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.MacroImpl
		 * @see xacro.impl.XacroPackageImpl#getMacro()
		 * @generated
		 */
		EClass MACRO = eINSTANCE.getMacro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO__NAME = eINSTANCE.getMacro_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__PARAMETERS = eINSTANCE.getMacro_Parameters();

		/**
		 * The meta object literal for the '<em><b>Configured Macros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__CONFIGURED_MACROS = eINSTANCE.getMacro_ConfiguredMacros();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__LINK = eINSTANCE.getMacro_Link();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO__JOINT = eINSTANCE.getMacro_Joint();

		/**
		 * The meta object literal for the '{@link xacro.impl.ConfiguredMacroImpl <em>Configured Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ConfiguredMacroImpl
		 * @see xacro.impl.XacroPackageImpl#getConfiguredMacro()
		 * @generated
		 */
		EClass CONFIGURED_MACRO = eINSTANCE.getConfiguredMacro();

		/**
		 * The meta object literal for the '<em><b>Macro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_MACRO__MACRO = eINSTANCE.getConfiguredMacro_Macro();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_MACRO__PARAMETERS = eINSTANCE.getConfiguredMacro_Parameters();

		/**
		 * The meta object literal for the '{@link xacro.impl.ConfiguredParameterImpl <em>Configured Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.ConfiguredParameterImpl
		 * @see xacro.impl.XacroPackageImpl#getConfiguredParameter()
		 * @generated
		 */
		EClass CONFIGURED_PARAMETER = eINSTANCE.getConfiguredParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_PARAMETER__PARAMETER = eINSTANCE.getConfiguredParameter_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURED_PARAMETER__VALUE = eINSTANCE.getConfiguredParameter_Value();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link xacro.impl.XacroRobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.impl.XacroRobotImpl
		 * @see xacro.impl.XacroPackageImpl#getXacroRobot()
		 * @generated
		 */
		EClass XACRO_ROBOT = eINSTANCE.getXacroRobot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XACRO_ROBOT__NAME = eINSTANCE.getXacroRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Macros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XACRO_ROBOT__MACROS = eINSTANCE.getXacroRobot_Macros();

		/**
		 * The meta object literal for the '<em><b>Configured Macros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XACRO_ROBOT__CONFIGURED_MACROS = eINSTANCE.getXacroRobot_ConfiguredMacros();

		/**
		 * The meta object literal for the '{@link xacro.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xacro.ParameterType
		 * @see xacro.impl.XacroPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //XacroPackage
