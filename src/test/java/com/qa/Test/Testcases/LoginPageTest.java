package com.qa.Test.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.qa.Testdata.BaseTest;
import com.qa.main.BasePage.HomePage;
import com.qa.main.BasePage.LoginPage;

public class LoginPageTest extends BaseTest
{
	LoginPage loginpg;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void beforePageLode()
	{
		initalise();
		
	}
	
	@Test (priority=1)
	public void PerformLoginTestCase()
	{ loginpg = new LoginPage();
	  loginpg.PerformLoginPage(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}

}
