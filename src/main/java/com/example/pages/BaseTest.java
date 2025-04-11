package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
protected WebDriver driver;

@BeforeMethod
public void setup() {
	String projectPath = System.getProperty("user.dir");
	System.getProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	ScreenshotUtil.takeScreenshot(driver, "Launching website");
}

@AfterMethod
public void teardown() {
	if(driver != null) {
		driver.quit();
	}
}
}
