package mathematics;

public class RoundOff {
  public static void main(String args[])
  {
   double d1 = 24.9*6.3;
   System.out.println(d1);
   double d2 = 25.01;
   double d3 = -25.01;
  
   long result1 = Math.round(d1);
 
   System.out.println("\nEvaluating double values:");
   System.out.println("Math.round(24.49) is " + result1);   
   System.out.println("Math.round(25.01) is " + Math.round(d2)); 
   System.out.println("Math.round(-25.01) is " + Math.round(d3));
 
   float f1 = 24.49f;
   float f2 = 25.01f;
   float f3 = -25.01f;
 
   int result2 = Math.round(f1);
 
   System.out.println("\nEvaluating float values:");
   System.out.println("Math.round(24.49f) is " + result2);   
   System.out.println("Math.round(25.01f) is " + Math.round(f2));   
   System.out.println("Math.round(-25.01f) is " + Math.round(f3));  
  }
}
