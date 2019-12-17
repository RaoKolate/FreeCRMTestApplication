package com.qa.main.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.main.qa.Testdata.BaseTest;

public class ContactsPage extends BaseTest
{
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement btnNewContact;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[1]")
	WebElement lblconatctlogo;
	
	// create new conatct
	@FindBy(name="first_name")
	WebElement TxtFTname;
	
	@FindBy(name="last_name")
	WebElement TxtLTname;
	
	@FindBy(name="middle_name")
	WebElement TxtMTname;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement TxtCompanyName;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")
	WebElement TxtEmailID;
	
	//save button
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement btnSave;
	
public ContactsPage()
{
	PageFactory.initElements(driver, this);
	//System.out.println("wlc to conatct page");
 }


// method 

public void ButtonNewConatctPage()
{
	btnNewContact.click();
}

public boolean verifycontactPage()
{
	return lblconatctlogo.isDisplayed();
}

public void createNewcontact(String Ftname, String ltname, String Mtname , String CPanyName , String EMailID)
{
	TxtFTname.sendKeys(Ftname);
	TxtLTname.sendKeys(ltname);
	TxtMTname.sendKeys(Mtname);
	TxtCompanyName.sendKeys(CPanyName);
	TxtEmailID.sendKeys(EMailID);
	btnSave.click();
}

}