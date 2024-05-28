package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HP/OneDrive/Documents/Training%20session/SimpleAlert.html");
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();
        driver.switchTo().alert().accept();

    }
}
