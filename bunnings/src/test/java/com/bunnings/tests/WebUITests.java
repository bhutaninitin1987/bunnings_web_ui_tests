package com.bunnings.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bunnings.pageobjects.HomePage;
import com.bunnings.pageobjects.SearchPage;
import com.bunnings.webactions.DriverProvider;

public class WebUITests {
	
	@BeforeMethod
	public void initializeDriver() {	//Function to initialize the driver before each test
		DriverProvider.driver = DriverProvider.initializeDriver("chrome");
	}
	
	@Test(priority = 0)
    public void searchWithInputText() {
		
		//Test Data
		String searchText = "DIY"; 
		
		//Object initializations for different pages
		HomePage homePage = new HomePage(DriverProvider.driver);
		SearchPage searchPage = new SearchPage(DriverProvider.driver);
		
		//Launch bunnings website
		homePage.navigateToURL();
		
		//Test Steps to use search box
		homePage.clickSearchTextBox();
		homePage.writeSearchTextBox(searchText);
		homePage.clickSearchIcon();
		
		//Assertion for successful search results
		String resultTextActual = "443 results for DIY";
		String resultTextExpected = searchPage.getSearchResultText(); 
		Assert.assertEquals(resultTextActual, resultTextExpected);
	}
	
	@Test(priority = 1)
	public void searchWithSpecialCharacters() {
		
		//Test Data
		String searchText = "!@#$%"; 
		
		//Object initializations for different pages
		HomePage homePage = new HomePage(DriverProvider.driver);
		SearchPage searchPage = new SearchPage(DriverProvider.driver);
		
		//Launch bunnings website
		homePage.navigateToURL();
		
		//Test Steps to use search box
		homePage.clickSearchTextBox();
		homePage.writeSearchTextBox(searchText);
		homePage.clickSearchIcon();
		
		//Assertion for incorrect search
		String resultTextActual = "0 results for !@#$%";
		String resultTextExpected = searchPage.getSearchResultText(); 
		Assert.assertEquals(resultTextActual, resultTextExpected);
	}
	
	@Test(priority = 2)
    public void searchWithoutInputText() {
		
		//Object initializations for different pages
		HomePage homePage = new HomePage(DriverProvider.driver);
		
		//Launch bunnings website
		homePage.navigateToURL();
		
		//Test Steps to use search box without input text
		homePage.clickSearchIcon();
		
		//Assertion of error message
		String alertTextExpected = "Please enter search keywords";
		String alertTextActual = DriverProvider.driver.switchTo().alert().getText();	
		Assert.assertEquals(alertTextActual,alertTextExpected);
	}

	@AfterMethod
	public void closeDriver() {		//Function to close the driver after each test
		DriverProvider.driver.close();
	}

}
