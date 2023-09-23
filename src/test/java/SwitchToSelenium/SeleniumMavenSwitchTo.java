package SwitchToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SeleniumMavenSwitchTo {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        Actions accion = new Actions(driver);

        // En este caso el elemento que se quiere trabajar se encuentra dentro de un iFrame, asi que para poder seleccionar lo que esta dentro es necesario hacer lo siguiente
        WebElement iframe = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe")); // Se selecciona el iFrame, en este caso a través del Xpath

        driver.switchTo().frame(iframe); // Se usa la función de SwitchTo para seleccionar el iFrame al que se quiere ingresar
        accion.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform(); // Ya seleccionado el Iframe se prosigue a hacer el Drag And Drop
        Thread.sleep(3000);

        driver.switchTo().defaultContent(); // Se sale del contenido del Iframe y permite seguir trabajando de forma normal con los otros elementos

        driver.findElement(By.xpath("//a[contains(.,'Demos')]")).click();
        Thread.sleep(2000);

        driver.close();

    }
}
