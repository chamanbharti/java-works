package com.collection.api.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


// <?> VS <? extends T> VS <? super T>
public class ExtendsAndSuperWildCard0 {

	public static void main(String[] args) {

		/*
		 //List of apples  step-I
	      List<Apple> apples = new ArrayList<Apple>();
	      apples.add(new Apple());
	       
	      //We can assign a list of apples to a basket of fruits;
	      //because apple is subtype of fruit 
	      List<? extends Fruit> basket = apples;
	       
	      //Here we know that in basket there is nothing but fruit only
	      for (Fruit fruit : basket)
	      {
	         System.out.println(fruit);
	      }
	       
	      //basket.add(new Apple()); //Compile time error
	      //basket.add(new Fruit()); //Compile time error
	      
	      */


		//List of apples step-II
	      List<Apple> apples = new ArrayList<Apple>();
	      apples.add(new Apple());
	       
	      //We can assign a list of apples to a basket of apples
	      List<? super Apple> basket = apples;
	       
	      basket.add(new Apple());      //Successful
	      basket.add(new AsianApple()); //Successful
	      //basket.add(new Fruit());      //Compile time error
	      
	      
	      /*
	      Collection<Number> scol = new  ArrayList<Number>();
	      scol.add(20);
	      scol.add(30.9);
	      Collection<Double> addC1 = new ArrayList<Double>();
	      addC1.add(10.6);
	      Collection<Integer> addC2 = new ArrayList<Integer>();
	      addC2.add(20);
	      scol.addAll(addC1);
	      scol.addAll(addC2);
	      System.out.println(scol);
	      */
	      
	      
	      /*
	      List<Integer> list = Arrays.asList(1, 2, 3);
	      printListWildCard(list);
	      
	      List someList = new ArrayList<>();
	      boolean instanceTest = someList instanceof List<?>;
	      System.out.println(instanceTest);
	      
	      List anotherList = new ArrayList<>();
	      boolean instanceTest2 = anotherList instanceof List<? extends Object>;
	      System.out.println(instanceTest2);
	      
	      List<?>[] arrayOfList = new List<?>[1];
	      List<? extends Object>[] arrayOfAnotherList = new List<? extends Object>[1];
	      System.out.println(instanceTest2);
	      */
	}
	public static void printListObject(List<Object> list) {    
	    for (Object element : list) {        
	        System.out.print(element + " ");    
	    }        
	}    

	public static void printListWildCard(List<?> list) {    
	    for (Object element: list) {        
	        System.out.print(element + " ");    
	    }     
	}
	
	
}
class Fruit {
	   @Override
	   public String toString() {
	      return "I am a Fruit !!";
	   }
	}
	 
	class Apple extends Fruit {
	   @Override
	   public String toString() {
	      return "I am an Apple !!";
	   }
	}
	class AsianApple extends Apple {
		   @Override
		   public String toString() {
		      return "I am an AsianApple !!";
		   }
		}
