package com.pages;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility 
{
	@FindBy(xpath="(//*[text()='Login'])[2]")
	private WebElement Login;
	
	@FindBy(xpath="//*[@id='navbar-collapse-header']/ul/li[1]/a")
	private WebElement text;
	
	@FindBy(xpath="//input[@name='newsletter']")
    private WebElement newsletter; 
	
	@FindBy(xpath="//*[@id=\"newsletter\"]/div/div/button")
	private WebElement arrow;
	
	@FindBy(xpath="//select[@id='fieldjrayki']")
	private WebElement country;
	
	@FindBy(xpath="//*[@id='fieldjrayki']/option[104]")
	private WebElement dropdown;
	
	@FindBy(xpath="//label[@for='fieldjrydjiy-3']")
	private WebElement Other;
	
	@FindBy(xpath="//button[@id='button-newsletter']")
	private WebElement Subscribe;
	
	
     public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandingPageTitle()
	{
		return validatePageTitle(); 
	}

    public void LoginButton() {
		Login.click();
		
	}

	public String validateLoginPageTitle() {
		return driver.getTitle(); 
	}

//	public String validateField() {
//		return driver.getTitle();
//		
//	}

	public void newsletter() {
		 newsletter.click();
		
	}

	public void userEmail(String email) {
		newsletter.sendKeys(email);
		
	}

	public void countryButton() {
		country.click();
		
	}

	public void dropdownList() {
		country.isSelected();
		
	}

	public void typeButton() {
		Other.click();
		
	}

	public void subscribeButton() {
		Subscribe.click();
		
	}

	public void arrowButton() {
		arrow.click();
		
	}

	public void dropdown() {
		dropdown.click();
		
	}

   public String validateText() {
		return text.getText();
		
	}

	
				
	
}
	