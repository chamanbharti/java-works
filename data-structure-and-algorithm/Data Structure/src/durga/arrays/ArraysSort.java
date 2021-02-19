package durga.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
	public static void main(String[] args) {
		
		//byte primitive type
		byte[] b = {10,7,4,37,29};
		System.out.println("byte primitive array before sorting:");
		for(byte b1:b){
			System.out.print(b1+" ");
		}
		System.out.println();
		Arrays.sort(b);
		System.out.println("byte primitive array after sorting:");
		for(byte b1:b){
			System.out.print(b1+" ");
		}
		System.out.println();
		
		byte[] b2 = {29,10,7,4,37,16};
		// sorting array from index 1 to 4
		//byte temp;
		Arrays.sort(b2, 1, 4);
		/*for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				if(b2[j]>b2[j+1]){
					temp = b2[j];
					b2[j]=b2[j+1];
					b2[j+1]=temp;
				}
			}
		}*/
		System.out.println("byte array with some sorted values(1 to 4) is:");
		for(byte bb:b2){
			System.out.print(bb+" ");//29 4 7 10 37 16
		}
		System.out.println();
		
		//int primitive type
		int[] a = {10,5,20,11,6};
		System.out.println("int primitive array before sorting:");
		for(int a1:a){
			System.out.print(a1+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("int primitive array after sorting:");
		for(int a1:a){
			System.out.print(a1+" ");
		}
		System.out.println();
		
		//String object type
		String[] s = {"A","Z","C","Y","P"};
		System.out.println("Object array before sorting:");
		for(String s1:s){
			System.out.print(s1+" ");//A Z C Y
		}
		System.out.println();
		
		/*Arrays.sort(s);
		System.out.println("Object array after sorting:");
		for(String s1:s){
			System.out.print(s1+" ");
		}
		System.out.println();
		*/
		
		/*Arrays.sort(s, new MyComprator());
		System.out.println("Object array after sorting by comparator:");
		for(String s1:s){
			System.out.print(s1+" ");
		}
		System.out.println();*/
		
		Arrays.sort(s, 1, 2, new MyComprator());
		System.out.println("Object array with some sorted values(1 to 2) is::");
		for(String s1:s){
			System.out.print(s1+" ");// A C Z Y
		}
		System.out.println();
		
	}

}
class MyComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s1.compareTo(s2);
	}
	
}
