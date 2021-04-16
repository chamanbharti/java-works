package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 1. Sort an Array To sort an Array, use the Arrays.sort().
		 */
		String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana" };

		Arrays.sort(fruits);

		int i = 0;
		System.out.println("Array Sorting");
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp);
		}
		/*
		 * 2. Sort an ArrayList To sort an ArrayList, use the
		 * Collections.sort().
		 */
		List<String> list = new ArrayList<String>();
		list.add("Pineapple");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");

		Collections.sort(list);
		int j = 0;
		System.out.println("List Sorting");
		for (String temp : list) {
			System.out.println("fruits " + ++j + " : " + temp);
		}
		/*
		 * 3. Sort an Object with Comparable How about a Java Object? Let create
		 * a Fruit class:
		 */
		Fruit[] arrayFruit = new Fruit[4];

		Fruit pineapple = new Fruit("Pineapple", "Pineapple description", 70);
		Fruit apple = new Fruit("Apple", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "Orange description", 80);
		Fruit banana = new Fruit("Banana", "Banana description", 90);

		arrayFruit[0] = pineapple;
		arrayFruit[1] = apple;
		arrayFruit[2] = orange;
		arrayFruit[3] = banana;

		Arrays.sort(arrayFruit);

		int k = 0;
		System.out.println("Object Sort with Comparable");
		for (Fruit temp : arrayFruit) {
			System.out.println("fruits " + ++k + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
		}
		// Exception in thread "main" java.lang.ClassCastException:
		// com.comparable.Fruit cannot be cast to java.lang.Comparable
		/*
		 * 4. Sort an Object with Comparator How about sorting with Fruit’s
		 * “fruitName” or “Quantity”? The Comparable interface is only allow to
		 * sort a single property. To sort with multiple properties, you need
		 * Comparator. See the new updated Fruit class again :
		 */
		Arrays.sort(arrayFruit, Fruit.fruitNameSort);
		int l = 0;
		System.out.println("Sort an Object with Comparator");
		for (Fruit temp : arrayFruit) {
			System.out.println("fruits " + ++l + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
		}
	}

}
