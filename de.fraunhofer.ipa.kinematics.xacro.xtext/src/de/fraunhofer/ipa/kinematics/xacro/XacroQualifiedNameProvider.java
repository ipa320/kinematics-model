package de.fraunhofer.ipa.kinematics.xacro;

import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import xacro.Link;
import xacro.XacroPackage;

public class XacroQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	protected QualifiedName qualifiedName(Object obj) {
		if (obj instanceof Link) {
			final Link link = (Link) obj;
			List<INode> refs = NodeModelUtils
						.findNodesForFeature(link, XacroPackage.Literals.LINK__NAME);			
			if (refs.size() > 0) {
				String link_name = refs.get(0).getText().trim().replaceAll("\"", "");
				return QualifiedName.create(link_name);
			}
			return QualifiedName.create(link.getName().getValue());
		}
		return super.qualifiedName(obj);
	}
}
