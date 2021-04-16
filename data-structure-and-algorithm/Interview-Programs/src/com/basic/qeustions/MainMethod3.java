package com.basic.qeustions;
/*
 Can We Declare main() Method As Non-Static?

No, main() method must be declared as static so that 
JVM can call main() method without instantiating it’s class. 
If you remove ‘static’ from main() method signature, 
compilation will be successful but program fails at run time. 
 */
public class MainMethod3 {
	
	public void main(String[] args) {
		
		 System.out.println(1);
	}
	

}
