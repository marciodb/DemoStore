package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EscolhaProduto {

    private WebDriver navegador;

    public EscolhaProduto(WebDriver navegador) {

        this.navegador = navegador;
    }

    public AdicionarCarrinho ClicarNoProduto() {

        navegador.findElement(By.id("det_img_126")).click();

        return new AdicionarCarrinho(navegador);
    }

}
