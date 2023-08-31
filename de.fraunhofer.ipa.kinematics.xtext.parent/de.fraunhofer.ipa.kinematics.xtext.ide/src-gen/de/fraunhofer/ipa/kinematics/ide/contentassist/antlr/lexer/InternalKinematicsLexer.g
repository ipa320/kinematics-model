/*
 * generated by Xtext 2.25.0
 */
lexer grammar InternalKinematicsLexer;

@header {
package de.fraunhofer.ipa.kinematics.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

FlangeAttachment : 'flangeAttachment:';

BaseAttachment : 'baseAttachment:';

Ros2_control : 'ros2_control:';

Connection : 'connection:';

Collision : 'collision:';

Component : 'component:';

BaseLink : 'baseLink:';

Category : 'category:';

Cylinder : 'cylinder:';

Filename : 'filename:';

Geometry : 'geometry:';

Inertial : 'inertial:';

Velocity : 'velocity:';

EndLink : 'endLink:';

GitRepo : 'gitRepo:';

Inertia : 'inertia:';

Package : 'package:';

Version : 'version:';

Branch : 'branch:';

Distro : 'distro:';

Effort : 'effort:';

Length : 'length:';

Origin : 'origin:';

Parent : 'parent:';

Prefix : 'prefix:';

Radius : 'radius:';

Sphere : 'sphere:';

Visual : 'visual:';

AnyURI : 'AnyURI';

Child : 'child:';

Group : 'group:';

Joint : 'joint:';

Limit : 'limit:';

Lower : 'lower:';

Scale : 'scale:';

Upper : 'upper:';

Value : 'value:';

Axis : 'axis:';

Link : 'link:';

Mass : 'mass:';

Mesh : 'mesh:';

Name : 'name:';

Repo : 'repo:';

Size : 'size:';

Type : 'type:';

Box : 'box:';

Ixx : 'ixx:';

Ixy : 'ixy:';

Ixz : 'ixz:';

Iyy : 'iyy:';

Iyz : 'iyz:';

Izz : 'izz:';

Rpy : 'rpy:';

Xyz : 'xyz:';

Comma : ',';

HyphenMinus : '-';

LeftSquareBracket : '[';

RightSquareBracket : ']';

fragment RULE_DIGIT : '0'..'9';

RULE_BOOLEAN : ('true'|'false');

RULE_DOUBLE : '-'? RULE_INT* ('.' RULE_INT+)?;

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

RULE_JOINTTYPE : ('revolute'|'continuous'|'prismatic'|'fixed'|'floating'|'planar');

RULE_CATEGORY : ('manipulator'|'gripper'|'camera');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
