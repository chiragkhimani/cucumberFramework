package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.utils.HelperUtils;

public class HomePage extends BasePage{
	
	@FindBy(id="branding")
	public WebElement logo;
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyHomePageAfterLogin() {
		
		HelperUtils.explcitWaitUntilVisible(driver,logo);
		Assert.assertTrue(logo.isDisplayed());
	}

}
