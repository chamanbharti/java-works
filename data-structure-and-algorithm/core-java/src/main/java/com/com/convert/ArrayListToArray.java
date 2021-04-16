package com.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//http://viralpatel.net/blogs/convert-arraylist-to-arrays-in-java/
public class ArrayListToArray {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("Switzerland");
		list.add("Italy");
		list.add("France");
		
		//method I
		//String[] countries = list.toArray(new String[list.size()]);
		//System.out.println("Array: "+countries);//Array: [Ljava.lang.String;@15db9742
		//System.out.println("Array: "+Arrays.toString(countries));//Array: [India, Switzerland, Italy, France]
		//method II
		/*ArrayList to Array Conversion */
		String[] countries = new String[list.size()];
		for(int i=0;i<list.size();i++){
			countries[i] = list.get(i);
		}
		for(String obj:countries){
			System.out.println(obj);
		}
		
		/*
So to convert ArrayList of any class into array use following code. 
Convert T into the class whose arrays you want to create.

List<T> list = new ArrayList<T>();
	
T [] countries = list.toArray(new T[list.size()]);
		 */
	}

}
