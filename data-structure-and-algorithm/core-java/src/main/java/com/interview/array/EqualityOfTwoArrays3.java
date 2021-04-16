package com.array;

import java.util.Arrays;

public class EqualityOfTwoArrays3 {
	public static void main(String[] args) {
		
		String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
		 
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
        
        /*Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2));        //Output : true
        if(Arrays.equals(s1,s2)){
			System.out.println("s1 and s2 Arrays Are Equals");
		}
		else{
			System.out.println("s1 and s2 Arrays Are not Equals");
		}*/
      
        sortBubble1(s1);
        for(int i=0;i<s1.length;i++){
        	System.out.print(s1[i]+" ");
        }
        System.out.println();
        sortBubble2(s2);
        for(int i=0;i<s2.length;i++){
        	System.out.print(s2[i]+" ");
        }
        System.out.println();
        
        if(Arrays.equals(s1,s2)){
			System.out.println("s1 and s2 Arrays Are Equals");
		}
		else{
			System.out.println("s1 and s2 Arrays Are not Equals");
		}
        
	}
	 public static void sortBubble1( String  x [ ] )
     {
           int j;
           boolean flag = true;  // will determine when the sort is finished
           String temp;

           while ( flag )
           {
                 flag = false;
                 for ( j = 0;  j < x.length - 1;  j++ )
                 {
                         if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                         {      // ascending sort
                                temp = x [ j ];
                                x [ j ] = x [ j+1]; // swapping
                                x [ j+1] = temp; 
                                flag = true;
                          } 
                  } 
           } 
     } 
	 
	 public static void sortBubble2( String  x [ ] )
     {
           int j;
           boolean flag = true;  // will determine when the sort is finished
           String temp;

           while ( flag )
           {
                 flag = false;
                 for ( j = 0;  j < x.length - 1;  j++ )
                 {
                         if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                         {      // ascending sort
                                temp = x [ j ];
                                x [ j ] = x [ j+1]; // swapping
                                x [ j+1] = temp; 
                                flag = true;
                          } 
                  } 
           } 
     }

}
