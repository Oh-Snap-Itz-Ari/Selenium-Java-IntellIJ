package EvidenciasVideoRecording;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SeleniumMavenChromeVideoRecording {

    @Test
    public void TestExecute() throws InterruptedException, IOException, AWTException, ATUTestRecorderException {

        ATUTestRecorder video;

        // Para añadir lo anterior es necesario descargar ATUTestRecorder desde el siguiente enlace https://github.com/miteshsavani/Selenium
        // Una vez descargado se importa el JAR en Project Structure > Modules > IntellIJSeleniumJava > Dependencies > + > JARS or Directories > Apply > Ok

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        video = new ATUTestRecorder("D:\\Mr. Blue Sky\\Automatización\\IntelliJ\\IntellIJ Selenium Java\\src\\video\\", "VideoRecord", false);

        video.start();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.id("userName")).sendKeys("Mr. Blue Sky");
        driver.findElement(By.id("userEmail")).sendKeys("alexfabianmelo12@hotmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Calle 30 # 01 - 26");

        WebElement El1 = driver.findElement(By.id("permanentAddress"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", El1);

        driver.findElement(By.id("permanentAddress")).sendKeys("Calle 30 # 01 - 26 Bogotá D.C.");

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        driver.quit();

        video.stop();
        System.out.println("Video grabado de forma exitosa.");

    }
}
