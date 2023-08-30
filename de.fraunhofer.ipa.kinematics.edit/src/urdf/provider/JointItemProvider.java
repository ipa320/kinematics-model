/**
 */
package urdf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import urdf.Joint;
import urdf.UrdfFactory;
import urdf.UrdfPackage;

/**
 * This is the item provider adapter for a {@link urdf.Joint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JointItemProvider 
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
	public JointItemProvider(AdapterFactory adapterFactory) {
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

			addParentPropertyDescriptor(object);
			addChildPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Joint_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Joint_parent_feature", "_UI_Joint_type"),
				 UrdfPackage.Literals.JOINT__PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Joint_child_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Joint_child_feature", "_UI_Joint_type"),
				 UrdfPackage.Literals.JOINT__CHILD,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Joint_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Joint_name_feature", "_UI_Joint_type"),
				 UrdfPackage.Literals.JOINT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Joint_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Joint_type_feature", "_UI_Joint_type"),
				 UrdfPackage.Literals.JOINT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__ORIGIN);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__AXIS);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__CALIBRATION);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__DYNAMICS);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__LIMIT);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__SAFETY_CONTROLLER);
			childrenFeatures.add(UrdfPackage.Literals.JOINT__MIMIC);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Joint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Joint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Joint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Joint_type") :
			getString("_UI_Joint_type") + " " + label;
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

		switch (notification.getFeatureID(Joint.class)) {
			case UrdfPackage.JOINT__NAME:
			case UrdfPackage.JOINT__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UrdfPackage.JOINT__ORIGIN:
			case UrdfPackage.JOINT__AXIS:
			case UrdfPackage.JOINT__CALIBRATION:
			case UrdfPackage.JOINT__DYNAMICS:
			case UrdfPackage.JOINT__LIMIT:
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
			case UrdfPackage.JOINT__MIMIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__ORIGIN,
				 UrdfFactory.eINSTANCE.createPose()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__AXIS,
				 UrdfFactory.eINSTANCE.createAxis()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__CALIBRATION,
				 UrdfFactory.eINSTANCE.createCalibration()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__DYNAMICS,
				 UrdfFactory.eINSTANCE.createDynamics()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__LIMIT,
				 UrdfFactory.eINSTANCE.createLimit()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__SAFETY_CONTROLLER,
				 UrdfFactory.eINSTANCE.createSafetyController()));

		newChildDescriptors.add
			(createChildParameter
				(UrdfPackage.Literals.JOINT__MIMIC,
				 UrdfFactory.eINSTANCE.createMimic()));
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
