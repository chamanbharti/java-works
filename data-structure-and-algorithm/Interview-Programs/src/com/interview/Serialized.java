package com.interview;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialized {
	private static final long serialversionId = 3L;
	public static void main(String[] args) throws IOException {
		
		Student s = new Student("Chaman", 12);
		FileOutputStream fos = new FileOutputStream("txt.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		System.out.println("serialized: "+s);
	}

}
