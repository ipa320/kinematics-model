/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xtext.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.kinematics.xtext.services.KinematicsGrammarAccess
import kinematics.joint
import kinematics.robot
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class KinematicsFormatter extends AbstractFormatter2 {
	
	@Inject extension KinematicsGrammarAccess

	def dispatch void format(robot robot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		robot.root_link.format
		for (joint : robot.joints) {
			joint.format
		}
	}

	def dispatch void format(joint joint, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (link : joint.child) {
			link.format
		}
	}
	
}
