package com.ds.iteration;

import java.util.*;

public class IterationOfList {

	public static void main(String[] args) {
				List<Integer> numbers=Arrays.asList(new Integer[]{1,2,3,4,5});
				//List<Integer> numbers=new ArrayList<>();
				//List<Integer> numbers=new LinkedList<>();
				//List<Integer> numbers=new Vector<>();
//				numbers.add(1);
//				numbers.add(2);
//				numbers.add(3);
//				numbers.add(4);
//				numbers.add(5);
				/* 1 Basic for Loop*/
				System.out.print("1 Basic For Loop : ");
				for (int i = 0; i < numbers.size(); i++) {
					System.out.print(numbers.get(i)+"\t");
				}
				 // 2 While Loop for iterating ArrayList
			      System.out.println("\n2 While Loop:");
			      int i=0;
			      while(numbers.size() > i){
			    	  System.out.print(numbers.get(i)+"\t");
			    	  i++;
			      }
			      // 3 Do-While Loop for iterating ArrayList
			      System.out.println("\n3 Do-While Loop: ");
			      int j=0;
			      do{
			    	  System.out.print(numbers.get(j)+"\t");
			    	  j++;
			      }while(j<=3);
				/* For-Each loop */
				System.out.print("\n4 For-Each Loop :\t ");
				for (Integer integer : numbers) {
					System.out.print(integer+"\t");
				}
				
				/* Using Iterator  */
				System.out.print("\n5 Using Iterator : ");
				
				  Iterator<Integer> itr = numbers.iterator();
		      while(itr.hasNext()){
		    	  System.out.println(itr.next());
		      }
			 
				for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
					System.out.print(iterator.next()+"\t");
				}
				
				/* Using ListIterator  */
				System.out.print("\n6 Using ListIterator : ");
				/*
			  ListIterator<Integer> itr2 = numbers.listIterator();
		      while(itr2.hasNext()){
		    	  System.out.println(itr2.next());
		      }
		      while(itr2.hasPrevious()) {
		    	  System.out.println(itr2.previous());
		      }
				 */
				for (ListIterator<Integer> listIterator=numbers.listIterator();listIterator.hasNext();) {
					System.out.print(listIterator.next()+"\t");
				}
			
			  // 7 Enumeration for iterating ArrayList
		      System.out.println("\n7 Enumeration:");
		      Enumeration<Integer> enumeration = Collections.enumeration(numbers);
		      while(enumeration.hasMoreElements()){
		    	  System.out.print(enumeration.nextElement()+"\t");
		      }
			 
				/* Using Stream */
				System.out.print("\n8 Using Stream : ");
				numbers.stream().forEach(e->System.out.print(e+"\t"));
			}

}
