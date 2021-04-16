package com.interview.overriding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee { 
    int employeeId;
    String employeeName;
    double salary;
 
    public Employee(int employeeId, String employeeName, double salary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
 
    public Employee(String employeeName, int employeeId) {
    	 this.employeeId = employeeId;
         this.employeeName = employeeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
       this.salary = salary;
    }

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
class Manager extends Employee{
	 
    public static final double BONUSPERCENT=0.2;
    public Manager(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }
    public double getSalary() {
        return salary+salary*BONUSPERCENT;
    }
}
class Developer extends Employee{ 
    public static final double BONUSPERCENT=0.1;
 
    public Developer(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);        
    }
 
    public double getSalary() {
 
        return salary+salary*BONUSPERCENT;
    }
}
public class Overriding2 {

	public static void main(String[] args) {
//		Developer d1=new Developer(1,"Arpit" ,20000);
//        Developer d2=new Developer(2,"John" ,15000);
//        Manager m1=new Manager(1,"Amit" ,30000);
//        Manager m2=new Manager(2,"Ashwin" ,50000);
// 
//        System.out.println("Name of Employee:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
//        System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
//        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
//        System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
		
//		Employee emp1=new Employee("Martin",27);
//		Map<Employee,String> hm=new HashMap<Employee,String>();
//		hm.put(emp1, "Verified");
//		emp1.setName("John");
//		System.out.println(hm.get(emp1));
		
		// HashMap with Country as key and capital as value
				HashMap<String,String> map=new HashMap<String,String>();
				map.put("India","Delhi");
				map.put("Japan","Tokyo");
				map.put("France","Paris");
				map.put("Russia","Moscow");
		 
				
				// Iterating java iterator
				System.out.println("Iterating java Iterator");
				Iterator<String> countryKeySetIterator=map.keySet().iterator();
				while(countryKeySetIterator.hasNext()){
					String countryKey=countryKeySetIterator.next();
					map.put("Nepal", "KathMandu");
					System.out.println(countryKey);
		 
				}
				System.out.println("-----------------------------");
			}

}
