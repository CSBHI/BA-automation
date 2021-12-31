package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

     System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();

    driver.get("https://chemistatplay.com");
    driver.findElement(By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/div/div[1]/a[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("abhishek@onestolabs.com");
    driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("abhishek@123");
    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();

     @BeforeClass
    public void setup()
     {
         System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
    }
    @AfterClass
    public void tearDown()
    {
        WebDriver driver;
        driver.quit();
    }

}
