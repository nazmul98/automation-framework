package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//*[text()='Sign in'])[2]")
	private WebElement homepageSignInBtn;
	
	@FindBy (id = "input-email-address")
	private WebElement emailInput;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement passwordInput;
	
	@FindBy (xpath = "//button[text()='Sign in']")
	private WebElement signInBtn;

	public WebElement getHomepageSignInBtn() {
		return homepageSignInBtn;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
}
