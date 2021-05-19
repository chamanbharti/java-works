package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DateCell {

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFCreationHelper createHelper = workbook.getCreationHelper();
		try(OutputStream os = new FileOutputStream("datecell2.xlsx")) {
			XSSFSheet sheet = workbook.createSheet("New Sheet");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			XSSFCellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("d/m/yy h:mm"));
			cell = row.createCell(1);
			cell.setCellValue(new Date());
			cell.setCellStyle(cellStyle);
			workbook.write(os);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
