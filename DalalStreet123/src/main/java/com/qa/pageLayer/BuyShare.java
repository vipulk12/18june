package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class BuyShare extends TestBase{
	
	public BuyShare() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")private WebElement buy_Button1;
	public void ClickOnBuyButton1() 
	{
		buy_Button1.click();;
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")private WebElement QuntityOfShare;
	public void Enter_QuntityOfShare(String quntity) 
	{
		QuntityOfShare.sendKeys(quntity);
	}
	
	@FindBy(xpath="//button[text()='Buy']")private WebElement BuyButton2;
	public void ClickOnBuyButton2() 
	{
		BuyButton2.click();
	}
	@FindBy(xpath="//div[text()='Order Created successfully']")private WebElement Is_Status_Successful;
	public String Get_Status() 
	{
		String data= Is_Status_Successful.getText();
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
