package duplicate.remove;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		
		String s = "Chaman Bharti";
		
		char[] array = s.toCharArray();
		Arrays.sort(array);
		int length =s.length();
		length=removeDuplicate(array,length);
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	public static int removeDuplicate(char[] array,int n) {
		char[] array2 = new char[array.length];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(array[i] != array[i+1]) {
				array2[j++] = array[i];
			}
		}
		//array[j++] = array[n-1];
		//changing origninal array
		for(int i=0;i<j;i++) {
			array[i]=array2[i];
		}
		return j;
	}
}
