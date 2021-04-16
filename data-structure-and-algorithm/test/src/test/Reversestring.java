package test;

public class Reversestring {

     public static void main(String []args){
        //System.out.println("Hello World");
    
    /*
Write a function that reverses a string. The input string is given array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
    
    */
    // String[] input = {"h","e","l","l","o"};
    //String[] a = new String[input.length];
    String input = "hello";
    String rev = "";
    for(int i=input.length()-1;i>=0;i--){
       // a[i] = input[i];
       rev = rev + input.charAt(i);
    }
    System.out.println(rev);
        
     }
      
}