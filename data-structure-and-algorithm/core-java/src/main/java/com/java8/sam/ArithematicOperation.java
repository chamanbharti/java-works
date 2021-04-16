package java8.sam;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ArithematicOperation {

//public static void main(String[] args) throws Exception {
//        
//        String expression = "12 + 14 - 2 / 4";
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("javascript");
//        Object result = engine.eval(expression);
//        System.out.println(result);// 25.5
//        
//    }   
	
	// A utility function to check if 
	// a given character is operand 
	static boolean isOperand(char c) 
	{ 
		return (c >= '0' && c <= '9'); 
		
	} 

	// utility function to find value of and operand 
	static int value(char c) 
	{ 
		return (int)(c - '0'); 
		
	} 

	// This function evaluates simple expressions. 
	// It returns -1 if the given 
	// expression is invalid. 
	static int evaluate(String exp) 
	{ 
		// Base Case: Given expression is empty 
		if (exp.length() == 0) return -1; 

		// The first character must be 
		// an operand, find its value 
		int res = value(exp.charAt(0)); 

		// Traverse the remaining characters in pairs 
		for (int i = 1; i<exp.length(); i += 2) 
		{ 
			// The next character must be an operator, and 
			// next to next an operand 
			char opr = exp.charAt(i), opd = exp.charAt(i+1); 

			// If next to next character is not an operand 
			if (isOperand(opd) == false) return -1; 

			// Update result according to the operator 
			if (opr == '+') res += value(opd); 
			else if (opr == '-') res -= value(opd); 
			else if (opr == '*') res *= value(opd); 
			else if (opr == '/') res /= value(opd); 

			// If not a valid operator 
			else				 return -1; 
		} 
		return res; 
	} 

	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		String expr1 = "1+2*5+3"; 
		int res = evaluate(expr1); 
		if(res == -1) System.out.println(expr1+" is Invalid"); 
		else	 System.out.println("Value of "+expr1+" is "+res); 

		String expr2 = "1+2*3"; 
		res = evaluate(expr2); 
		if(res == -1) System.out.println(expr2+" is Invalid"); 
		else		 System.out.println("Value of "+expr2+" is "+res); 

		String expr3 = "4-2+6*3"; 
		res = evaluate(expr3); 
		if(res == -1) System.out.println(expr3+" is Invalid"); 
		else		 System.out.println("Value of "+expr3+" is "+res); 

		String expr4 = "1++2"; 
		res = evaluate(expr4); 
		if(res == -1) System.out.println(expr4+" is Invalid"); 
		else		 System.out.println("Value of "+expr4+" is "+res); 
	} 


}
