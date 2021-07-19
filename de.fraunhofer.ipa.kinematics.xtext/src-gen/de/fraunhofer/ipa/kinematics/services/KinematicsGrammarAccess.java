/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class KinematicsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RobotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.kinematics.Kinematics.robot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRobotAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRobotKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPrefixKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPrefixAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPrefixEStringParserRuleCall_4_1_0 = (RuleCall)cPrefixAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRoot_linkKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cRoot_linkAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cRoot_linkLinkParserRuleCall_5_1_0 = (RuleCall)cRoot_linkAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cJointsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cJointsAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cJointsJointParserRuleCall_6_2_0 = (RuleCall)cJointsAssignment_6_2.eContents().get(0);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cCommaKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Assignment cJointsAssignment_6_3_1 = (Assignment)cGroup_6_3.eContents().get(1);
		private final RuleCall cJointsJointParserRuleCall_6_3_1_0 = (RuleCall)cJointsAssignment_6_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_4 = (Keyword)cGroup_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//robot returns robot:
		//    {robot}
		//    'robot' name=EString
		//    '{'
		//        ('prefix' prefix=EString)?
		//        ('root_link' root_link=Link)?
		//        ('joints' '{' joints+=Joint ( "," joints+=Joint)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{robot}
		//'robot' name=EString
		//'{'
		//    ('prefix' prefix=EString)?
		//    ('root_link' root_link=Link)?
		//    ('joints' '{' joints+=Joint ( "," joints+=Joint)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{robot}
		public Action getRobotAction_0() { return cRobotAction_0; }
		
		//'robot'
		public Keyword getRobotKeyword_1() { return cRobotKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('prefix' prefix=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'prefix'
		public Keyword getPrefixKeyword_4_0() { return cPrefixKeyword_4_0; }
		
		//prefix=EString
		public Assignment getPrefixAssignment_4_1() { return cPrefixAssignment_4_1; }
		
		//EString
		public RuleCall getPrefixEStringParserRuleCall_4_1_0() { return cPrefixEStringParserRuleCall_4_1_0; }
		
		//('root_link' root_link=Link)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'root_link'
		public Keyword getRoot_linkKeyword_5_0() { return cRoot_linkKeyword_5_0; }
		
		//root_link=Link
		public Assignment getRoot_linkAssignment_5_1() { return cRoot_linkAssignment_5_1; }
		
		//Link
		public RuleCall getRoot_linkLinkParserRuleCall_5_1_0() { return cRoot_linkLinkParserRuleCall_5_1_0; }
		
		//('joints' '{' joints+=Joint ( "," joints+=Joint)* '}' )?
		public Group getGroup_6() { return cGroup_6; }
		
		//'joints'
		public Keyword getJointsKeyword_6_0() { return cJointsKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//joints+=Joint
		public Assignment getJointsAssignment_6_2() { return cJointsAssignment_6_2; }
		
		//Joint
		public RuleCall getJointsJointParserRuleCall_6_2_0() { return cJointsJointParserRuleCall_6_2_0; }
		
		//( "," joints+=Joint)*
		public Group getGroup_6_3() { return cGroup_6_3; }
		
		//","
		public Keyword getCommaKeyword_6_3_0() { return cCommaKeyword_6_3_0; }
		
		//joints+=Joint
		public Assignment getJointsAssignment_6_3_1() { return cJointsAssignment_6_3_1; }
		
		//Joint
		public RuleCall getJointsJointParserRuleCall_6_3_1_0() { return cJointsJointParserRuleCall_6_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_4() { return cRightCurlyBracketKeyword_6_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.kinematics.Kinematics.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLinkAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLinkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Link returns Link:
		//    {Link}
		//    'Link'
		//    name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Link}
		//'Link'
		//name=EString
		public Group getGroup() { return cGroup; }
		
		//{Link}
		public Action getLinkAction_0() { return cLinkAction_0; }
		
		//'Link'
		public Keyword getLinkKeyword_1() { return cLinkKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class JointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.kinematics.Kinematics.Joint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJointKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cParentKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cParentLinkCrossReference_4_0 = (CrossReference)cParentAssignment_4.eContents().get(0);
		private final RuleCall cParentLinkEStringParserRuleCall_4_0_1 = (RuleCall)cParentLinkCrossReference_4_0.eContents().get(1);
		private final Keyword cChildKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cChildAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cChildLinkParserRuleCall_6_0 = (RuleCall)cChildAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Joint returns Joint:
		//    'Joint'
		//    name=EString
		//    '{'
		//        'parent' parent=[Link|EString]
		//        'child' child=Link
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Joint'
		//name=EString
		//'{'
		//    'parent' parent=[Link|EString]
		//    'child' child=Link
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Joint'
		public Keyword getJointKeyword_0() { return cJointKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'parent'
		public Keyword getParentKeyword_3() { return cParentKeyword_3; }
		
		//parent=[Link|EString]
		public Assignment getParentAssignment_4() { return cParentAssignment_4; }
		
		//[Link|EString]
		public CrossReference getParentLinkCrossReference_4_0() { return cParentLinkCrossReference_4_0; }
		
		//EString
		public RuleCall getParentLinkEStringParserRuleCall_4_0_1() { return cParentLinkEStringParserRuleCall_4_0_1; }
		
		//'child'
		public Keyword getChildKeyword_5() { return cChildKeyword_5; }
		
		//child=Link
		public Assignment getChildAssignment_6() { return cChildAssignment_6; }
		
		//Link
		public RuleCall getChildLinkParserRuleCall_6_0() { return cChildLinkParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.fraunhofer.ipa.kinematics.Kinematics.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final RobotElements pRobot;
	private final LinkElements pLink;
	private final JointElements pJoint;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public KinematicsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRobot = new RobotElements();
		this.pLink = new LinkElements();
		this.pJoint = new JointElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.fraunhofer.ipa.kinematics.Kinematics".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//robot returns robot:
	//    {robot}
	//    'robot' name=EString
	//    '{'
	//        ('prefix' prefix=EString)?
	//        ('root_link' root_link=Link)?
	//        ('joints' '{' joints+=Joint ( "," joints+=Joint)* '}' )?
	//    '}';
	public RobotElements getRobotAccess() {
		return pRobot;
	}
	
	public ParserRule getRobotRule() {
		return getRobotAccess().getRule();
	}
	
	//Link returns Link:
	//    {Link}
	//    'Link'
	//    name=EString;
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//Joint returns Joint:
	//    'Joint'
	//    name=EString
	//    '{'
	//        'parent' parent=[Link|EString]
	//        'child' child=Link
	//    '}';
	public JointElements getJointAccess() {
		return pJoint;
	}
	
	public ParserRule getJointRule() {
		return getJointAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
