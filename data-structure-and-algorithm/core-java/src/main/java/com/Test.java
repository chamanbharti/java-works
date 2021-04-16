package com;

public class Test {
	public static void main(String[] args) {
		//         i j
		int[] a = {3,1,2,3,5,7};
		print(a);//C=1,h=1,a=2,m=1,n=1
	}

	private static void print(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j>=i;i++) {
				if(a[j]<a[i]) {
					int temp = a[i];
					a[i] = a[j+1];
					temp = a[i];
					System.out.println(temp);
				}
			}
		}
	}
}
