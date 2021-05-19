package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheet {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		try(OutputStream os = new FileOutputStream("new_sheet2.xlsx")){
			XSSFSheet sheet = workbook.createSheet("First Sheet");
			XSSFSheet sheet2 = workbook.createSheet("Second Sheet");
			workbook.write(os);
			workbook.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
