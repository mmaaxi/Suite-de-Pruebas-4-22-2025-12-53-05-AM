package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc5Page;
import static org.junit.Assert.assertTrue;

public class tc5Steps {

    tc5Page page = new tc5Page();

    @Given("^el usuario está en la página de inicio de sesión$")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        page.navigateToLoginPage();
    }

    @When("^el usuario intenta acceder a una sección segura$")
    public void elUsuarioIntentaAccederAUnaSeccionSegura() {
        page.attemptAccessToSecureSection();
    }

    @Then("^el sistema verifica el rol del usuario$")
    public void elSistemaVerificaElRolDelUsuario() {
        assertTrue(page.isUserAccessChecked());
    }
    
    @Then("^el acceso es denegado o permitido según el rol del usuario$")
    public void elAccesoEsDenegadoOPermitidoSegunElRolDelUsuario() {
        assertTrue(page.isAccessBasedOnRole());
    }
}