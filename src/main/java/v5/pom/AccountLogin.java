package v5.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import v4.TestData;

public class AccountLogin {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;


    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Entering correct email
    public void enterEmail() {
        emailTextBox.sendKeys(TestData.LOGIN_EMAIL_ID);
    }

    //Entering correct password
    public void enterPassword() {
        passwordTextBox.sendKeys(TestData.LOGIN_PASSWORD);
    }
    //Clicking on Login button

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
