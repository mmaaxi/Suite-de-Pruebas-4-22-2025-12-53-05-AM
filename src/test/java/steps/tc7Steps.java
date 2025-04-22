package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc7Page;

public class tc7Steps {
    WebDriver driver;
    tc7Page page;

    @Given("el usuario accede a la aplicación")
    public void el_usuario_accede_a_la_aplicacion() {
        driver = new ChromeDriver();
        page = new tc7Page(driver);
        driver.get("url_de_la_aplicacion");
    }

    @When("el usuario realiza el flujo de trabajo Y")
    public void el_usuario_realiza_el_flujo_de_trabajo_y() {
        page.realizaFlujoDeTrabajoY();
    }

    @Then("se valida correctamente el flujo de trabajo Y")
    public void se_valida_correctamente_el_flujo_de_trabajo_y() {
        Assert.assertTrue(page.validarFlujoDeTrabajoY());
        driver.quit();
    }
}