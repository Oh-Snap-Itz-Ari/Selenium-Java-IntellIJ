package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class AbsWebDriverListener extends AbstractWebDriverEventListener {

    // Si solo se quieren llamar ciertos listener es posible de la siguiente manera
    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

    }
}
