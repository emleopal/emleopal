package selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage extends BasePage {

	public FooterPage(WebDriver driver) {
		super(driver);
		map.put("footer", "//footer");
		map.put("direccion", "//footer//span[text()='Direcci�n:']/..");
		map.put("horario", "//footer//span[text()='Horario de Atenci�n al P�blico:']/..");
		map.put("telefono", "//footer//span[text()='Tel�fono:']/..");
		map.put("avisoLegal", "//footer//span[text()='Aviso legal']/..");
		map.put("privacidad", "//footer//span[text()='Privacidad']/..");
		map.put("accesibilidad", "//footer//span[text()='Accesibilidad']/..");
	}

	@Override
	public boolean isShownProperly() {

		boolean shown = false;
		shown = this.isDisplayed(By.xpath(this.map.get("footer")))
				&& this.isDisplayed(By.xpath(this.map.get("direccion")))
				&& this.isDisplayed(By.xpath(this.map.get("horario")))
				&& this.isDisplayed(By.xpath(this.map.get("telefono")))
				&& this.isDisplayed(By.xpath(this.map.get("avisoLegal")))
				&& this.isDisplayed(By.xpath(this.map.get("privacidad")))
				&& this.isDisplayed(By.xpath(this.map.get("accesibilidad")));

		return shown;
	}

}
