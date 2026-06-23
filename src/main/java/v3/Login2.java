package v3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login2 {
    public static void main(String[] args) {
//        1- Open the browser and Enter the Url
        WebDriver driver = utilities.Browsers.launchBrowser(AppData.BROWSER_NAME);

//        2- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(AppData.WAIT_TIME));

//        3- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

//        4- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(TestData.LOGIN_EMAIL_ID);

//        5- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(TestData.LOGIN_PASSWORD);

//        6- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

//        7- Validate Login Status
        String actualLoginPageTitle = driver.getTitle();
        if (actualLoginPageTitle.equals(TestData.EXPECTED_LOGIN_PAGE_TITLE)) {
            System.out.println(TestData.LOGIN_SUCCESS_MSG);
        } else {
            System.out.println(TestData.LOGIN_FAILURE_MSG);
        }

//        8- Close the browser
        utilities.Browsers.closeBrowser();

    }
}
