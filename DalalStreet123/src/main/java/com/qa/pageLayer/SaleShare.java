package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SaleShare extends TestBase{

	
	public SaleShare() 
	{
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath="//a[contains(text(),'Sell')]")private WebElement sale_Button1;
	public void ClickOnSaleButton1() 
	{
		sale_Button1.click();;
	}
	
	@FindBy(xpath="//input[@id='quantity']")private WebElement Quntity_Share;
	public void Enter_Quntity_Share(String quntity ) 
	{
		Quntity_Share.sendKeys(quntity);
	}
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")private WebElement saleButton2;
	public void ClickOnSaleButton2() 
	{
		saleButton2.click();
	}
	@FindBy(xpath="//div[text()='Order Created successfully']")private WebElement Is_Status_Successful;
	public String Get_Status() 
	{
		String data= Is_Status_Successful.getText();
		return data;
	}
	
	
	
	
	
}
