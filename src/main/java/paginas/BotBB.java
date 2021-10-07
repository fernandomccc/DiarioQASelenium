package paginas;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BotBB {

    public static void main(String[] args) throws InterruptedException {

        String senha1 = "sin03070";
        String senha2 = "25085815";
        String chavej = "J0559246";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\DiarioQASelenium\\src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //maximizando a tela
        navegador.manage().window().maximize();

        //definindo tempo de espera implicita
        navegador.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //navegando ate a pagina de testes
        navegador.get("https://autoatendimento.bb.com.br/apf-apj-acesso/?tipoCliente=empresa&pk_vid=0a8b26c983eb30261631127830e168aa");


        navegador.findElement(By.xpath("//button[contains(text(),'Chave J')]")).click();
        navegador.findElement(By.id("identificacaoUsuario")).click();
        navegador.findElement(By.id("identificacaoUsuario")).sendKeys(chavej);
        navegador.findElement(By.id("botaoEnviar")).click();

        Thread.sleep(2500);

        navegador.findElement(By.id("senhaUsuario")).click();
        navegador.findElement(By.id("senhaUsuario")).sendKeys(senha1);
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(9000);
        navegador.findElement(By.cssSelector("input[type='password']")).click();
        navegador.findElement(By.cssSelector("input[type='password']")).sendKeys(senha2);
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        //navegador.findElement(By.cssSelector())

    }


}
