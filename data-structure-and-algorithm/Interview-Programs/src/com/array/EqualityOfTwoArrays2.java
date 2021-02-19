package com.array;

import java.util.Arrays;

public class EqualityOfTwoArrays2 {
	public static void main(String[] args) {
		
		String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		 
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
 
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
 
        //System.out.println(Arrays.equals(s1, s2));       //Output : false
       // System.out.println(Arrays.equals(s1, s3));      //Output : true
        if(Arrays.equals(s1, s2)){
			System.out.println("s1 and s2 Arrays Are Equals");
			
		}
		else{
			System.out.println("s1 and s2 Arrays Are not Equals");
			 if(Arrays.equals(s1, s3)){
					System.out.println("s1 and s3 Arrays Are Equals");
				}
				else{
					System.out.println("s1 and s3 Arrays Are not Equals");
				}
		}
	}

}
