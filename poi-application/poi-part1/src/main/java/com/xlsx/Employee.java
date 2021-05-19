package com.xlsx;

public class Employee {

	public String Name, Age, Company, Salary;
	  
    public Employee(String name, String age, 
                String company, String salary)
    {
        super();
        Name = name;
        Age = age;
        Company = company;
        Salary = salary;
    }
  
    @Override
    public String toString()
    {
       return "Employee [Name=" + Name + ", Age=" + Age + ", Company=" + Company + ", Salary=" + Salary + "]";
    }
}
