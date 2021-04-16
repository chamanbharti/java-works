package com.string;

public class SortString3 {
	 public static void main(String[] args)
	    {
		 String[] names = {"joe", "slim", "ed", "george"};
         sortStringExchange(names);
         for ( int i=0;i<4;i++)
            System.out.print(names[i]+" ");
	    }
	 	//Exchange Sort:
	private static void sortStringExchange(String[] x) {
		 int i,j;
        // boolean flag = true;  // will determine when the sort is finished
         String temp;

       for(i=0;i<x.length;i++)
        {
          for(j=i+1;j<x.length;j++)    
             {
              if ( x [ i ].compareToIgnoreCase( x [ j ] ) < 0 )// descending sort 
        	 // if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )// ascending sort
                       {           
                                   temp = x [ i ];
                                   x [ i ] = x [ j];  // swapping
                                   x [ j] = temp; 
                                   //flag = true;
                        } 
                } 
         } 
   } 
		
}
