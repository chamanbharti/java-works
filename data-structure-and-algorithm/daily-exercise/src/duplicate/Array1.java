package duplicate;

public class Array1 {

	static int[] a = {1,2,1,2};
	
	public static void main(String[] args) {
		
		int count = duplicateElements();
		System.out.println("Duplicate Element:"+count);
	}
	static int duplicateElements() {
		
		int duplicate = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					duplicate++;
					System.out.println(a[j]);
				}
			}
		}
		
		return duplicate;
	}
}
