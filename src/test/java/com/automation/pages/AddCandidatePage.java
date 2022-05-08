package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyUtils;

public class AddCandidatePage extends BasePage{
	
	@FindBy(id = "addCandidate_firstName")
	public WebElement firstName;
	
	@FindBy(id = "addCandidate_lastName")
	public WebElement lastName;
	
	@FindBy(id = "addCandidate_email")
	public WebElement email;
	
	@FindBy(id = "btnSave")
	public WebElement saveButton;

	public AddCandidatePage(WebDriver driver) {
		super(driver);
	}

	public void verifyUserIsOnAddCandidatePage() {
		 String expectedUrl = DriverUtils.getDriver().getCurrentUrl();
		   Assert.assertTrue(expectedUrl.contains("recruitment/addCandidate"));
	}
	
	public void enterDetailsAndSave(String firstname, String lastname, String emailId) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(emailId);
		saveButton.click();
	}
	
	public void verifyCandidateIsAdded(String firstname, String lastname, String emailId) {
		 
		   Assert.assertEquals(firstName.getAttribute("value"),firstname);
	}
	
}
