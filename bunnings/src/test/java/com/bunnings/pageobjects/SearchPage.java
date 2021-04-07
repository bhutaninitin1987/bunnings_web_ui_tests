package com.bunnings.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bunnings.webactions.DriverActions;

public class SearchPage extends DriverActions {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//List of Web Elements on Bunnings home page
	String resultText = "responsive-search-title";
	
	//Functions to perform the actions on the home page
	public String getSearchResultText() {
		return readText(By.className(resultText));
	}


}
