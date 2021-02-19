package ds.sorting.bubble;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] a = {1,7,3,9,23,77,33,99,30};
		int[] b = bubbleSort(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

	private static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;i++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
