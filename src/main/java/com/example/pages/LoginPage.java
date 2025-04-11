package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage{
	 private WebDriver driver;
	 private By usernameField = By.id("username");
	 private By passwordField = By.id("password");
	 private By loginButton = By.id("submit");
	 
	 //constructor 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//actions
	public void login(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		ScreenshotUtil.takeScreenshot(driver, "Login Screen");
		driver.findElement(loginButton).click();
	}
	
	public boolean isLoginSuccessful() {
		return driver.getTitle().contains("Logged In Successfully | Practice Test Automation");
	}

	 

}
