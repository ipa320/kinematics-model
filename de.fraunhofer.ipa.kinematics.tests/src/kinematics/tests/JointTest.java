/**
 */
package kinematics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kinematics.Joint;
import kinematics.KinematicsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointTest extends TestCase {

	/**
	 * The fixture for this Joint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Joint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JointTest.class);
	}

	/**
	 * Constructs a new Joint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Joint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Joint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Joint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Joint getFixture() {
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
		setFixture(KinematicsFactory.eINSTANCE.createJoint());
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

} //JointTest
