package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	static WebDriver driver;
	
	public  static void createDriver() {
		PropertyUtils.initProperty();
		ExcelUtils.initproperty();
		if(System.getProperty("os.name").contains("Win")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/webdrivers/chromedriver.exe");
		}else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/webdrivers/chromedriver");
		}
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
