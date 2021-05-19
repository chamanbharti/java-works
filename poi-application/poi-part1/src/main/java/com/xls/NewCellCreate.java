package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class NewCellCreate {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		try(OutputStream os = new FileOutputStream("cell.xls")) {
			Sheet sheet = workbook.createSheet("New Sheet");
			Row row = sheet.createRow(2);
			Cell cell = row.createCell(5);
			cell.setCellValue("Ryaan");
			workbook.write(os);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
