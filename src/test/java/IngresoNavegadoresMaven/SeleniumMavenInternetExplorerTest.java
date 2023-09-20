package IngresoNavegadoresMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class SeleniumMavenInternetExplorerTest {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.ie.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }

}