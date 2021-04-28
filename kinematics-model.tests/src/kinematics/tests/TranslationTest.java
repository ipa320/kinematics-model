/**
 */
package kinematics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kinematics.KinematicsFactory;
import kinematics.Translation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationTest extends TestCase {

	/**
	 * The fixture for this Translation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Translation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TranslationTest.class);
	}

	/**
	 * Constructs a new Translation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Translation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Translation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Translation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Translation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KinematicsFactory.eINSTANCE.createTranslation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TranslationTest
