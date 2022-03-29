/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

import xacro.XacroPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class KinematicsStandaloneSetup extends KinematicsStandaloneSetupGenerated {

	public static void doSetup() {
		new KinematicsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(final Injector injector) {
		EPackage.Registry.INSTANCE.put(XacroPackage.eNS_URI, XacroPackage.eINSTANCE);
		super.register(injector);
	}
}