package de.fraunhofer.ipa.kinematics.generator

import component.Component

class VCSReposCompiler {
	
	def compile_Repos(Component component)'''
	«IF component.component !== null»
repositories:
	«FOR configuredComponent : component.component»
	«val depComponent = configuredComponent.type»
	«depComponent.gitRepo.package»:
		url: «depComponent.gitRepo.repo»
		version:  «depComponent.gitRepo.version»
	«ENDFOR»
	«ENDIF»
	'''
}