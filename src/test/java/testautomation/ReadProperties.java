package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Properties pro=new Properties();
        FileInputStream f=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\TestNG\\Testdata.properties");
        pro.load(f);
        System.out.println(pro.getProperty("url"));
        String vUrl= pro.getProperty("url");
        String vUsername=pro.getProperty("username");
        driver.get(vUrl);
        WebElement webElement=driver.findElement(By.name(pro.getProperty("emailread")));
        webElement.sendKeys(vUsername);
        FileOutputStream fw=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\TestNG\\Testdata.properties");
        pro.setProperty("password","helloworld");
        pro.store(fw,"comments");
    }
}
