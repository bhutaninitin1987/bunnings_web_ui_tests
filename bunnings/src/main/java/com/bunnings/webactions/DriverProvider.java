package com.bunnings.webactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {
	//define driver instantiation
		public static WebDriver driver;
		public static WebDriver initializeDriver(String browserName)
		{
			System.setProperty("webdriver.chrome.driver","./\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
}