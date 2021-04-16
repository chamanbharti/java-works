package array.ds;

public class Update {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,8};
		int item=5,n=5;
		int k=4;
		
		System.out.println("befor search array");
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
			a[k-1]=item;
		
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
