package com.java7;

import java.io.IOException;
import java.sql.SQLException;

public class CatchingMultipleException {

	public static void main(String[] args) {
		
		//before java 7
		/*
		String exceptionString = args[0];
		try {
			  if(exceptionString.equals("io")) {
				  throw new IOException();
			  }
			  if(exceptionString.equals("sql")) {
				  throw new SQLException();
			  }
			  if(exceptionString.equals("cnf")) {
				  throw new ClassNotFoundException();
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		*/
		
		//after java 7
		/*
		String exceptionString = args[0];
		try {
			  if(exceptionString.equals("io")) {
				  throw new IOException();
			  }
			  if(exceptionString.equals("sql")) {
				  throw new SQLException();
			  }
			  if(exceptionString.equals("cnf")) {
				  throw new ClassNotFoundException();
			  }
		} catch (IOException | SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
		//before java 7
		/*
		try {
			  int[] array = new int[10];
			  array[10] = 30/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		//after java 7
		try {
			  int[] array = new int[10];
			  array[10] = 30/0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
