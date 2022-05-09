/**
 */
package it.disim.univaq.qml.provider;

import it.disim.univaq.qml.QmlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.disim.univaq.qml.ExcludeConstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcludeConstraintItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeConstraintItemProvider(AdapterFactory adapterFactory) {
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

			addExcludingFeaturePropertyDescriptor(object);
			addExcludedFeaturePropertyDescriptor(object);
			addExcludedAttributePropertyDescriptor(object);
			addExcludedAttributeValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Excluding Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludingFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ExcludeConstraint_excludingFeature_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExcludeConstraint_excludingFeature_feature",
						"_UI_ExcludeConstraint_type"),
				QmlPackage.Literals.EXCLUDE_CONSTRAINT__EXCLUDING_FEATURE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Excluded Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExcludeConstraint_excludedFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExcludeConstraint_excludedFeature_feature",
								"_UI_ExcludeConstraint_type"),
						QmlPackage.Literals.EXCLUDE_CONSTRAINT__EXCLUDED_FEATURE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Excluded Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ExcludeConstraint_excludedAttribute_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExcludeConstraint_excludedAttribute_feature",
						"_UI_ExcludeConstraint_type"),
				QmlPackage.Literals.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Excluded Attribute Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludedAttributeValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ExcludeConstraint_excludedAttributeValue_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ExcludeConstraint_excludedAttributeValue_feature",
						"_UI_ExcludeConstraint_type"),
				QmlPackage.Literals.EXCLUDE_CONSTRAINT__EXCLUDED_ATTRIBUTE_VALUE, true, false, true, null, null, null));
	}

	/**
	 * This returns ExcludeConstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExcludeConstraint"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExcludeConstraint_type");
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