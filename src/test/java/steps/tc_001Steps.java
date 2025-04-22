package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page uploadPage;

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        // Initialize WebDriver and navigate to upload page
        driver = new WebDriverSetup().getDriver();
        uploadPage = new tc_001Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("the user selects the option 'cargar documentos'")
    public void the_user_selects_the_option_cargar_documentos() {
        uploadPage.selectUploadOption();
    }

    @Then("the system shows options for 'carga única' and 'carga múltiple'")
    public void the_system_shows_options_for_carga_unica_and_carga_multiple() {
        Assert.assertTrue(uploadPage.areUploadModesDisplayed());
    }

    @When("the user chooses 'carga en un solo archivo'")
    public void the_user_chooses_carga_en_un_solo_archivo() {
        uploadPage.selectSingleFileUpload();
    }

    @Then("a single file upload box is enabled")
    public void a_single_file_upload_box_is_enabled() {
        Assert.assertTrue(uploadPage.isSingleUploadBoxEnabled());
    }

    @When("the user chooses 'cargar documentos por separado'")
    public void the_user_chooses_cargar_documentos_por_separado() {
        uploadPage.selectSeparateFileUpload();
    }

    @Then("multiple file upload boxes are displayed for each required document")
    public void multiple_file_upload_boxes_are_displayed_for_each_required_document() {
        Assert.assertTrue(uploadPage.areMultipleUploadBoxesDisplayed());
    }
}