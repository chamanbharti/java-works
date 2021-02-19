package search.linear;

import java.util.Scanner;

public class LinearSearch1 {

	public static void main(String[] args) {
		
		 int[] array = {10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19}; 
		 int item;
		 boolean flag = false;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter no to search");
		 item = input.nextInt();
		 
		 int i;
		 //search logic
		 for(i=0;i<array.length;i++) {
			 if(array[i] == item) {
				 flag = true;
				 break;
			 }else {
				 flag = false;
			 }
		 }
		 
		 if(flag) {
		 System.out.println("Item "+item+" founded at "+i+" index of array");
		 }else {
			 System.out.println("Item not found");
		 }
	}
}
/* In Python
 arr = [10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19];  
item = int(input("Enter the item which you want to search "));  
for i in range (0,len(arr)):  
    if arr[i] == item:  
        flag = i+1;  
        break;  
    else:   
        flag = 0;   
if flag != 0:   
    print("Item found at location %d" % i);  
else :   
    print("Item not found"); 
*/