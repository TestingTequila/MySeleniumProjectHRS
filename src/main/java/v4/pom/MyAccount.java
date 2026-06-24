package v4.pom;

import org.openqa.selenium.WebDriver;
import v4.TestData;

public class MyAccount
{
    WebDriver driver;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    //Validating Login Status
    public  void validateLoginStatus()
    {
        String actualLoginPageTitle = driver.getTitle();
        if (actualLoginPageTitle.equals(TestData.EXPECTED_LOGIN_PAGE_TITLE)) {
            System.out.println(TestData.LOGIN_SUCCESS_MSG);
        } else {
            System.out.println(TestData.LOGIN_FAILURE_MSG);
        }
    }
}
