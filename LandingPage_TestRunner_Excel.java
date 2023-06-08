package testrunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/LandingPageExcel.feature"},
		glue = {"landingpage_stepdefinitions_excel", "apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/cucumber",
						 "json:target/creport/cucumber.json",
				 		 "junit:target/creport/cucumber.xml"}
		//dryRun=true
		
		)

public class LandingPage_TestRunner_Excel extends AbstractTestNGCucumberTests {

}
