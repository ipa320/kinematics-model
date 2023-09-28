/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KinematicsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KinematicsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Component_BaseAttachmentKeyword_9_0_0_q;
	protected AbstractElementAlias match_Component_ComponentKeyword_11_0_0_q;
	protected AbstractElementAlias match_Component_ConnectionKeyword_12_0_0_q;
	protected AbstractElementAlias match_Component_FlangeAttachmentKeyword_10_0_0_q;
	protected AbstractElementAlias match_Component_GroupKeyword_13_0_0_q;
	protected AbstractElementAlias match_Component_JointKeyword_15_0_0_q;
	protected AbstractElementAlias match_Component_LinkKeyword_14_0_0_q;
	protected AbstractElementAlias match_Link___BEGINTerminalRuleCall_3_0_ENDTerminalRuleCall_3_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KinematicsGrammarAccess) access;
		match_Component_BaseAttachmentKeyword_9_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getBaseAttachmentKeyword_9_0_0());
		match_Component_ComponentKeyword_11_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getComponentKeyword_11_0_0());
		match_Component_ConnectionKeyword_12_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getConnectionKeyword_12_0_0());
		match_Component_FlangeAttachmentKeyword_10_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getFlangeAttachmentKeyword_10_0_0());
		match_Component_GroupKeyword_13_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getGroupKeyword_13_0_0());
		match_Component_JointKeyword_15_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getJointKeyword_15_0_0());
		match_Component_LinkKeyword_14_0_0_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getLinkKeyword_14_0_0());
		match_Link___BEGINTerminalRuleCall_3_0_ENDTerminalRuleCall_3_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getLinkAccess().getBEGINTerminalRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getENDTerminalRuleCall_3_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Component_BaseAttachmentKeyword_9_0_0_q.equals(syntax))
				emit_Component_BaseAttachmentKeyword_9_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_ComponentKeyword_11_0_0_q.equals(syntax))
				emit_Component_ComponentKeyword_11_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_ConnectionKeyword_12_0_0_q.equals(syntax))
				emit_Component_ConnectionKeyword_12_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_FlangeAttachmentKeyword_10_0_0_q.equals(syntax))
				emit_Component_FlangeAttachmentKeyword_10_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_GroupKeyword_13_0_0_q.equals(syntax))
				emit_Component_GroupKeyword_13_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_JointKeyword_15_0_0_q.equals(syntax))
				emit_Component_JointKeyword_15_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Component_LinkKeyword_14_0_0_q.equals(syntax))
				emit_Component_LinkKeyword_14_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Link___BEGINTerminalRuleCall_3_0_ENDTerminalRuleCall_3_4__q.equals(syntax))
				emit_Link___BEGINTerminalRuleCall_3_0_ENDTerminalRuleCall_3_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'baseAttachment:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:' flangeAttachment+=FlangeAttachment
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:' component+=ConfiguredComponent
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:' connection+=Connection
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:' group+=Group
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? link+=Link
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? group+=Group
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? 'component:'? connection+=Connection
	 *     category=CATEGORY (ambiguity) 'flangeAttachment:'? component+=ConfiguredComponent
	 *     category=CATEGORY (ambiguity) flangeAttachment+=FlangeAttachment
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:' flangeAttachment+=FlangeAttachment
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:' component+=ConfiguredComponent
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:' connection+=Connection
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:' group+=Group
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? link+=Link
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? group+=Group
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? 'component:'? connection+=Connection
	 *     gitRepo=GitRepo (ambiguity) 'flangeAttachment:'? component+=ConfiguredComponent
	 *     gitRepo=GitRepo (ambiguity) flangeAttachment+=FlangeAttachment
	 *     version=EString (ambiguity) 'flangeAttachment:' flangeAttachment+=FlangeAttachment
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:' component+=ConfiguredComponent
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:' connection+=Connection
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:' group+=Group
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? link+=Link
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? 'connection:'? group+=Group
	 *     version=EString (ambiguity) 'flangeAttachment:'? 'component:'? connection+=Connection
	 *     version=EString (ambiguity) 'flangeAttachment:'? component+=ConfiguredComponent
	 *     version=EString (ambiguity) flangeAttachment+=FlangeAttachment
	 */
	protected void emit_Component_BaseAttachmentKeyword_9_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'component:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:' connection+=Connection
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:' group+=Group
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:' link+=Link
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? link+=Link
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) 'connection:'? group+=Group
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? (ambiguity) connection+=Connection
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:' connection+=Connection
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:' group+=Group
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:' link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? group+=Group
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) connection+=Connection
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:' connection+=Connection
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:' group+=Group
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:'? 'link:' link+=Link
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? 'group:'? link+=Link
	 *     flangeAttachment+=FlangeAttachment (ambiguity) 'connection:'? group+=Group
	 *     flangeAttachment+=FlangeAttachment (ambiguity) connection+=Connection
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:' connection+=Connection
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:' group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:' link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) connection+=Connection
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:' connection+=Connection
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:' group+=Group
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:' link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? 'group:'? link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) 'connection:'? group+=Group
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? (ambiguity) connection+=Connection
	 */
	protected void emit_Component_ComponentKeyword_11_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'connection:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:' group+=Group
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:' link+=Link
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? link+=Link
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? (ambiguity) group+=Group
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:' group+=Group
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:' link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) group+=Group
	 *     component+=ConfiguredComponent (ambiguity) 'group:' group+=Group
	 *     component+=ConfiguredComponent (ambiguity) 'group:'? 'link:' link+=Link
	 *     component+=ConfiguredComponent (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     component+=ConfiguredComponent (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     component+=ConfiguredComponent (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     component+=ConfiguredComponent (ambiguity) 'group:'? link+=Link
	 *     component+=ConfiguredComponent (ambiguity) group+=Group
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:' group+=Group
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:'? 'link:' link+=Link
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) 'group:'? link+=Link
	 *     flangeAttachment+=FlangeAttachment 'component:'? (ambiguity) group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:' group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:' link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) group+=Group
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:' group+=Group
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:' link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? 'link:'? joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) 'group:'? link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? (ambiguity) group+=Group
	 */
	protected void emit_Component_ConnectionKeyword_12_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'flangeAttachment:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:' component+=ConfiguredComponent
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:' connection+=Connection
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:' group+=Group
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? 'group:'? link+=Link
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? 'connection:'? group+=Group
	 *     baseAttachment+=BaseAttachment (ambiguity) 'component:'? connection+=Connection
	 *     baseAttachment+=BaseAttachment (ambiguity) component+=ConfiguredComponent
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:' component+=ConfiguredComponent
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:' connection+=Connection
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:' group+=Group
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? link+=Link
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? group+=Group
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) 'component:'? connection+=Connection
	 *     category=CATEGORY 'baseAttachment:'? (ambiguity) component+=ConfiguredComponent
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:' component+=ConfiguredComponent
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:' connection+=Connection
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:' group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? group+=Group
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) 'component:'? connection+=Connection
	 *     gitRepo=GitRepo 'baseAttachment:'? (ambiguity) component+=ConfiguredComponent
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:' component+=ConfiguredComponent
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:' connection+=Connection
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:' group+=Group
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:' link+=Link
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:' joint+=Joint
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? 'joint:'? END (rule end)
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? 'link:'? joint+=Joint
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? 'group:'? link+=Link
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? 'connection:'? group+=Group
	 *     version=EString 'baseAttachment:'? (ambiguity) 'component:'? connection+=Connection
	 *     version=EString 'baseAttachment:'? (ambiguity) component+=ConfiguredComponent
	 */
	protected void emit_Component_FlangeAttachmentKeyword_10_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'group:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:' link+=Link
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:' link+=Link
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) link+=Link
	 *     component+=ConfiguredComponent 'connection:'? (ambiguity) 'link:' link+=Link
	 *     component+=ConfiguredComponent 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     component+=ConfiguredComponent 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     component+=ConfiguredComponent 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     component+=ConfiguredComponent 'connection:'? (ambiguity) link+=Link
	 *     connection+=Connection (ambiguity) 'link:' link+=Link
	 *     connection+=Connection (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     connection+=Connection (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     connection+=Connection (ambiguity) 'link:'? joint+=Joint
	 *     connection+=Connection (ambiguity) link+=Link
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? (ambiguity) 'link:' link+=Link
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? (ambiguity) link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:' link+=Link
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:' link+=Link
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:' joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? 'joint:'? END (rule end)
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) 'link:'? joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? (ambiguity) link+=Link
	 */
	protected void emit_Component_GroupKeyword_13_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'joint:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     component+=ConfiguredComponent 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     connection+=Connection 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 *     group+=Group 'link:'? (ambiguity) END (rule end)
	 *     link+=Link (ambiguity) END (rule end)
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? 'link:'? (ambiguity) END (rule end)
	 */
	protected void emit_Component_JointKeyword_15_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'link:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     baseAttachment+=BaseAttachment 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     category=CATEGORY 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 *     component+=ConfiguredComponent 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     component+=ConfiguredComponent 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     component+=ConfiguredComponent 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 *     connection+=Connection 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     connection+=Connection 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     connection+=Connection 'group:'? (ambiguity) joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     flangeAttachment+=FlangeAttachment 'component:'? 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     gitRepo=GitRepo 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 *     group+=Group (ambiguity) 'joint:' joint+=Joint
	 *     group+=Group (ambiguity) 'joint:'? END (rule end)
	 *     group+=Group (ambiguity) joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:' joint+=Joint
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) 'joint:'? END (rule end)
	 *     version=EString 'baseAttachment:'? 'flangeAttachment:'? 'component:'? 'connection:'? 'group:'? (ambiguity) joint+=Joint
	 */
	protected void emit_Component_LinkKeyword_14_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) (rule end)
	 */
	protected void emit_Link___BEGINTerminalRuleCall_3_0_ENDTerminalRuleCall_3_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
