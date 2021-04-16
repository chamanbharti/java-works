package array;

public class Array4 {

	public static void main(String[] args) {
		
		printArray(new int[] {10,20,70,30,90,52});
	}
	static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
