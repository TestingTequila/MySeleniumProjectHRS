package testNG;

import org.testng.annotations.*;

public class Dummy
{
    @Test
    public  void login()
    {
        System.out.println("@Test: This is dummy Login function....");
    }

    @Test
    public void registration()
    {
        System.out.println("@Test: This is registration function....");
    }

    @BeforeMethod
    public void enterTheUrl()
    {
        System.out.println("@BeforeMethod: Enter the URL into the browser....");
    }

    @AfterMethod
    public  void clearTheUrl()
    {
        System.out.println("@AfterMethod: Clear the URL from the browser...");
    }
    @BeforeClass
    public  void launchBrowser()
    {
        System.out.println("@BeforeClass: This will launch the browser.....");
    }

    @AfterClass
    public  void closeBrowser()
    {
        System.out.println("@AfterClass: This will close the browser.....");
    }

    @BeforeTest
    public  void connectDB()
    {
        System.out.println("@BeforeTest: This will connect with DB.....");
    }
    @AfterTest
    public  void disconnectDB()
    {
        System.out.println("@AfterTest: This will disconnect with DB.....");
    }

    @BeforeSuite
    public  void createDB()
    {
        System.out.println("@BeforeSuite: This will create the DB....");
    }

    @AfterSuite
    public  void deleteDB()
    {
        System.out.println("@AfterSuite: This will delete the DB....");
    }
}
