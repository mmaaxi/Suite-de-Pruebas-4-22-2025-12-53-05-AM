package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc10Page {
    private WebDriver driver;
    private By integrationCompleteMessage = By.id("integrationSuccess");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
        driver.get("http://example.com/integration");
    }

    public void completeIntegration() {
        // Add steps to fill out integration process
        // For the sake of this example, assume it's a simple button click
        driver.findElement(By.id("completeIntegrationButton")).click();
    }

    public boolean isIntegrationSuccessful() {
        // Check if the integration was successful by verifying the presence of a success message
        return driver.findElement(integrationCompleteMessage).isDisplayed();
    }
}