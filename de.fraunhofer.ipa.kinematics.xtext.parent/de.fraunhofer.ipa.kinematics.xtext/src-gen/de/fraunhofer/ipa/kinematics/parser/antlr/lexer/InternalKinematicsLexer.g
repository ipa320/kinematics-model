/*
 * generated by Xtext 2.25.0
 */
lexer grammar InternalKinematicsLexer;

@header {
package de.fraunhofer.ipa.kinematics.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

MacroCalls : 'macroCalls:';

Parameters : 'parameters:';

Collision : 'collision:';

Cylinder : 'cylinder:';

Filename : 'filename:';

Geometry : 'geometry:';

Inertial : 'inertial:';

Velocity : 'velocity:';

Inertia : 'inertia:';

Version : 'version:';

LinkRef : 'LinkRef';

Default : 'default';

Effort : 'effort:';

Joints : 'joints:';

Length : 'length:';

Macros : 'macros:';

Origin : 'origin:';

Parent : 'parent:';

Radius : 'radius:';

Sphere : 'sphere:';

Visual : 'visual:';

AnyURI : 'AnyURI';

String : 'String';

Child : 'child:';

Limit : 'limit:';

Links : 'links:';

Lower : 'lower:';

Robot : 'robot:';

Scale : 'scale:';

Upper : 'upper:';

Axis : 'axis:';

Body : 'body:';

Mass : 'mass:';

Mesh : 'mesh:';

Name : 'name:';

Type : 'type:';

Value : 'value';

Pose : 'Pose';

Box : 'box:';

Ixx : 'ixx:';

Ixy : 'ixy:';

Ixz : 'ixz:';

Iyy : 'iyy:';

Iyz : 'iyz:';

Izz : 'izz:';

Rpy : 'rpy:';

Size : 'size';

Xyz : 'xyz:';

HyphenMinus : '-';

Colon : ':';

fragment RULE_DIGIT : '0'..'9';

RULE_BOOLEAN : ('true'|'false');

RULE_DOUBLE : RULE_DECINT ('.' RULE_DIGIT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DECINT);

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

RULE_JOINTTYPE : ('revolute'|'continuous'|'prismatic'|'fixed'|'floating'|'planar');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
