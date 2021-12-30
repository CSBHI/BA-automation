package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String email,password;

        driver.get("https://chemistatplay.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);

       driver.findElement(By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/div/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]")).sendKeys("abhishek@onestolabs.com");
        driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]")).sendKeys("abhishek@123");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();


    }

    }