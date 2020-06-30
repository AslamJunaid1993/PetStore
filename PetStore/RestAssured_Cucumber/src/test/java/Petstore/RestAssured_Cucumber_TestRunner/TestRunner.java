package Petstore.RestAssured_Cucumber_TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},
		format={"pretty","html:target/reports/test-report"},
		tags= "@smokeTest"
)
public class TestRunner {}