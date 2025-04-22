package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc2Page;

public class tc2Steps {
    WebDriver driver;
    tc2Page page;

    @When("I perform a secondary action")
    public void performSecondaryAction() {
        page = new tc2Page(driver);
        page.doSecondaryAction();
    }

    @Then("I validate the result of the action")
    public void validateActionResult() {
        boolean result = page.isActionValid();
        Assert.assertTrue("The action result is not valid", result);
    }
}