package java14.java13;

public class SwitchWithWrapper {
	public static void main(String[] args) {
		Integer age = 18;//Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement. 
        switch (age)  
        {  
            case (16):            
                System.out.println("You are under 18.");  
                break;  
            case (18):                
                System.out.println("You are eligible for vote.");  
                break;  
            case (65):                
                System.out.println("You are senior citizen.");  
                break;  
            default:  
                System.out.println("Please give the valid age.");  
                break;  
        }         
	}

}
