package com.exceloperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\datafiles\\student2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Student data");
		
		int rows = sheet.getLastRowNum();
		// reading data from excel to hashmap
		Map<String, String> data = new HashMap<>();
		for(int r=0;r<=rows;r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key,value);
		}
		
		// read data from hashmap
		for(Map.Entry<String, String> entry:data.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		workbook.close();
		fis.close();
		
	}
}
