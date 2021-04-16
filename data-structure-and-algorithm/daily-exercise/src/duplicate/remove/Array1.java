package duplicate.remove;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		 
		int[] a = {1,20,20,1,30,44,45};
		Arrays.sort(a);
		int n = a.length;
		n=removeDuplicate(a,n);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static int removeDuplicate(int[]a ,int n) {
		if( n == 0 || n == 1) {
			return n;
		}
		int[] b = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i] != a[i+1]) {
				b[j++]=a[i];
			}
		}
		b[j++]=a[n-1];
		//changing the original array
		for(int i=0;i<j;i++) {
			a[i]=b[i];
		}
		return j;
	}
	
}
