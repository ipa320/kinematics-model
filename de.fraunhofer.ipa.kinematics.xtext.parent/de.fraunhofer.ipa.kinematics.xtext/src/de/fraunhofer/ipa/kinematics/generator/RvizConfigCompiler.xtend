package de.fraunhofer.ipa.kinematics.generator

class RvizConfigCompiler {
	
	def compile_RvizConfig(String rootLink)'''
	Panels:
	  - Class: rviz_common/Displays
	    Help Height: 78
	    Name: Displays
	    Property Tree Widget:
	      Expanded:
	        - /Global Options1
	        - /Status1
	      Splitter Ratio: 0.5026177763938904
	    Tree Height: 719
	  - Class: rviz_common/Selection
	    Name: Selection
	  - Class: rviz_common/Tool Properties
	    Expanded:
	      - /2D Goal Pose1
	      - /Publish Point1
	    Name: Tool Properties
	    Splitter Ratio: 0.5886790156364441
	  - Class: rviz_common/Views
	    Expanded:
	      - /Current View1
	    Name: Views
	    Splitter Ratio: 0.5
	  - Class: rviz_common/Time
	    Experimental: false
	    Name: Time
	    SyncMode: 0
	    SyncSource: ""
	Visualization Manager:
	  Class: ""
	  Displays:
	    - Alpha: 0.5
	      Cell Size: 1
	      Class: rviz_default_plugins/Grid
	      Color: 160; 160; 164
	      Enabled: true
	      Line Style:
	        Line Width: 0.029999999329447746
	        Value: Lines
	      Name: Grid
	      Normal Cell Count: 0
	      Offset:
	        X: 0
	        Y: 0
	        Z: 0
	      Plane: XY
	      Plane Cell Count: 10
	      Reference Frame: <Fixed Frame>
	      Value: true
	    - Alpha: 1
	      Class: rviz_default_plugins/RobotModel
	      Collision Enabled: false
	      Description File:
	      Description Source: Topic
	      Description Topic:
	        Depth: 5
	        Durability Policy: Volatile
	        History Policy: Keep Last
	        Reliability Policy: Reliable
	        Value: /robot_description
	      Enabled: true
	      Links:
	        All Links Enabled: true
	        Expand Joint Details: false
	        Expand Link Details: false
	        Expand Tree: false
	        Link Tree Style: Links in Alphabetic Order
	      Name: RobotModel
	      TF Prefix: ""
	      Update Interval: 0
	      Value: true
	      Visual Enabled: true
	  Enabled: true
	  Global Options:
	    Background Color: 48; 48; 48
	    Fixed Frame:
	    Frame Rate: 30
	  Name: root
	  Tools:
	    - Class: rviz_default_plugins/Interact
	      Hide Inactive Objects: true
	    - Class: rviz_default_plugins/MoveCamera
	    - Class: rviz_default_plugins/Select
	    - Class: rviz_default_plugins/FocusCamera
	    - Class: rviz_default_plugins/Measure
	      Line color: 128; 128; 0
	    - Class: rviz_default_plugins/SetInitialPose
	      Covariance x: 0.25
	      Covariance y: 0.25
	      Covariance yaw: 0.06853891909122467
	      Topic:
	        Depth: 5
	        Durability Policy: Volatile
	        History Policy: Keep Last
	        Reliability Policy: Reliable
	        Value: /initialpose
	    - Class: rviz_default_plugins/SetGoal
	      Topic:
	        Depth: 5
	        Durability Policy: Volatile
	        History Policy: Keep Last
	        Reliability Policy: Reliable
	        Value: /goal_pose
	    - Class: rviz_default_plugins/PublishPoint
	      Single click: true
	      Topic:
	        Depth: 5
	        Durability Policy: Volatile
	        History Policy: Keep Last
	        Reliability Policy: Reliable
	        Value: /clicked_point
	  Transformation:
	    Current:
	      Class: rviz_default_plugins/TF
	  Value: true
	  Views:
	    Current:
	      Class: rviz_default_plugins/Orbit
	      Distance: 3.030024766921997
	      Enable Stereo Rendering:
	        Stereo Eye Separation: 0.05999999865889549
	        Stereo Focal Distance: 1
	        Swap Stereo Eyes: false
	        Value: false
	      Focal Point:
	        X: 0.058396220207214355
	        Y: 0.21347738802433014
	        Z: 0.7640080451965332
	      Focal Shape Fixed Size: true
	      Focal Shape Size: 0.05000000074505806
	      Invert Z Axis: false
	      Name: Current View
	      Near Clip Distance: 0.009999999776482582
	      Pitch: 0.4603983163833618
	      Target Frame: <Fixed Frame>
	      Value: Orbit (rviz)
	      Yaw: 4.476734638214111
	    Saved: ~
	Window Geometry:
	  Displays:
	    collapsed: false
	  Height: 1016
	  Hide Left Dock: false
	  Hide Right Dock: false
	  QMainWindow State: 000000ff00000000fd0000000400000000000001800000035afc0200000008fb0000001200530065006c0065006300740069006f006e00000001e10000009b0000005c00fffffffb0000001e0054006f006f006c002000500072006f007000650072007400690065007302000001ed000001df00000185000000a3fb000000120056006900650077007300200054006f006f02000001df000002110000018500000122fb000000200054006f006f006c002000500072006f0070006500720074006900650073003203000002880000011d000002210000017afb000000100044006900730070006c006100790073010000003d0000035a000000c900fffffffb0000002000730065006c0065006300740069006f006e00200062007500660066006500720200000138000000aa0000023a00000294fb00000014005700690064006500530074006500720065006f02000000e6000000d2000003ee0000030bfb0000000c004b0069006e0065006300740200000186000001060000030c00000261000000010000010f0000035afc0200000003fb0000001e0054006f006f006c002000500072006f00700065007200740069006500730100000041000000780000000000000000fb0000000a00560069006500770073010000003d0000035a000000a400fffffffb0000001200530065006c0065006300740069006f006e010000025a000000b200000000000000000000000200000490000000a9fc0100000001fb0000000a00560069006500770073030000004e00000080000002e10000019700000003000007400000003efc0100000002fb0000000800540069006d0065010000000000000740000002eb00fffffffb0000000800540069006d00650100000000000004500000000000000000000004a50000035a00000004000000040000000800000008fc0000000100000002000000010000000a0054006f006f006c00730100000000ffffffff0000000000000000
	  Selection:
	    collapsed: false
	  Time:
	    collapsed: false
	  Tool Properties:
	    collapsed: false
	  Views:
	    collapsed: false
	  Width: 1856
	  X: 64
	  Y: 27
	
	'''
}