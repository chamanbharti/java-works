package com.xls;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateWorkBook {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		try(OutputStream fileOutput = new FileOutputStream("javatpoint.xls")) {
			workbook.write(fileOutput);
			workbook.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
