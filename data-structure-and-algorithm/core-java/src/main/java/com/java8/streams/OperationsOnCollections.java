package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class OperationsOnCollections {

	public static void main(String[] args) {
		
		/*
		 Usually, when you have a list, you'd want to iterate over its elements. A common way is to use a for block.
		 */
		
		System.out.println("Either with an index:");
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		
		System.out.println("Or with an iterator:");
		for(Iterator<String>it = words.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
		System.out.println("Or with the so-called for-each loop:");
		for(String w:words) {
			System.out.println(w);
		}
		
		System.out.println("The Stream interface provides a corresponding forEach method:");
		/*The Stream interface provides a corresponding forEach method:
			void forEach(Consumer<? super T> action)
			Since this method doesn't return a stream, it is a terminal operation.
			Using it is not different from using the other methods:
		*/
		
		Stream<String> stream = words.stream();
		// As an anonymous class
		stream.forEach(
				(new Consumer<String>() {
				    public void accept(String t) {
				        System.out.println(t);
				    }
				})
		 );
		
		// As a lamba expression
		//stream.forEach(t -> System.out.println(t));
		
		// Of course, the advantage of using streams is that you can chain operations.
//		words.sorted()
//		.limit(2)
//		.forEach(System.out::println);
		
		//Remember that because this is a terminal operation, you cannot do things like this:
		words.forEach(t -> System.out.println(t.length()));
		words.forEach(System.out::println);
		
		//If you want to do something like that, either create a new stream each time:
//		Stream.of(words).forEach(t -> System.out.println(t.length()));
//		Stream.of(words).forEach(System.out::println);
		
		System.out.println("Or wrap the code inside one lambda:");
		Consumer<String> print = t -> {
		    System.out.println(t.length());
		    System.out.println(t);
		};
		words.forEach(print);
		
		/*
		Also, 
		you can't use return, break or continue to terminate an iteration either. 
		break and continue will generate a compilation error 
		since they cannot be used outside of a loop and return doesn't make sense 
		when we see that the foreach method is implemented basically as:

			for (T t : this) {
			   // Inside accept, return has no effect
			   action.accept(t);
			}
			
			Another common requirement is to filter (or remove) elements from a collection that don't match a particular condition.

			You normally do this either by copying the matching elements to another collection:
*/
		
			List<String> nonEmptyWords = new ArrayList<String>();
			for(String w : words) {
			    if(w != null && !w.isEmpty()) {
			        nonEmptyWords.add(w);
			    }
			}
			System.out.println(nonEmptyWords);
			
		//	Or by removing the non-matching elements in the collection itself with an iterator 
		// (only if the collection supports removal):

			for (Iterator<String> it = words.iterator(); it.hasNext();) {
			    String w = it.next();
			    if (w == null || w.isEmpty()) {
			        it.remove();
			    }
			}
			
			/*
			For these cases, you can use the filter method of the Stream interface:

			Stream<T> filter(Predicate<? super T> predicate)
			
			That returns a new stream consisting of the elements that satisfy the given predicate.

			Since this method returns a stream, it represents an intermediate operation, 
			which basically means that you can chain any number of filters or other intermediate operations:
           */
			
			List<String> words2 = Arrays.asList("hello", null, "");
			words2.stream()
			    .filter(t -> t != null) // ["hello", ""]
			    .filter(t -> !t.isEmpty()) // ["hello"]
			    .forEach(System.out::println);
	}
}
