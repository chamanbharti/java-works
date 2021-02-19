package com.newfeatures;

interface Interf{
	public void m1();
}
/*class Demo implements Interf{

	@Override
	public void m1() {
		System.out.println("Hello...");
		
	}
	
}*/
public class LambdaExpression1 {

	public static void main(String[] args) {
		/*Demo d = new Demo();
		d.m1();*/
		/*Interf i = new Demo();
		i.m1();*/
		Interf i = ()->System.out.println("Hello.... implemented By Lambda Expression");
		//i.m1();
		//i.m1();
	}
}
