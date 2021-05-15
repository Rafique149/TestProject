package com.ecommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[1]/a")
	WebElement link;
	
	@FindBy(name="login[username]")
	WebElement txtemail;
	
	@FindBy(name="login[password]")
	WebElement txtpassword;

	@FindBy(name="send")
	WebElement btnlogin;
	
	public void loginlink()
	{
		link.click();
	}
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		btnlogin.click();
	}
}
