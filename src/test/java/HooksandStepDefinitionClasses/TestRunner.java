package HooksandStepDefinitionClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//test//resources//Feature Files//WorkOrder.feature",
		glue={"HooksandStepDefinitionClasses"},
		dryRun=false,
		monochrome=true,
		plugin={"json:target//BSF.json","html:target//reports"}
		)


public class TestRunner {

}
