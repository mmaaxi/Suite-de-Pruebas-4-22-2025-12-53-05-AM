package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc2Page {
    WebDriver driver;

    By secondaryActionButton = By.id("secondaryActionButton");
    By actionResultIndicator = By.id("actionResultIndicator");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void doSecondaryAction() {
        driver.findElement(secondaryActionButton).click();
    }

    public boolean isActionValid() {
        return driver.findElement(actionResultIndicator).isDisplayed();
    }
}