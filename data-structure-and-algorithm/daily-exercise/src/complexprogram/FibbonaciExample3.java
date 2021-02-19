package complexprogram;

public class FibbonaciExample3 {
	public static void main(String[] args)  
	 {  
	  System.out.println("Printing Fibonacci series:");  
	  // first two number of series  
	  int prev=0,next=1;  
	  //printing first two elements  
	  System.out.print(prev+" "+next);  
	  //number of elements to be printed  
	  int numberOfElements=10;  
	  int sum=0;  
	  for(int i=2;i<numberOfElements;i++)  
	  {  
	   sum=prev+next;  
	   System.out.print(" "+sum);  
	   prev=next;  
	   next=sum;  
	  }  
	 }  

}
