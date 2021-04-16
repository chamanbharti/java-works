package design_pattern.creational.singleton;

import java.lang.reflect.Constructor;
class Employee{
	
	private static Employee e;
	private Employee(){
		if(e != null) {
			throw new RuntimeException("get your object by getInstance()");//it breaks reflection
		}
	}
	
	public static Employee getInstance(){
		if(e == null) {
			e = new Employee();
		}
		return e;
	}
}
/*
class Employee{
	
	//private Employee(){}// 2nd object creation possible through reflection
	private Employee(){
		throw new RuntimeException("get your object by getInstance()");//it breaks reflection
	}
	
	private static class Helper{
		private static Employee e=new Employee();
	}
	public static Employee getInstance(){
		return Helper.e;
	}
}
*/

public class Singleton7 {
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
