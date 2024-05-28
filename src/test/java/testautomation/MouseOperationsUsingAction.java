package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseOperationsUsingAction {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sellglobal.ebay.in/seller-center/");
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Seller Updates"))).build().perform();
        }
    }

