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
		
		## Installation (Ubuntu)
		To make installation easy, we will install the required packages using `vcs` and a `«component.name».repos` file. `«component.name».repos` can be found at the root of `«component.name»_description` package.  
		```bash
		cd ~/ros2_ws/src
		vcs import --recursive < <path/to>«component.name».repos
		```

		Now update all dependencies:
		```bash
		cd ~/ros2_ws
		sudo apt update
		rosdep update
		rosdep install --rosdistro ${ROS_DISTRO} --from-paths src --ignore-src
		```

		And finally, build your workspace:
		```bash
		cd ~/ros2_ws
		colcon build --cmake-args -DBUILD_TESTING=ON
		```

		If you’d like to test your installation, run:
		```bash
		cd ~/ros2_ws
		source ./install/setup.bash
		colcon test --packages-select «component.name»_description
		colcon test-result --all --verbose
		```

		## Usage
		To visualize the URDF in RViz, run the following command in the terminal
		```bash
		ros2 launch «component.name»_description display.launch.py
		```
	'''
}
