package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Featurefiles/LoginFeature.feature",
		glue = "stepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:/target/cucumberReports/reports1.html"}
		)

public class runnerClass {

}
