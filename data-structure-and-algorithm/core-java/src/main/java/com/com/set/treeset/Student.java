package com.set.treeset;

public class Student implements Comparable<Student>{
	
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	public int compareTo(Student st){
		
		//ascending order
		/*if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;*/
		
		//descending order
		if(age == st.age)
			return 0;
		else if(age < st.age)
			return 1;
		else
			return -1;
	}
}
