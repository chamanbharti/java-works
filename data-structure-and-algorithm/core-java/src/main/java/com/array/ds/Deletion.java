package array.ds;

public class Deletion {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		int k=3,n=5;
		int i=0,j=n;
		
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=8;
		
		System.out.println("befor deletion array");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		j=k;
		while(j<n) {
 			a[j-1]=a[j];
			j=j+1;
		}
		n = n-1;
		System.out.println("after deletion array");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
