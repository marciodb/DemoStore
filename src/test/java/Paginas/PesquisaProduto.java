package Paginas;

import DemoStore.StartNaveg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PesquisaProduto {

    private WebDriver navegador;

        public PesquisaProduto(WebDriver navegador) {

            this.navegador = navegador;
    }

    public EscolhaProduto PesquisaFeita() {

        navegador.findElement(By.id("search_input")).sendKeys("Calculators");
        navegador.findElement(By.id("search_input")).sendKeys(Keys.ENTER);


        return new EscolhaProduto(navegador);
    }
}
