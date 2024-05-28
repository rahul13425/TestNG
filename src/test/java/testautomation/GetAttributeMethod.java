package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("Rahul");
        String ActualValue = driver.findElement(By.name("email")).getAttribute("value");
        //System.out.println(ActualValue);
        if (ActualValue.equals("Rahul"))
        {
            System.out.println("Testcase is passed");
        }
        else
        {
            System.out.println("Testcase is failed");
        }
    }
}
