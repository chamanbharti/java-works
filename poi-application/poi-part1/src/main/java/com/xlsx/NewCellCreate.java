package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class NewCellCreate {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		try(OutputStream os = new FileOutputStream("cell2.xlsx")) {
			XSSFSheet sheet = workbook.createSheet("New Sheet");
			XSSFRow row = sheet.createRow(2);
			XSSFCell cell = row.createCell(5);
			cell.setCellValue("Ryaan");
			workbook.write(os);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
