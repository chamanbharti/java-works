package com.oops.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class GrapeSerialization {

	public static void main(String[] args) {
		Grape g = new Grape();
		g.setGrapeName("Green");
		g.setGrapeNumber(2);
		//g.setGrapeCost(50);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("grape.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(g);
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
