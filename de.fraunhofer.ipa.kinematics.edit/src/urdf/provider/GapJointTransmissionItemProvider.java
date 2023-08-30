/**
 */
package urdf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import urdf.GapJointTransmission;
import urdf.UrdfPackage;

/**
 * This is the item provider adapter for a {@link urdf.GapJointTransmission} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GapJointTransmissionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GapJointTransmissionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAPropertyDescriptor(object);
			addBPropertyDescriptor(object);
			addGearRatioPropertyDescriptor(object);
			addHPropertyDescriptor(object);
			addL0PropertyDescriptor(object);
			addMechanicalReductionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPhi0PropertyDescriptor(object);
			addRPropertyDescriptor(object);
			addScrewReductionPropertyDescriptor(object);
			addT0PropertyDescriptor(object);
			addTheta0PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_a_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_a_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__A,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_b_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_b_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gear Ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGearRatioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_gearRatio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_gearRatio_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__GEAR_RATIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_h_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_h_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__H,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the L0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addL0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_l0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_l0_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__L0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mechanical Reduction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanicalReductionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_mechanicalReduction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_mechanicalReduction_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_name_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phi0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhi0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_phi0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_phi0_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__PHI0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_r_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_r_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__R,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Screw Reduction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScrewReductionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_screwReduction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_screwReduction_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the T0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_t0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_t0_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__T0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Theta0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheta0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GapJointTransmission_theta0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GapJointTransmission_theta0_feature", "_UI_GapJointTransmission_type"),
				 UrdfPackage.Literals.GAP_JOINT_TRANSMISSION__THETA0,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GapJointTransmission.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GapJointTransmission"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GapJointTransmission)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GapJointTransmission_type") :
			getString("_UI_GapJointTransmission_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GapJointTransmission.class)) {
			case UrdfPackage.GAP_JOINT_TRANSMISSION__A:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__B:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__H:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__L0:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__NAME:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__R:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__T0:
			case UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UrdfEditPlugin.INSTANCE;
	}

}
