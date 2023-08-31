package de.fraunhofer.ipa.kinematics.generator

import component.Component

class ReadMeCompiler {

	def compile_ReadMe(Component component) '''
		# «component.name» «IF component.category !==null»«component.category»«ENDIF» description package
		This is the description package for component `«component.name»`
		
		«IF component.component !== null»
			`«component.name»` is a composition of the following sub-components
			«FOR configuredComponent : component.component»
				- `«configuredComponent.name»` [ `«configuredComponent.type.name»` «IF configuredComponent.type.category !==null»of type `«configuredComponent.type.category»`«ENDIF» ]
			«ENDFOR»
		«ENDIF»
		
		The package structure of «component.name»_description is as follows
		- `./urdf/` - holds the URDF file(s)
		- `./models/` - holds the kinematic model file(s) of `«component.name»` and its dependent models 
		
		To visualize the URDF in RViz, run the following command in the terminal
		```bash
		ros2 launch «component.name»_description display.launch.py
		```
	'''
}
