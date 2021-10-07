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
    @DisplayName("inputFieldTest")
    public void inputFieldTest(){
        new SimpleFormPage(navegador)
                .informarMensagem("Eu vou aprender de todo jeito!");
    }
    @Test
    @DisplayName("SomaInteirosTest")
    public  void somaInteirosTest(){
        new SimpleFormPage(navegador)
                .somaInteiros("81", "19");
    }
    @Test
    @DisplayName("RadioButtonsTestMale")
    public void marcarRadioButtonMale(){
        new RadioButtonsTestPage(navegador)
                .testarRadioButtonSimplesMale();
    }

    @Test
    @DisplayName("RadioButtonsTestFemale")
    public void marcarRadioButtonFemale(){
        new RadioButtonsTestPage(navegador)
                .testarRadioButtonSimplesFemale();
    }

    @Test
    @DisplayName("CheckBoxTestSimples")
        public void marcandoCheckBoxSimplesMale() {
        new CheckBoxTestPage(navegador)
                .marcandoCheckBoxSimples()
                .marcandoCheckBoxiesMultiplas();
    }

    @Test
    @DisplayName("CheckBoxTestMultiplas")
    public void marcandoCheckBoxiesMultiplas() {
        new CheckBoxTestPage(navegador)
                .marcandoCheckBoxiesMultiplas();
    }

    @Test
    @DisplayName("radioButtonMale0to5")
    public void radioButtonTest() {
        new RadioButtonsTestPage(navegador)
                .radioButtonMale("Male","0 - 5")
                .radioButtonMale("Male","5 - 15")
                .radioButtonMale("Male","15 - 50")
                .radioButtonMale("Female","0 - 5")
                .radioButtonMale("Female","5 - 15")
                .radioButtonMale("Female","15 - 50");
    }

    @AfterEach
    public void AfterEach(){
        navegador.quit();
    }
}

