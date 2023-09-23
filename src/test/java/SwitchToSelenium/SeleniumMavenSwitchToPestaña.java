package SwitchToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SeleniumMavenSwitchToPestaña {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        Thread.sleep(2000);

        driver.findElement(By.id("dynamicLink")).click(); // Se da click a un link que abre una nueva pestaña en el navegador
        Thread.sleep(3000);

        ArrayList<String> framesToTest = new ArrayList<String>(driver.getWindowHandles()); // Obtiene la información de las pestañas que se tienen abiertas

        driver.switchTo().window(framesToTest.get(1)); // Se selecciona la pestaña 2 (La que se abrió, el contador comienza desde cero)
        Thread.sleep(3000);

        // Scroll hasta encontrar el elemento

        WebElement El1 = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][contains(.,'Forms')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", El1); // Hace Scroll hasta que encuentra el El1
        Thread.sleep(3000);

        El1.click(); // Selecciona un elemento de la nueva pestaña y le da click
        Thread.sleep(3000);

        driver.close(); // Se cierra la pestaña con el driver.close() - Si se quieren cerrar varias pestañas se selecciona el Frame y se le da driver.close()

        driver.switchTo().window(framesToTest.get(0)); // Volvemos a la primera pestaña (https://demoqa.com/links)
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[@class='btn btn-light '][contains(.,'Text Box')]")).click();
        Thread.sleep(3000);

        driver.quit(); // Se finaliza la ejecución

    }
}

