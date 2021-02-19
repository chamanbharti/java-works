package com.netprophet;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FindRowsInFile {
	public static void main(String[] args) {
		
		try{
			File file = new File("e:\\file.txt");
			
			if(file.exists()){
				FileReader fr = new FileReader(file);
				LineNumberReader lnr = new LineNumberReader(fr);
				
				int lineNumber = 0;
				while(lnr.readLine() !=null){
					lineNumber++;
				}
				System.out.println("Total no of rows or lines : "+lineNumber);
				lnr.close();
			}else{
				System.out.println("File does not exists!");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
