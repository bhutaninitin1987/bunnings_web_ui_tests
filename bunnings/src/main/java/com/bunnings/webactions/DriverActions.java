package com.bunnings.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverActions {
	// functions for click , write , read and send keyboard keys
	
    public WebDriver driver;
 
    //constructor
    public DriverActions (WebDriver driver){  
    this.driver = driver;
    }
 
    //click method
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }
 
    //write text
    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }
 
    //read text
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
    
    //send keys
    public void sendKeyboardKeys (By elementLocation, CharSequence Keys) {
        driver.findElement(elementLocation).sendKeys(Keys);
    }
    
    //clear text
    public void clearText (By elementLocation) {
        driver.findElement(elementLocation).clear();
    }

}
