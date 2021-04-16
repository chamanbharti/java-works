package array;

public class Array5 {

	public static void main(String[] args) {
		
		int[] a = get();
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	static int[] get() {
		return new int[] {10,30,50,90,60};
	}
}
