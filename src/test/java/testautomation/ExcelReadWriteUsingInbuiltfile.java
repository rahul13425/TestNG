package testautomation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWriteUsingInbuiltfile {
    public static void main(String[] args) {


        DriverScript.Xls_Reader xl = new DriverScript.Xls_Reader("C:\\Users\\HP\\IdeaProjects\\TestNG\\test-output\\TestdataSheet.xlsx");
        int row = xl.getRowCount("sheet1");
        System.out.println(row);

        String username = xl.getCellData("Sheet1", "username", 2);
        System.out.println(username);
        xl.setCellData("Sheet1", "status", 2, "passed");
    }
}
