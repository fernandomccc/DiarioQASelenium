package paginas;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@DisplayName("Testing SeleniumEasy page.")

public class SeleniumEasyTest {
    private WebDriver navegador;

    @BeforeEach
    public void BeforeEach() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\DiarioQASelenium\\src\\test\\resources\\driver\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        //maximizando a tela
        this.navegador.manage().window().maximize();

        //definindo tempo de espera implicita
        this.navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navegando ate a pagina de testes
        this.navegador.get("https://www.seleniumeasy.com/test/");

        //Fechando o banner de abertura
        this.navegador.findElement(By.linkText("No, thanks!")).click();
    }

    @Test
    @DisplayName("")
    public void inputFieldTest(){
        new SimpleFormPage(navegador)
                .informarMensagem("Eu vou aprender de todo jeito!");
    }

    @Test
    @DisplayName("SEila,depois eu vejo")
    public  void somaInteirosTest(){
        new SimpleFormPage(navegador)
                .somaInteiros("81", "19");

    }
    @Test
    @DisplayName("RadioButtons Test")
    public void marcarRadioButton(){
        new RadioButtonsTestPage(navegador)
                .testarRadioButtonSimples();

    }

    //.testarPaginaRadioButtonsTestPage()
                //.testarRadioButtonSimples();



                /*.testarPaginaCheckBox()
                .marcandoCheckBoxSimples()
                .marcandoCheckBoxiesMultiplas();*/

    @AfterEach
    public void AfterEach(){
        //navegador.quit();
    }
}

