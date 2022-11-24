package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.HomePOM;
import Utility.BaseClass;
import Utility.Library;

public class HomeTest extends BaseClass{

	@Test
	public void homePage() {
		
		HomePOM home=PageFactory.initElements(driver, HomePOM.class);
		
		Library.Click(home.getGo());
		
	}
	
}
