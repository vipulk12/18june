package com.qa.testLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;



public class TestCase1_buy extends TestBase{
	
	@Test
	public void BuyShare1() throws InterruptedException 
	{
		logger.info("dashboard");
		dash.EnterCompanyName("WIPRO");
		dash.ClickOnSelected_Company1();
		logger.info("company selected");
		Thread.sleep(3000);
		buy.ClickOnBuyButton1();
		buy.Enter_QuntityOfShare("5");
		buy.ClickOnBuyButton2();
		logger.info("Buy share 1 complite");
		System.out.println(buy.Get_Status());
		
		Assert.assertEquals(buy.Get_Status(), "Order Created successfully");
	}
	@Test
	public void BuyShare2() throws InterruptedException 
	{
		dash.EnterCompanyName("Axis");
		dash.ClickOnSelected_Company2();
		
		Thread.sleep(3000);
		buy.ClickOnBuyButton1();
		buy.Enter_QuntityOfShare("5");
		buy.ClickOnBuyButton2();
		System.out.println(buy.Get_Status());
		
		Assert.assertEquals(buy.Get_Status(), "Order Created successfully");
	}
	
	
	
	
	
	
	
	
	
	
	

}
