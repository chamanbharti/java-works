package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateWorkBook {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		try(OutputStream fileOutput = new FileOutputStream("WorkBook.xlsx")) {
			workbook.write(fileOutput);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
