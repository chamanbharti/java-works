package com.oops.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GrapeDeserialization {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream("grape.ser");
			ois = new ObjectInputStream(fis);
			Grape g = (Grape)ois.readObject();
			System.out.println(g.getGrapeName()+" "+g.getGrapeNumber()+" ");
			ois.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
