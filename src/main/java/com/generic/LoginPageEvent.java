package com.generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utils.Base;
import com.utils.BaseConfig;

public class LoginPageEvent {
	WebDriver driver;
	MasterPageFactory mpf;
	
	@BeforeTest
	public void getLoginPage () {
		driver = Base.initBrowser("chrome");
		driver.get(BaseConfig.getValue("URL"));
		mpf = new MasterPageFactory(driver);
		mpf.getHomepageSignInBtn().click();
	}
	
	@Test 
	public void getLogin () {
		mpf.getEmailInput().sendKeys(BaseConfig.getValue("EMAIL"));
		mpf.getPasswordInput().sendKeys(BaseConfig.getValue("PASSWORD"));
		mpf.getSignInBtn().click();
	}
	
	@AfterTest
	public void tearDown () {
		driver.quit();
	}
}
