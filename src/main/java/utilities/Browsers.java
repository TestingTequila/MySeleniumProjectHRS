package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import v3.AppData;

public class Browsers
{
    static WebDriver driver;

    public static WebDriver launchBrowser(String browserName)
    {


        if(browserName.equals("Chrome"))
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(AppData.PAGE_URL);
        }
        else if (browserName.equals("Firefox"))
        {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(AppData.PAGE_URL);
        }
        else if (browserName.equals("IE"))
        {
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get(AppData.PAGE_URL);
        }
        else
        {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get(AppData.PAGE_URL);
        }
        return driver;
    }

    public static void closeBrowser()
    {
          driver.close();
    }
}
