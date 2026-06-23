import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration2 {

    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = new ChromeDriver();

        //2. Enter the Url
        driver.get(AppData.PAGE_URL);

        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the form
        WebElement fNameTextBox = driver.findElement(By.id("input-firstname"));
        fNameTextBox.sendKeys(TestData.FIRST_NAME);

        WebElement lNameTextBox = driver.findElement(By.name("lastname"));
        lNameTextBox.sendKeys(TestData.LAST_NAME);

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys(TestData.EMAIL_ID);

        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys(TestData.TELEPHONE);

        WebElement countryDdl = driver.findElement(By.id("input-country"));
        Select countries = new Select(countryDdl);
        countries.selectByValue(TestData.COUNTRY);

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys(TestData.PASSWORD);

        WebElement confirmPwdTextBox = driver.findElement(By.name("confirm"));
        confirmPwdTextBox.sendKeys(TestData.CONFIRM_PASSWORD);

        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']"));
        yesRadioButton.click();

        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByValue(TestData.SUBSCRIPTION);

        //6. Click no Privacy Policy Checkbox
        WebElement privacyPolicyCheckBox = driver.findElement(By.name("agree"));
        privacyPolicyCheckBox.click();

        //7. Click on Continue button
        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();

        //8. Validate Registration status
        String actualPageTitle = driver.getTitle();
        if (actualPageTitle.equals(TestData.EXPECTED_PAGE_TITLE)) {
            System.out.println(TestData.REGISTER_SUCCESS_MSG);
            System.out.println(actualPageTitle);
        } else {
            System.out.println(TestData.REGISTER_FAILURE_MSG);
        }

        //9. Close the browser
        driver.close();
    }

}
