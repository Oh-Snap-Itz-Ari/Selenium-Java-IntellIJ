package IngresoNavegadoresMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumMavenEdgeTest {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.edge.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();

    }
}

