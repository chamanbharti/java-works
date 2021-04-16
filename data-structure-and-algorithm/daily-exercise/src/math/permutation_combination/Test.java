package math.permutation_combination;

import java.sql.Date;

final class Student{
	 final int id;
	 final String name;
	
	private Student(final int id,final String name){
		this.id=id;
		this.name=name;
	}
	
	public static Student createObject(int id,String name) {
		return new Student(id,name);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "ID:"+id+", Name:"+name;
	}
}
public class Test {

	public static void main(String[] args) {
		
		//Student s = new Student(1,"chaman");
		Student s = Student.createObject(1, "chaman");
		System.out.println("Before change value");
		System.out.println(s.getId()+","+s.getName());
		
		changValue(s.getId(),s.getName());
		System.out.println(s.getId()+","+s.getName());
		/*Student s = Student.createObject(1, "chaman");
		System.out.println("Before change value");
		System.out.println(s.getId()+","+s.getName());
		
		changValue(s.getId(),s.getName());
		System.out.println(s.getId()+","+s.getName());*/
	}
	
	private static void changValue(int id,String name) {
		id=2;
		name="bharti";
	}
}
