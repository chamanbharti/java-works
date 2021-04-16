package creational.prototype;

import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emps = new Employee();
		emps.loadData();
		//Use the clone method to get the Employee object
		Employee emp1 = (Employee)emps.clone();
		Employee emp2 = (Employee)emps.clone();
		
		List<String>list = emp1.getEmpList();
		list.add("John");
		List<String>list1 = emp2.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("emp1 List: "+list);
		System.out.println("emp2 List: "+list1);
		
	}

}
