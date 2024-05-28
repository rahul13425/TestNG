package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("xyz");
        driver.findElement(By.name("password")).sendKeys("xyz");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("password")).clear();

    }
}
