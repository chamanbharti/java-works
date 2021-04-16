package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {
		//Constructing an arraylist
		ArrayList<String> listWithDuplicateElements = new ArrayList<>();
		
		listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
        System.out.println(listWithDuplicateElements);
        
        //Constructing a hashset
        //HashSet<String>hs = new HashSet<>(listWithDuplicateElements);
       // System.out.println(hs);
        LinkedHashSet<String>hs = new LinkedHashSet<>(listWithDuplicateElements);
        ArrayList<String> listWithDuplicateElements2 = new ArrayList<>(hs);
        System.out.println(hs);
        
	}

}
