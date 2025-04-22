package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc1Page;
import utils.WebDriverManager;

public class tc1Steps {

    WebDriver driver;
    tc1Page page;

    public tc1Steps() {
        driver = WebDriverManager.getDriver();
        page = PageFactory.initElements(driver, tc1Page.class);
    }

    @Given("que estoy en la página inicial")
    public void queEstoyEnLaPaginaInicial() {
        driver.get("http://tu-pagina-inicial.com");
    }

    @When("ejecuto el paso inicial")
    public void ejecutoElPasoInicial() {
        page.ejecutarPasoInicial();
    }

    @Then("debería ver el resultado esperado del paso 1")
    public void deberiaVerElResultadoEsperadoDelPaso1() {
        Assert.assertTrue(page.verificarResultadoEsperado());
    }
}