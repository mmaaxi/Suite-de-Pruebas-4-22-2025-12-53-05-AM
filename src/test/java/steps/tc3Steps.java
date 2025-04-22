package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc3Page;

public class tc3Steps {
    WebDriver driver;
    tc3Page page;

    @Given("I have initialized the Selenium WebDriver")
    public void i_have_initialized_the_selenium_webdriver() {
        driver = new ChromeDriver();
        page = new tc3Page(driver);
    }

    @When("I perform actions to simulate scenario A")
    public void i_perform_actions_to_simulate_scenario_a() {
        page.simulateScenarioA();
    }

    @Then("I confirm behavior A")
    public void i_confirm_behavior_a() {
        page.verifyBehaviorA();
    }
}