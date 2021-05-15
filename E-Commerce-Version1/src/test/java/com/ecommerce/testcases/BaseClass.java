package com.ecommerce.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ecommerce.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseUrl = readconfig.getApplicationURL();
	public String email = readconfig.getemail();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
