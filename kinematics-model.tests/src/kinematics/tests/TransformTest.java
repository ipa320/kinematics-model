/**
 */
package kinematics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kinematics.KinematicsFactory;
import kinematics.Transform;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformTest extends TestCase {

	/**
	 * The fixture for this Transform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transform fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformTest.class);
	}

	/**
	 * Constructs a new Transform test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Transform fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transform test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transform getFixture() {
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
		setFixture(KinematicsFactory.eINSTANCE.createTransform());
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

} //TransformTest
