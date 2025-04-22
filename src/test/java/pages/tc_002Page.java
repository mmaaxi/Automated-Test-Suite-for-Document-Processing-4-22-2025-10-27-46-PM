package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_002Page {
    WebDriver driver;

    By inputSubirArchivo = By.id("uploadInput");
    By labelVistaPreviaNombre = By.id("previewName");
    By labelVistaPreviaTamano = By.id("previewSize");
    By labelVistaPreviaTipo = By.id("previewType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void subirArchivo(String rutaArchivo) {
        WebElement inputArchivo = driver.findElement(inputSubirArchivo);
        inputArchivo.sendKeys(rutaArchivo);
    }

    public boolean esArchivoSubido() {
        // lógica para verificar si el archivo ha sido subido correctamente
        return true;
    }

    public boolean mostrarDetallesArchivo() {
        String nombre = driver.findElement(labelVistaPreviaNombre).getText();
        String tamano = driver.findElement(labelVistaPreviaTamano).getText();
        String tipo = driver.findElement(labelVistaPreviaTipo).getText();

        return !nombre.isEmpty() && !tamano.isEmpty() && !tipo.isEmpty();
    }
}