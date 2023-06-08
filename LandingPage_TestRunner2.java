package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/test/resources/features/LandingPage2.feature"},
		glue = {"landingpage2_stepdefinitions", "apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/cucumber",
						 "json:target/creport/cucumber.json",
				 		 "junit:target/creport/cucumber.xml"}
		//dryRun=true
		
		)

public class LandingPage_TestRunner2 extends AbstractTestNGCucumberTests{

}
