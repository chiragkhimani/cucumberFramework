package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	static WebDriver driver;
	
	public  static void createDriver() {
		PropertyUtils.initProperty();
		ExcelUtils.initproperty();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/webdrivers/chromedriver");
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
