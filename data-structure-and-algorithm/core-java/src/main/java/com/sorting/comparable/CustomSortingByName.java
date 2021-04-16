package com.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSortingByName {

	public static void main(String[] args) {
		
	  ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Viru",55));  
      al.add(new Student("Saurav",23));  
      al.add(new Student("Mukesh",20));  
      al.add(new Student("Tahir",31));
      
      Collections.sort(al);
      for(Student s:al) {
    	  System.out.println("name:"+s.name+", age:"+s.age);
      }
	}
}
