package com.interview;
class AgeNotValid extends Exception{
	public AgeNotValid(String s){
		super(s);
	}
}
public class CustomException {

	public static void main(String[] args) {
		
		try{
			validate(14);
		}catch(Exception e){
			System.out.println("Exception occured:"+e);
		}
	}
	
	private static void validate(int age){
		if(age<18)
			try{
				throw new AgeNotValid("Not Valid Age");
			}catch(Exception e){
				e.printStackTrace();
			}
			
		else
			System.out.println("Vote");
	}
}
