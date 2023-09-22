package ValidacionesAssertsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumMavenChromeAsserts {

    // Para esto se requiere de la libreria de TestNG (Maven Repository)

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe"); // Se establece la ruta en la que se encuentra el driver
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Espera 15 segundos para encontrar el elemento del Try, y al no encontrarlo sigue con el Catch (Implicito es para todos los elementos)

        driver.findElement(By.id("firstName")).sendKeys("Alex Fabián");
        driver.findElement(By.id("lastName")).sendKeys("Melo Gómez");
        driver.findElement(By.id("userEmail")).sendKeys("alexfabianmelo12@hotmail.com");

        driver.findElement(By.xpath("//label[@for='gender-radio-1'][contains(.,'Male')]")).click(); // Da click al XPath seleccionado, se consigue con extensiones o directamente en copiar > copiar Xpath ó Copiar > Copiar Xpath Completo (Inspeccionar)

        driver.findElement(By.id("userNumber")).sendKeys("3245447847");

        Thread.sleep(3000);

        // Scroll hasta encontrar el elemento

        WebElement El1 = null, El2;

        try {
            El1 = driver.findElement(By.xpath("//label[@class='form-label'][contains(.,'Picture')]"));
            El2 = driver.findElement(By.id("currentAddres")); // Se modifica el ID del elemento para que no lo encuentre y active el Catch
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("No se ha encontrado el El2.");
            El2 = driver.findElement(By.id("currentAddress"));
        }

        //Assert
        WebElement titulo1 = driver.findElement(By.xpath("//*[text()='Current Address']"));
        String str_titulo1 = titulo1.getText(); // Convierte a String el contenido de titulo_1 y obtiene el texto
        String valor_esperado = "Current Address";

        Assert.assertEquals(str_titulo1, valor_esperado); // Valor Obtenido del Xpath y valor esperado

        System.out.println("Los textos son iguales (Obtenido | Esperado) => (" + str_titulo1 + " | " + valor_esperado + ")");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", El1); // Hace Scroll hasta que encuentra el El1

        El2.sendKeys("Calle 30 # 05 - 15 San Antonio"); // Ingresa el contenido en la caja de texto del El2

        Thread.sleep(2000);

        driver.quit();

    }
}
