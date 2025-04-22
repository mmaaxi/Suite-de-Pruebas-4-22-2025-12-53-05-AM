package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc9Page {
    private WebDriver driver;

    // Constructor
    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to the update section of the system
    public void navigateToUpdateSection() {
        driver.get("http://example.com/update");
    }

    // Check if the system is ready for an update
    public boolean isReadyForUpdate() {
        WebElement statusElement = driver.findElement(By.id("updateStatus"));
        return statusElement.getText().equals("Ready for update");
    }

    // Initiate the update process
    public void initiateUpdate() {
        WebElement updateButton = driver.findElement(By.id("initiateUpdate"));
        updateButton.click();
    }

    // Verify if the update was successful
    public boolean isUpdateSuccessful() {
        WebElement resultElement = driver.findElement(By.id("updateResult"));
        return resultElement.getText().equals("Update Successful");
    }
}