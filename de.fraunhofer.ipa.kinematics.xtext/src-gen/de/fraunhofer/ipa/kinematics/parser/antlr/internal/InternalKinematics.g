/*
 * generated by Xtext 2.25.0
 */
grammar InternalKinematics;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.fraunhofer.ipa.kinematics.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;

}

@parser::members {

 	private KinematicsGrammarAccess grammarAccess;

    public InternalKinematicsParser(TokenStream input, KinematicsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "robot";
   	}

   	@Override
   	protected KinematicsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulerobot
entryRulerobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_rulerobot=rulerobot
	{ $current=$iv_rulerobot.current; }
	EOF;

// Rule robot
rulerobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRobotAccess().getRobotAction_0(),
					$current);
			}
		)
		otherlv_1='robot'
		{
			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='prefix'
		{
			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getPrefixKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getPrefixEStringParserRuleCall_5_0());
				}
				lv_prefix_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"prefix",
						lv_prefix_5_0,
						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='root_link'
			{
				newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getRoot_linkKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getRoot_linkLinkParserRuleCall_6_1_0());
					}
					lv_root_link_7_0=ruleLink
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						set(
							$current,
							"root_link",
							lv_root_link_7_0,
							"de.fraunhofer.ipa.kinematics.Kinematics.Link");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='joints'
			{
				newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getJointsKeyword_7_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_2_0());
					}
					lv_joints_10_0=ruleJoint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"joints",
							lv_joints_10_0,
							"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getRobotAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRobotAccess().getJointsJointParserRuleCall_7_3_1_0());
						}
						lv_joints_12_0=ruleJoint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRobotRule());
							}
							add(
								$current,
								"joints",
								lv_joints_12_0,
								"de.fraunhofer.ipa.kinematics.Kinematics.Joint");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_ruleLink=ruleLink
	{ $current=$iv_ruleLink.current; }
	EOF;

// Rule Link
ruleLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLinkAccess().getLinkAction_0(),
					$current);
			}
		)
		otherlv_1='Link'
		{
			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleJoint
entryRuleJoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJointRule()); }
	iv_ruleJoint=ruleJoint
	{ $current=$iv_ruleJoint.current; }
	EOF;

// Rule Joint
ruleJoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Joint'
		{
			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJointAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJointRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.fraunhofer.ipa.kinematics.Kinematics.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='parent'
		{
			newLeafNode(otherlv_3, grammarAccess.getJointAccess().getParentKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJointRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getJointAccess().getParentLinkCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='child'
		{
			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJointAccess().getChildLinkParserRuleCall_6_0());
				}
				lv_child_6_0=ruleLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJointRule());
					}
					set(
						$current,
						"child",
						lv_child_6_0,
						"de.fraunhofer.ipa.kinematics.Kinematics.Link");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getJointAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
