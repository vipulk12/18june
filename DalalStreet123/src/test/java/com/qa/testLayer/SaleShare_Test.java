package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.testBase.TestBase;

public class SaleShare_Test extends TestBase {

	
	@Test
	public void Sale_share1() throws InterruptedException 
	{
		dash.EnterCompanyName("WIPRO");
		dash.ClickOnSelected_Company1();
		
		Thread.sleep(3000);
		sale.ClickOnSaleButton1();
		sale.Enter_Quntity_Share("3");
		sale.ClickOnSaleButton2();
		System.out.println(sale.Get_Status());
		
		//Assert.assertEquals(sale.Get_Status(), "Order Created successfully");
		SoftAssert soft = new SoftAssert();
		//Assert.assertEquals(sale.Get_Status(), "Order Created successfully");
		soft.assertEquals(sale.Get_Status(), "Order Created successfully");
        soft.assertAll();
	}
	
	@Test
	public void Sale_share2() throws InterruptedException 
	{
		dash.EnterCompanyName("AXIS");
		dash.ClickOnSelected_Company2();
		
		Thread.sleep(3000);
		sale.ClickOnSaleButton1();
		sale.Enter_Quntity_Share("3");
		sale.ClickOnSaleButton2();
		System.out.println(sale.Get_Status());
		SoftAssert soft = new SoftAssert();
		//Assert.assertEquals(sale.Get_Status(), "Order Created successfully");
		soft.assertEquals(sale.Get_Status(), "Order Created successfully");
		soft.assertAll();
	}
	
	
	
	
	
	
	
	
}
