package EvidenciaDocumentoChrome;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SeleniumMavenChromeDocumento {

    GeneracionDocumentoClass Evidencia = new GeneracionDocumentoClass();

    @Test
    public void TestExecute() throws InterruptedException, IOException, AWTException, InvalidFormatException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        Evidencia.InicializaArchivo();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        Evidencia.DescripcionPasoScript("1. Ingresa a la Página Web");

        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        Evidencia.DescripcionPasoScript("2. Escribe el Username");

        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        Evidencia.DescripcionPasoScript("3. Escribe el Password");

        driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
        Thread.sleep(2000);
        Evidencia.DescripcionPasoScript("5. Da click en el Botón de Login.");
        Thread.sleep(5000);

        Evidencia.DescripcionPasoScript("5. Ingresa al Home de la Página Web.");
        Evidencia.GeneraEvidencia("Caso De Prueba.docx");

        driver.quit();

    }
}
