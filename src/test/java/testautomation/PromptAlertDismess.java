package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertDismess {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HP/OneDrive/Documents/Training%20session/Prompt.html");
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Rahul");
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

    }
}


