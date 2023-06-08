package landingpage1_stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import com.aventstack.extentreports.Status;

import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Config;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage1_Steps extends Utility{
	     public LandingPage ldp;
	     public LoginPage lp;
	ExcelReader reader;
		
	public void objectMethod1() throws IOException {
         ldp = new LandingPage();
         lp=new LoginPage();
		}
	
    @Given("chrome is launched and Opencart is launched")
	public void chrome_is_launched_and_opencart_is_launched() throws Exception {
		objectMethod1();
       
		logger = report.createTest("test01");

        logger.log(Status.INFO, "Validating landing page title");
        
        String actualtitle = ldp.validateLandingPageTitle();
        String expectedtitle="OpenCart - Open Source Shopping Cart Solution";
        
        try {
        	 assertEquals(actualtitle, expectedtitle);
             logger.log(Status.PASS, "Step1 is passed");
             System.out.println(actualtitle);
             assert true;
        }catch(AssertionError e) {
        	e.printStackTrace();
        	logger.log(Status.FAIL,"Step1 is failed");
        	captureScreenshotOnFailure();
        	assert false;
        }
        Utility.implicitWait();
	}
	@Then("User navigates on Landing page")
	public void user_navigates_on_landing_page1() throws Exception {
		objectMethod1();
        
        logger = report.createTest("test02");
        
        logger.log(Status.INFO, "Validating landing page title");
        
        String actualtitle = ldp.validateLandingPageTitle();
        String expectedtitle="OpenCart - Open Source Shopping Cart Solution";
        
        try {
       	     assertEquals(actualtitle, expectedtitle);
             logger.log(Status.PASS, "Step2 is passed");
             System.out.println(actualtitle);
             assert true;
          }catch(AssertionError e) {
       	     e.printStackTrace();
       	     logger.log(Status.FAIL,"Step2 is failed");
       	     captureScreenshotOnFailure();
           	 assert false;
        Utility.implicitWait();
	}
	}
	
	@Then("fields are visible on the Landing page")
	public void fields_are_visible_on_the_landing_page() throws IOException, InterruptedException {
		objectMethod1();
		
		logger.log(Status.INFO,"Validating Landing page text");
		
		String actualtext=ldp.validateText();
		String expectedtext="FEATURES";
		
		try {
			logger.log(Status.INFO,"Step3 is executed");
			
			assertEquals(actualtext,expectedtext);
			logger.log(Status.PASS,"Test is passed");
			System.out.println(actualtext);
			assert true;
		 }catch(AssertionError e) {
      	     e.printStackTrace();
      	     logger.log(Status.FAIL,"Test is failed");
      	     captureScreenshotOnFailure();
          	 assert false;
			}
		
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod1();
		Thread.sleep(2000);
		ldp.LoginButton();
		Utility.implicitWait();
		
		logger.log(Status.INFO, "Step4 is executed");
	    }
	@Then("Login button is clickable and User navigates to login page")
	public void login_button_is_clickable_and_user_navigates_to_login_page() throws IOException, InterruptedException {
		objectMethod1();
		Thread.sleep(2000);
		 logger = report.createTest("test05");

	     logger.log(Status.INFO, "Validating login page title");
	     
		String actualtitle = lp.validateLoginPageTitle();
		String expectedtitle = "Just a moment...";
		System.out.println(actualtitle);
		
		try {
		    assertEquals(expectedtitle, actualtitle);
		    logger.log(Status.PASS, "Step5 is passed");
		    System.out.println(actualtitle);
		    assert true;
		 }catch(AssertionError e) {
		     e.printStackTrace();
		     logger.log(Status.FAIL,"Step5 is failed");
		     captureScreenshotOnFailure();
		     assert false;
		     Utility.implicitWait();
		 }    
	}
	@Then("User navigates on Landing Page")
	public void user_navigates_on_landing_page() throws Exception {
		objectMethod1();
        Thread.sleep(2000);
        
        logger = report.createTest("test06");
        logger.log(Status.INFO, "Validating landing page title");
        String actualtitle = ldp.validateLandingPageTitle();
        String expectedtitle="OpenCart - Open Source Shopping Cart Solution";
        
        System.out.println(actualtitle);
        //Utility.captureScreenshot();
        
        try {
          	 assertEquals(actualtitle, expectedtitle);
               logger.log(Status.PASS, "Step6 is passed");
               System.out.println(actualtitle);
               assert true;
        }catch(AssertionError e) {
           	e.printStackTrace();
           	logger.log(Status.FAIL,"Step6 is failed");
           	captureScreenshotOnFailure();
           	assert false;
            Utility.implicitWait();
}
}
}
	
	
	


