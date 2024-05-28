package testautomation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadTest {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\TestNG\\test-output\\TestdataSheet.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(f);
        XSSFSheet sheet = wb.getSheetAt(0);
        int row = sheet.getLastRowNum();
        int col = sheet.getRow(1).getLastCellNum();
        System.out.println(row);
        System.out.println(col);
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col - 1; j++) {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }

    }
}
