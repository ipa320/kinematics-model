/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XacroRuntimeModule extends AbstractXacroRuntimeModule {
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return XacroQualifiedNameProvider.class;
	}
}
