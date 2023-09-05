/*
 * generated by Xtext 2.26.0
 */
grammar DebugInternalKinematics;

// Rule Component
ruleComponent:
	'component:'
	RULE_BEGIN
	'name:'
	ruleEString
	'version:'
	ruleEString
	(
		'category:'
		RULE_CATEGORY
	)?
	(
		'gitRepo:'
		ruleGitRepo
	)?
	(
		'baseAttachment:'
		ruleBaseAttachment
		*
		    |
		ruleBaseAttachment
	)?
	(
		'flangeAttachment:'
		ruleFlangeAttachment
		*
		    |
		ruleFlangeAttachment
	)?
	(
		'component:'
		ruleConfiguredComponent
		*
		    |
		ruleConfiguredComponent
	)?
	(
		'connection:'
		ruleConnection
		*
		    |
		ruleConnection
	)?
	(
		'group:'
		ruleGroup
		*
		    |
		ruleGroup
	)?
	(
		'link:'
		ruleLink
		*
		    |
		ruleLink
	)?
	(
		'joint:'
		ruleJoint
		*
		    |
		ruleJoint
	)?
	RULE_END
;

// Rule ConfiguredComponent
ruleConfiguredComponent:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'type:'
	ruleEString
	(
		'prefix:'
		ruleEString
	)?
	RULE_END
;

// Rule GitRepo
ruleGitRepo:
	RULE_BEGIN
	'distro:'
	ruleEString
	'repo:'
	ruleEString
	'branch:'
	ruleEString
	'package:'
	ruleEString
	'version:'
	ruleEString
	RULE_END
;

// Rule Group
ruleGroup:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'baseLink:'
	ruleEString
	'endLink:'
	ruleEString
	(
		'ros2_control:'
		ruleEString
	)?
	RULE_END
;

// Rule BaseAttachment
ruleBaseAttachment:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'origin:'
	rulePose
	'parent:'
	ruleEString
	RULE_END
;

// Rule FlangeAttachment
ruleFlangeAttachment:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'origin:'
	rulePose
	'parent:'
	ruleEString
	RULE_END
;

// Rule Connection
ruleConnection:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'baseAttachment:'
	ruleEString
	'flangeAttachment:'
	ruleEString
	RULE_END
;

// Rule Joint
ruleJoint:
	'-'
	'name:'
	ruleEString
	RULE_BEGIN
	'type:'
	RULE_JOINTTYPE
	'parent:'
	ruleParent
	'child:'
	ruleChild
	'origin:'
	rulePose
	(
		'axis:'
		ruleAxis
	)?
	(
		'limit:'
		ruleLimit
	)?
	RULE_END
;

// Rule Parent
ruleParent:
	RULE_BEGIN
	'link:'
	ruleEString
	RULE_END
;

// Rule Child
ruleChild:
	RULE_BEGIN
	'link:'
	ruleEString
	RULE_END
;

// Rule Link
ruleLink:
	'-'
	'name:'
	ruleEString
	(
		RULE_BEGIN
		(
			'inertial:'
			ruleInertial
		)?
		(
			'visual:'
			ruleVisual
		)?
		(
			'collision:'
			ruleCollision
		)?
		RULE_END
	)?
;

// Rule Pose
rulePose:
	RULE_BEGIN
	(
		'rpy:'
		'['
		RULE_DOUBLE
		(
			','
			RULE_DOUBLE
		)*
		']'
	)?
	(
		'xyz:'
		'['
		RULE_DOUBLE
		(
			','
			RULE_DOUBLE
		)*
		']'
	)?
	RULE_END
;

// Rule Axis
ruleAxis:
	RULE_BEGIN
	(
		'xyz:'
		ruleEString
	)?
	RULE_END
;

// Rule Limit
ruleLimit:
	RULE_BEGIN
	(
		'effort:'
		RULE_DOUBLE
	)?
	(
		'lower:'
		RULE_DOUBLE
	)?
	(
		'upper:'
		RULE_DOUBLE
	)?
	(
		'velocity:'
		RULE_DOUBLE
	)?
	RULE_END
;

// Rule Inertial
ruleInertial:
	RULE_BEGIN
	(
		'origin:'
		rulePose
	)?
	(
		'mass:'
		ruleMass
	)?
	(
		'inertia:'
		ruleInertia
	)?
	RULE_END
;

// Rule Visual
ruleVisual:
	RULE_BEGIN
	(
		'origin:'
		rulePose
	)?
	'geometry:'
	ruleGeometry
	RULE_END
;

// Rule Collision
ruleCollision:
	RULE_BEGIN
	(
		'origin:'
		rulePose
	)?
	'geometry:'
	ruleGeometry
	RULE_END
;

// Rule Mass
ruleMass:
	RULE_BEGIN
	'value:'
	RULE_DOUBLE
	RULE_END
;

// Rule Inertia
ruleInertia:
	RULE_BEGIN
	(
		'ixx:'
		RULE_DOUBLE
	)?
	(
		'ixy:'
		RULE_DOUBLE
	)?
	(
		'ixz:'
		RULE_DOUBLE
	)?
	(
		'iyy:'
		RULE_DOUBLE
	)?
	(
		'iyz:'
		RULE_DOUBLE
	)?
	(
		'izz:'
		RULE_DOUBLE
	)?
	RULE_END
;

// Rule Geometry
ruleGeometry:
	RULE_BEGIN
	(
		'box:'
		ruleBox
	)?
	(
		'cylinder:'
		ruleCylinder
	)?
	(
		'sphere:'
		ruleSphere
	)?
	(
		'mesh:'
		ruleMesh
	)?
	RULE_END
;

// Rule Box
ruleBox:
	RULE_BEGIN
	'size:'
	ruleEString
	RULE_END
;

// Rule Cylinder
ruleCylinder:
	RULE_BEGIN
	'length:'
	ruleEString
	'radius:'
	ruleEString
	RULE_END
;

// Rule Sphere
ruleSphere:
	RULE_BEGIN
	'radius:'
	ruleDouble0
	RULE_END
;

// Rule Mesh
ruleMesh:
	RULE_BEGIN
	'filename:'
	ruleEString
	(
		'scale:'
		'['
		RULE_DOUBLE
		(
			','
			RULE_DOUBLE
		)*
		']'
	)?
	RULE_END
;

// Rule EString
ruleEString:
	RULE_STRING
;

// Rule Double0
ruleDouble0:
	RULE_DOUBLE
;

fragment RULE_DIGIT : '0'..'9';

RULE_BOOLEAN : ('true'|'false');

RULE_DOUBLE : '-'? RULE_INT* ('.' RULE_INT+)? (('e'|'E') ('-'|'+') RULE_INT)?;

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

RULE_JOINTTYPE : ('revolute'|'continuous'|'prismatic'|'fixed'|'floating'|'planar');

RULE_CATEGORY : ('manipulator'|'gripper'|'camera');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* {skip();};

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_ANY_OTHER : .;
