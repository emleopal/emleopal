# CALIDAD

Estos tests nos permiten testear la página de la Escuela Politecnica Superior, situada en la Universidad Pablo de Olavide. La aplicación realizara tests funcionales, de estrés y de regresión para obtener la actuación de la página contra ellos.

## Configuración y uso

### Verificar Java en tu equipo

Puede comprobar a traves de la consola su versión de java ejecutando:
<code>java -version</code>

Si no tienes instalado Java en tu equipo, puedes descargar JDK (Java Software Development Kit) desde: 
https://www.oracle.com/java/technologies/javase-downloads.html

### Declarar Java como variable de entorno

Necesita setear la variable **JAVA_HOME** hacia el directorio donde tiene Java instalado, para ello puede seguir el siguiente tutorial:
https://www.abrirllave.com/java/configurar-la-variable-de-entorno-java-home.php#:~:text=Hacer%20clic%20en%20el%20bot%C3%B3n,%22%20(variable%20del%20sistema).

### Descargar e instalar Maven

Descarga la última versión de Maven:
https://maven.apache.org/download.cgi

Descomprimelo en el directorio en el que desea instalar maven.  Una vez descomprimido, añade las variables de entorno para Maven. Puede seguir la siguiente guía:
https://www.tutorialspoint.com/maven/maven_environment_setup.htm

Para verificar la instalación, puede ejecutar el siguiente comando en pantalla: <code>mvn --version</code>

### Importar el proyecto maven

<ol>
  <li>Abre eclipse</li>
  <li>Selecciona File->Import</li>
  <li>Click en Maven, Existing Maven Project</li>
  <li>Selecciona el proyecto y pulsa finalizar</li>
</ol>

 ### Incluir GeckoDriver en Eclipse
 
 <ol>
  <li>Descarga geckdriver del repositorio de git: https://github.com/mozilla/geckodriver/releases</li>
  <li>En el proyecto, dirijete al directorio drivers creado y copia el .exe descargado</li>
</ol>
 
 ### Configurar TestNg 
 
 <ol>
  <li>En eclipse, dirigete a help->eclipse marketplace</li>
  <li>En la ventana emergente, busca por: TestNg</li>
  <li>Selecciona TestNg for eclipse, le dependencia será instalada en tu entorno</li>
  <li>Comprueba que la versión instalada coincide con la versión que se detalla en el archivo pom.xml. En caso contrario, modifiquela para que coincida</li>
</ol>


## Métodos
class BasePage
<table>
<tr>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripción</th>
<tr>
<tr>
<td>isShownProperly</td>
<td>boolean</td>
<td>Comprueba si se muestra correctamente</td>
<tr>

<tr>
<td>findElement</td>
<td>WebElement</td>
<td>Obtiene el objeto web driver deseado de la página</td>
<tr>
<tr>
<td>existsElement</td>
<td>boolean</td>
<td>Comprueba si el elemento introducido existe</td>
<tr>
<tr>
<td>isDisplayed</td>
<td>boolean</td>
<td>Busca si el elemento está visible en la página u oculto</td>
<tr>


</table>

## Ejemplo

<code>

    @Override
    public boolean isShownProperly() {

        boolean shown = false;
        shown = this.isDisplayed(By.xpath("//header/.."))
                && this.isDisplayed(By.xpath("//div[@class= 'branding']//img[@class= ' preload-me']"))
                && this.isDisplayed(By.xpath("//div[@class= 'mini-widgets']//a[@class= 'facebook']"))
                && this.isDisplayed(By.xpath("//div[@class= 'mini-widgets']//a[@class= 'twitter']"))
                && this.isDisplayed(By.xpath("//div[@class= 'mini-widgets']//a[@class= 'instagram']"))
                && this.isDisplayed(By.xpath("//div[@class= 'branding']//span[text()= 'TOUR VIRTUAL']/.."))
                && this.isDisplayed(By.xpath("//*[@id= 'primary-menu']"));
        return shown;
    }
    
    <!--xpath requires a valid path to an element-->

</code>


