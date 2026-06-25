package v6.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import v4.AppData;
import v6.CommonActions;

import java.time.Duration;

public class YourStore {
    WebDriver driver;
    CommonActions ca;
    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");

    By loginLink = By.xpath("//a[text()='Login']");

    public YourStore(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    //click on my account icon
    public void clickOnMyAccountIcon() {
        ca.doClick(myAccountIcon);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(AppData.WAIT_TIME));
    }

    //click on login link
    public void clickOnLoginLink() {

        ca.doClick(loginLink);
    }

}
