import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Demo {
    @BeforeSuite
    public void beforesuit() {
        System.out.println("This is before suit");
    }

    @AfterSuite
    public void aftersuit() {
        System.out.println("This is after suit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before Demo test project");
    }

    @AfterTest
    public void aftertest() {
        System.out.println("After Demo test project");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class Demo");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is After class Demo");}
        @Test(priority = 2)
        public static void firstdemo ()
        {
            System.out.println("this is first demo");
        }
        @Test(priority = 1)
        public static void seconddemo ()
        {
            System.out.println("this is the second demo");
        }
        @Test(priority = 3)
    public void verifyLogin_2() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.findElement(By.xpath("//span[@class='caret']")).click();
        boolean isdisplayed=driver.findElement(By.linkText("Login")).isDisplayed();
        Assert.assertTrue(isdisplayed);
        System.out.println("login Passes");
        driver.quit();
    }

    }


