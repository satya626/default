package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,plugin = {"json:target/cucumber.json"}
		,glue={"stepDef"}
		,tags={"@LoginTest"}
		//,dryRun=true
		//
		,monochrome=true
		)
public class Testrunner extends AbstractTestNGCucumberTests {
	
	

}
