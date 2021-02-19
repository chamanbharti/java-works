package com.ds.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Spliterator {
	public static void main(String[] args) {
		
		//List<String> nameList = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo");
		        //Iterator<String> itr = nameList.iterator();
//		        while (itr.hasNext()) {
//		            System.out.println("name - " + itr.next());   
//		        }
		        
		       // itr.forEachRemaining(action->System.out.println("name - " +action));
//		        itr.forEachRemaining(action->{
//		        	System.out.println("name - " +action);
//		        });;
		        
		        //using spliterator
//		        java.util.Spliterator<String> splitStr = nameList.spliterator();
//		        //while(splitStr.tryAdvance(action->System.out.println("name - " +action)));
//		        //You can see, with Spliterator, 
//		        //you need to use only one method tryAdvance() which combines both hasNext() and next() methods of the iterator.
//		        
//		        splitStr.forEachRemaining(action->{
//		        	String x = action.toLowerCase();
//		        	System.out.println(" "+x);
//		        });
		        
//		        java.util.Spliterator<String> splitStr1 = nameList.spliterator();
//		        java.util.Spliterator<String> splitStr2 = splitStr1.trySplit();
//		        // Check if splitting actually happened, then use it
//		        if(splitStr2 != null) {
//		        	System.out.println("Spliterator-2");
//		            while(splitStr2.tryAdvance((n) -> System.out.println("name - " + n)));
//		        }
//		     // Original spliterator
//		        System.out.println("Original Spliterator");
//		        while(splitStr1.tryAdvance((n) -> System.out.println("name - " + n)));
		
//		 List<String> progList = Arrays.asList("Java","Android","Python","C++");  
//		 java.util.Spliterator<String> splitr = progList.spliterator();  
//		 java.util.Spliterator<String> st = splitr.trySplit();  
//	        splitr.forEachRemaining(System.out::println);  
//	        System.out.println("Traversing the next half of the spliterator-");  
////	        st.forEachRemaining(System.out::println);  
//	        st.forEachRemaining(s->System.out.println(s));  
		
//		for(String name:nameList){
//			
//		if(name.equals("Ram")) {
//			nameList.remove(name);
//		}
		//List<String> words = new ArrayList<>(Arrays.asList("pen", "pencil","sky", "blue", "sky", "dog"));

//        for (String word: words) {
//
//            if ("sky".equals(word)) {
//
//                words.remove(word);
//            }
//        }
		//words.removeIf(e -> "sky".equals(e));

        //System.out.println(words);
		
//		Iterator<String> iter = words.iterator();
//
//		while (iter.hasNext()) {
//		    String s = iter.next();
//
//		    if ("sky".equals(s)) {
//		        iter.remove();
//		    }
//		}
//		words.forEach(s->System.out.println(s));
		
		//external iteration
		 List<String> alphabets = Arrays.asList(new String[]{"a","b","b","d"});
         
	        for(String letter: alphabets){
	            System.out.println(letter.toUpperCase());
	        }
	        Iterator<String> iterator = alphabets.listIterator();
	        while(iterator.hasNext()){
	            System.out.println(iterator.next().toUpperCase());
	        }
	        
	      //internal iteration
	        alphabets.stream().forEach(action->action.toUpperCase());
	        
	}
		

}
