package com.ArrayList.exercise;
import java.util.*;
class ArrayListDemo4
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Chaman",24);
		Student s2=new Student(102,"Rahi",27);
		Student s3=new Student(103,"Sahil",23);
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
