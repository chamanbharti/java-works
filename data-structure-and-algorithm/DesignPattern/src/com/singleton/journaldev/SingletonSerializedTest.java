package com.singleton.journaldev;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private Student(){}
	private static class Helper{
		private static final Student obj=new Student();
	}
	public static Student getInstance(){
		return Helper.obj;
	}
	
}
public class SingletonSerializedTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student obj=Student.getInstance();
		//serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println(obj.hashCode());
		oos.close();
		
		//deserailize from file to object
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student obj2=(Student)ois.readObject();
		System.out.println(obj2.hashCode());
		ois.close();
	}
}
