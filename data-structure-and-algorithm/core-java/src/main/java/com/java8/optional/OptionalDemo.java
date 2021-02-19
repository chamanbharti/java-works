package java8.optional;

import java.util.ArrayList;
import java.util.List;

public class OptionalDemo {
	public static void main(String[] args) {
		
		List<Employee> employeeList = createEmployeeList();
		Employee employee = findEmployee(employeeList,"Adam");
		System.out.println("Employee name: "+employee.getName());
	}

	private static Employee findEmployee(List<Employee> employeeList, String name) {
		for(Employee e: employeeList) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e;
			}
		}
		return null;
	}

	private static List<Employee> createEmployeeList() {
		List<Employee> employeeList=new ArrayList<>();
		
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",22);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		return employeeList;
	}

}
