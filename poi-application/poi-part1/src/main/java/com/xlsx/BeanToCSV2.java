package com.xlsx;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.model.Book;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class BeanToCSV2 {
	public static void main(String[] args) {
	
		/*
		// name of generated csv
		final String CSV_LOCATION = "Employees.csv ";

		try {

			// Creating writer class to generate
			// csv file
			FileWriter writer = new
					FileWriter(CSV_LOCATION);

			// create a list of employee
			List<Employee> EmployeeList = new
								ArrayList<Employee>();
			Employee emp1 = new Employee
					("Mahafuj", "24", "HTc", "75000");
			Employee emp2 = new Employee
				("Aman", "24", "microsoft", "79000");
			Employee emp3 = new Employee
					("Suvradip", "26", "tcs", "39000");
			Employee emp4 = new Employee
					("Riya", "22", "NgGear", "15000");
			Employee emp5 = new Employee
					("Prakash", "29", "Sath", "51000");
			EmployeeList.add(emp1);
			EmployeeList.add(emp2);
			EmployeeList.add(emp3);
			EmployeeList.add(emp4);
			EmployeeList.add(emp5);

			
			// Create Mapping Strategy to arrange the
			// column name in order
			ColumnPositionMappingStrategy<Employee> mappingStrategy=new ColumnPositionMappingStrategy<Employee>();
			mappingStrategy.setType(Employee.class);

			// Arrange column name as provided in below array.
			String[] columns = new String[]
					{ "Name", "Age", "Company", "Salary" };
			mappingStrategy.setColumnMapping(columns);

			// Createing StatefulBeanToCsv object
			StatefulBeanToCsvBuilder<Employee> builder=
						new StatefulBeanToCsvBuilder<Employee>(writer);
			StatefulBeanToCsv<Employee> beanWriter =
		builder.withMappingStrategy(mappingStrategy).build();

			// Write list to StatefulBeanToCsv object
			//beanWriter.write(EmployeeList);

			// closing the writer object
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		BeanToCSV2 csvWriter = new BeanToCSV2();
		 
		List<Book> listBook = csvWriter.getListBook();
		String csvFilePath = "D://test/download/NiceJavaBooks18.csv";
		 
		csvWriter.writeCSV(listBook, csvFilePath);
		System.out.println("success");
	}
	public <T> void writeCSV(List<T> listBook, String csvFilePath) {
		
		try {
			FileWriter writer = new FileWriter(csvFilePath);
			 Object[] a = listBook.toArray();
		    	List<Book> data = new ArrayList<>();
			    for (int i=0;i<a.length;i++) {
			    	Book aBook = (Book) a[i];
			    	data.add(aBook);
			    }
			    
				ColumnPositionMappingStrategy<Book> mappingStrategy=new ColumnPositionMappingStrategy<Book>();
				mappingStrategy.setType(Book.class);

				// Arrange column name as provided in below array.
				String[] columns = new String[]
						{ "Book Name", "Author Name", "Book Price" };
				mappingStrategy.setColumnMapping(columns);

				// Createing StatefulBeanToCsv object
				StatefulBeanToCsvBuilder<Book> builder=new StatefulBeanToCsvBuilder<Book>(writer);
				StatefulBeanToCsv<Book> beanWriter =builder.withMappingStrategy(mappingStrategy).build();

				// Write list to StatefulBeanToCsv object
				beanWriter.write(data);

				// closing the writer object
				writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private List<Book> getListBook() {
	    Book book1 = new Book("Head First Java", "Kathy Serria", "79");
	    Book book2 = new Book("Effective Java", "Joshua Bloch", "36");
	    Book book3 = new Book("Clean Code", "Robert Martin", "42");
	    Book book4 = new Book("Thinking in Java", "Bruce Eckel", "35");
	 
	    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
	 
	    return listBook;
	}
}
