package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				glue="stepDefinitions",
				tags="@smoketest",
				monochrome = true,
				plugin= {"pretty", 
						"junit:target/cucumber/report.xml",
						"json:target/cucumber/report.json",
						"html:target/cucumber/report.html"}
				)
public class TestRunner {

}
