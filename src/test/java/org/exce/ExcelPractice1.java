package org.exce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\SenthilVel\\eclipse-workspace\\FrameWorkPracticeMaven\\excel\\CompanyData.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet sheet1 = w.getSheet("Data");
		
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet1.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					} else if (cellType==0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							
							Date d = cell.getDateCellValue();
							SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
							String date = sim.format(d);
							System.out.println(date);
						} else {
							double num = cell.getNumericCellValue();
							long l = (long)num;
							 
							String number = String.valueOf(l);
							System.out.println(number);
							
						}
						
					}
				
			}
			
		}
		
	}

}
