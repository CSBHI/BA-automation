package testcases;

import org.bouncycastle.jcajce.provider.digest.MD4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

public class BaseClass {

    public static String baseUrl = "https://chemistatplay.com";
    public static String userName = "abhishek@onestolabs.com";
    public static String password = "abhishek@123";
    public static String profileButtonXPath = "//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/div/div[1]/a[2]";
    public static String emailXPath = "/html/body/div[1]/div/main/div/div/div[2]/form/input[3]";
    public static String passwordXPath = "//*[@id=\"CustomerPassword\"]";
    public static String signInXPath = "//*[@id=\"customer_login\"]/p[1]/button";


    public static WebDriver driver;

     @BeforeClass
    public void setup()
     {
         System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(baseUrl);
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
