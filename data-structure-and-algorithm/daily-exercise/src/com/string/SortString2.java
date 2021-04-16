package com.string;

public class SortString2 {
	 public static void main(String[] args)
	    {
		 String[] names = {"joe", "slim", "ed", "george"};
         sortStringBubble (names);
         for ( int i=0;i<names.length;i++)
            System.out.print(names[i]+" ");
	    }

	private static void sortStringBubble(String[] x) {
		 int j;
         boolean flag = true;  // will determine when the sort is finished
         String temp;

         while ( flag )
         {
               flag = false;
               for ( j = 0;  j < x.length - 1;  j++ )
               {
                      // if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) < 0 )//descending sort
            	   if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 ) // ascending sort
                       {                                   
                                   temp = x [ j ];
                                   x [ j ] = x [ j+1];     // swapping
                                   x [ j+1] = temp; 
                                   flag = true;
                        } 
                } 
         } 
   } 
		
}
