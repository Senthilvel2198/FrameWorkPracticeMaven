package org.exce;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.info.Ultilityclass;

public class ExcelCreate extends Ultilityclass {
	
	public static void main(String[] args) throws IOException {
		
		createExceldata(1, 1, "Soji");	
	}

}
