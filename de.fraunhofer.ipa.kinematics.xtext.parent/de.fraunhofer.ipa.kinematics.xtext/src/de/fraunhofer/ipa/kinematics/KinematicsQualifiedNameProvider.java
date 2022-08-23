package de.fraunhofer.ipa.kinematics;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.inject.Inject;

import xacro.Link;
import xacro.XacroPackage;
import xacro.impl.MacroImpl;
import xacro.impl.RobotImpl;

public class KinematicsQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	protected QualifiedName qualifiedName(Object obj) {
		if (obj instanceof Link) {
			final Link link = (Link) obj;
			List<INode> refs = NodeModelUtils
						.findNodesForFeature(link, XacroPackage.Literals.LINK__NAME);
			if (refs.size() > 0) {
				String link_name = refs.get(0).getText().trim().replaceAll("\"", "");

				if(link.eContainer().eContainer() instanceof MacroImpl) {
					String macro_name = ((MacroImpl)link.eContainer().eContainer()).getName();
					String robot_name = ((RobotImpl)link.eContainer().eContainer().eContainer()).getName();

					return QualifiedName.create(robot_name, macro_name, link_name);
				} else if (link.eContainer().eContainer() instanceof RobotImpl) {
					String robot_name = ((RobotImpl)link.eContainer().eContainer()).getName();

					return QualifiedName.create(robot_name, link_name);
				}

				return QualifiedName.create(link_name);
			}
			return QualifiedName.create(link.getName().getValue());
		}
		return super.qualifiedName(obj);
	}
}
