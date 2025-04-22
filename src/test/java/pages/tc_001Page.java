package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    private By uploadOptionButton = By.id("uploadOption");
    private By singleFileOption = By.id("singleFile");
    private By multipleFileOption = By.id("multipleFiles");
    private By singleUploadBox = By.id("singleUploadBox");
    private By multipleUploadBoxes = By.cssSelector(".multipleUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectUploadOption() {
        driver.findElement(uploadOptionButton).click();
    }

    public boolean areUploadModesDisplayed() {
        WebElement singleOption = driver.findElement(singleFileOption);
        WebElement multipleOption = driver.findElement(multipleFileOption);
        return singleOption.isDisplayed() && multipleOption.isDisplayed();
    }

    public void selectSingleFileUpload() {
        driver.findElement(singleFileOption).click();
    }

    public boolean isSingleUploadBoxEnabled() {
        return driver.findElement(singleUploadBox).isDisplayed();
    }

    public void selectSeparateFileUpload() {
        driver.findElement(multipleFileOption).click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 1;
    }
}