/*
 * 
 */
package ui_diagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Ui_diagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {

			case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UI_DiagramEditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceEditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupTitleEditPart(view);

			case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Group2EditPart(view);

			case ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupTitle2EditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonEditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonTextEditPart(view);

			case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelEditPart(view);

			case ui_diagram.diagram.edit.parts.LabelTextEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelTextEditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxEditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxNameEditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputEditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputTextEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputTextEditPart(view);

			case ui_diagram.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImageEditPart(view);

			case ui_diagram.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImageNameEditPart(view);

			case ui_diagram.diagram.edit.parts.ListEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ListEditPart(view);

			case ui_diagram.diagram.edit.parts.ListNameEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ListNameEditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonEditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonNameEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonNameEditPart(view);

			case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Button2EditPart(view);

			case ui_diagram.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ButtonText2EditPart(view);

			case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Label2EditPart(view);

			case ui_diagram.diagram.edit.parts.LabelText2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.LabelText2EditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBox2EditPart(view);

			case ui_diagram.diagram.edit.parts.CheckBoxName2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.CheckBoxName2EditPart(view);

			case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInput2EditPart(view);

			case ui_diagram.diagram.edit.parts.TextInputText2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.TextInputText2EditPart(view);

			case ui_diagram.diagram.edit.parts.Image2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.Image2EditPart(view);

			case ui_diagram.diagram.edit.parts.ImageName2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ImageName2EditPart(view);

			case ui_diagram.diagram.edit.parts.List2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.List2EditPart(view);

			case ui_diagram.diagram.edit.parts.ListName2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.ListName2EditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButton2EditPart(view);

			case ui_diagram.diagram.edit.parts.RadioButtonName2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.RadioButtonName2EditPart(view);

			case ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(
						view);

			case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart(view);

			case ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ui_diagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
