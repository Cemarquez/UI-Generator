/*
* 
*/
package ui_diagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Ui_diagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem
				&& !isOwnView(((ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup group = (ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) element;
			return ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorItem navigatorItem = (ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?ui_concrete?UI_Diagram", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.UI_Diagram_1000);
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?ui_concrete?UserInterface", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Group", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Group", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Button", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Label", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?CheckBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?TextInput", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006);
		case ui_diagram.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Image", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Image_3007);
		case ui_diagram.diagram.edit.parts.ListEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?List", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.List_3008);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?RadioButton", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3009);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Button", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3010);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Label", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3011);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?CheckBox", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3012);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?TextInput", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3013);
		case ui_diagram.diagram.edit.parts.Image2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?Image", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.Image_3014);
		case ui_diagram.diagram.edit.parts.List2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?List", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.List_3015);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?ui_concrete?RadioButton", //$NON-NLS-1$
					ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3016);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ui_diagram.diagram.providers.Ui_diagramElementTypes.isKnownElementType(elementType)) {
			image = ui_diagram.diagram.providers.Ui_diagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup group = (ui_diagram.diagram.navigator.Ui_diagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) {
			ui_diagram.diagram.navigator.Ui_diagramNavigatorItem navigatorItem = (ui_diagram.diagram.navigator.Ui_diagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getVisualID(view)) {
		case ui_diagram.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000Text(view);
		case ui_diagram.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case ui_diagram.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001Text(view);
		case ui_diagram.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case ui_diagram.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003Text(view);
		case ui_diagram.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case ui_diagram.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005Text(view);
		case ui_diagram.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006Text(view);
		case ui_diagram.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3007Text(view);
		case ui_diagram.diagram.edit.parts.ListEditPart.VISUAL_ID:
			return getList_3008Text(view);
		case ui_diagram.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3009Text(view);
		case ui_diagram.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3010Text(view);
		case ui_diagram.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3011Text(view);
		case ui_diagram.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3012Text(view);
		case ui_diagram.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3013Text(view);
		case ui_diagram.diagram.edit.parts.Image2EditPart.VISUAL_ID:
			return getImage_3014Text(view);
		case ui_diagram.diagram.edit.parts.List2EditPart.VISUAL_ID:
			return getList_3015Text(view);
		case ui_diagram.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3016Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUI_Diagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3001Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3001,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3003Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3003,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3004,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.LabelTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3005Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3005,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3006Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3006,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TextInputTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3007Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Image_3007,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ImageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getList_3008Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.List_3008,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ListNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3009Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3009,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.RadioButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3010Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Button_3010,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3011Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Label_3011,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.LabelText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3012Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.CheckBox_3012,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.CheckBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3013Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.TextInput_3013,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.TextInputText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3014Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.Image_3014,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ImageName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getList_3015Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.List_3015,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.ListName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3016Text(View view) {
		IParser parser = ui_diagram.diagram.providers.Ui_diagramParserProvider.getParser(
				ui_diagram.diagram.providers.Ui_diagramElementTypes.RadioButton_3016,
				view.getElement() != null ? view.getElement() : view, ui_diagram.diagram.part.Ui_diagramVisualIDRegistry
						.getType(ui_diagram.diagram.edit.parts.RadioButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ui_diagram.diagram.part.Ui_diagramDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ui_diagram.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID
				.equals(ui_diagram.diagram.part.Ui_diagramVisualIDRegistry.getModelID(view));
	}

}
