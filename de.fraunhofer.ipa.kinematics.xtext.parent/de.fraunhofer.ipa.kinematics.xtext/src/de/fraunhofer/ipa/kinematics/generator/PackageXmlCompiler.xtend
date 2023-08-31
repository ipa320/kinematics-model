package de.fraunhofer.ipa.kinematics.generator

import java.util.List

class PackageXmlCompiler{

		def compile_package_xml_format3(String name, List<CharSequence> depends_list) '''
<?xml version="1.0"?>
<?xml-model
   href="http://download.ros.org/schema/package_format3.xsd"
   schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
 <name>«name»_description</name>
 <version>0.0.1</version>
 <description>Description package for component «name»</description>
  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author>Jane Doe</author>
  <license>Apache 2.0</license>

  <buildtool_depend>ament_cmake</buildtool_depend>
  
  <exec_depend>ament_index_python</exec_depend>
  <exec_depend>launch</exec_depend>
  <exec_depend>joint_state_publisher_gui</exec_depend>
  <exec_depend>launch</exec_depend>
  <exec_depend>launch_ros</exec_depend>
  <exec_depend>robot_state_publisher</exec_depend>
  <exec_depend>rviz2</exec_depend>
  <exec_depend>urdf</exec_depend>
  «FOR pkg:depends_list»
  <exec_depend>«pkg»</exec_depend>
  «ENDFOR»

  <!--test_depend>ament_copyright</test_depend>
  <test_depend>ament_flake8</test_depend>
  <test_depend>ament_pep257</test_depend>
  <test_depend>launch</test_depend>
  <test_depend>python3-pytest</test_depend-->

  <export>
  	<build_type>ament_python</build_type>
  </export>
</package>
		'''
		}
