package v5;

import org.openqa.selenium.WebDriver;
import v5.pom.AccountLogin;
import v5.pom.MyAccount;
import v5.pom.YourStore;

public class Login2 {
    public static void main(String[] args) {
//        1- Open the browser and Enter the Url
        WebDriver driver = utilities.Browsers.launchBrowser(AppData.BROWSER_NAME);

//        2- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

//        3- Click on login Link
        ys.clickOnLoginLink();

//        4- Enter correct email
        AccountLogin al = new AccountLogin(driver);
        al.enterEmail();

//        5- Enter correct password
        al.enterPassword();

//        6- Click on Login button
        al.clickOnLoginButton();

//        7- Validate Login Status
        MyAccount ma= new MyAccount(driver);
        ma.validateLoginStatus();

//        8- Close the browser
        utilities.Browsers.closeBrowser();

    }
}
