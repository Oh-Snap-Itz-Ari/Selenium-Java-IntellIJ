package Listeners;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SeleniumMavenChromeListeners extends  WebDriverListener{

    @Test
    public void TestExecute() throws InterruptedException, IOException, AWTException, InvalidFormatException {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        EventFiringWebDriver EFWDriver = new EventFiringWebDriver(driver); // Recibe el driver para que sea utilizado con los Listener
        WebDriverListener WDLTest = new WebDriverListener();

        EFWDriver.register(WDLTest); // Se cambia el driver por EFWDriver para que lea la información el Listener

        EFWDriver.manage().window().maximize();
        EFWDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        EFWDriver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);

        EFWDriver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);

        EFWDriver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
        Thread.sleep(5000);

        EFWDriver.findElement(By.xpath("//span[contains(.,'Performance')]")).click();
        Thread.sleep(3000);

        EFWDriver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]")).sendKeys("Alex Fabián");
        Thread.sleep(2000);

        EFWDriver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][contains(.,'-- Select --')])[1]")).sendKeys("a"+ Keys.ENTER);
        Thread.sleep(2000);

        EFWDriver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][contains(.,'--- Select ---')])[1]")).sendKeys("a"+ Keys.ENTER); // Error para activar la excepción de no encontrar el elemento
        Thread.sleep(2000);

        driver.quit();

    }
}
