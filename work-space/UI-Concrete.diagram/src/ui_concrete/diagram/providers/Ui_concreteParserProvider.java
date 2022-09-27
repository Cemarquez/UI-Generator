/*
 * 
 */
package ui_concrete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Ui_concreteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceTitle_5017Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceTitle_5017Parser() {
		if (userInterfaceTitle_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getUserInterface_Title() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			userInterfaceTitle_5017Parser = parser;
		}
		return userInterfaceTitle_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5009Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5009Parser() {
		if (groupTitle_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getGroup_Title() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5009Parser = parser;
		}
		return groupTitle_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5008Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5008Parser() {
		if (groupTitle_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getGroup_Title() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5008Parser = parser;
		}
		return groupTitle_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonText_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonText_5001Parser() {
		if (buttonText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			buttonText_5001Parser = parser;
		}
		return buttonText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser labelText_5002Parser;

	/**
	* @generated
	*/
	private IParser getLabelText_5002Parser() {
		if (labelText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getLabel_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			labelText_5002Parser = parser;
		}
		return labelText_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5003Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5003Parser() {
		if (checkBoxName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			checkBoxName_5003Parser = parser;
		}
		return checkBoxName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputText_5004Parser;

	/**
	* @generated
	*/
	private IParser getTextInputText_5004Parser() {
		if (textInputText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			textInputText_5004Parser = parser;
		}
		return textInputText_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser imageName_5005Parser;

	/**
	* @generated
	*/
	private IParser getImageName_5005Parser() {
		if (imageName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			imageName_5005Parser = parser;
		}
		return imageName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser listName_5006Parser;

	/**
	* @generated
	*/
	private IParser getListName_5006Parser() {
		if (listName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			listName_5006Parser = parser;
		}
		return listName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5007Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5007Parser() {
		if (radioButtonName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			radioButtonName_5007Parser = parser;
		}
		return radioButtonName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonText_5010Parser;

	/**
	* @generated
	*/
	private IParser getButtonText_5010Parser() {
		if (buttonText_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			buttonText_5010Parser = parser;
		}
		return buttonText_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser labelText_5011Parser;

	/**
	* @generated
	*/
	private IParser getLabelText_5011Parser() {
		if (labelText_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getLabel_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			labelText_5011Parser = parser;
		}
		return labelText_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5012Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5012Parser() {
		if (checkBoxName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			checkBoxName_5012Parser = parser;
		}
		return checkBoxName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputText_5013Parser;

	/**
	* @generated
	*/
	private IParser getTextInputText_5013Parser() {
		if (textInputText_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			textInputText_5013Parser = parser;
		}
		return textInputText_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser imageName_5014Parser;

	/**
	* @generated
	*/
	private IParser getImageName_5014Parser() {
		if (imageName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			imageName_5014Parser = parser;
		}
		return imageName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser listName_5015Parser;

	/**
	* @generated
	*/
	private IParser getListName_5015Parser() {
		if (listName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			listName_5015Parser = parser;
		}
		return listName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5016Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5016Parser() {
		if (radioButtonName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			radioButtonName_5016Parser = parser;
		}
		return radioButtonName_5016Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ui_concrete.diagram.edit.parts.UserInterfaceTitleEditPart.VISUAL_ID:
			return getUserInterfaceTitle_5017Parser();
		case ui_concrete.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
			return getGroupTitle_5009Parser();
		case ui_concrete.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
			return getGroupTitle_5008Parser();
		case ui_concrete.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
			return getButtonText_5001Parser();
		case ui_concrete.diagram.edit.parts.LabelTextEditPart.VISUAL_ID:
			return getLabelText_5002Parser();
		case ui_concrete.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID:
			return getCheckBoxName_5003Parser();
		case ui_concrete.diagram.edit.parts.TextInputTextEditPart.VISUAL_ID:
			return getTextInputText_5004Parser();
		case ui_concrete.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
			return getImageName_5005Parser();
		case ui_concrete.diagram.edit.parts.ListNameEditPart.VISUAL_ID:
			return getListName_5006Parser();
		case ui_concrete.diagram.edit.parts.RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5007Parser();
		case ui_concrete.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID:
			return getButtonText_5010Parser();
		case ui_concrete.diagram.edit.parts.LabelText2EditPart.VISUAL_ID:
			return getLabelText_5011Parser();
		case ui_concrete.diagram.edit.parts.CheckBoxName2EditPart.VISUAL_ID:
			return getCheckBoxName_5012Parser();
		case ui_concrete.diagram.edit.parts.TextInputText2EditPart.VISUAL_ID:
			return getTextInputText_5013Parser();
		case ui_concrete.diagram.edit.parts.ImageName2EditPart.VISUAL_ID:
			return getImageName_5014Parser();
		case ui_concrete.diagram.edit.parts.ListName2EditPart.VISUAL_ID:
			return getListName_5015Parser();
		case ui_concrete.diagram.edit.parts.RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5016Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ui_concrete.diagram.providers.Ui_concreteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
