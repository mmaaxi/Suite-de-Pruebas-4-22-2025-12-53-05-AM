package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc4Page;
import static org.junit.Assert.assertTrue;

public class tc4Steps {
    WebDriver driver;
    tc4Page page;

    public tc4Steps(WebDriver driver) {
        this.driver = driver;
        this.page = new tc4Page(driver);
    }

    @When("realizo la acción para simular el escenario B")
    public void realizoLaAccionParaSimularElEscenarioB() {
        page.performActionForScenarioB();
    }

    @Then("confirmo el comportamiento B")
    public void confirmoElComportamientoB() {
        assertTrue(page.verifyBehaviorB());
    }
}