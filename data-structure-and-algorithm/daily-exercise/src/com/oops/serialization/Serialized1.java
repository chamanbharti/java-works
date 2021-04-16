package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Person extends Student{
	String course;
	int fee;
	public Person(int id,String name,String course,int fee) {
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
}
public class Serialized1 {
	private static final long serialVersionUID=8L;
	public static void main(String[] args) throws Exception {
		Person s1 = new Person(211,"Chaman","MCA",9000);
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}
