package com.newfeatures;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

interface C{
	void m1();
	void m2();
}
public class LambdaExpression9 {

	public static void main(String[] args) {
		
		C a = new C(){
			
				public void m1() {
					System.out.println("m1()");
				}
				public void m2() {
					System.out.println("m2()");
				}
		};
		
			
		a.m1();
		a.m2();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			//throw new RuntimeException();
		}
	}
}
