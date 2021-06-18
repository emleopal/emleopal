package selenium.tests;

import org.testng.annotations.Test;
import selenium.pageObjects.HomePage;

public class HomeTest extends DefaultTest<HomePage> {

	@Override
	protected void initializePage() {
		this.page = new HomePage(driver);
	}

	/**
	 * TC_01, TC_02, TC_05
	 * 
	 * # Dado que el Header y el Footer forman parte de la pagina de inicio,
	 * reunimos los tres test cases en el mismo test
	 * 
	 * # Ir a la pagina de inicio de la EPS # Comprobar que se muestra el header
	 * (logo de la UPO, redes sociales, tour virtual y navbar) # Comprobar que se
	 * muestra el footer (Direccion, horario, telefono, aviso legal, privacidad y
	 * accesibilidad) # Comprobar que se muestra el boton de contactar "Contacta" en
	 * el apartado "Grado en ingenieria informatica en sistemas de la informacion"
	 */
	@Test
	public void testShowHome() {
		this.page.isShownProperly();
	}

	/**
	 * TC_06
	 * 
	 * # Comprobar que funciona el boton de Contacta
	 */
	@Test
	public void testClickOnContacta() {
		this.page.clickOnHomeElement("contacta");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar que funciona la imagen que nos lleva a la página principal
	 */
	@Test
	public void testClickOnLogoUpo() {
		this.page.clickOnHeaderElement("linkLogoUpo");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar que funcionan los botones a las redes sociales de la EPS
	 * (facebook)
	 */
	@Test
	public void testClickOnFacebook() {
		this.page.clickOnHeaderElement("facebook");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar que funcionan los botones a las redes sociales de la EPS
	 * (twitter)
	 */
	@Test
	public void testClickOnTwitter() {
		this.page.clickOnHeaderElement("twitter");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar que funcionan los botones a las redes sociales de la EPS
	 * (instagram)
	 */
	@Test
	public void testClickOnInstagram() {
		this.page.clickOnHeaderElement("instagram");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar que funcionan el boton de Tour virtual.
	 */
	@Test
	public void testClickOnTourvirtual() {
		this.page.clickOnHeaderElement("tourVirtual");
	}

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar el funcionamiento de la barra de navegación (Estudiantes ->
	 * Horarios y Aulas)
	 */
	/*
	 * @Test public void testClickOnHorariosAulas() {
	 * this.page.clickOnHeaderElement("horariosAulas"); }
	 */

	/**
	 * TC_07
	 * 
	 * # El siguiente test forma parte del TC_07
	 * 
	 * # Comprobar el funcionamiento de la barra de navegación (Estudiantes ->
	 * Examenes)
	 */

	/*
	 * @Test public void testClickOnExamenes() {
	 * this.page.clickOnHeaderElement("examenes"); }
	 */

	/**
	 * TC_08
	 * 
	 * # El siguiente test forma parte del TC_08
	 * 
	 * # Comprobar que funcionan los enlaces de la barra horizontal del final de la
	 * página (Aviso Legal)
	 */
	@Test
	public void testClickOnAvisoLegal() {
		this.page.clickOnFooterElement("avisoLegal");
	}

	/**
	 * TC_08
	 * 
	 * # El siguiente test forma parte del TC_08
	 * 
	 * # Comprobar que funcionan los enlaces de la barra horizontal del final de la
	 * página (Privacidad)
	 */
	@Test
	public void testClickOnPrivacidad() {
		this.page.clickOnFooterElement("privacidad");
	}

	/**
	 * TC_08
	 * 
	 * # El siguiente test forma parte del TC_08
	 * 
	 * # Comprobar que funcionan los enlaces de la barra horizontal del final de la
	 * página (Accesibilidad)
	 */
	@Test
	public void testClickOnAccesibilidad() {
		this.page.clickOnFooterElement("accesibilidad");
	}

	@Test
	public void testWrongForm() {
		this.page.wrongForm();
	}

	@Test
	public void testRightForm() {
		this.page.rightForm();
	}

}
