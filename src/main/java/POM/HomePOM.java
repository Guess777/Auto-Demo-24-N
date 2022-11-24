package POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePOM {

	@FindBy(id = "enterimg")
	private WebElement go;

	@FindBy(xpath = "//div[@class='col-md-6 col-xs-6 col-sm-6 social pull-right']/a")
	private List<WebElement> social;

	public List<WebElement> getSocial() {
		return social;
	}

	public WebElement getGo() {
		return go;
	}

}
