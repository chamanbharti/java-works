package com.oops.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Reciever {

	public static void main(String[] args) throws Exception {
		ObjectInputStream out = new ObjectInputStream(new FileInputStream("b.txt"));
		Message msg = (Message)out.readObject();
		out.close();
		System.out.println(msg.mobile+" "+msg.phone);
	}
}
