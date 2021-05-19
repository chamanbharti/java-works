package com.xlsx;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MergeTwoCell {
	
	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("merge_cell2.xlsx")){
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Sheet");
			XSSFRow row = sheet.createRow(1);
			XSSFCell cell = row.createCell(1);
			cell.setCellValue("Two cells have merged");
			// Merging cells by providing cell index
			sheet.addMergedRegion(new CellRangeAddress(1,1,1,2));
			workbook.write(os);
			workbook.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

	}
}
