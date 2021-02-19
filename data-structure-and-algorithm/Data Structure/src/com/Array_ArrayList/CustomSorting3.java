package com.Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CustomSorting3 {
	
	public static void main(String[] args) {
		HashSet<Student> al = new HashSet<Student>();
		al.add(new Student(223, "Rahi", 30));
		al.add(new Student(224, "Chaman", 27));
		al.add(new Student(225, "Sahil", 24));
		
		Collections.sort(al); 
		for(Student str:al){
			System.out.println(str);
		}
	}

}
