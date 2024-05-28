package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCredential {
    public static void main(String[] args) {
        DriverScript.Xls_Reader Xl= new DriverScript.Xls_Reader(System.getProperty("user.dir")+"TestdataSheet.xlsx");
        int rowcount = Xl.getRowCount("Sheet1");
        for (int i=2;i<=rowcount;i++)
        {
            String vTCname= Xl.getCellData("sheet1","Testcasename",i);
            if (vTCname.equals("TC01_InvalidCredential"))
            {
                String url = Xl.getCellData("Sheet1","URL",i);
                String uname = Xl.getCellData("Sheet1","username",i);
                String pwd = Xl.getCellData("Sheet1","password",i);

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get(url);
                driver.findElement(By.name("email")).sendKeys(uname);
                driver.findElement(By.name("password")).sendKeys(pwd);
                driver.findElement(By.name("//input[@value='login']")).click();
                Boolean stat = driver.findElement(By.xpath("//div[text()='warning: No match for E-mail Address and /or Password.']")).isDisplayed();
                if (stat)
                {
                    Xl.setCellData("Sheet1","Status",i,"Login functionality is not working for invalid credential");
                }
                else
                {
                    Xl.setCellData("Sheet1","Status",i,"failed");
                }
                }
            }
        }


}
