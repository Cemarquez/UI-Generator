/**
 */
package ui_concrete.tests;

import junit.textui.TestRunner;

import ui_concrete.Label;
import ui_concrete.Ui_concreteFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LabelTest.class);
	}

	/**
	 * Constructs a new Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Label getFixture() {
		return (Label)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concreteFactory.eINSTANCE.createLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LabelTest
