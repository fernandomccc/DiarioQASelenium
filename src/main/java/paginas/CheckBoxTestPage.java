package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxTestPage {

    private WebDriver navegador;

    public CheckBoxTestPage(WebDriver navegador){
        this.navegador = navegador;

    }

    public CheckBoxTestPage  marcandoCheckBoxSimples() {

        navegador.findElement(By.id("isAgeSelected")).click();
        String msg = navegador.findElement(By.cssSelector("div[id='txtAge']")).getText();
        Assertions.assertEquals("Success - Check box is checked",msg);

        return this;
    }

    public CheckBoxTestPage marcandoCheckBoxiesMultiplas(){
        navegador.findElement(By.id("check1")).click();

        return this;
    }

}
