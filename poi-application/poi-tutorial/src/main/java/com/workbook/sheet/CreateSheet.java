package com.workbook.sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateSheet {

	public static void main(String[] args)throws FileNotFoundException, IOException {
		
		Workbook workbook = new HSSFWorkbook();
		try(OutputStream fileOut = new FileOutputStream("st_sheet.xls")) {
			  Sheet sheet1 = workbook.createSheet("First Sheet");
			  Sheet sheet2 = workbook.createSheet("Second Sheet");
			  workbook.write(fileOut);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
