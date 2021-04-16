package com.hashcode_equal;
public class EqualsHashcodeTest 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(101);
		e2.setId(101);
		
		/*//Prints 'false' because i have not implement equals() method
		System.out.println(e1.equals(e2));*/
		
		//Prints 'true' because i have implemented equals() method
		System.out.println(e1.equals(new Student()));
		
		/*Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		
		//prints two object without implementation of hashCode() method
		//System.out.println(employees);
		//[com.hashcode_equal.Employee@15db9742, com.hashcode_equal.Employee@6d06d69c]
		
		//prints one object
		System.out.println(employees);
		//[com.hashcode_equal.Employee@84]
		 */		
	}
}
