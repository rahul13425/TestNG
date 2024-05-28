package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxeswithsameproperty {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Checkboxes")).click();
        //List<WebElement> lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
        List<WebElement> lst1 = driver.findElements(By.linkText("checkboxes"));
        //below case for single checkbox
        //WebElement elem = driver.findElement(By.linkText("Checkboxes"));
        //elem.click();
        lst1.get(0).click();
        System.out.println(lst1.size());
        List<WebElement> lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
        lst.get(0).click();
        System.out.println(lst.size());

    }
}
