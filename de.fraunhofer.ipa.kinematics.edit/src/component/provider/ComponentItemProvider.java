/**
 */
package component.provider;


import component.Component;
import component.ComponentFactory;
import component.ComponentPackage;

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

import urdf.UrdfFactory;

/**
 * This is the item provider adapter for a {@link component.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider 
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
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Component_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_name_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_version_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_category_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_component_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_component_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__COMPONENT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__GIT_REPO);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__BASE_ATTACHMENT);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__FLANGE_ATTACHMENT);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__GROUP);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__CONNECTION);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__LINK);
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__JOINT);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case ComponentPackage.COMPONENT__NAME:
			case ComponentPackage.COMPONENT__VERSION:
			case ComponentPackage.COMPONENT__CATEGORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.COMPONENT__GIT_REPO:
			case ComponentPackage.COMPONENT__BASE_ATTACHMENT:
			case ComponentPackage.COMPONENT__FLANGE_ATTACHMENT:
			case ComponentPackage.COMPONENT__GROUP:
			case ComponentPackage.COMPONENT__CONNECTION:
			case ComponentPackage.COMPONENT__LINK:
			case ComponentPackage.COMPONENT__JOINT:
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
				(ComponentPackage.Literals.COMPONENT__GIT_REPO,
				 ComponentFactory.eINSTANCE.createGitRepo()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__BASE_ATTACHMENT,
				 ComponentFactory.eINSTANCE.createBaseAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__FLANGE_ATTACHMENT,
				 ComponentFactory.eINSTANCE.createFlangeAttachment()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__GROUP,
				 ComponentFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__CONNECTION,
				 ComponentFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__LINK,
				 UrdfFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__JOINT,
				 UrdfFactory.eINSTANCE.createJoint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentEditPlugin.INSTANCE;
	}

}
