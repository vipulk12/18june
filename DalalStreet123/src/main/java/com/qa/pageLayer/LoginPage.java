package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	// Enter Mobile number
	@FindBy(xpath="//input[@name='email']") private WebElement Mob_Num;
	public void EnterMob_Num(String mobile_Number) 
	{
		Mob_Num.sendKeys(mobile_Number);
	}
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	public void EnterPassword(String Pass) 
	{
		Password.sendKeys(Pass);
	}
	@FindBy(xpath="//button[text()='Log In']") private WebElement Login_btn;
	public void ClickOn_Login_btn() 
	{
		Login_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
