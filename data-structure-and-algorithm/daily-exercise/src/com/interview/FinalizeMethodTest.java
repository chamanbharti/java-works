package com.interview;

public class FinalizeMethodTest {

	public static void main(String[] args) throws Throwable {
		
		//String s = new String("Chaman");
		/*FinalizeMethodTest s = new FinalizeMethodTest();
		s=null;
		System.gc();
		System.out.println("End Of Main");*/
		
		FinalizeMethodTest s = new FinalizeMethodTest();
		s.finalize();
		s.finalize();
		s=null;
		System.gc();
		System.out.println("End Of Main");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
}
