package com.string;

public class StringLength2 {
	
	static int i,c,res;
	public static int length(String s){
		try{
			for(i=0,c=0;0<=i;i++,c++)
				s.charAt(i);
		}
		catch(Exception e){
			//Array index out of bounds and array index out of range are different exceptions
			System.out.println("length is ");
			 // we can not put return  statement in catch
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("Original String is: ");
		System.out.println("Alives awesome ");
		res=StringLength1.length("Alive is awesome");
		System.out.println("Total Length:"+res);
	}

}
