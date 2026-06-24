package v5.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import v4.AppData;

import java.time.Duration;

public class YourStore
{
    WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginLink;

    public YourStore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //click on my account icon
    public  void clickOnMyAccountIcon()
    {
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(AppData.WAIT_TIME));
    }

    //click on login link
    public  void clickOnLoginLink()
    {

        loginLink.click();
    }

}
