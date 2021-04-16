package com.oops.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialized1 {
private static final long serialVersionUID=5L;
	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		Person s = (Person)in.readObject();
		s.course="abc";
		System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
		
		in.close();
	}
}
