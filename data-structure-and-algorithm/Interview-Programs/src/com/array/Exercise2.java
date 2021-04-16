package com.array;

public class Exercise2 {

	public static void main(String[] args) {
		
		Object [] stringArray = new String[5];
		//No compile time error : String[] is auto-upcasted to Object[]
		stringArray[1] = "Java Technocracy";
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		stringArray[2]=100;
		//No compile time error, 
		//but this statement will throw java.lang.ArrayStoreException at run time
        
        //because we are inserting integer element into an array of strings
		System.out.println(stringArray[2]);

	}

}
