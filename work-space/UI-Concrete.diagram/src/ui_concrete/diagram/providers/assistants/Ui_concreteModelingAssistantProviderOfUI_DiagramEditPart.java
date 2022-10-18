/*
 * 
 */
package ui_concrete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Ui_concreteModelingAssistantProviderOfUI_DiagramEditPart
		extends ui_concrete.diagram.providers.Ui_concreteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.UserInterface_2001);
		return types;
	}

}
