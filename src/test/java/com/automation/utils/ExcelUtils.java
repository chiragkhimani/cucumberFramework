package com.automation.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void initproperty() {
		
		try {
			workbook = new XSSFWorkbook("src/test/resources/data/Testdata.xlsx");
			sheet = workbook.getSheetAt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String getData(int rowNum, int columnNum) {
		
		XSSFRow row = sheet.getRow(rowNum);
		return row.getCell(columnNum).getStringCellValue();
		
	}

	public static int getNumberOfRows() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public static int getNumberOfColoumns(int rowNum) {
		return sheet.getRow(rowNum).getPhysicalNumberOfCells();
	}
}
