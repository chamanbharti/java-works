package com.oops.waysOfCreateObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int id = 101;
	public Student() {
		System.out.println("Student constructor");
	}
	@Override
	public String toString() {
		return "id:"+id;
	}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class CreateObject5Ways {

	public static void main(String[] args) {
		
		// step I
		System.out.println("***1. creating object by new keyword**");
		Student s1 = new Student();
		//printing the object reference
		System.out.println(s1);
		//calling student class properties
		s1.id=202;
		System.out.println(s1);

		// step II-a using java.lang.Class
		System.out.println("***2. creating object by java.lang.Class.newInstance() of class Class**");
			try {
				Student s2 = (Student)Class.forName("com.oops.waysOfCreateObject.Student").newInstance();
				//printing the object reference
				System.out.println(s2);
				//calling student class properties
				s2.id=202;
				System.out.println(s2);
			}
			catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			  e.printStackTrace();
			}
			
			// step II-b using java.lang.reflect.Constructor
			System.out.println("***3. creating object by java.lang.reflect.Constructor.newInstance()**");
			try {
				Constructor<Student> constructor = Student.class.getConstructor();
				try {
					Student s3 = constructor.newInstance();
					//printing the object reference
					System.out.println(s3);
					//calling student class properties
					s3.id=202;
					System.out.println(s3);
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("***4. creating object by Object class clone()**");
			try {
				Student s4 = (Student)s1.clone();
				//printing the object reference
				System.out.println(s4);
				//calling student class properties
				s4.id=202;
				System.out.println(s4);
				
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
			System.out.println("***5. creating object by Deserialization**");
			//serialization
				try {
					FileOutputStream fos = new FileOutputStream("test.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					Student s4 = new Student();
					oos.writeObject(s4);
					
					//deserialization
					FileInputStream fis = new FileInputStream("test.txt");
					ObjectInputStream ois = new ObjectInputStream(fis);
					Student s5 = (Student)ois.readObject();
					oos.writeObject(s4);
					
					//printing the object reference
					System.out.println(s5);
					//calling student class properties
					s5.id=202;
					System.out.println(s5);
				} catch (IOException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
}
