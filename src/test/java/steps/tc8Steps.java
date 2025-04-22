package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc8Page;

public class tc8Steps {
    WebDriver driver;
    tc8Page page;

    public tc8Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc8Page.class);
    }

    @Given("I am on the Z entry page")
    public void i_am_on_the_z_entry_page() {
        page.navigateToZEntryPage();
    }

    @When("I simulate the Z entry")
    public void i_simulate_the_z_entry() {
        page.simulateZEntry();
    }

    @Then("I should see an error or confirmation message")
    public void i_should_see_an_error_or_confirmation_message() {
        page.verifyErrorOrConfirmationMessage();
    }
}