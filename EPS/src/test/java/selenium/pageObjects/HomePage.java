package selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BrowseablePage {

	private HeaderPage header;
	private FooterPage footer;
	private Actions action;

	public HomePage(WebDriver driver) {
		super(driver);
		this.header = new HeaderPage(driver);
		this.footer = new FooterPage(driver);
		this.action = new Actions(driver);
		this.map.put("contacta", "//h2[contains(.,'Por qu')]/../..//following-sibling::a");
		this.map.put("desplegableEstudiantes",
				"//*[@id='primary-menu']//span[text()='Estudiantes']/../../..//*[@class='dt-mega-menu-wrap']");
	}

	@Override
	public boolean isShownProperly() {
		boolean shown = false;
		shown = this.isDisplayed(By.xpath(this.map.get("contacta"))) && this.header.isShownProperly()
				&& this.footer.isShownProperly();
		return shown;
	}

	public void goToYourPage() {
		this.driver.get("https://www.upo.es/escuela-politecnica-superior/");
	}

	public void clickOnHomeElement(String elemento) {
		this.clickOnElement(elemento);
	}

	public void clickOnHeaderElement(String elemento) {
		if (elemento == "horariosAulas" || elemento == "examenes") {

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			action.moveToElement(driver.findElement(By.xpath(this.header.map.get("desplegableEstudiantes")))).perform();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
			}
			this.header.clickOnElement(elemento);
		} else {
			this.header.clickOnElement(elemento);
		}
	}

	public void clickOnFooterElement(String elemento) {
		this.footer.clickOnElement(elemento);
	}

	public void wrongForm() {
		WebElement inputName = driver.findElement(By.className("tnp-name"));
		WebElement inputEmail = driver.findElement(By.className("tnp-email"));
		WebElement button = driver.findElement(By.className("tnp-button"));

		inputName.sendKeys("Name");
		inputEmail.sendKeys("wrongEmail@wrongEmail");
		button.click();
	}

	public void rightForm() {
		WebElement inputName = driver.findElement(By.className("tnp-name"));
		WebElement inputEmail = driver.findElement(By.className("tnp-email"));
		WebElement button = driver.findElement(By.className("tnp-button"));

		inputName.sendKeys("Name");
		inputEmail.sendKeys("rightEmail@rightEmail.com");
		button.click();
	}
}
