package exception;

public class ExceptionIntroduction3 {

	public static void main(String[] args) {
		
		doStuff();
		System.out.println(10/0);
		
	}

	private static void doStuff() {
		doMoreStuff();
		
		
	}

	private static void doMoreStuff() {
		System.out.println("Hello");
		
	}

}
/*
 * inside a method if exception occurs is responsible to create exception object
 * jvm hand over exception to default exception handler if exception is not handled
 * Name of exception
 * Description of exception
 * Location at which exception occurs
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at durga.ExceptionIntroduction2.doMoreStuff(ExceptionIntroduction2.java:28)
	at durga.ExceptionIntroduction2.doStuff(ExceptionIntroduction2.java:17)
	at durga.ExceptionIntroduction2.main(ExceptionIntroduction2.java:7)
	
 	|				|
	|-------------- |				
	| doMoreStuff()	|
	|-------------- |				
	|	doStuff()	|
	|-------------- |
	|	main()		|---> Activation Record/Stack Frame
	|---------------|
     Runtime Stack for main thread
     
     Note: JVM creates a runtime stack for every thread.
     
      when we run above program in internally jvm creat runtime stack like below
      
      
   |			|
   |			|
   |			|====>
   |			|
   |			|
   --------------
   Runtime Stack for main thread
   
	Now call push into stack
	---------------------------
	|				|
	|				|				
	| 				|
	|				|====>				
	|	 	        |     
	|-------------- |
	|	main()		| Stack Frame/Activation Record
	|---------------|
	
		
	|-------------- |			
	|	doStuff()	| Stack Frame/Activation Record    
	|-------------- |====>	
	|	main()		|Stack Frame/Activation Record
	|---------------|
	
	|				|
	|-------------- |				
	| doMoreStuff()	| Stack Frame/Activation Record
	|-------------- |====>				
	|	doStuff()	| Stack Frame/Activation Record   
	|-------------- |
	|	main()		| Stack Frame/Activation Record
	|---------------|
	
	Now call pop from stack
	---------------------------
	
	|				|
	|	 			|				
	| 				|
	|-------------- |====>				
	|	doStuff()	|     
	|-------------- |
	|	main()		|
	|---------------|
	
	|				|
	|	 			|				
	| 				|
	|				|====>				
	|				|     
	|-------------- |
	|	main()		|
	|---------------|
	
		
	|	 			|				
	| 				|
	|				|			
	|				|     
	| 				|
	|				|
	|---------------|
 	This empty stack will be destroyed by jvm		
 */
