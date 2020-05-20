package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//feature location
		features = {"src/test/java/Features/"},

		//step files
		glue={"Steps"},

		monochrome = true,

		dryRun = false,

		tags={},

		plugin = {"pretty"}
		)


public class MainRunner {

}
