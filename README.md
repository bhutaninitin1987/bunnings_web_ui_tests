# Bunnings Testing Challenge
 Repo for bunnings web user interface testing
 
## The Problem
Automate top 3 test cases for Search and Results feature on Bunnings website. Please refer to below link for more information.
https://github.com/ettiennegous/testing-challenge-1

## Solution

### Test Scenarios

As per my understanding, I have identified the below 3 top priority test cases for the search and results feature of Bunnings website which includes 1 positive scenario and 2 negative scenarios. 

**1. Search with input text** 
  This test case is to cover the happy path of the search and result feature when any user enters a valid input text and the corresponding search results are displayed.
  Test Steps:
  - Launch Bunnings Website.
  - Enter _"DIY"_ in the search text box.
  - Click on search icon button.
  - Verify the corresponding results are displayed on the screen.
  
**2. Search with special characters**
  This test case is to cover an exception path of the search and result feature when any user enters an invalid text (special characters) in the search text box.
  Test Steps:
  - Launch Bunnings Website.
  - Enter _"!@#$"_ in the search text box.
  - Click on search icon button.
  - Verify the corresponding result message is displayed on the screen.
  
**3. Search without input text**
  This test case is to cover an additional exception path of the search and result feature when any user doesn't enter any text in the search text box.
  Test Steps:
  - Launch Bunnings Website.
  - Click on search icon button.
  - Verify an error message is displayed on the screen.

### Test Automation

#### JAVA - TestNG - Page Object - TDD - Selenium

I have automated the above test scenarios in Java using TestNG framework with Selenium.

The framework is developed in TDD approach and based on page object model. There are 2 classes under pageobjects which represent different pages of the bunnings website.
- HomePage
- SearchPage

The "_WebUITests_" class under tests package contains all the three test cases along with BeforeMethod and AfterMethod functions.
- BeforeMethod - initializeDriver() - This method is used to initialize the driver and it gets executed before execution of each test method. 
- AfterMethod - closeDriver() - This method is used to close the driver and it gets executed after completion of each test method.
- searchWithInputText() - This method represents test case #1 where user enters a valid text to search.
- searchWithSpecialCharacters() - This method represents test case #2 where user enters an invalid text to search.
- searchWithoutInputText() - This methos represents test case #3 where user doesn't enter any text to search.

There is one additional file under testcase package.
- TestSuite.xml - This file contains the list of the tests to execute using this framework.

In addition to above, there is an additional folder named as "_test-output_" folder which contains the execution results from my local machine. This is the standard reporting functionality of TestNG framework.
