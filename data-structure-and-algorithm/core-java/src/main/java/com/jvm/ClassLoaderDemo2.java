package com.jvm;
/**
 * For every loaded .class file, only one class Class object will be created by jvm, 
 * even though we are using that class multiple times in our program
 * @author Chaman.Bharti
 *
 */
public class ClassLoaderDemo2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Class c1 = s1.getClass();
		System.out.println("s1:"+s1.hashCode());
		System.out.println("c1:"+s1.hashCode());
		
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println("s2:"+s2.hashCode());
		System.out.println("c2"+s2.hashCode());
	}
}
