package com.interview;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{
	String name;
	int rollNo;
	
	public Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		
		if(this == o){
			return true;
		}
		if(getClass()!=o.getClass()){
			return false;
		}
		if(o instanceof Student){
			Student s= (Student)o;
			
			//step 1
			//return this.rollNo == s.rollNo;//by rollno
			//return this.getRollNo() == s.getRollNo();//by rollno
			//return this.getName() == s.getName();//by name
			//return this.getClass() == s.getClass();
			//return true;
			
			//step 2
			return rollNo==s.rollNo && Objects.equals(name, s.name);
		}
		else
			return false;
		//Student s = (Student)o;
		//return this.getRollNo()==s.rollNo;
		
	}
	public int hashCode(){
		/*final int prime=31;
		int result=0;
		result = result * prime + getRollNo();
		return result;*/
		return Objects.hash(rollNo,name);
	}

}
