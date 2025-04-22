package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class tc8Page {
    WebDriver driver;

    @FindBy(how = How.ID, using = "zEntryElement")
    private WebElement zEntryElement;

    @FindBy(how = How.ID, using = "messageElement")
    private WebElement messageElement;

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToZEntryPage() {
        driver.get("http://example.com/zentry");
    }

    public void simulateZEntry() {
        zEntryElement.click(); // Assuming click simulates the entry
    }

    public void verifyErrorOrConfirmationMessage() {
        String message = messageElement.getText();
        if (message.contains("Error") || message.contains("Confirmation")) {
            System.out.println("Correct message displayed: " + message);
        } else {
            System.out.println("Unexpected message: " + message);
        }
    }
}