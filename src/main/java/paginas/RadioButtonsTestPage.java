package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RadioButtonsTestPage {
    private WebDriver navegador;

    public RadioButtonsTestPage(WebDriver navagador){
        this.navegador = navegador;
    }

    public RadioButtonsTestPage testarRadioButtonSimples() throws InterruptedException {
        Thread.sleep(2500);
        navegador.findElement(By.cssSelector("//input[@value=\"Male\"][@name=\"optradio\"]")).click();

        return this;
    }
}
