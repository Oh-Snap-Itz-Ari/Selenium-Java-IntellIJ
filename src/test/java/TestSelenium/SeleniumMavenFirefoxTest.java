package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMavenFirefoxTest {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver;

        System.setProperty("webdriver.firefox.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Thread.sleep(3000);

        driver.quit();

    }

}
