package java11.CollectionToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class CollectionToArrayTest {

	public static void main(String[] args) {
		
		List<String> list = List.of("apple", "banana", "orange");
	    //old methods
		/*
       		<T> T[] toArray(T[] a);
		 */
		/*ArrayList to Array Conversion */
		String array[] = new String[list.size()];  
		for(int j =0;j<list.size();j++){
			  array[j] = list.get(j);
			}
		//String[] array = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(array));
		
		Object[] objects = list.toArray();
		System.out.println(Arrays.toString(objects));
		
		//new method
		/*
		   default <T> T[] toArray(IntFunction<T[]> generator) {
           return toArray(generator.apply(0));
         }
		 */
		String[] array2 = list.toArray(String[]::new);
		System.out.println(Arrays.toString(array2));
		
		/* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

		  /*Adding new elements to the converted List*/
		  citylist.add("New City2");
		  citylist.add("New City3");

		  /*Final ArrayList content display using for*/
		  for (String str: citylist)
		  {
			System.out.println(str);
	       	  }
	}
}
