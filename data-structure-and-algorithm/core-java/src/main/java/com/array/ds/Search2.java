package array.ds;

public class Search2 {
 static int mid;
 static int item;
	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,8};
		int item=7,n=5;
		
		System.out.println("befor search array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		binarySearch(a,item);
		
		
		System.out.println("\nFound element "+item+" at position:"+mid);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static int binarySearch(int[] a,int item) {
		int low=1;
		int n=a.length;
		int high=n-1;
		
		
		while(low<=high) {
			mid=(low+high)/2;
 			if(a[mid]==item) {
 				return mid;
 			}else if(item<a[mid]) {
 				high = mid-1;
 			}
 			else {
 				low = mid+1;
 			}
 			
		}
		return -1;
		
	}
}
