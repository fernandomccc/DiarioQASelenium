package paginas;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RadioButtonsTestPage {
    private WebDriver navegador;

    public RadioButtonsTestPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public RadioButtonsTestPage testarRadioButtonSimplesMale() {
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Radio Buttons Demo")).click();
        navegador.findElement(By.xpath("//input[@value=\"Male\"][@name=\"optradio\"]")).click();
        navegador.findElement(By.id("buttoncheck")).click();
        String msg = navegador.findElement(By.cssSelector("p[class='radiobutton']")).getText();
        Assertions.assertEquals("Radio button 'Male' is checked",msg);

        return this;
    }
    public RadioButtonsTestPage testarRadioButtonSimplesFemale() {
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Radio Buttons Demo")).click();
        navegador.findElement(By.xpath("//input[@value=\"Female\"][@name=\"optradio\"]")).click();
        navegador.findElement(By.id("buttoncheck")).click();
        String msg = navegador.findElement(By.cssSelector("p[class='radiobutton']")).getText();
        Assertions.assertEquals("Radio button 'Female' is checked",msg);

        return this;
    }

    //Male + 0 to 5
    public RadioButtonsTestPage radioButtonMale(String gender,String age) {
        navegador.findElement(By.linkText("Input Forms")).click();
        navegador.findElement(By.linkText("Radio Buttons Demo")).click();

        navegador.findElement(By.xpath("//input[@value='"+gender+"'][@name='gender']")).click();
        navegador.findElement(By.xpath("//input[@value='"+age+"'][@name='ageGroup']")).click();
        navegador.findElement(By.xpath("//button[contains(text(),'Get value')]")).click();

        String msg = navegador.findElement(By.cssSelector("p[class='groupradiobutton']")).getText();
        Assertions.assertEquals("Sex : "+gender+"\n" + "Age group: "+age,msg);

        return this;
    }


}
