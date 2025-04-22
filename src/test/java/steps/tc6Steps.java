package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc6Page;

public class tc6Steps {
    private WebDriver driver;
    private tc6Page page;

    @Before
    public void setUp() {
        // Código para inicializar el WebDriver
        // driver = new YourWebDriverImplementation();
        page = new tc6Page(driver);
    }

    @Given("que el usuario ha iniciado la aplicación")
    public void iniciarAplicacion() {
        page.iniciarAplicacion();
    }

    @When("el usuario ejecuta el comando X")
    public void ejecutarComandoX() {
        page.ejecutarComandoX();
    }

    @Then("la salida debe ser correcta para el comando")
    public void verificarSalidaCorrecta() {
        assertTrue(page.verificarSalidaCorrecta());
    }
}