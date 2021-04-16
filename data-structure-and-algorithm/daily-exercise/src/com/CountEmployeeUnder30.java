package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEmployeeUnder30 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("D:\\employee.txt"));
				
		int count= 0;
		while(scan != null) {
			System.out.println(scan);
		}
		
	}
}
