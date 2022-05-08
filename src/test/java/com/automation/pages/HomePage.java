package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.DriverUtils;
import com.automation.utils.HelperUtils;

public class HomePage extends BasePage{
	
	@FindBy(id="branding")
	public WebElement logo;
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement admin;
	
	@FindBy(id="menu_admin_Job")
	public WebElement job;
	
	
	@FindBy(xpath="//a[@id='menu_admin_Job']/following-sibling::ul/li/a")
	public List<WebElement> listOfJobItemsOnUI;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void verifyHomePageAfterLogin() {
		
		HelperUtils.explcitWaitUntilVisible(driver,logo);
		Assert.assertTrue(logo.isDisplayed());
	}

	public void hoverOverAdminAndJobs() {
		Actions action = new Actions(DriverUtils.getDriver());
		action.moveToElement(admin).moveToElement(job).build().perform();
	}
	
	public void verifyJobItems(List<String> listOfItems) {
		
		for(int i=0;i<listOfItems.size();i++) {
			Assert.assertEquals(listOfItems.get(i), listOfJobItemsOnUI.get(i).getText());
		}
		
	}
}
