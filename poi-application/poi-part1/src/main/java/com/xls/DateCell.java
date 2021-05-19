package com.xls;

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


public class DateCell {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		CreationHelper createHelper = workbook.getCreationHelper();
		try(OutputStream os = new FileOutputStream("datecell.xls")) {
			Sheet sheet = workbook.createSheet("New Sheet");
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0);
			CellStyle cellStyle = workbook.createCellStyle();
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
