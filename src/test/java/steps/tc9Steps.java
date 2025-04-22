package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc9Page;

public class tc9Steps {
    tc9Page page = new tc9Page();

    @Given("the system is ready for an update")
    public void theSystemIsReadyForAnUpdate() {
        page.navigateToUpdateSection();
        Assert.assertTrue(page.isReadyForUpdate());
    }

    @When("the update process is initiated")
    public void theUpdateProcessIsInitiated() {
        page.initiateUpdate();
    }

    @Then("the system should be updated correctly")
    public void theSystemShouldBeUpdatedCorrectly() {
        Assert.assertTrue(page.isUpdateSuccessful());
    }
}