package com.java9.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionFactoryMethods {

	public static void main(String[] args) {
		
		//prior to 9
		List<String> list = new ArrayList<>();  
        list.add("SVN");  
        list.add("Git");  
        list.add("GitHub");  
        list.add("Docker");  
        list.add("Kubernates");  
        for(String l : list){  
            System.out.println(l);  
        }  
        //using 9 factory method for collection special type of static method that are created to create unmodifiable instances of collection
        //it means we can use these methods to create list,set & map of small number of elements
        //it is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException
        List<String>list2 = List.of("SVN","Git","GitHub","Docker","Kubernates");
        for(String l : list2){  
            System.out.println(l);  
        } 
	}
}
