/**
 */
package kinematics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kinematics.KinematicsFactory;
import kinematics.Rotation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RotationTest extends TestCase {

	/**
	 * The fixture for this Rotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rotation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RotationTest.class);
	}

	/**
	 * Constructs a new Rotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Rotation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rotation getFixture() {
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
		setFixture(KinematicsFactory.eINSTANCE.createRotation());
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

} //RotationTest
