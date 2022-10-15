package com.qa.utility;

import java.io.File;
import java.io.IOException; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class TakeScreenShot extends TestBase {

	public static void Takess(String filename ) 
	{
		String path ="C:\\Users\\Chetu\\eclipse-workspace\\DalalStreet123\\Screenshots\\";
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;		
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e)
		{
			System.out.println("File path is Wrong");
		}
		
		
	}
	
}
