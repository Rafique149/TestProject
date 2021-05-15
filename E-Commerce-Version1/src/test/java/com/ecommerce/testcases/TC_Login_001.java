package com.ecommerce.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.pageobject.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginlink();
		lp.setemail(email);
		lp.setpassword(password);
		
		lp.clicksubmit();
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("My Account"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
