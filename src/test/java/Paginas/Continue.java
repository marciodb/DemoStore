package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Continue {

    private WebDriver navegador;

    public Continue(WebDriver navegador) {

        this.navegador = navegador;
    }

    public FormaPagamento ClicarContinue() {






            return new FormaPagamento(navegador);
    }


}
