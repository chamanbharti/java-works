package com.set.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Chaman", 28));
		al.add(new Student(102, "Vandita", 34));
		al.add(new Student(105,"Jai",21));  
		
		Collections.sort(al);
		for(Student st:al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
