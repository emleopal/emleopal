package selenium.pageObjects;

import org.openqa.selenium.WebDriver;

public abstract class BrowseablePage extends BasePage {

	public BrowseablePage(WebDriver driver) {
		super(driver);
	}

	public abstract void goToYourPage();

}
