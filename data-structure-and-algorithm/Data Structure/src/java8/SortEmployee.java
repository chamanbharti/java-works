package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> emp = getEmployees();
		//Sort all employees by first name
		/*emp.sort(Comparator.comparing(e -> e.getFirstName() ));
		System.out.println(emp);
		
		//Or you can use below
		emp.sort(Comparator.comparing(Employee::getFirstName));
		System.out.println(emp);*/
		
		// Sort all employees by first name in reverse order
		//Sort all employees by first name; And then reversed
		/*Comparator<Employee> comparator = Comparator.comparing( e -> e.getFirstName() );
		emp.sort(comparator.reversed());
		//Let's print the sorted list
	    System.out.println(emp);*/
	    
	    //Sort all employees by last name
		//emp.sort(Comparator.comparing( e -> e.getLastName() ));
		
		//Or you can use below
		//emp.sort(Comparator.comparing( e -> e.getLastName() ));
		//Let's print the sorted list
		//System.out.println(emp);
		
		//Sort By first name and then by last name (sort on multiple fields)
		//Sorting on multiple fields; Group by.
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee :: getFirstName).thenComparing(Employee :: getLastName);
		emp.sort(groupByComparator);
		System.out.println(emp);
		
		//Using parallel sorting (with multiple threads)
		//Parallel Sorting
		Employee[] empArray = emp.toArray( new Employee[ emp.size() ] );
		
		//Parallel Sorting
		Arrays.parallelSort(empArray, groupByComparator);
		System.out.println(empArray);
	}

	private static List<Employee> getEmployees(){
	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	    employees.add(new Employee(2,"Aman", "Sharma", 28));
	    employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	    employees.add(new Employee(4,"James", "Hedge", 72));
	    employees.add(new Employee(5,"David", "Kameron", 19));
	    employees.add(new Employee(6,"Yash", "Chopra", 25));
	    employees.add(new Employee(7,"Karan", "Johar", 59));
	    employees.add(new Employee(8,"Balaji", "Subbu", 88));
	    employees.add(new Employee(9,"Vishu", "Bissi", 33));
	    employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	    return employees;
	}
}
