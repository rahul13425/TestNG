import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class textverify {
    public WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        System.out.println("Setup Completed");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
        System.out.println("teardown Completely ");
    }

    @Test(priority = 1)
        public void textverify1() {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
//            //System.out.println(System.getProperty("user.dir"));
//            WebDriver driver = new ChromeDriver();
//            driver.get("https://demo.opencart.com/");
            String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
           // Assert.assertEquals(val, "Your Store");
        SoftAssert as =new SoftAssert();
       // as.assertEquals(val,"your store1");
        Assert.assertNotEquals(val, "Your Store1");
        String err_val=as.toString();
        System.out.println("soft assert executed "+err_val);
            System.out.println("Test Case Passed");}
        @Test(priority = 2, dependsOnMethods = {"textverify1"})
        public void Login() {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
//            //System.out.println(System.getProperty("user.dir"));
            driver.findElement(By.xpath("//span[@class='caret']")).click();
            driver.findElement(By.linkText("Login")).click();
            System.out.println("Login Test Case Passed");


        }

    }
