package com.example.pages;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
	@Test
	 public void testValidLogin() throws InterruptedException {
		 LoginPage loginPage = new LoginPage(driver);
		 loginPage.login("student", "Password123"); //replace with valida credentials
		 
		 Thread.sleep(4000);
		 
		 boolean isSuccess = loginPage.isLoginSuccessful();
		 Assert.assertTrue(isSuccess, "Login is successfulss");
		 ScreenshotUtil.takeScreenshot(driver, "Successful login!");
	 }
}
