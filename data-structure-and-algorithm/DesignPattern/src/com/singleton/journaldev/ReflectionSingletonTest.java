package com.singleton.journaldev;

import java.lang.reflect.Constructor;

class Employee{
	
	private Employee(){}
	
	private static class Helper{
		private static Employee e=new Employee();
	}
	public static Employee getInstance(){
		return Helper.e;
	}
}
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		
		Employee obj1=Employee.getInstance();
		Employee obj2=null;
		try{
			Constructor[] constructors =Employee.class.getDeclaredConstructors();
			for(Constructor constructor:constructors){
				//below code destroy singleton pttern
				constructor.setAccessible(true);
				obj2=(Employee)constructor.newInstance();
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
