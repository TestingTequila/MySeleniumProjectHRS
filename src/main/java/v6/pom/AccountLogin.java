package v6.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import v4.TestData;
import v6.CommonActions;

public class AccountLogin {

    WebDriver driver;

    CommonActions ca;

    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@type='submit']");

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    //Entering correct email
    public void enterEmail() {
        ca.doSendKeys(emailTextBox, TestData.LOGIN_EMAIL_ID);
    }

    public void enterInvalidEmail() {
        ca.doSendKeys(emailTextBox, TestData.INVALID_LOGIN_EMAIL_ID);
    }

    //Entering correct password
    public void enterPassword() {
        ca.doSendKeys(passwordTextBox, TestData.LOGIN_PASSWORD);
    }
    //Clicking on Login button

    public void clickOnLoginButton() {
        ca.doClick(loginButton);
    }
}
