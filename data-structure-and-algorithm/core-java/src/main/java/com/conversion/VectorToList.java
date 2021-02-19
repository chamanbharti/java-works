package conversion;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

//https://beginnersbook.com/2014/07/java-convert-vector-to-list-example/
public class VectorToList {

	public static void main(String[] args) {
		 
	     // Step1: Creating a Vector of String elements
	     Vector<String> vector = new Vector<String>();
	 
	     // Step2: Populating Vector
	     vector.add("Tim");
	     vector.add("Rock");
	     vector.add("Hulk");
	     vector.add("Rick");
	     vector.add("James");
	 
	    // Step3: Displaying Vector elements
	    System.out.println("Vector Elements :");
	    for (String str : vector){
	       System.out.println(str);
	    }
	 
	    // Step4: Converting Vector to List
	    List<String> list = Collections.list(vector.elements());
	 
	    // Step 5: Displaying List Elements
	    System.out.println("\nList Elements :");
	    for (String str2 : list){
	       System.out.println(str2);
	    }
	 }	
}
