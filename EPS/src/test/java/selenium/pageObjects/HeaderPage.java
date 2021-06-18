package selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {

	public HeaderPage(WebDriver driver) {
		super(driver);
		map.put("header", "//header/..");
		map.put("logoUpo", "//div[@class= 'branding']//img[@class= ' preload-me']");
		map.put("linkLogoUpo",
				"//div[@class= 'branding']//a[@href='https://www.upo.es/escuela-politecnica-superior/']");
		map.put("facebook", "//div[@class= 'mini-widgets']//a[@class= 'facebook']");
		map.put("twitter", "//div[@class= 'mini-widgets']//a[@class= 'twitter']");
		map.put("instagram", "//div[@class= 'mini-widgets']//a[@class= 'instagram']");
		map.put("tourVirtual", "//div[@class= 'branding']//span[text()= 'TOUR VIRTUAL']/..");
		map.put("navbar", "//*[@id= 'primary-menu']");
		map.put("horariosAulas",
				"//*[@id='primary-menu']//span[text()='Estudiantes']/../../..//a[@href='https://www.upo.es/escuela-politecnica-superior/horarios-y-aulas/']");
		map.put("examenes",
				"//*[@id='primary-menu']//span[text()='Estudiantes']/../../..//a[@href='https://www.upo.es/escuela-politecnica-superior/examenes/']");
		map.put("desplegableEstudiantes",
				"//[@id='primary-menu']//span[text()='Estudiantes']/../../..//[@class='dt-mega-menu-wrap']");
	}

	@Override
	public boolean isShownProperly() {

		boolean shown = false;
		shown = this.isDisplayed(By.xpath("//header/..")) && this.isDisplayed(By.xpath(this.map.get("logoUpo")))
				&& this.isDisplayed(By.xpath(this.map.get("facebook")))
				&& this.isDisplayed(By.xpath(this.map.get("twitter")))
				&& this.isDisplayed(By.xpath(this.map.get("instagram")))
				&& this.isDisplayed(By.xpath(this.map.get("tourVirtual")))
				&& this.isDisplayed(By.xpath(this.map.get("navbar")));
		return shown;
	}

}
