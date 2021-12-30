package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");

        String email, password;


        WebDriver driver = new ChromeDriver();
        //search google
        driver.get("https://www.google.com/");

    }
}