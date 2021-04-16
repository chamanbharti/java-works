package exception.durga;

public class ExceptionIntroduction {

	public static void main(String[] args) {
		
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
		
	}

	private static void doMoreStuff() {
		System.out.println(10/0);
		
	}

}
/*
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
