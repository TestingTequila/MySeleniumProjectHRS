package v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = new ChromeDriver();

        //2. Enter the Url
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the form
        WebElement fNameTextBox = driver.findElement(By.id("input-firstname"));
        fNameTextBox.sendKeys("James");

        WebElement lNameTextBox = driver.findElement(By.name("lastname"));
        lNameTextBox.sendKeys("Boxill");

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("james.boxill3@janbask.com");

        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("789785674");

        WebElement countryDdl = driver.findElement(By.id("input-country"));
        Select countries = new Select(countryDdl);
        countries.selectByValue("57");

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement confirmPwdTextBox = driver.findElement(By.name("confirm"));
        confirmPwdTextBox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']"));
        yesRadioButton.click();

        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByValue("Monthly");

        //6. Click no Privacy Policy Checkbox
        WebElement privacyPolicyCheckBox = driver.findElement(By.name("agree"));
        privacyPolicyCheckBox.click();

        //7. Click on Continue button
        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();


        String pageTitle =driver.getTitle();
        if(pageTitle.equals("Your Account Has Been Created!")) {
            System.out.println("dummy.Registration Successful");
            System.out.println(pageTitle);
        }
        else
        {
            System.out.println("Already Registered, Please use different email....");
        }

        //8. Validate dummy.Registration status


        //9. Close the browser
        driver.close();
    }

}
