package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void setUp() {
		config=new ConfigDataProvider();
		excel=new ExcelDataProvider();
		
	}
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void startUp(String bn) {
		if(bn.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("start-maximized");
			driver=new ChromeDriver(opt);
					
		}
		driver.get("https://demo.automationtesting.in/");
	}
}
