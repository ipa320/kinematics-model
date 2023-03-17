package de.fraunhofer.ipa.kinematics.ide;

import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.fraunhofer.ipa.kinematics.services.KinematicsGrammarAccess;
import xacro.XacroPackage;

public class KinematicsContentProposalProvider extends IdeContentProposalProvider {

	@Inject
	private KinematicsGrammarAccess kinematicsGrammarAccess;

	@Override
	protected void _createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {

		if (ruleCall.getRule() == kinematicsGrammarAccess.getParameterLinkRule()) {
			IScope scope = getScopeProvider().getScope(context.getCurrentModel(), XacroPackage.Literals.BODY__LINK);

			for (IEObjectDescription description : Iterables.filter(scope.getAllElements(),
					it -> XacroPackage.Literals.LINK.equals(it.getEClass()))) {
				String proposalString = "\"" + description.getName().toString() + "\"";
				ContentAssistEntry entry = getProposalCreator().createProposal(proposalString, context);
				acceptor.accept(entry, getProposalPriorities().getDefaultPriority(entry));
			}
		}
	}

	@Override
	protected void _createProposals(Assignment assignment, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		
		if (assignment == kinematicsGrammarAccess.getParameterCallAccess().getParameterAssignment_4()) {
			IScope scope = getScopeProvider().getScope(context.getCurrentModel(),
					XacroPackage.Literals.PARAMETER_CALL__PARAMETER);

			for (IEObjectDescription description : Iterables.filter(scope.getAllElements(),
					it -> XacroPackage.Literals.PARAMETER.equals(it.getEClass()))) {
				String proposalString = "\"" + description.getName().toString() + "\"";
				ContentAssistEntry entry = getProposalCreator().createProposal(proposalString, context);
				acceptor.accept(entry, getProposalPriorities().getDefaultPriority(entry));
			}
		} else if (assignment == kinematicsGrammarAccess.getMacroCallAccess().getMacroAssignment_4()) {
			IScope scope = getScopeProvider().getScope(context.getCurrentModel(),
					XacroPackage.Literals.MACRO_CALL__MACRO);

			for (IEObjectDescription description : Iterables.filter(scope.getAllElements(),
					it -> XacroPackage.Literals.MACRO.equals(it.getEClass()))) {
				String proposalString = "\"" + description.getName().toString() + "\"";
				ContentAssistEntry entry = getProposalCreator().createProposal(proposalString, context);
				acceptor.accept(entry, getProposalPriorities().getDefaultPriority(entry));
			}
		}

	}
}
