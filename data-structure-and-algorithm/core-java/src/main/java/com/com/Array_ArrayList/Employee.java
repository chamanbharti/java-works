package com.Array_ArrayList;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	private String employeeame;
    private int id;
    private int age;

    public Employee(int id, String employeeame, int age) {
         this.id = id;
         this.employeeame = employeeame;
         this.age = age;
    }

	public String getemployeeame() {
		return employeeame;
	}

	public void setemployeeame(String employeeame) {
		this.employeeame = employeeame;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	/*Comparator for sorting the list by Employee Name*/
	public static Comparator<Employee> employeeName = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			String employeeName1 = e1.getemployeeame().toUpperCase();
			String employeeName2 = e2.getemployeeame().toUpperCase();
			
			//ascending order
			return employeeName1.compareTo(employeeName2);
			//descending order
			//return employeeName2.compareTo(employeeName1);
		}
	};
	/*Comparator for sorting the list by id no*/
	public static Comparator<Employee> empId = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			
			int id1 = e1.getid();
			int id2 = e2.getid();
			//for ascending order
			return id1-id2;
			//for descending order
			//return id2-id1;
		}
	};

	@Override
	public String toString() {
		return "Student [employeeame=" + employeeame + ", id=" + id + ", age=" + age + "]";
	}
/*
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
    */

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
