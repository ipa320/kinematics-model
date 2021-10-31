/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;
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
public class XacroSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XacroGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ParameterString___PlusSignKeyword_0_2_0_STRINGTerminalRuleCall_0_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XacroGrammarAccess) access;
		match_ParameterString___PlusSignKeyword_0_2_0_STRINGTerminalRuleCall_0_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterStringAccess().getPlusSignKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getParameterStringAccess().getSTRINGTerminalRuleCall_0_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEStringRule())
			return getEStringToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EString returns ecore::EString:
	 * 	STRING
	 * ;
	 */
	protected String getEStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ParameterString___PlusSignKeyword_0_2_0_STRINGTerminalRuleCall_0_2_1__q.equals(syntax))
				emit_ParameterString___PlusSignKeyword_0_2_0_STRINGTerminalRuleCall_0_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('+' STRING)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     ref=[Parameter|STRING] (ambiguity) (rule end)
	 */
	protected void emit_ParameterString___PlusSignKeyword_0_2_0_STRINGTerminalRuleCall_0_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
