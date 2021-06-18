package selenium.tests;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import selenium.pageObjects.BrowseablePage;

public abstract class DefaultTest<K extends BrowseablePage> {

	protected WebDriver driver;
	protected K page;

	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		this.initializePage();
		this.page.goToYourPage();
		assertTrue(this.page.isShownProperly());
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	protected abstract void initializePage();

}
