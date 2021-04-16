package ds.udemy.ds.array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {1,4,6,2,3,9};
		System.out.println(find(a,9));
	}
	
	static int find(int[]a, int item) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
				return i;
			}
		}
		return -1;
	}
}
