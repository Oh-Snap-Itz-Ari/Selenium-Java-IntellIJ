package FuncionalidadesChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMavenChromeLinkTest {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver; // Se genera la instancia del driver

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe"); // Se establece la ruta en la que se encuentra el driver
        driver = new ChromeDriver(); // Se crea un nuevo driver

        driver.manage().window().maximize(); // Permite maximizar la ventana del navegador
        driver.get("https://stackoverflow.com/");
        driver.findElement(By.linkText("About")).click(); // Busca el elemento por el texto que contiene un <a> de HTML

        Thread.sleep(5000);

        driver.quit();

    }
}
