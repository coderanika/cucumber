package testRunner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	
	
	@CucumberOptions(features = "src/test/resources/features", 
			glue = "stepDefination",
			plugin = {"pretty", "html:target/cucumber-reports.html",
					"json:target/Cucumber.json"
			})
	
	public class TestRunner extends AbstractTestNGCucumberTests {

	}

