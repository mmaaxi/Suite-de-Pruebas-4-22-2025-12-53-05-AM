package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc10Page;

public class tc10Steps {
    private WebDriver driver;
    private tc10Page integrationPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        integrationPage = new tc10Page(driver);
    }

    @When("I complete the integration process")
    public void iCompleteTheIntegrationProcess() {
        integrationPage.completeIntegration();
    }

    @Then("the integration should be successful without any errors")
    public void theIntegrationShouldBeSuccessfulWithoutAnyErrors() {
        assertTrue(integrationPage.isIntegrationSuccessful());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}