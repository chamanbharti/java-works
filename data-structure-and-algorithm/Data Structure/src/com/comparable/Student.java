package com.comparable;

import java.util.Comparator;


public class Student implements Comparator<Student>{
	int rollno;  
	String name;  
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object obj){
		Student st=(Student)obj;
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		
		return -1;
	}
	public static Comparator<Student> nameSort = new Comparator<Student>() {
		
			 public int Compare(Student name1,Student name2){  
					Student s1=name1;  
					Student s2=name2;  
					  
					return s1.name.compareTo(s2.name); 
		}

	};
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
