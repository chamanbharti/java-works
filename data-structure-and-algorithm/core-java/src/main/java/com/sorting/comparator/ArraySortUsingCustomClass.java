package com.sorting.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortUsingCustomClass {

	public static void main(String[] args) {
		
		Fruit[] fruits = new Fruit[4];
        
        Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
        Fruit apple = new Fruit("Apple", "Apple description",100); 
        Fruit orange = new Fruit("Orange", "Orange description",80); 
        Fruit banana = new Fruit("Banana", "Banana description",90); 
        
        fruits[0]=pineappale;
        fruits[1]=apple;
        fruits[2]=orange;
        fruits[3]=banana;
//        Arrays.sort(fruits, Fruit.FruitNameComparator);
        
        
        // using anonymous class
        Arrays.sort(fruits, new Comparator<Fruit>() {

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

        int i=0;
        for(Fruit temp: fruits){
           System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
        }
        
        System.out.println("using sort by quantity");
        Arrays.sort(fruits, new Comparator<Fruit>() {

			@Override
			public int compare(Fruit fruit1, Fruit fruit2) {
				return fruit1.getQuantity() - fruit2.getQuantity();
			}
        	
		});
        i=0;
        for(Fruit temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
         }
        
        System.out.println("using sort by quantity using lambda express");
	}
}
