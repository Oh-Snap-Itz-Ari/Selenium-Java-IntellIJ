package FuncionalidadesChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumMavenChromeSelect {

    @Test
    public void TestExecute() throws InterruptedException {

        WebDriver driver; // Se genera la instancia del driver

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe"); // Se establece la ruta en la que se encuentra el driver
        driver = new ChromeDriver(); // Se crea un nuevo driver

        driver.manage().window().maximize(); // Permite maximizar la ventana del navegador
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Thread.sleep(2000);

        Select ComboDropdown = new Select(driver.findElement(By.id("dropdown")));

        ComboDropdown.selectByVisibleText("Option 1"); // Seleccionar por texto visible (Exactamente como se ve)

        Thread.sleep(3000);
        ComboDropdown.selectByValue("2"); // Selecciona por value (Identificados al examinar el HTML)

        Thread.sleep(3000);
        ComboDropdown.selectByIndex(1); // Selecciona el primer elemento de la lista (Comienza desde 1)

        Thread.sleep(3000);
        driver.findElement(By.id("dropdown")).sendKeys("Option 2"); // También es posible enviandole el Send key correspondiente de la casilla

        Thread.sleep(3000);
        driver.findElement(By.id("dropdown")).click();
        driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[2]")).click(); // Selecciona el primer elemento (Option 1)
        Thread.sleep(3000);

        driver.quit();

    }

}
