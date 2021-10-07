import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalTime;

public class InstagramBot {

        public static void main(String[] args) throws InterruptedException {


                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\DiarioQASelenium\\src\\test\\resources\\driver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();
                driver.get("https://www.instagram.com");

                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name=\"username\"]")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("fernandomccc");

                driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
                Thread.sleep(500);
                driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Id3147986");
                Thread.sleep(500);
                driver.findElement(By.cssSelector("button[type='submit']")).click();
                Thread.sleep(4000);
                driver.findElement(By.cssSelector("button[class='sqdOP yWX7d    y3zKF     ']")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("button[class='aOOlW   HoLwm ']")).click();
                Thread.sleep(1000);
                driver.get("https://www.instagram.com/p/CUfSko0tY-Y/");


                int count = 0;
                int a = 1;
                while (a>0) {
                        String campo_comentario = driver.findElement(By.className("Ypffh")).getText();
                        if(campo_comentario.isEmpty()){
                                LocalTime ltNow = LocalTime.now();
                                LocalTime lt = LocalTime.of(11, 10, 01);
                                if(count%2==0) {                                        Thread.sleep(2000);
                                        driver.findElement(By.className("Ypffh")).click();
                                        driver.findElement(By.className("Ypffh")).sendKeys("QUEROOOOOO  @umtraderaprendiz  " + count);
                                        Thread.sleep(2000);
                                        driver.findElement(By.cssSelector("button[type='submit']")).click();
                                        count++;
                                        System.out.println("Comentário de numero: " + (count - 1) + "  as " + ltNow);
                                }else{
                                        Thread.sleep(2000);
                                        driver.findElement(By.className("Ypffh")).click();
                                        driver.findElement(By.className("Ypffh")).sendKeys("Eu queroooo MENGOOO @umtraderaprendiz   " + count);
                                        Thread.sleep(2000);
                                        driver.findElement(By.cssSelector("button[type='submit']")).click();
                                        count++;
                                        System.out.println("Comentário de numero: " + (count - 1) + "  as " + ltNow);

                                }
                        }else{
                                System.out.println("Campo preenchido com comentario anterior....ATUALIZANDO...");
                                System.out.println("Esperando 3 minutos para retomar...");
                                driver.navigate().refresh();
                                Thread.sleep(150000);
                        }

                        if(count%5==0){
                                Thread.sleep(2000);
                                System.out.println("Atualizando a página...");
                                driver.navigate().refresh();
                                System.out.println("Esperando 45 segundos para continuar...\n");
                                Thread.sleep(45000);

                        }else if(count%30 == 0){
                                System.out.println("Esperando 3 minutos para continuar...\n");
                                System.out.println("Atualizando a página...");
                                Thread.sleep(2000);
                                driver.navigate().refresh();
                                Thread.sleep(150000);
                        }else {
                                System.out.println("Carregando novo comentário...\n");
                                Thread.sleep(15000);

                        }
                }
        }


}
