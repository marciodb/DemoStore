package DemoStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StartNaveg {

    public static WebDriver createChrome() {
        //Abre o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para uma página
        navegador.manage().window().maximize();
        navegador.get("https://demo.cs-cart.com/");

        return navegador;
    }
}
