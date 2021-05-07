package com.workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateWorkBook {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook workbook = new HSSFWorkbook();
		
		try{
			OutputStream fileOut = new FileOutputStream("st.xls");
			workbook.write(fileOut);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
