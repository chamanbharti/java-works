package com.xlsx;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import com.model.Book;

public class TestFinal {

	private static String produceCsvData(Object[] data) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		if (data.length == 0) {
			return "";
		}

		Class<?> classType = data[0].getClass();
		StringBuilder builder = new StringBuilder();

		Method[] methods = classType.getDeclaredMethods();

		for (Method m : methods) {
			if (m.getParameterTypes().length == 0) {
				if (m.getName().startsWith("get")) {
					builder.append(m.getName().substring(3)).append(',');
				} else if (m.getName().startsWith("is")) {
					builder.append(m.getName().substring(2)).append(',');
				}

			}

		}
		builder.deleteCharAt(builder.length() - 1);
		builder.append('\n');
		for (Object d : data) {
			for (Method m : methods) {
				if (m.getParameterTypes().length == 0) {
					if (m.getName().startsWith("get") || m.getName().startsWith("is")) {
						//System.out.println(m.invoke(d).toString());
						builder.append(m.invoke(d).toString()).append(',');
					}
				}
			}
			builder.append('\n');
		}
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

	public static boolean generateCSV(Object[] data, File csvFileName) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(csvFileName);
			if (!csvFileName.exists())
				csvFileName.createNewFile();
			fw.write(produceCsvData(data));
			fw.flush();
		} catch (Exception e) {
			System.out.println("Error while generating csv from data. Error message : " + e.getMessage());
			e.printStackTrace();
			return false;
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
				}
				fw = null;
			}
		}
		return true;
	}

	private List<Book> getListBook() {
		Book book1 = new Book("Head First Java", "Kathy Serria", "79");
		Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
		Book book3 = new Book("Clean Code", "Robert Martin", "42");
		Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");

		List<Book> listBook = Arrays.asList(book1, book2, book3, book4);

		return listBook;
	}

	public <T> void writeCSV(List<T> listBook, String csvFilePath) {
		
			 Object[] a = listBook.toArray();
			 // approach I
		     Book[] list = new Book[a.length];
			    for (int i=0;i<a.length;i++) {
			    	Book aBook = (Book) a[i];
			    	list[i] = aBook;
			    }
			    
			    TestFinal.generateCSV(list, new File("D:\\products1.csv"));
			 
			 // approach II
			    TestFinal.generateCSV(a, new File("D:\\products2.csv"));
			    
	}
	public static void main(String[] args) {

		TestFinal test = new TestFinal();
	    List<Book> listBook = test.getListBook();
		String csvFilePath = "D://test/download/NiceJavaBooks1801.csv";
		 
		test.writeCSV(listBook, csvFilePath);
	}
}
