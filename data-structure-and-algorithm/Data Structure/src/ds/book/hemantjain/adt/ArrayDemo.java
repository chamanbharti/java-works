package ds.book.hemantjain.adt;

public class ArrayDemo {
	
public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = i;
		}
		System.out.println(arr);
		System.out.println(arr.toString());
		
		for(int j=0;j<10;j++) {
			System.out.println(arr[j]);
		}
	}

	/*public static void main(String[] args) {
		int[] arr = new int[10];
		int i=1;
		for(;i<10;i++) {
			arr[i] = i;
		}
		
		for(int j=1;j<10;j++) {
			System.out.println(arr[j]);
		}
	}*/
}
