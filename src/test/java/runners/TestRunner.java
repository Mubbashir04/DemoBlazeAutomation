package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions", "hooks" }, plugin = { "pretty",
		"html:target/CucumberReport.html", "json:target/CucumberReport.json" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
}