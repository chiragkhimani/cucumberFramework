package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.HelperUtils;
import com.automation.utils.PropertyUtils;

public class LoginPage extends BasePage{
	
	@FindBy(id="txtUsername")
	public WebElement usernameOnWeb;
	
	@FindBy(id="txtPassword")
	public WebElement passwordOnWeb;
	
	@FindBy(id="btnLogin")
	public WebElement loginButton;
	
	@FindBy(xpath="//span[@id='spanMessage']")
	public WebElement errorMsgOnLogin;
	
	@FindBy(xpath="//div[@id='forgotPasswordLink']/a")
	public WebElement forgetPasswordLink;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void openWebsite() {
		driver.get(PropertyUtils.getProperty("app.url"));
	}
	
	public void doLogin(String username, String password) {
		
		String actualPageTitle =  driver.getTitle();
		
		String expectedPageTitle = "OrangeHRM";
		
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		
		usernameOnWeb.sendKeys(username);
		passwordOnWeb.sendKeys(password);
		loginButton.click();
	}
	
	public void verifyInvalidCred() {
		HelperUtils.explcitWaitUntilVisible(driver,errorMsgOnLogin);
		
		Assert.assertTrue(errorMsgOnLogin.isDisplayed());
	}
	
	public void doLoginWithBlankCred() {
		loginButton.click();
	}
	
	public void clickOnForgetPasswordLink() {
		forgetPasswordLink.click();
	}
	
}
