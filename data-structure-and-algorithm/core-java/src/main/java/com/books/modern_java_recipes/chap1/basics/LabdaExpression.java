package com.books.modern_java_recipes.chap1.basics;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 *  https://github.com/tanvn/modern-java-recipes
 * https://github.com/kousen/java_8_recipes
 * https://github.com/kousen/java_9_recipes
 * https://github.com/kousen/cfboxscores
 * 
 * @author Chaman.Bharti
 *
 */
public class LabdaExpression {

	public static void main(String[] args) {
		
		// Anonymous inner class implementation of Runnable
		/*
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
				
			}
		}).start();
		
		*/
		
	// Using a lambda expression in a Thread constructor
	//	new Thread( () -> System.out.println("Hello")).start();

		/*
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
			}
		};
		Thread t = new Thread(r);
		*/
		
		/*
		// Assigning a lambda expression to a variable
		Runnable r = () -> System.out.println("Hello");
		new Thread(r).start();
		*/
		
		
		
		/*
		// An anonymous inner class implementation of FilenameFilter
		File file = new File("./src/main/java/com");
		String[] names = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		System.out.println(Arrays.toString(names));
		*/
		
		// Lambda expression implementing FilenameFilter
		/*
		File file = new File("./src/main/java/com");
		String[] names = file.list( (dir,name) -> name.endsWith(".java"));
		System.out.println(Arrays.toString(names));
		*/
	}
}
