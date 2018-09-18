package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClicarNoMyCart {

    private WebDriver navegador;

    public ClicarNoMyCart(WebDriver navegador) {

        this.navegador = navegador;
    }

    public FazerLogin ClicarCheckout() {

        //navegador.findElement(By.xpath("sw_dropdown_8")).click();
        navegador.findElement(By.linkText("CHECKOUT")).click();

        return new FazerLogin(navegador);

    }

}
