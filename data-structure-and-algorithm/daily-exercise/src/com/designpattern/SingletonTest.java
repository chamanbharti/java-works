package com.designpattern;
class Parent extends Thread{
	@Override
	public void run() {
		Student s= Student.getInstance();
		//Student ss= Student.getInstance();
		System.out.println(s.hashCode());
		//System.out.println(ss.hashCode());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Child extends Thread{
	@Override
	public void run() {
		Student s= Student.getInstance();
		System.out.println(s.hashCode());
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Thread1 extends Thread{
	@Override
	public void run() {
		Student s= Student.getInstance();
		//Student ss= Student.getInstance();
		System.out.println(s.hashCode());
		//System.out.println(ss.hashCode());
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		Student s= Student.getInstance();
		System.out.println(s.hashCode());
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		p.start();
		c.start();
		t1.start();
		t2.start();
	}
}
