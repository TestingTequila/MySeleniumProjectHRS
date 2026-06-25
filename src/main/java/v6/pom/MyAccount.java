package v6.pom;

import org.openqa.selenium.WebDriver;
import v4.TestData;
import v6.CommonActions;

public class MyAccount
{
    WebDriver driver;

    CommonActions ca;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    //Validating Login Status
    public  void validateLoginStatus()
    {
        String actualLoginPageTitle = ca.doCapturePageTitle();
        if (actualLoginPageTitle.equals(TestData.EXPECTED_LOGIN_PAGE_TITLE)) {
            System.out.println(TestData.LOGIN_SUCCESS_MSG);
        } else {
            System.out.println(TestData.LOGIN_FAILURE_MSG);
        }
    }
}
