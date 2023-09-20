package TestSelenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenshotClass {

    public static void Screenshot(String screenName) throws InterruptedException, AWTException, IOException {

        Thread.sleep(1000);

        String formato_foto = ".png";
        String path_foto = "D:\\Mr. Blue Sky\\Automatización\\IntelliJ\\IntellIJ Selenium Java\\src\\img\\";
        String archivo_foto = path_foto + screenName + formato_foto;

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File(archivo_foto));

        System.out.println("Fotografia tomada: " +screenName);

    }

}
