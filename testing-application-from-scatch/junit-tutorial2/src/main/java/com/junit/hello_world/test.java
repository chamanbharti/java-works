package com.junit.hello_world;

import java.io.FileOutputStream;
import java.io.IOException;

//class MyThread extends Thread 
//{
//    MyThread() 
//    {
//        System.out.print(" Thread");
//    }
//    public void run() 
//    {
//        System.out.print(" 2");
//    }
//    public void run(String s) 
//    {
//        System.out.println(" 3");
//    }
//}
public class test 
{
	public static void Order(String s)
	{
		System.out.println("String");
	}
	public static void Order(Object o)
	{
		System.out.println("Object");
	}
	public static void mythrow() 
    {
        System.out.print("L0 ");
        throw new RuntimeException();
    }
    public static void main(String [] args) 
    {
//    	Order(null);
//        try 
//        {
//            System.out.print("L1 ");
//            mythrow();
//        }
//        catch(Exception e) 
//        {
//            System.out.print("L2 ");
//        }
//        finally 
//        {
//            System.out.print("L3 ");
//        }
//        System.out.println("L4 ");
    	
//    	new MyThread().start(); 
//        new MyThread(new RunnableDemo()).start(); 
    	
//              method();
    	
//    	String str="FiRstpROgrAm";;
//		String s=str;
//		int a=31,b=a++;
//		if (s=="FiRstproRAm")
//		    System.out.println(b--);
//	    else
//	        System.out.println(--b);
    	
//    	String s1 = "xyz";
//        String s2 = s1;
//        s1 += "d";
//        System.out.println(s1 + " " + s2 + " " + (s1==s2));
//        StringBuffer sb1 = new StringBuffer("abc");
//        StringBuffer sb2 = sb1;
//        sb1.append("d");
//        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
//         
    }
    
}
//    public void test(int x) 
//    { 
//        int odd = 1; 
//        if(odd)       
//        {
//            System.out.println("odd"); 
//        }
//        else 
//        {
//            System.out.println("even"); 
//
//        }
//    }
    
//    public static int method()
//    {
//         try
//        {
//            System.out.println("try");
//            int x =33/0;
//            System.out.println(11);
//            return 11;
//       }
//        catch(Exception e)
//     {
//             System.out.println("catch");
//             System.out.println(17);
//          return 17;
//       }
//        finally
//        {
//            System.out.println("finally");
//            System.out.println(88);
//            return 88;
//        }
//   }
//  
//}
//class MyThread extends Thread 
//{ 
//    MyThread() {} 
//    MyThread(Runnable r) {super(r); } 
//    public void run() 
//    { 
//        System.out.print("Inside Thread ");
//    } 
//} 
//class RunnableDemo implements Runnable 
//{ 
//    public void run() 
//    { 
//        System.out.print(" Inside Runnable"); 
//    } 
//} 