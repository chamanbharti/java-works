package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class NewSheet {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		try(OutputStream os = new FileOutputStream("new_sheet.xls")){
			Sheet sheet = workbook.createSheet("First Sheet");
			Sheet sheet2 = workbook.createSheet("Second Sheet");
			workbook.write(os);
			workbook.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
