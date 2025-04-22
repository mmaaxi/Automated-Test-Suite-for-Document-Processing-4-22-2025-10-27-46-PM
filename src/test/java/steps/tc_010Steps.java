package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @When("the system generates the 'Exit Slip'")
    public void generateExitSlip() {
        page.generateExitSlip();
    }

    @Then("the system should save the original documents in request history")
    public void verifyOriginalDocumentsSaved() {
        page.verifyOriginalDocumentsInHistory();
    }

    @Then("the system should save the extracted data in request history")
    public void verifyExtractedDataSaved() {
        page.verifyExtractedDataInHistory();
    }
}