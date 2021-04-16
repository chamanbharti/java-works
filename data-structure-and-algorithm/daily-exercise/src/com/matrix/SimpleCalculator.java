package com.matrix;
import java.util.*;

public class SimpleCalculator 
{
    
     public static void main(String[] args) 
     {

        String choice; 
        int a,b;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first no:");
        a =  in.nextInt();
        System.out.println("Enter second no:");
        b = in.nextInt();
        System.out.println("Enter choice like +,-,* or /");
        choice = in.next();
        
        switch(choice)
        {
            case "+" : System.out.println(a+b);
                        break;
            case "-" : System.out.println(a-b);
                        break;
            case "*" : System.out.println(a*b);
                        break;
            case "/" : System.out.println(a/b);
                        break;  
            default : System.out.println("You have entered wrong key");
        }
      
     }

    }