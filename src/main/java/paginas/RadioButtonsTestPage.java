package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RadioButtonsTestPage {
    private WebDriver navegador;

    public RadioButtonsTestPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public RadioButtonsTestPage testarRadioButtonSimples() {
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Radio Buttons Demo")).click();
        navegador.findElement(By.xpath("//input[@value=\"Male\"][@name=\"optradio\"]")).click();

        return this;
    }
}
