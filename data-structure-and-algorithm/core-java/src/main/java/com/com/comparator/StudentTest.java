package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
	int rollno;    
	 String name;    
	 int age;    
	 Student(int rollno,String name,int age){    
	 this.rollno=rollno;    
	 this.name=name;    
	 this.age=age;  
	 }
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
}
class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.name.compareTo(s2.name);
	}
	
}
class SortByAge implements Comparator<Object>{
	public int compare(Object o1,Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));    
		al.add(new Student(106,"Ajay",27));    
		al.add(new Student(105,"Jai",21));  
		al.add(new Student(105,null,20));  
		
		System.out.println("Sorting by Name");  
		//Collections.sort(al, new SortByName());
		
		//using java 8
		//Comparator<Student>sortByName=Comparator.comparing(Student::getName);
		
		//to sort the list of elements that also contains null.
		Comparator<Student>sortByName=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));
		
		Collections.sort(al, sortByName);
		Iterator<Student>itr=al.iterator();
		while(itr.hasNext()) {
			Student student = (Student)itr.next();
			System.out.println(student.rollno+" "+student.name+" "+student.age);
		}
		
		System.out.println("Sorting by Age");  
		//Collections.sort(al, new SortByAge());
		
		//Comparator<Student>sortByAge=Comparator.comparing(Student::getAge);
		//Collections.sort(al, sortByAge);
		
		//to sort the list of elements that also contains null.
		Comparator<Student>sortByAge=Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));
		//Collections.sort(al, Collections.reverseOrder(sortByAge));
		Collections.sort(al, sortByAge);
		
		Iterator<Student>itr2=al.iterator();
		while(itr2.hasNext()) {
			Student student = (Student)itr2.next();
			System.out.println(student.rollno+" "+student.name+" "+student.age);
		}
	}
}
