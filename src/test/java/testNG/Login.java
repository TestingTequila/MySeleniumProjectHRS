package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import v6.AppData;
import v6.pom.AccountLogin;
import v6.pom.MyAccount;
import v6.pom.YourStore;

public class Login {

    WebDriver driver;

    @BeforeMethod
    public void launchBrowserAndEnterUrl() {
        driver = utilities.Browsers.launchBrowser(AppData.BROWSER_NAME);
    }

    @Test
    public void login1() {
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        ys.clickOnLoginLink();

        AccountLogin al = new AccountLogin(driver);
        al.enterEmail();

        al.enterPassword();

        al.clickOnLoginButton();

        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();
    }

    @Test
    public void login2() {
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        ys.clickOnLoginLink();

        AccountLogin al = new AccountLogin(driver);
        al.enterEmail();

        al.enterPassword();

        al.clickOnLoginButton();

        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();
    }

    @Test
    public void login3() {
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        ys.clickOnLoginLink();

        AccountLogin al = new AccountLogin(driver);
        al.enterInvalidEmail();

        al.enterPassword();

        al.clickOnLoginButton();

        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();
    }

    @AfterMethod
    public void closeBrowser() {
        utilities.Browsers.closeBrowser();
    }


}
