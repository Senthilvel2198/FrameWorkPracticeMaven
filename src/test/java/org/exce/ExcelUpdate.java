package org.exce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\SenthilVel\\eclipse-workspace\\FrameWorkPracticeMaven\\excel\\CompanyData.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet sheet = w.getSheet("Data");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(4);
		
		String value = cell.getStringCellValue();
		
		if (value.equals("Karur")) {
			
			cell.setCellValue("Pondy");
			
			
		}
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		
		System.out.println("Successfully Updated");
	}

}
