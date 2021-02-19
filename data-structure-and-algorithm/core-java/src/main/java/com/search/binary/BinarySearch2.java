package search.binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		    int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};  
		    int item, location = -1;  
		    int left=0;
		    int right = arr.length - 1;
		    System.out.println("Enter the item which you want to search");  
		    Scanner sc = new Scanner(System.in);  
		    item = sc.nextInt();  
		    location = binarySearch(arr,left,right,item);  
		    if(location != -1)  
		    System.out.println(item+" the location of the array"+Arrays.toString(arr)+" is "+location);  
		    else   
		        System.out.println("Item not found");  
		 
	}
	
	public static int binarySearch(int[] array,int left,int right,int item) {
		
		 int mid;  
		    if(right >= left)   
		    {     
		        mid = (left + right)/2;  
		        if(array[mid] == item)  
		        {  
		            return mid;  
		        }  
		        else if(array[mid] < item)   
		        {  
		            return binarySearch(array,mid+1,right,item);  
		        }  
		        else   
		        {  
		            return binarySearch(array,left,mid-1,item);  
		        }  
		      
		    }  
		    return -1;   
	}
}
/* In Python
 def binarySearch(arr,beg,end,item):
    if end >= beg:
        mid = int((beg+end)/2)
        if arr[mid] == item:
            return mid
        elif arr[mid] < item:
            return binarySearch(arr,mid+1,end,item)
        else:
            return binarySearch(arr,beg,mid-1,item)
        return -1

arr=[16, 19, 20, 23, 45, 56, 78, 90, 96, 100];
item = int(input("Enter the item which you want to search ?"))
location = -1;
location = binarySearch(arr,0,9,item);
if location != -1:
    print("Item found at location %d" %(location))
else:
    print("Item not found")

 */ 
