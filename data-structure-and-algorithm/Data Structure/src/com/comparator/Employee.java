package com.comparator;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable{
	 String department, name;

	  public Employee(String department, String name) {
	    this.department = department;
	    this.name = name;
	  }

	  public String getDepartment() {
	    return department;
	  }

	  public String getName() {
	    return name;
	  }

	  public String toString() {
	    return "[dept=" + department + ",name=" + name + "]";
	  }
	  public int compareTo(Object obj) {
		    Employee emp = (Employee) obj;
		    int deptComp = department.compareTo(emp.getDepartment());

		    return ((deptComp == 0) ? name.compareTo(emp.getName()) : deptComp);
		  }
	  public boolean equals(Object obj) {
		    if (!(obj instanceof Employee)) {
		      return false;
		    }
		    Employee emp = (Employee) obj;
		    return department.equals(emp.getDepartment()) && name.equals(emp.getName());
		  }

		  public int hashCode() {
		    return 31 * department.hashCode() + name.hashCode();
		  }
		
		  public static void main(String[] args) {
			  Employee emps[] = { 
				        new Employee("Finance", "A"), 
				        new Employee("Finance", "B"),
				        new Employee("Finance", "C"), 
				        new Employee("Engineering", "D"),
				        new Employee("Engineering", "E"), 
				        new Employee("Engineering", "F"),
				        new Employee("Sales", "G"), 
				        new Employee("Sales", "H"), 
				        new Employee("Support", "I"), };
				    Set set = new TreeSet(Arrays.asList(emps));
				    System.out.println(set);
				  
		}

}
