package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UpperBoundedWildCard {

	private static Double add(ArrayList<? extends Number>num) {
		double sum = 0.0;
		for(Number n:num) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}
	//Unbounded Wildcards
	 public static void display(List<?> list)  
	    {  
	          
	        for(Object o:list)  
	        {  
	            System.out.println(o);  
	        }  
	          
	    }  
	 
	 public static void display2(Set<?> set)  
	    {  
	          
	        for(Object o:set)  
	        {  
	            System.out.println(o);  
	        }  
	          
	    }  
	 
	//Lower Bounded wildcards
	 public static void addNumbers(List<? super Integer> list) {  
		  
	        for(Object n:list)  
	        {  
	              System.out.println(n);  
	        }  
	 }
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();  
        l1.add(10);  
        l1.add(20);  
        System.out.println("displaying the sum= "+add(l1));  
        ArrayList<Double> l2=new ArrayList<Double>();  
        l2.add(30.0);  
        l2.add(40.0);  
        System.out.println("displaying the sum= "+add(l2));  
        
        System.out.println("Unbounded Wildcards");
        List<Integer> l3=Arrays.asList(1,2,3);  
        System.out.println("displaying the Integer values");  
        display(l3);  
        List<String> l4=Arrays.asList("One","Two","Three");  
        System.out.println("displaying the String values");  
        display(l4);  
        
        System.out.println("HashSet Unbounded Wildcards");
        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3));  
        System.out.println("displaying the Integer values");  
        display2(set); 
        
        System.out.println("Lower Bounded Wildcards");
        List<Integer> list1=Arrays.asList(1,2,3);  
        System.out.println("displaying the Integer values");  
        addNumbers(list1);  
        
      List<Number> list2=Arrays.asList(1.0,2.0,3.0);  
        System.out.println("displaying the Number values");  
        addNumbers(list2);  
        
	}
}
