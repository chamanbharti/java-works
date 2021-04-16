package com.string;

public class ReverseString5 {
	public static void main(String[] args) {
		
		/*String str ="Apple";
		StringBuffer sb = new StringBuffer(str);
		str =sb.reverse().toString();
		System.out.println("ReverseString "+str);*/
		
		/*StringBuffer sb = new StringBuffer("Apple");
		sb.reverse().toString();
		//System.out.println("ReverseString "+sb.reverse());
		System.out.println("ReverseString "+sb);*/
		
		/*String str = "Hello Java";
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}*/
		String str = "Hello Java";
		System.out.println("Original String is :"+str);
		char value[] = str.toCharArray();
		
		System.out.print("Reverse String is :");
		for(int i=value.length-1;i>=0;i--){
			System.out.print(value[i]);
		}
			
	}

}
