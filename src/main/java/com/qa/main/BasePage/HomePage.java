package com.qa.main.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.qa.Testdata.BaseTest;

public class HomePage extends BaseTest
{      ContactsPage contactpage;
	
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]/span")
	WebElement lblContacts;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	// method 
	
	public ContactsPage ClickOnConatctPages()
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		lblContacts.click();
	
		return new ContactsPage();
	}
	
	
}
