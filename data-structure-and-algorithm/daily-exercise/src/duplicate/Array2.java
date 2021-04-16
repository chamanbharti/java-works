package duplicate;

public class Array2 {

	static int[] a = {1,2,3,4,1,3};
	static int[] b = new int[a.length];
	static String array = "";
	public static void main(String[] args) {
		
		int count = duplicateCounts();
		System.out.println("Duplicate Elements:"+count);
		System.out.println("These are duplicate in Array:");
		System.out.println(array);
		for(int i:b) {
			System.out.print(i+" ");
		}
	}
	
	public static int duplicateCounts() {
	
		int duplicate = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					//b[i] = a[j];
					array = array+a[j];
					array = array+",";
					duplicate++;
				}
			}
		}
		return duplicate;
	}
}
