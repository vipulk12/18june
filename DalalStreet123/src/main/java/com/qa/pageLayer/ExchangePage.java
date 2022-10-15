package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase {

	public ExchangePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle arrow-none'])[2]")private WebElement Exchange ;
	public void ClickOnExchange() 
	{
		Exchange.click();;
	}
	
	@FindBy (xpath="//a[text()='AAVAS.NS']")private WebElement Select_com ;
	public void Selectcompany_name( ) 
	{
		Select_com.click();
	}
	@FindBy(partialLinkText="ABB.NS")private WebElement SelectComp;
	public void ClickOnSelected_Comp() 
	{
		SelectComp.click();;
	}
	
	
	
	
	
	
	
	
}
