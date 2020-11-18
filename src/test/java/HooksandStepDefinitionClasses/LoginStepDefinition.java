package HooksandStepDefinitionClasses;

import CommonMethods.CommonMethods;
import Locators.LoginLocators;
import cucumber.api.java.en.*;

public class LoginStepDefinition extends CommonMethods {
	LoginLocators l = new LoginLocators();

	@Given("Navigate to BSF Login Page")
	public void navigate_to_BSF_Login_Page() throws Exception {
		getUrl("http://staging.buildsuperfast.com:10080/dev_release/bsferp_v1.12/public/application/index/index");
		waits();
		System.out.println("Navigated to BSF Login Page");
	}

	@Then("User fills the {string} and {string}")
	public void user_fills_the_Username(String S, String P) {
		sendkeys(l.getUsername(), S);
		sendkeys(l.getPassword(), P);
		System.out.println("Username and Password are Filled");
	}

	@Then("User press the submit button")
	public void user_press_the_submit_button() {
		click(l.getSubmit());
		System.out.println("Clicked the Submit Button");
	}

}
