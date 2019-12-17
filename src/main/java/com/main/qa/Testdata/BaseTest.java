package com.main.qa.Testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.main.util.testutil;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties prop;
	public BaseTest()
	{
		prop = new Properties();
		FileInputStream input;
		
		try {
			input = new FileInputStream("C:\\Users\\r.sambhaji.kolate\\workspace\\CRMfreeTest\\src\\main\\java\\com\\qa\\main\\configuration\\config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initalise()
	{
		String Bname= prop.getProperty("browser");
		System.out.println(Bname);
		if (Bname.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\r.sambhaji.kolate\\Desktop\\BrowserExe\\chrome\\chrome1\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (Bname.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\r.sambhaji.kolate\\Desktop\\BrowserExe\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
	
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
