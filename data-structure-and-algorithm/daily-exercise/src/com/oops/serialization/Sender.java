package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sender{

	public static void main(String[] args) throws Exception {
		Message msg=new Message();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("b.txt"));
		out.writeObject(msg);
		out.close();
		System.out.println("data sent ");
	}
}
