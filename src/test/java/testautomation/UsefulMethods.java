package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Boolean bol = driver.findElement(By.name("email")).isDisplayed();
        if (bol)
        {
            System.out.println("Tst case is passed and username is visible on the web page");
        }
        else
        {
            System.out.println("Test case is failed as usernsme field is not  visible on the webpage");
        }
    }
}
