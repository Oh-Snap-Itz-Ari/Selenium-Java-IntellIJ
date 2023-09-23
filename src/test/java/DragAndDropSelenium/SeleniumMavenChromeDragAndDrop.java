package DragAndDropSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SeleniumMavenChromeDragAndDrop {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe"); // Se establece la ruta en la que se encuentra el driver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        Actions accion = new Actions(driver);
        WebElement iframe = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));

        driver.switchTo().frame(iframe);
        accion.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform(); // Inicio , Final (Destino)

        Thread.sleep(3000);

        driver.close();

    }
}
