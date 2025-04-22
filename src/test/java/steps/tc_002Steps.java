package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;

import pages.tc_002Page;
import static org.junit.Assert.*;

public class tc_002Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_002Page page;

    @Given("El usuario está en la página de subida de archivos")
    public void elUsuarioEstaEnLaPaginaDeSubidaDeArchivos() {
        page = new tc_002Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_SUBIDA");
    }

    @When("El usuario selecciona un archivo válido en formato PDF o DOCX dentro del límite de 50 MB")
    public void elUsuarioSeleccionaArchivoValido() {
        page.subirArchivo("RUTA_DE_ARCHIVO_VALIDO");
    }

    @Then("El archivo debería cargarse exitosamente")
    public void elArchivoDeberiaCargarseExitosamente() {
        assertTrue(page.esArchivoSubido());
    }

    @And("La vista previa debería mostrar el nombre, tamaño y tipo del archivo")
    public void laVistaPreviaDeberiaMostrarDetalles() {
        assertTrue(page.mostrarDetallesArchivo());
    }
}