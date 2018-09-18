package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarCarrinho {

    private WebDriver navegador;

    public AdicionarCarrinho(WebDriver navegador) {

        this.navegador = navegador;
    }

    public ClicarNoMyCart AdicionarCarrinho() {

        navegador.findElement(By.id("button_cart_126")).click();

        return new ClicarNoMyCart(navegador);

    }

}
