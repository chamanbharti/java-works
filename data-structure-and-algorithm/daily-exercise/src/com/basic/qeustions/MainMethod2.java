package com.basic.qeustions;
/*
 Can we declare main() method as private or protected or with no access modifier?

No, main() method must be public. 
You can’t define main() method as private or protected or with no access modifier. 
This is because to make the main() method accessible to JVM. 
If you define main() method other than public, 
compilation will be successful but you will get run time error as no main method found. 
 */
public class MainMethod2 {
	
	private static void main(String[] args) {
		 //System.out.println("Execution starts from this method");
	}
	

}
