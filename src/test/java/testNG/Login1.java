package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login1 {
    WebDriver driver;
    @BeforeMethod
    public void openBrowserEnterUrl() {

        driver = new ChromeDriver();
        driver.get("http://www.janbaskdemo.com/");
    }

    @Test
    public void login1() {

        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("ben.fletcher@janbask.com");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@123455");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "My Account");
//        if (pageTitle.equals("My Account")) {
//            System.out.println("Login is successful...");
//        } else {
//            System.out.println("Login Failed.....");
//        }
    }


    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }


}
