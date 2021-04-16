package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpression8 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
					
				}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			//throw new RuntimeException();
		}
	}
}
