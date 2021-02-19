package com.array;

import java.util.ArrayList;
import java.util.Scanner;
//Find the Missing Number in the List
public class MissingNoInArray2{
	
	public static void main(String[] args){
		
		int arr[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" element in array");
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
			int j = arr[0];
			
    		ArrayList<Integer>al = new ArrayList<Integer>();
    		for(int i=0;i<n;i++){
    			if(j == arr[i]){
    				
    				j++;
    				//continue;
    			}else{
    				al.add(j);
    				i--;
    				j++;
    			}
    		}
		System.out.println("Missing No is: ");
		
		for(int ar:al){
			System.out.println(""+ar);
		}
		
	}
	
}
