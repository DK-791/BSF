package HooksandStepDefinitionClasses;

import CommonMethods.CommonMethods;
import cucumber.api.java.*;

public class Hooks extends CommonMethods {

	@Before
	public void beforeFeature() throws Exception {
		browserLaunch();
	}

	@After
	public void afterFeature() throws Exception {
		browserClose();
	}
}
