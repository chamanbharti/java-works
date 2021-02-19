package com.oops.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizedDemo {

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		Student test=new Student("Chaman",10,"Bharti");
	
		FileOutputStream fos = new FileOutputStream("external.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);
		
		//deserialization
		FileInputStream fis = new FileInputStream("external.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student test2 = (Student)ois.readObject();
		System.out.println(test2.getId()+","+test2.getName()+","+test2.getTemp());
	}
}
