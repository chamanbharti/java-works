package com.oops.thread;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total memory:"+r.totalMemory());
		System.out.println("Free memory:"+r.freeMemory());
		
		for(int i=0;i<10000;i++) {
			new RuntimeTest();
		}
		System.out.println("after creating 10000 instance free memory:"+r.freeMemory());
		System.gc();
		System.out.println("after gc(), free memory:"+r.freeMemory());
	}
}
