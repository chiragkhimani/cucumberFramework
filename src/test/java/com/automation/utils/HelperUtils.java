package com.automation.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.pages.BasePage;

public class HelperUtils {
	
	public static void explcitWaitUntilVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void explcitWaitUntilClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void captureScreenshot(WebDriver driver,String path) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcImg = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destImg = new File(path);
		
		FileUtils.copyFile(srcImg, destImg);
	}
}
