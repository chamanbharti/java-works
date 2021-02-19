package com.oops.thread;

public class TestGarbage {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		TestGarbage t1 = new TestGarbage();
		TestGarbage t2 = new TestGarbage();
		t1=null;
		t2=null;
		//System.gc();
		Runtime r = Runtime.getRuntime();
		r.gc();
	}
}
