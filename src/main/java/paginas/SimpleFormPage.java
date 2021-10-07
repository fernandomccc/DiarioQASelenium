package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SimpleFormPage {

    private WebDriver navegador;

    public SimpleFormPage(WebDriver navegador){

        this.navegador = navegador;
    }

    public SimpleFormPage informarMensagem(String mensagem){
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Simple Form Demo")).click();

        navegador.findElement(By.id("user-message")).click();
        navegador.findElement(By.id("user-message")).sendKeys(mensagem);

        navegador.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
        String msg = navegador.findElement(By.cssSelector("span[id='display']")).getText();
        Assertions.assertEquals("Eu vou aprender de todo jeito!", msg);


        return this;

    }
    public SimpleFormPage somaInteiros(String a, String b){
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Simple Form Demo")).click();

        navegador.findElement(By.id("sum1")).click();
        navegador.findElement(By.id("sum1")).sendKeys(a);

        navegador.findElement(By.id("sum2")).click();
        navegador.findElement(By.id("sum2")).sendKeys(b);

        navegador.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
        String soma = navegador.findElement(By.cssSelector("span[id='displayvalue']")).getText();
        Assertions.assertEquals("100",soma);


        return this;
    }

}
