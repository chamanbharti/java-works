package com.neon_number;

import java.util.Scanner;

public class NeonNumber2 {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=ob.nextInt();
        int square=num*num;
        int sum=0;
        while(square!=0)//Loop to find the sum of digits.
        {
            int r=square%10;
            sum=sum+r;
            square=square/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Neon Number.");
        }
        else
        {
            System.out.println(num+" is not a Neon Number.");
        }
    }
}