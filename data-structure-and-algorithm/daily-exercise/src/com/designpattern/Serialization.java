package com.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
		Student s1 = Student.getInstance();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("a.txt"));

		out.writeObject(s1);
		out.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		Student s2 = (Student)ois.readObject();
		
		ois.close();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
