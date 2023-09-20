package EvidenciasTakeScreenshotCapturasDePantalla;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SeleniumMavenChromeScreenshot {

    @Test
    public void TestExecute() throws InterruptedException, IOException, AWTException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        TakesScreenshotClass.Screenshot("01. Ingreso página Web", driver); // La diferencia es que permite tomar captura al navegador, no a la pantalla como tal

        driver.findElement(By.id("userName")).sendKeys("Mr. Blue Sky");
        TakesScreenshotClass.Screenshot("02. Diligenciar UserName", driver);
        driver.findElement(By.id("userEmail")).sendKeys("alexfabianmelo12@hotmail.com");
        TakesScreenshotClass.Screenshot("03. Diligenciar Email", driver);
        driver.findElement(By.id("currentAddress")).sendKeys("Calle 30 # 01 - 26");
        TakesScreenshotClass.Screenshot("04. Diligenciar Dirección", driver);

        WebElement El1 = driver.findElement(By.id("permanentAddress"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", El1);

        driver.findElement(By.id("permanentAddress")).sendKeys("Calle 30 # 01 - 26 Bogotá D.C.");
        TakesScreenshotClass.Screenshot("05. Diligenciar Dirección Completa", driver);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        TakesScreenshotClass.Screenshot("06. Formulario Diligenciado", driver);

        driver.quit();

        Thread.sleep(2000);
        ScreenshotClass.Screenshot("07. Evidencias Log");

    }
}
