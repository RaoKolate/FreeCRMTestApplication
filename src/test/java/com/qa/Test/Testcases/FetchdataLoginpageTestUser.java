package com.qa.Test.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.qa.Testdata.BaseTest;
import com.qa.main.BasePage.HomePage;
import com.qa.main.Fetchdatafromexcel.fetchDataFromExcel;
import com.qa.main.util.tetsLoginUtil;

public class FetchdataLoginpageTestUser extends BaseTest
{
	fetchDataFromExcel fetchdatafromexcel;
 public FetchdataLoginpageTestUser()
 {
	 super();
 }
 
 @BeforeMethod
 public void setup()
 {
	 initalise();
	 
 }
 @DataProvider
 public Object[][] getLoginData()
 {
	Object data[][]= tetsLoginUtil.getTestData("Login");
	return data;
 }
 
 @Test(dataProvider="getLoginData")
 public void TestLoginwithManyuser(String UserName , String Password)
 {
	 fetchdatafromexcel.PerformLoginPage(UserName, Password);
 }
 
 @AfterMethod
 public void teardown()
 {
	 driver.close();
 }
  
}
