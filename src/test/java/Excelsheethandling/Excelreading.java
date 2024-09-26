package Excelsheethandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Eclipse_workspace\\Seleniumexlproject\\testdata\\ExcelsheetRead.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rows;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int c=0;c<cols;c++) {
				String values=row.getCell(c).toString();
				System.out.print(values+ " ");
			}
			System.out.println();
		}

	}

}
