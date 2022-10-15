package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Dash_Board extends TestBase {
	
	public Dash_Board() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement Searchbox;
	public void EnterCompanyName(String company_name) 
	{
		Searchbox.sendKeys(company_name);
	}
	
	@FindBy(partialLinkText="WIPRO")private WebElement SelectCompany1;
	public void ClickOnSelected_Company1() 
	{
		SelectCompany1.click();;
	}
	@FindBy(partialLinkText="AXIS")private WebElement SelectCompany2;
	public void ClickOnSelected_Company2() 
	{
		SelectCompany2.click();;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
