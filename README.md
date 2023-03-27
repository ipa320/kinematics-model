[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

## Kinematics Model

[URDF](http://wiki.ros.org/urdf/XML) is a simple XML format for defining kinematic properties of robotic systems. It is error prone and time consuming to create for complex systems [^1]. To overcome these challenges, we leverage the advantages of Model-Driven Engineering techniques to develop an integrated development tooling for kinematics modeling.

At the core of this effort is an [Ecore meta-model](https://www.eclipse.org/modeling/emf/) (original source: [urdf.xsd](https://github.com/ros/urdfdom/blob/master/xsd/urdf.xsd)), which describes a kinematic model. Along with this Ecore model, we develop a set of  plugins to introduce a language grammar based on [Eclipse Xtext](https://www.eclipse.org/Xtext/) and [Xtend](https://www.eclipse.org/xtend/). This grammar facilitates developing integrated development tools that allows creating kinematic models from scratch and composing those models. The models are then validated (e.g. kinematic tree validation) and a ROS package can be auto-generated for the composed description files. 

### Related projects

[kinematics-model-parser](https://github.com/ipa320/kinematics-model-parser): parses a URDF file using the API from [xacro](https://github.com/ros/xacro). It then generates a kinematics DSL file.

[vscode-kinematics-model](https://github.com/ipa-hsd/vscode-kinematics-model): Text editor for the kinematics DSL defined in this repository

[kinematics-glsp](https://github.com/ipa-hsd/kinematics-glsp): Graphical editor for kinematics model defined in this repository.


### References
[^1]: Understanding Xacro Misunderstandings https://arxiv.org/pdf/2109.09694.pdf
