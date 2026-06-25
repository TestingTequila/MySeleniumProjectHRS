package v6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActions {
    WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator) {
        driver.findElement(locator).click();
    }

    public void doSendKeys(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public  String doCapturePageTitle()
    {
        return driver.getTitle();
    }
}
