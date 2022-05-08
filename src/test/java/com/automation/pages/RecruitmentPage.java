package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.DriverUtils;

public class RecruitmentPage extends BasePage{
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitment;
	
	@FindBy(id = "menu_recruitment_viewCandidates")
	public WebElement candidate;
	
	@FindBy(name = "btnAdd")
	public WebElement addButton;

	public RecruitmentPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnCandidateTabUnderRecruitment() {
		Actions action = new Actions(DriverUtils.getDriver());
		action.moveToElement(recruitment).click(candidate).build().perform();
	}
	
	public void verifyUserIsOnCandidatePage() {
		 String expectedUrl = DriverUtils.getDriver().getCurrentUrl();
		   Assert.assertTrue(expectedUrl.contains("recruitment/viewCandidates"));
	}
	public void clickOnAddCandidate() {
		addButton.click();
	}
}
