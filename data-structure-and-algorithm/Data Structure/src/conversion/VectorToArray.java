package conversion;

import java.util.Vector;

//https://beginnersbook.com/2014/07/how-to-convert-vector-to-string-array-in-java/
public class VectorToArray {

	 public static void main(String[] args) {
		 
	     // Creating a Vector of String elements
	     Vector<String> vector = new Vector<String>();
	 
	     // Add elements to Vector
	     vector.add("Item1");
	     vector.add("Item2");
	     vector.add("Item3");
	     vector.add("Item4");
	     vector.add("Item5");
	     vector.add("Item6");
	 
	    //Converting Vector to String Array
	    String[] array = vector.toArray(new String[vector.size()]);
	 
	    //Displaying Array Elements
	    System.out.println("String Array Elements :");
	    for(int i=0; i < array.length ; i++){
	       System.out.println(array[i]);
	    }
	  }
}
