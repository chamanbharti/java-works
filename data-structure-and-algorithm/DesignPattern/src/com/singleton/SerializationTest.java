package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializationTest{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		SerializableClass t1=SerializableClass.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.ser"));
		out.writeObject(t1);
		out.close();
		
		//deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"));
		SerializableClass t2 = (SerializableClass)in.readObject();
		in.close();
		
		System.out.println("t1 ="+t1.hashCode());
		System.out.println("t2 ="+t2.hashCode());
	}
}
