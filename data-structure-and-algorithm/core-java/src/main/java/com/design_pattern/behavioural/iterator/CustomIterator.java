package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// https://www.journaldev.com/13460/java-iterator

class Employee {
	  private int empid;
	  private String ename;
	  private String designation;
	  private double salary;
		
	  public Employee(int empid,String ename,String designation,double salary){
		this.empid = empid;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
	  }

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return empid + "\t" + ename + "\t" + designation + "\t" + salary;
	}
	
	  
}

class Employees implements Iterable<Employee> {

	private List<Employee> emps = null;
	public Employees() {
		emps = new ArrayList<>();
		emps.add(new Employee(1001,"Rams","Lead", 250000L));
		emps.add(new Employee(1002,"Posa","Dev", 150000L));
		emps.add(new Employee(1003,"Chinni","QA", 150000L));
	}
	@Override
	public Iterator<Employee> iterator() {
		return emps.iterator();
	}
	
}
public class CustomIterator {

	public static void main(String[] args) {
		
		Employees emps = new Employees();
		for(Employee emp:emps) {
			System.out.println(emp);
		}
	}
}
