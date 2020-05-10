package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\chetn\\workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature" ,
		glue={"stepDefinitions"},
		format ={"pretty", "html:test-outout"},
		monochrome= true,
		strict = true,
		dryRun= false
		
		)



public class TestRunner {
	
	
	}
