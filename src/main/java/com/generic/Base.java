package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	@Test
	public void openBrowser () {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
}
