package com.conversion.array2list;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		
		list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JSF");
        
        /*Method - 1 (Using for loop)*/
        System.out.println("ArrayList To Array Elements Approach I");
        String[] array0 = new String[list.size()];
        for(int i=0;i<list.size();i++) {
        	array0[i] = list.get(i);
        }
        for(int i=0;i<array0.length;i++) {
        	System.out.println(array0[i]);
        }
        
        /*Method - 2 (List.toArray())*/
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("ArrayList To Array Elements Approach II");
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
        
        /*Method - 3 Using stream*/
        //String[] array2 = list.stream().toArray(String[]::new); //since java 8
        String[] array2 = list.toArray(String[]::new); //since java 11
        System.out.println("ArrayList To Array Elements Approach III");
        for(int i=0;i<array2.length;i++) {
        	System.out.println(array2[i]);
        }
        
        
	}

}
