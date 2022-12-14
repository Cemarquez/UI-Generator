/**
 */
package ui_concrete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getUI_Diagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UI_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' containment reference.
	 * @see #setUserInterface(UserInterface)
	 * @see ui_concrete.Ui_concretePackage#getUI_Diagram_UserInterface()
	 * @model containment="true"
	 * @generated
	 */
	UserInterface getUserInterface();

	/**
	 * Sets the value of the '{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface</em>' containment reference.
	 * @see #getUserInterface()
	 * @generated
	 */
	void setUserInterface(UserInterface value);

} // UI_Diagram
