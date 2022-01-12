package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testcases.BaseClass;

public class LoginPage {


    public  void doSomething(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);

        WebElement profile = driver.findElement(By.xpath(BaseClass.profileButtonXPath));
        profile.click();

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath(BaseClass.emailXPath));

        email.sendKeys(BaseClass.userName);

        WebElement pasword = driver.findElement(By.xpath(BaseClass.passwordXPath));

        pasword.sendKeys(BaseClass.password);

        driver.findElement(By.xpath(BaseClass.signInXPath)).click();
    }


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chemistatplay.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);

        WebElement profile = driver.findElement(By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div/div[3]/div/div[1]/a[2]"));
        profile.click();



        WebElement login = driver.findElement(By.xpath("//*[@id=\"CustomerEmail\"]"));

        login.sendKeys("abhishek@onestolabs.com");

        WebElement pasword = driver.findElement(By.xpath("//*[@id=\"CustomerPassword\"]"));

        pasword.sendKeys("abhishek@123");

        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/p[1]/button")).click();

    }

    }