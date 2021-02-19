package array.ds;

public class Sorting {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		int n=5;
		a[0]=1;
		a[1]=30;
		a[2]=50;
		a[3]=17;
		a[4]=8;
		
		System.out.println("before sort array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		*/

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//if(a[i]<a[j]) {//ascending order
				if(a[i]>a[j]) {//descending order
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nafter sort array");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
