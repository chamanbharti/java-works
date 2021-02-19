package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
	
	public static void main(String[] args) {
		
//		ArrayList<String> al=new ArrayList<String>(); 
//		al.add("C");  
//		al.add("A");  
//		al.add("B"); 
//		Collections.sort(al);
//		Collections.sort(al,Collections.reverseOrder());
//		
//		Iterator<String> itr=al.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		//to sort Wrapper class objects
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(Integer.valueOf(105));
//		al.add(Integer.valueOf(101));
//		al.add(103);//internally will be converted into objects Integer.valueOf(103)
//		
//		//Collections.sort(al);
//		Collections.sort(al,Collections.reverseOrder());
//		Iterator<Integer>itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//to sort user-defined class objects
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));    
		al.add(new Student(106,"Ajay",27));    
		al.add(new Student(105,"Jai",21));    
	   // Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder()); 
//	    Iterator<Student>itr = al.iterator();
//		while(itr.hasNext()) {
//			Student s = (Student)itr.next();
//			System.out.println(s.name);
//	   }
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
	}

}
class Student implements Comparable<Student>{
	
	int rollno;    
	 String name;    
	 int age;    
	 Student(int rollno,String name,int age){    
	 this.rollno=rollno;    
	 this.name=name;    
	 this.age=age;  
	 }
	 
	public int compareTo(Student s) {
		//sort by name
		//return name.compareTo(s.name);
		
//		//sort by age
//		if(age == s.age) 
//			return 0;
////		else if(age>s.age)  //for ascending order
//			
//		else if(age>s.age) //for descending order
//			return 1;
//		else 
//			return -1;
//		
		
		//sort by rollno
		if(rollno == s.rollno) 
			return 0;
		else if(rollno>s.rollno)  //for ascending order
			return 1;
		else
			return -1;
		
	}
}
