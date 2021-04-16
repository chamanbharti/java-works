package com.interview;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		/*
		m.m1(10,10);//int,int
		m.m1(10,10);//int,Integer
		m.m1(10,10);//Integer,Integer
		 */		
		/*
		    m.m1(10,10l);//int,Long
			m.m1(10,10L);//int,Long
		 */	
		 m.m1(10, 10f);
		 m.m1(10, 10F);
		 m.m1(10f, 10);
		/*m.m1(10,10d);//int,Double
		m.m1(10,10D);//int,Double
		m.m1(10,10.0);//int,Double
		m.m1(10.0,10);//int,Double
*/		
		
	}
	/*private void m1(int a,int b){
		//System.out.println("int a,int b "+a+b);//int a,int b 1010
		System.out.println("int a,int b "+(a+b));//int a,int b 20
	}*/
	/*private void m1(int a,Integer b){
		System.out.println("int a,Integer b "+a+b);//int a,int b 1010
		System.out.println("int a,Integer b "+(a+b));//int a,int b 20
	}*/
	/*private void m1(Integer a,Integer b){
		System.out.println("int a,Integer b "+a+b);//int a,int b 1010
		System.out.println("int a,Integer b "+(a+b));//int a,int b 20
	}*/
	/*private void m1(int a,Long b){
		System.out.println("int a,Long b "+(a+b));//int a,Long b 20
	}*/
	private void m1(int a,Float b){
		System.out.println("int a,Float b "+(a+b));//int a,Float b 20.0
	}
	private void m1(Float a,int b){
		System.out.println("int a,Float b "+(a+b));//int a,Float b 20.0
	}
	/*private void m1(int a,Double b){
		System.out.println("int a,Double b "+(a+b));//int a,Double b 20
	}*/
	/*private void m1(Double b,int a){
		System.out.println("Double b,int a "+(a+b));//int a,Double b 20
	}*/
}
