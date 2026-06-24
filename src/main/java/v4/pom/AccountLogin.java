package v4.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import v4.TestData;

public class AccountLogin {

    WebDriver driver;

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
    }

    //Entering correct email
    public  void enterEmail()
    {
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(TestData.LOGIN_EMAIL_ID);
    }
    //Entering correct password
    public  void enterPassword()
    {
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(TestData.LOGIN_PASSWORD);
    }
    //Clicking on Login button

    public  void clickOnLoginButton()
    {
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }
}
