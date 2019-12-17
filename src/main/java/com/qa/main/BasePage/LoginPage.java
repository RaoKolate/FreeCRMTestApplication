package com.qa.main.BasePage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.qa.Testdata.BaseTest;

public class LoginPage extends BaseTest
{
	// define web element 
	@FindBy(name="email")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement btnLogin;

  // initailse web element 
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method for doing action .
	
	public HomePage PerformLoginPage(String us, String pwd)
	{
		txtUsername.sendKeys(us);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		return new HomePage();
		
	}
}
