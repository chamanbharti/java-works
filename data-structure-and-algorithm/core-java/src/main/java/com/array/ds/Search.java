package array.ds;

public class Search {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,8};
		int item=5,n=5;
		
		System.out.println("befor search array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		/*int j=0;
		while(j<n) {
 			if(a[j]==item) {
 				break;	
 			}
 			j = j + 1;
		}*/
		linearSearch(a,n,item);
		
	}
	static void linearSearch(int a[],int n,int item) {

		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==item)
				index=i;
				break;
		}
		System.out.println("\nFound element "+item+" at position:"+index);
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
	}
}
