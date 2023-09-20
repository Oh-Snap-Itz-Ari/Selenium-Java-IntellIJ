package EvidenciasTakeScreenshotCapturasDePantalla;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakesScreenshotClass {

    public static void Screenshot(String screenName, WebDriver driver) throws InterruptedException, AWTException, IOException {

        File screenshot;

        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("D:\\Mr. Blue Sky\\Automatización\\IntelliJ\\IntellIJ Selenium Java\\src\\imgts\\"+screenName+" (TS).png")); // Es necesario para esto instalar de Maven Repository la dependencia Apache Commons IO

        System.out.println("Fotografia tomada: " +screenName);
    }

}
