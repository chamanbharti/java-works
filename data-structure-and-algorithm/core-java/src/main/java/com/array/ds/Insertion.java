package array.ds;

public class Insertion {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		int item=10,k=3,n=5;
		int i=0,j=n;
		
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=8;
		
		System.out.println("befor insert array");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		n = n+1;
		while(j>=k) {
 			a[j+1]=a[j];
			j=j-1;
		}
		a[k]=item;
		
		System.out.println("after insert array");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
