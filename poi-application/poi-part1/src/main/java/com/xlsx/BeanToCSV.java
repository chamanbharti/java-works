package com.xlsx;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class BeanToCSV {
	public static void main(String[] args)
	{

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
			beanWriter.write(EmployeeList);

			// closing the writer object
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
