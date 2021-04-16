package com.sorting.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortUsingCustomClass {

	public static void main(String[] args) {
		
		List<Fruit> fruits = new ArrayList<>();
        
        Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
        Fruit apple = new Fruit("Apple", "Apple description",100); 
        Fruit orange = new Fruit("Orange", "Orange description",80); 
        Fruit banana = new Fruit("Banana", "Banana description",90); 
        
        fruits.add(pineappale);
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
      //  Collections.sort(fruits); // for it u have to implements comparable or comparator in Fruit class
        System.out.println("using sort by quantity");
        int i=0;
        for(Fruit temp: fruits){
           System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
        
        System.out.println("using anonymous class sorted by name");
        Collections.sort(fruits, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit fruit1, Fruit fruit2) {
              //ascending order
               // return fruit1.getFruitName().compareTo(fruit2.getFruitName());
                
                //descending order
               // return fruit2.getFruitName().compareTo(fruit1.getFruitName());
                
                //insertion order
                 //return fruit1.getFruitName().compareTo(fruit1.getFruitName());
				return fruit2.getFruitName().compareTo(fruit2.getFruitName());
			}
		});

        i=0;
        for(Fruit temp: fruits){
           System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
        
        System.out.println("using anonymous class sorted by quantity");
        Collections.sort(fruits, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit fruit1, Fruit fruit2) {
				return fruit1.getQuantity() - fruit2.getQuantity();
			}
		});
        i=0;
        for(Fruit temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
         }
        
        System.out.println("using lambda express sort by quantity ");
      //lambda here!
      //fruits.sort((Fruit f1, Fruit f2) -> f1.getQuantity() - f2.getQuantity());
        fruits.sort((f1, f2) -> f1.getQuantity() - f2.getQuantity());
      //java 8 only, lambda also, to print the List
      //fruits.forEach( (fruit) ->System.out.println(fruit));
        fruits.forEach(System.out::println);
        
        System.out.println("using lambda express sort by name ");
        /*
        Collections.sort(fruits, new Comparator<Fruit>() {
        	public int compare(Fruit o1, Fruit o2) {
        		return o1.getFruitName().compareTo(o2.getFruitName());
        	};
		});
        */
        //using lambda
       // fruits.sort((Fruit f1,Fruit f2)->f1.getFruitName().compareTo(f2.getFruitName())); // method I
        
       // fruits.sort( (f1,f2) -> f1.getFruitName().compareTo(f2.getFruitName())); // method II
       // Lambda expression to sort a List using their name. 
       // Comparator<Fruit>sortByName = (f1,f2) -> f1.getFruitName().compareTo(f2.getFruitName()); // method III
       // fruits.sort(sortByName);
        
        //Reversed sorting.
        Comparator<Fruit>sortByName = (f1,f2) -> f1.getFruitName().compareTo(f2.getFruitName());
        fruits.sort(sortByName.reversed());
        i=0;
        for(Fruit temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
         }
        
        
	}
}
