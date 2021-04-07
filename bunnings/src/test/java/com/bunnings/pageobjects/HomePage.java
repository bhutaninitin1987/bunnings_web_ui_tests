package com.bunnings.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bunnings.webactions.DriverActions;

public class HomePage extends DriverActions {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Bunnings Website URL
	String url = "https://www.bunnings.com.au/";
		
	//List of Web Elements on Bunnings home page
	String searchIconBtn = "search-container_btn-submit";
	String searchTextBox = "//*[@type='submit']//preceding::input[1]";
	String resultText = "responsive-search-title";
	
	
	//Functions to perform the actions on the home page
	public void navigateToURL() {
		driver.get(url);
	}
	
	public void clickSearchIcon() {
	    click(By.className(searchIconBtn));
	}
	
	public void clickSearchTextBox() {
	    click(By.xpath(searchTextBox));
	}
	
	public void writeSearchTextBox(String searchText) {
		writeText(By.xpath(searchTextBox), searchText);
	}
	
}
