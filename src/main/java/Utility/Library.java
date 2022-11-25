package Utility;

import java.io.IOException;
import java.net.*;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

public class Library {

	public static ExtentTest test;
	
	public static void Click(WebElement ele)
	{
		ele.click();
	}
	
	public static void BrokenLink(List<WebElement> list) throws MalformedURLException, IOException
	{
		SoftAssert soft=new SoftAssert();
		int count =list.size();
		for(int i=0;i<count;i++)
		{
			String url=list.get(i).getAttribute("href");
			System.out.println(url);
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respo=conn.getResponseCode();
			System.out.println(respo);
			soft.assertTrue(respo<400, "Broken Link is"+url);
		}
		soft.assertAll();
	}
}
