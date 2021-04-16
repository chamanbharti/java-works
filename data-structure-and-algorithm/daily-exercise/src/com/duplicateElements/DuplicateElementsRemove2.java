package com.duplicateElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//http://javaconceptoftheday.com/remove-duplicate-elements-array-java/
//How To Remove Duplicate Elements From An Array In Java?
//How To Remove Duplicate Elements From An Array In Java With Using Collection API?
public class DuplicateElementsRemove2 
{   
    static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("Array With Duplicates : ");
        for(int i=0;i<arrayWithDuplicates.length;i++){
        	System.out.print(arrayWithDuplicates[i]+"\t");
        }
        //Use HashSet if you don't want to insertion order
        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arrayWithDuplicates.length;i++){
        	set.add(arrayWithDuplicates[i]);
        }
        
        //Converting set into an array
        Object[] arrayWithoutDuplicates = set.toArray();
        //printing arrayWithoutDuplicates
        System.out.println();
        
        System.out.println("Array Without Duplicates : ");
        for(int i=0;i<arrayWithoutDuplicates.length;i++){
        	System.out.print(arrayWithoutDuplicates[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("==============================");
    }
     
    public static void main(String[] args) 
    {        
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
         
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
         
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }    
}
