package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.qa.pageLayer.BuyShare;
import com.qa.pageLayer.Dash_Board;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.SaleShare;

import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public Dash_Board dash;
	public BuyShare buy;
	public ExchangePage exe;
	public SaleShare sale;
	public Logger logger; 

@BeforeClass
public void Start() 
{
Logger logger = Logger.getLogger("Dalalstreet");
PropertyConfigurator.configure("Log4j.properties");
logger.info("Framework execution started");
}
	
@AfterClass
public void stop() 
{
logger.info("Framework execution Stop");	
}

@BeforeMethod
@Parameters("BrowserName")
	public void SEtup() throws InterruptedException 
	{
		String br= "chrome";
		if(br.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please provid proper browser name from chrome firefox and edge");
		}

		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		LoginPage login = new LoginPage();
		buy = new BuyShare();
		dash= new Dash_Board();
		exe = new ExchangePage();
		sale= new SaleShare();
		login.EnterMob_Num("chetan123@gmail.com");
		login.EnterPassword("123456789");
		login.ClickOn_Login_btn();
		Thread.sleep(3000);	
		
	}











}
