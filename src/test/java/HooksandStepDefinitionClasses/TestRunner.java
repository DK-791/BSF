package HooksandStepDefinitionClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//test//resources//Feature Files//WorkOrder.feature",
		glue={"HooksandStepDefinitionClasses"},
		dryRun=false,
		monochrome=true
		)


public class TestRunner {

}
