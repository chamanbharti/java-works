package com.ds.array;

import java.util.Arrays;

public class RemoveDulicate {

	public static void main(String[] args) {
		
		int[] a = { 1,2,5,2,1,8 };
		int len = a.length;
		int[] b = new int[len];
		
		 for(int i=0;i<len;i++){
		     if(b[i] != a[i]) {
		    	 b[i]=a[i];
		     }
		 }
		 for(int i=0;i<b.length;i++) {
			 System.out.println(b[i]);
		 }
		//complexity of this alogrith is o(n2)
		 
//		 int[] a1 = { 1,2,5,2,1,8 };
//			List<Integer> a = Arrays.stream(a1).boxed().collect(Collectors.toList());
		 //https://www.mkyong.com/java/how-do-convert-array-to-list-in-java/
		 //https://www.mkyong.com/java/java-how-to-convert-a-primitive-array-to-list/
//			int len = a.size();
//			List<Integer>  b = new ArrayList<>();
//			
//			 for(Integer i:a){
//			     if(!b.contains(i) ) {
//			    	 b.add(i);
//			     }
//			 }
//			 System.out.println(b);
//			//complexity of this alogrith is o(n2)
	}
}
