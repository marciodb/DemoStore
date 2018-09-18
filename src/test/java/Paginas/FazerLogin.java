package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FazerLogin {

    private WebDriver navegador;

    public FazerLogin(WebDriver navegador) {

        this.navegador = navegador;
    }

    public Continue ClicarNoSignIn() {




        navegador.findElement(By.id("footer-general_17")).click();

        return new Continue(navegador);

    }

}
