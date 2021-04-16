package com.interview;

class P{
	void m1(int a,Long b){
		System.out.println("P method:"+(a+b));
	}
}
class C extends P{
	void m1(int a,long b){
		System.out.println("C method:"+(a+b));
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		
		//P p=new P();
		//p.m1(10, 10);
		
		//P method:20
		P p=new C();
		p.m1(10, 10l);
		//P method:20
		
	}

}
