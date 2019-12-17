package com.qa.Test.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.qa.Testdata.BaseTest;
import com.qa.main.BasePage.ContactsPage;
import com.qa.main.BasePage.HomePage;
import com.qa.main.BasePage.LoginPage;

public class ContactpageTest extends BaseTest
{
	LoginPage loginpg;
	HomePage homepage;
	ContactsPage contactpage;
	
 public ContactpageTest()
 {
	 super();
 }
 @BeforeMethod
 public void beforePageLode()
 {
 	 initalise();
 	 loginpg = new LoginPage();
 	 homepage =loginpg.PerformLoginPage(prop.getProperty("username"),prop.getProperty("password"));
 	 contactpage=homepage.ClickOnConatctPages();
 	 contactpage = new ContactsPage();
 	 
  }
 
 
 // test area
 @Test (priority=1)
 public void verifyConatcspageLable()
 {
	Assert.assertTrue(contactpage.verifycontactPage(), "Contact label is missing on page");
 }
 
 @Test (priority=2)
 public void ClickonNewButtonTest()
 {
	 contactpage.ButtonNewConatctPage();
 }
 
 // entering values into new conatcts

 // create dataprovider
 @DataProvider
 public void getTestData()
 {
 
 }
 
 
 
 @Test(priority=3)
 public void validateCreateNewConatctTest()
 {
	 contactpage.ButtonNewConatctPage();
	 contactpage.createNewcontact("Ravi", "Kolate", "sambhaji", "accenture", "aa@bt.com");
	 homepage.ClickOnConatctPages();
 }
  
 @AfterMethod
 public void tearDown() 
 {
 	//driver.close();
 }
 
}
