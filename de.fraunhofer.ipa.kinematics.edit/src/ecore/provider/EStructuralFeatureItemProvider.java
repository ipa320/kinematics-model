/**
 */
package ecore.provider;


import ecore.EStructuralFeature;
import ecore.EcorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ecore.EStructuralFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EStructuralFeatureItemProvider extends ETypedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addChangeablePropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addDefaultValueLiteralPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addUnsettablePropertyDescriptor(object);
			addDerivedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Changeable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_changeable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_changeable_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__CHANGEABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_volatile_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_transient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_transient_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_defaultValueLiteral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_defaultValueLiteral_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_defaultValue_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unsettable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnsettablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_unsettable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_unsettable_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__UNSETTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EStructuralFeature_derived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeature_derived_feature", "_UI_EStructuralFeature_type"),
				 EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EStructuralFeature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EStructuralFeature_type") :
			getString("_UI_EStructuralFeature_type") + " " + label;
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

		switch (notification.getFeatureID(EStructuralFeature.class)) {
			case EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE:
			case EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE:
			case EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT:
			case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL:
			case EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE:
			case EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE:
			case EcorePackage.ESTRUCTURAL_FEATURE__DERIVED:
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

}
