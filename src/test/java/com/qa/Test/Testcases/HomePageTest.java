package com.qa.Test.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.qa.Testdata.BaseTest;
import com.qa.main.BasePage.HomePage;
import com.qa.main.BasePage.LoginPage;

public class HomePageTest extends BaseTest
{
	LoginPage loginpg;
	HomePage homepage;
public HomePageTest()
{
	super();
}

@BeforeMethod
public void beforePageLode()
{
	 initalise();
	 loginpg = new LoginPage();
	 homepage =loginpg.PerformLoginPage(prop.getProperty("username"),prop.getProperty("password"));
	
}

@Test (priority=2)
public void PerformLoginTestCase()
{ 
  homepage.ClickOnConatctPages();

}
//test

@AfterMethod
public void tearDown() 
{
	driver.close();
}
}
