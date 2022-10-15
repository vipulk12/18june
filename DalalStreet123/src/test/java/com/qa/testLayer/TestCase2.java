package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase2 extends TestBase{

	@Test
	public void Test2() throws InterruptedException 
	{
		Thread.sleep(3000);
		exe.ClickOnExchange();
		Thread.sleep(3000);
		exe.Selectcompany_name();
		
		Thread.sleep(3000);
		buy.ClickOnBuyButton1();
		buy.Enter_QuntityOfShare("5");
		buy.ClickOnBuyButton2();
		System.out.println(buy.Get_Status());
		
		Assert.assertEquals(buy.Get_Status(), "Order Created successfully");
	}
	
	
	
	
	
	
	
	
}
