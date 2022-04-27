package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.utils.HelperUtils;
import com.automation.utils.PropertyUtils;

public class ForgetPasswordPage extends BasePage{
	
	@FindBy(id="securityAuthentication_userName")
	public WebElement usernameOnForgetPasswordPage;
	
	@FindBy(id="btnSearchValues")
	public WebElement resetButton;
	
	@FindBy(xpath="//div[@class='message warning fadable']")
	public WebElement errorMsgOnForgetPassword;
	

	public ForgetPasswordPage(WebDriver driver) {
		super(driver);
	}

	public void resetPassword() {
		HelperUtils.explcitWaitUntilVisible(driver,usernameOnForgetPasswordPage);
		
		usernameOnForgetPasswordPage.sendKeys(PropertyUtils.getProperty("login.invalid.username"));
		
		HelperUtils.explcitWaitUntilClickable(driver,resetButton);
		resetButton.click();
	}
	
	public void verifyErrorMessageOnForgetPasswordPage() {
		Assert.assertTrue(errorMsgOnForgetPassword.isDisplayed());
		
		
	}
}
