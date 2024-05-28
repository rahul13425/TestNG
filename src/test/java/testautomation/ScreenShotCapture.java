package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenShotCapture {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        TakesScreenshot ts = ((TakesScreenshot)driver );
        File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("F:\\Screenshot.png"));
    }
}