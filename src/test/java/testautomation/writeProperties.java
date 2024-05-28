package testautomation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\TestNG\\test-output\\TestdataSheet.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(f);
        XSSFSheet sheet = wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("dssa");
        FileOutputStream fw = new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\TestNG\\test-output\\TestdataSheet.xlsx");
        wb.write(fw);
        fw.close();
    }
}
