/**
 */
package kinematics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kinematics.KinematicsFactory;
import kinematics.Vector3d;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vector3d</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vector3dTest extends TestCase {

	/**
	 * The fixture for this Vector3d test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vector3d fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Vector3dTest.class);
	}

	/**
	 * Constructs a new Vector3d test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3dTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vector3d test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vector3d fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vector3d test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vector3d getFixture() {
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
		setFixture(KinematicsFactory.eINSTANCE.createVector3d());
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

} //Vector3dTest
