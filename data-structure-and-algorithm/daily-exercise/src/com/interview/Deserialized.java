package com.interview;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialized {
	private static final long serialversionId = 3L;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("txt.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student)ois.readObject();
		System.out.println("Roll No: "+s.rollNo+"\nName:"+s.name);
	}

}
