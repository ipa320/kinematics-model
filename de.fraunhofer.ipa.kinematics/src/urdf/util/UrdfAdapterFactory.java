/**
 */
package urdf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import urdf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see urdf.UrdfPackage
 * @generated
 */
public class UrdfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UrdfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrdfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UrdfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrdfSwitch<Adapter> modelSwitch =
		new UrdfSwitch<Adapter>() {
			@Override
			public Adapter caseActuatorTransmission(ActuatorTransmission object) {
				return createActuatorTransmissionAdapter();
			}
			@Override
			public Adapter caseAxis(Axis object) {
				return createAxisAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
			}
			@Override
			public Adapter caseCalibration(Calibration object) {
				return createCalibrationAdapter();
			}
			@Override
			public Adapter caseChild(Child object) {
				return createChildAdapter();
			}
			@Override
			public Adapter caseCollision(Collision object) {
				return createCollisionAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter caseCylinder(Cylinder object) {
				return createCylinderAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamics(Dynamics object) {
				return createDynamicsAdapter();
			}
			@Override
			public Adapter caseGapJointTransmission(GapJointTransmission object) {
				return createGapJointTransmissionAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseInertia(Inertia object) {
				return createInertiaAdapter();
			}
			@Override
			public Adapter caseInertial(Inertial object) {
				return createInertialAdapter();
			}
			@Override
			public Adapter caseJoint(Joint object) {
				return createJointAdapter();
			}
			@Override
			public Adapter caseLimit(Limit object) {
				return createLimitAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseMass(Mass object) {
				return createMassAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object) {
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseMaterialGlobal(MaterialGlobal object) {
				return createMaterialGlobalAdapter();
			}
			@Override
			public Adapter caseMesh(Mesh object) {
				return createMeshAdapter();
			}
			@Override
			public Adapter caseMimic(Mimic object) {
				return createMimicAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter caseParent(Parent object) {
				return createParentAdapter();
			}
			@Override
			public Adapter casePassiveJointTransmission(PassiveJointTransmission object) {
				return createPassiveJointTransmissionAdapter();
			}
			@Override
			public Adapter casePose(Pose object) {
				return createPoseAdapter();
			}
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseSafetyController(SafetyController object) {
				return createSafetyControllerAdapter();
			}
			@Override
			public Adapter caseSphere(Sphere object) {
				return createSphereAdapter();
			}
			@Override
			public Adapter caseTexture(Texture object) {
				return createTextureAdapter();
			}
			@Override
			public Adapter caseTransmission(Transmission object) {
				return createTransmissionAdapter();
			}
			@Override
			public Adapter caseUseSimulatedGripperJointType(UseSimulatedGripperJointType object) {
				return createUseSimulatedGripperJointTypeAdapter();
			}
			@Override
			public Adapter caseVerbose(Verbose object) {
				return createVerboseAdapter();
			}
			@Override
			public Adapter caseVisual(Visual object) {
				return createVisualAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link urdf.ActuatorTransmission <em>Actuator Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.ActuatorTransmission
	 * @generated
	 */
	public Adapter createActuatorTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Axis
	 * @generated
	 */
	public Adapter createAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Calibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Calibration
	 * @generated
	 */
	public Adapter createCalibrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Child
	 * @generated
	 */
	public Adapter createChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Collision
	 * @generated
	 */
	public Adapter createCollisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Cylinder
	 * @generated
	 */
	public Adapter createCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Dynamics
	 * @generated
	 */
	public Adapter createDynamicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.GapJointTransmission <em>Gap Joint Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.GapJointTransmission
	 * @generated
	 */
	public Adapter createGapJointTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Inertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Inertia
	 * @generated
	 */
	public Adapter createInertiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Inertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Inertial
	 * @generated
	 */
	public Adapter createInertialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Joint
	 * @generated
	 */
	public Adapter createJointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Limit
	 * @generated
	 */
	public Adapter createLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Mass
	 * @generated
	 */
	public Adapter createMassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.MaterialGlobal <em>Material Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.MaterialGlobal
	 * @generated
	 */
	public Adapter createMaterialGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Mimic <em>Mimic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Mimic
	 * @generated
	 */
	public Adapter createMimicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Parent
	 * @generated
	 */
	public Adapter createParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.PassiveJointTransmission <em>Passive Joint Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.PassiveJointTransmission
	 * @generated
	 */
	public Adapter createPassiveJointTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Pose
	 * @generated
	 */
	public Adapter createPoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.SafetyController <em>Safety Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.SafetyController
	 * @generated
	 */
	public Adapter createSafetyControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Sphere
	 * @generated
	 */
	public Adapter createSphereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Texture
	 * @generated
	 */
	public Adapter createTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Transmission
	 * @generated
	 */
	public Adapter createTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.UseSimulatedGripperJointType <em>Use Simulated Gripper Joint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.UseSimulatedGripperJointType
	 * @generated
	 */
	public Adapter createUseSimulatedGripperJointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Verbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Verbose
	 * @generated
	 */
	public Adapter createVerboseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link urdf.Visual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see urdf.Visual
	 * @generated
	 */
	public Adapter createVisualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UrdfAdapterFactory
