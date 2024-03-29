package de.fraunhofer.ipa.kinematics.generator

import component.Component

class DisplayLaunchCompiler {
	
	def compile_DisplayLaunch(Component component)'''
from ament_index_python.packages import get_package_share_directory
import launch
import launch_ros
import os

def generate_launch_description():
    pkg_share = get_package_share_directory('«component.name»_description')
    default_model_path = os.path.join(pkg_share, 'urdf/«component.name».urdf')
    default_rviz_config_path = os.path.join(pkg_share, 'rviz/display.rviz')

    with open(default_model_path, 'r') as infp:
        robot_desc = infp.read()

    robot_state_publisher_node = launch_ros.actions.Node(
        package='robot_state_publisher',
        executable='robot_state_publisher',
        parameters=[{'robot_description': robot_desc}]
    )

    joint_state_publisher_node = launch_ros.actions.Node(
        package='joint_state_publisher',
        executable='joint_state_publisher',
        name='joint_state_publisher'
    )
    rviz_node = launch_ros.actions.Node(
        package='rviz2',
        executable='rviz2',
        name='rviz2',
        arguments=['-d ' + default_rviz_config_path],
        output='screen'
    )

    return launch.LaunchDescription([
        launch.actions.DeclareLaunchArgument(name='gui', default_value='True',
                                            description='Flag to enable joint_state_publisher_gui'),
        launch.actions.DeclareLaunchArgument(name='model', default_value=default_model_path,
                                            description='Absolute path to robot urdf file'),
        launch.actions.DeclareLaunchArgument(name='use_sim_time', default_value='True',
                                            description='Flag to enable use_sim_time'),
        joint_state_publisher_node,
        robot_state_publisher_node,
        rviz_node
    ])
	'''
}
