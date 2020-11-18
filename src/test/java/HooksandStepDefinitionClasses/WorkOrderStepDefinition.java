package HooksandStepDefinitionClasses;

import CommonMethods.CommonMethods;
import Locators.OrderWizardLocators;
import Locators.WorkOrderLocators;
import cucumber.api.java.en.*;

public class WorkOrderStepDefinition extends CommonMethods {
	OrderWizardLocators ow = new OrderWizardLocators();
	WorkOrderLocators wo = new WorkOrderLocators();

	@Then("Navigate to Order Wizard")
	public void navigate_to_Order_Wizard() throws Exception {
		getUrl("http://staging.buildsuperfast.com:10080/dev_release/bsferp_v1.12/public/wpm/workorder/index");
		waits();
		System.out.println("Navigated to BSF Order Wizard Page");
	}

	@Then("User fills the {string} {string} {string} {string}")
	public void user_fills_the(String cc, String ot, String wt, String v) throws Exception {
		selectbyVisibleText(ow.getCostcentre(), cc);
		waits();
		selectbyVisibleText(ow.getOrderType(), ot);
		waits();
		selectbyVisibleText(ow.getWorkType(), wt);
		waits();
		selectbyVisibleText(ow.getVendor(), v);
		waits();
		System.out.println("All Selection fields are Selected");
	}

	@Then("User click on Continue button")
	public void user_click_on_Continue_button() throws Exception {
		click(ow.getContinue());
		waits();
		System.out.println("Clicked Continue Button");
	}

	@Then("Double click on Common SAC")
	public void double_click_on_Common_SAC() throws Exception {
		waits();
		waits();
		waits();
		doubleClick(wo.getCommonSAC());
		System.out.println("Double Clicked on SAC");
	}

	@Then("Select the SAC Code and Click on OK")
	public void select_the_SAC_Code_and_Click_on_OK() throws Exception {
		waits();
		waits();
		click(wo.getSACCodeCheckbox());
		waits();
		click(wo.getSACCodeOkbutton());
		waits();
		System.out.println("SAC Selected and Pressed Ok");

	}

	@Then("Double click on Description")
	public void double_click_on_Description() throws Exception {
		waits();
		doubleClick(wo.getDescription());
		waits();
		System.out.println("Double Clicked on Description");
	}

	@Then("Select two items and click on OK")
	public void select_two_items_and_click_on_OK() throws Exception {
		waits();
		waits();
		click(wo.getItemCheckbox());
		waits();
		click(wo.getItemOkbutton());
		waits();
		System.out.println("Item Selected and Pressed Ok");
	}

	@Then("Provide the Qty as {string}")
	public void provide_the_Qty_as(String q) throws Exception {
		sendkeys(wo.getQty(), q);
		waits();
		System.out.println("Qty Filled");
	}

	@Then("Clear Current Rate and Enter Rate as {string}")
	public void clear_Current_Rate_and_Enter_Rate_as(String r) throws Exception {
		clear(wo.getRate());
		waits();
		sendkeys(wo.getRate(), r);
		waits();
		click(wo.getAmount());
		waits();
		javaexeScrollDown(wo.getSubmit());
		waits();
		click(wo.getReadyforApproval());
		System.out.println("Rate Cleared and New Rate Filled");
	}

	@Then("Click on Work Order submit button")
	public void click_on_Work_Order_submit_button() throws Exception {		
		click(wo.getSubmit());
		System.out.println("Order Submitted Successfully");
	}

}
