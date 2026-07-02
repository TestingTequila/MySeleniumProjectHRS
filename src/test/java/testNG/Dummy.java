package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Dummy {
    @Test(priority = 2, dependsOnMethods = "ARegistration", alwaysRun = true, groups = "smoke")
    public void BLogin() {
        System.out.println("@Test: This is dummy Login function....");
    }

    @Test(priority = -3, groups = "smoke")
    public void ARegistration() {
        System.out.println("@Test: This is registration function....");
        Assert.fail();
    }

    @Test(priority = 1, enabled = true, groups = "sanity", dependsOnGroups = "smoke")
    public void CProduct() {
        System.out.println("@Test: This is registration function....");
    }

    @Test(priority = 3, enabled = true, groups = "sanity", dependsOnGroups = "smoke")
    public void DAddToCart() {
        System.out.println("@Test: This is Add to cart function....");
    }

    @Test(priority = 4, timeOut = 22)
    public void checkout() {
        System.out.println("@Test: This is checkout function....");
    }

    @BeforeMethod
    public void enterTheUrl() {
        System.out.println("@BeforeMethod: Enter the URL into the browser....");
    }

    @AfterMethod
    public void clearTheUrl() {
        System.out.println("@AfterMethod: Clear the URL from the browser...");
    }

    @BeforeClass
    public void launchBrowser() {
        System.out.println("@BeforeClass: This will launch the browser.....");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("@AfterClass: This will close the browser.....");
    }

    @BeforeTest
    public void connectDB() {
        System.out.println("@BeforeTest: This will connect with DB.....");
    }

    @AfterTest
    public void disconnectDB() {
        System.out.println("@AfterTest: This will disconnect with DB.....");
    }

    @BeforeSuite
    public void createDB() {
        System.out.println("@BeforeSuite: This will create the DB....");
    }

    @AfterSuite
    public void deleteDB() {
        System.out.println("@AfterSuite: This will delete the DB....");
    }

    public int addition(int a, int b)
    {
        return (a+b);
    }

    public boolean checkEligibility(int age)
    {
        boolean flag= false;
        if(age>=18)
        {
            flag= true;
        }
        return flag;
    }

    @Test
    public void testAddition()
    {
        //Assert.assertEquals(addition(12,4), 16, "Addition Failed....");
        //Assert.assertNotEquals(addition(12,4), 16, "Addition Failed....");
    }

    @Test
    public void testEligibility()
    {
        //Assert.assertTrue(checkEligibility(16));
        Assert.assertFalse(checkEligibility(16));
    }
}
