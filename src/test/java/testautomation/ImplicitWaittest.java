package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImplicitWaittest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(10000);
        List<WebElement>lst = driver.findElements(By.xpath("//*[text]()='Hello World!'"));
        System.out.println(lst.size());


    }
}
