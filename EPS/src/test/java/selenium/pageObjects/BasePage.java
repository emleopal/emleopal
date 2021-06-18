package selenium.pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

	protected WebDriver driver;
	protected HashMap<String, String> map;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		map = new HashMap();
	}

	public abstract boolean isShownProperly();

	protected WebElement findElement(By by) {
		WebElement element = null;
		try {
			element = driver.findElement(by);
		} catch (Exception e) {
			System.out.println("Ha fallado el elemento " + by);
		}
		return element;
	}

	protected boolean existsElement(By by) {
		boolean exists = this.findElement(by) != null;
		return exists;
	}

	protected boolean isDisplayed(By by) {
		boolean displayed = this.existsElement(by) && this.findElement(by).isDisplayed();
		return displayed;
	}

	protected void clickOnElement(String elemento) {
		WebElement link = this.findElement(By.xpath(this.map.get(elemento)));
		link.click();
	}
}
