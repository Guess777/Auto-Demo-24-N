package Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.HomePOM;
import Utility.BaseClass;
import Utility.Library;

public class BrokenLinkTest extends BaseClass{

	@Test
	public void brokenLink() throws MalformedURLException, IOException{
		
		HomePOM home=PageFactory.initElements(driver, HomePOM.class);
		
		Library.BrokenLink(home.getSocial());
	}
}
