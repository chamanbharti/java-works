package ds.stack;

import java.util.Scanner;

class Stack {

	int top;
	int maxSize = 10;
	int[] arr = new int[maxSize]; 
	
	public Stack() {
		top = -1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(Scanner input) {
		if(top == maxSize-1) {
			System.out.println("Overflow !!");  
			return false;
		}else {
			System.out.println("Enter Value"); 
			int val = input.nextInt();
			top++;
			arr[top] = val;
			System.out.println("Item pushed"); 
			return true;
		}
	}
	
   boolean pop() {
	   if(top == -1) {
		   System.out.println("Underflow !!");  
           return false;  
	   }else {
		   top--;
		   System.out.println("Item popped");  
           return true; 
	   }
   }
    void display() {
    	 System.out.println("Printing stack elements .....");  
    	 for(int i=top;i>=0;i++) {
    		 System.out.println(arr[i]);
    	 }
    }
}

public class CustomStack{
	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack();
		System.out.println("*********Stack operations using array*********\n");  
	    System.out.println("\n------------------------------------------------\n");
	    
	    while(choice != 4) {
	    	
	    	 System.out.println("\nChose one from the below options...\n");  
	         System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
	         System.out.println("\n Enter your choice \n");   
	         
	         choice = input.nextInt();
	         
	         switch (choice) {
	         case 1:  
	            {   
	                stack.push(input);  
	                break;  
	            }  
	            case 2:  
	            {  
	                stack.pop();  
	                break;  
	            }  
	            case 3:  
	            {  
	                stack.display();  
	                break;  
	            }  
	            case 4:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            } 
	    }
	}
  }
}
