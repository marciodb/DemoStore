package Paginas;

import DemoStore.StartNaveg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class Home {

    private WebDriver navegador;

    @Before

    public void setUp() {
        navegador = StartNaveg.createChrome();
    }

    @Test

    public void StartNaveg() {
        new PesquisaProduto(navegador)
                .PesquisaFeita()
                .ClicarNoProduto()
                .AdicionarCarrinho()
                .ClicarCheckout()
                .ClicarNoSignIn();






    }

        @After

        public void tearDown () {


           // navegador.quit();
        }


    }
