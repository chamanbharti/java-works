package duplicate;

public class Array3 {

	static int[] a = { 1,2,3,4,1,3 };
	static int[] b = new int[a.length];
	public static void main(String[] args) {
		
		System.out.println("Original Elements:");
		for(int i:a) {
			System.out.print(i+" ");
		}
		int count = duplicateCounts();
		
		System.out.println("\nThese are duplicate in Array:");
		for(int i:b) {
			if(i != 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nDuplicate Elements:"+count);
	}
	
	public static int duplicateCounts() {
	
		int duplicate = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					b[i] = a[i];
					duplicate++;
				}
			}
		}
		
		return duplicate;
	}
}
