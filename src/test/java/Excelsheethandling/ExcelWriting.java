package Excelsheethandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Eclipse_workspace\\Seleniumexlproject\\testdata\\Excelwriting.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=4;r++) {
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<4;c++) {
				System.out.println("enter value");
				String value=sc.next();
				row.createCell(c).setCellValue(value);
			}
		}
		
          wb.write(fos);
          wb.close();
          System.out.println("Writing is completed");
	}

}
