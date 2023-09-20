package SelectoresChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumMavenChromeFuncionalidades {

    @Test
    public void TestExecute() throws InterruptedException {

        // Configuraciones previas Web Driver

        WebDriver driver; // Se genera la instancia del driver

        System.setProperty("webdriver.chrome.driver", "D:\\Mr. Blue Sky\\Automatización\\Drivers\\chromedriver.exe"); // Se establece la ruta en la que se encuentra el driver
        driver = new ChromeDriver(); // Se crea un nuevo driver

        // Maximizar e ingresar a un enlace

        driver.manage().window().maximize(); // Permite maximizar la ventana del navegador
        driver.get("https://demoqa.com/automation-practice-form"); // Se establece la ruta a la que queremos que vaya el driver

        // Busqueda de elementos por diferentes tipos

        driver.findElement(By.id("firstName")).sendKeys("Alex Fabián"); // Diligenciar información en los formularios al buscar el XPath correspondiente

        driver.findElement(By.cssSelector("#lastName")).sendKeys("Melo Gómez"); // Se obtiene inspeccionando el elemento y darle clic en copiar > copiar selector (No es muy recomendado usarlo)

        driver.findElement(By.id("userEmail")).sendKeys("alexfabianmelo12@hotmail.com");

        driver.findElement(By.xpath("//label[@for='gender-radio-1'][contains(.,'Male')]")).click(); // Da click al XPath seleccionado, se consigue con extensiones o directamente en copiar > copiar Xpath ó Copiar > Copiar Xpath Completo (Inspeccionar)

        driver.findElement(By.id("userNumber")).sendKeys("3245447847");

        Thread.sleep(3000);

        // Enviar una combinación de teclas

        // driver.findElement(By.id("dateOfBirthInput")).click();
        // driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "a"); // Selecciona el contenido de la caja

        // Scroll hasta encontrar el elemento

        WebElement El1 = driver.findElement(By.xpath("//label[@class='form-label'][contains(.,'Picture')]"));
        WebElement El2 = driver.findElement(By.id("currentAddress"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", El1); // Hace Scroll hasta que encuentra el El1

        Thread.sleep(3000);

        El2.sendKeys("Calle 30 # 05 - 15 San Antonio"); // Ingresa el contenido en la caja de texto del El2

        Thread.sleep(5000);

        driver.quit();

    }
}
