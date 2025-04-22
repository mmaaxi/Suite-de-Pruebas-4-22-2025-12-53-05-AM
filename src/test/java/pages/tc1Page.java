package pages;

import org.openqa.selenium.WebDriver;

public class tc1Page {

    WebDriver driver;

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ejecutarPasoInicial() {
        // Lógica para ejecutar el paso inicial
    }

    public boolean verificarResultadoEsperado() {
        // Implementar la verificación del resultado esperado
        return true;
    }
}