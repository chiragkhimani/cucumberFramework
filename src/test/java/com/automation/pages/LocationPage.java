package com.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.automation.utils.DriverUtils;

public class LocationPage extends BasePage{
	
	@FindBy(id="menu_admin_viewAdminModule")
	public WebElement admin;
	
	@FindBy(id="menu_admin_Organization")
	public WebElement organization;
	
	@FindBy(id="menu_admin_viewLocations")
	public WebElement locations;
	

	public LocationPage(WebDriver driver) {
		super(driver);
	}

	public void hoverOverAdminAndOrganizationAndClickOnLocation() {
		Actions action = new Actions(DriverUtils.getDriver());
		action.moveToElement(admin).moveToElement(organization).click(locations).build().perform();
	}

	public void verifyLocationData(List<List<String>> listOfdata) {
		//WebTable from UI
		List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
		System.out.println("Number of rows is "+numberOfRows.size());

		String columnLocator = "//table[@id='resultTable']//tr[%s]//td";
		
		for(int i=1,m=0;i<numberOfRows.size();i++,m++) {
			
			List<WebElement> numberOfColumns = driver.findElements(By.xpath(String.format(columnLocator,i )));
			
			
			
			for(int j=2,k=0;j<numberOfColumns.size();j++,k++) {
				
				System.out.println("Actual   "+numberOfColumns.get(j).getText());
				System.out.println("Expected  "+listOfdata.get(m).get(k));
				
				Assert.assertEquals(numberOfColumns.get(j).getText(),listOfdata.get(m).get(k));
				
			}
		}
	}

}
