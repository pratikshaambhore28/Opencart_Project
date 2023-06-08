package landingpage_stepdefinitions_excel;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.LandingPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageExcel extends Utility {
	public LandingPage ldp;
	ExcelReader reader;
		
	public void objectMethod1() throws IOException {
         ldp = new LandingPage();
		}
	
	@Given("chrome is launched and Opencart is launched")
	public void chrome_is_launched_and_opencart_is_launched() throws IOException {
		objectMethod1();
		Utility.implicitWait();
		logger = report.createTest("test01");

        logger.log(Status.INFO, "Validating landing page title");
        String actualtitle = ldp.validateLandingPageTitle();
        String expectedtitle="OpenCart - Open Source Shopping Cart Solution";
        System.out.println(actualtitle);
        
        try {
       	 assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Step1 is passed");
            System.out.println(actualtitle);
            assert true;
       }catch(AssertionError e) {
       	e.printStackTrace();
       	logger.log(Status.FAIL,"Step1 is failed");
       	//captureScreenshotOnFailure();
       	assert false;
       }
        
	}
	@Then("User navigates on Landing Page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod1();
        Thread.sleep(2000);
        
        logger = report.createTest("test02");
        
        logger.log(Status.INFO, "Validating landing page title");
        String actualtitle = ldp.validateLandingPageTitle();
        String expectedtitle="OpenCart - Open Source Shopping Cart Solution";
        System.out.println(actualtitle);
        //Utility.captureScreenshot();
        
        try {
       	 assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Step2 is passed");
            System.out.println(actualtitle);
            assert true;
       }catch(AssertionError e) {
       	e.printStackTrace();
       	logger.log(Status.FAIL,"Step2 is failed");
       	//captureScreenshotOnFailure();
       	assert false;
        Utility.implicitWait();
	}
	    
	}
	
	@When("User clicks on subscribe to newsletter and provide  Email from given sheetname {string} and rownumber {int} and clicks on arrow button")
	public void user_clicks_on_subscribe_to_newsletter_and_provide_email_from_given_sheetname_and_rownumber_and_clicks_on_arrow_button(String sheetName, Integer rowNumber) throws IOException, InterruptedException, InvalidFormatException {
		Thread.sleep(10000);
        objectMethod1();
        reader = new ExcelReader();
        
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String email=testData.get(rowNumber).get("Email");
        
        ldp.newsletter();
        ldp.userEmail(email);
        ldp.arrowButton();
        
        logger.log(Status.INFO, "Step3 is executed");
		
	}
	@Then("User navigates to signup to newsletter form and shows valid Email inserted in the Email box")
	public void user_navigates_to_signup_to_newsletter_form_and_shows_valid_email_inserted_in_the_email_box() throws IOException, InterruptedException {
		objectMethod1();
        Thread.sleep(2000);
        logger.log(Status.INFO, "Step4 is executed");
	}
	
	@When("User clicks on country box and it shows dropdown list and selects country name")
	public void user_clicks_on_country_box_and_it_shows_dropdown_list_and_selects_country_name() throws IOException {
		objectMethod1();
		Utility.implicitWait();
        ldp.countryButton();
        Utility.implicitWait();
        ldp.dropdownList();
        Utility.implicitWait();
        ldp.dropdown();
        Utility.implicitWait();
        logger.log(Status.INFO, "Step5 is executed");
	}
	
    @When("User clicks the type of subscriber checkbox")
	public void user_clicks_the_type_of_subscriber_checkbox() throws IOException {
	    
    	objectMethod1();
		Utility.implicitWait();
        ldp.typeButton();
        Utility.implicitWait();
        logger.log(Status.INFO, "Step6 is executed");
	}
	@When("User clicks subscribe button")
	public void user_clicks_subscribe_button() throws IOException, InterruptedException {
		objectMethod1();
        Thread.sleep(2000);
        ldp.subscribeButton();
        Utility.implicitWait();
        logger.log(Status.INFO, "Step7 is executed");
	    
	}

	@Then("User successfully subscribe newsletter")
	public void user_successfully_subscribe_newsletter() throws IOException, InterruptedException {
		objectMethod1();
        Thread.sleep(2000);
		System.out.println("User not subscribed");
		 logger.log(Status.INFO, "Step8 is executed");
	   
	}
	
	@When("User clicks on subscribe to newsletter and provide Email from given sheetName {string} and rowNumber {int} and clicks on arrow button")
	public void user_clicks_on_subscribe_to_newsletter_and_provide_email_from_given_sheet_name_and_row_number_and_clicks_on_arrow_button(String sheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {
	    
		Thread.sleep(10000);
        objectMethod1();
        reader = new ExcelReader();
        
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String email=testData.get(rowNumber).get("email");
        
        ldp.newsletter();
        ldp.userEmail(email);
        ldp.arrowButton();
        
        logger.log(Status.INFO, "Step9 is executed");
	}
}
