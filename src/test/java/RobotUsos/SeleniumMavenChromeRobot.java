package RobotUsos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SeleniumMavenChromeRobot {

    @Test
    public void TestExecute() throws InterruptedException, AWTException {

        Robot robot = new Robot();

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL); // Presiona las teclas
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL); // Deja de presionarlas y continua con los pasos
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);

        robot.keyPress(KeyEvent.VK_TAB); // Presiona tab para ir al siguiente cuadro de texto
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[contains(.,'Performance')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]")).sendKeys("Alex Fabián");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][contains(.,'-- Select --')])[1]")).sendKeys("a"+ Keys.ENTER);
        Thread.sleep(2000);

        driver.quit();

    }
}
