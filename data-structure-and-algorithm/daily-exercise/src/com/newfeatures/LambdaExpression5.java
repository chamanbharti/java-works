package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.oops.thread.Synchronisation1;
/*
Comparator
int compare(Object obj1,object obj2)
return -ve iff obj1 has to come before obj2
return +ve iff obj1 has to come after obj2
return 0 iff obj1 and obj2 are equal
*/
//Ascending order
/*class MyComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		//insertion order of array
//				if(o1<o2) {
//					return 0;
//				}else if(o1>o2) {
//					return 0;
//				}
//				else {
//					return 0;
//				}
		
		//reverse order of given arraylist means opposte of insertion order
//		if(o1<o2) {
//			return -1;
//		}else if(o1>o2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		//insertion order of array
//		if(o1<o2) {
//			return +1;
//		}else if(o1>o2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
		
		
		//ascending order
//		if(o1<o2) {
//			return -1;
//		}else if(o1>o2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
		
		//Descending order
//		if(o1<o2) {
//			return +1;
//		}else if(o1>o2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		//insertion order of array
//		if(o1<o2) {
//			return 0;
//		}else if(o1>o2) {
//			return 0;
//		}
//		else {
//			return 0;
//		}
		
		//ternary operator ascending order
		//return (o1<o2)?-1:(o1>o2)?1:0;
		
		//ternary operator descending order
		//return (o1<o2)?1:(o1>o2)?-1:0;
		
		//using lambda
		//(o1,o2) -> (o1<o2)?-1:(o1>o2)?1:0;
	}
}*/
public class LambdaExpression5 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		
		System.out.println(l);//[20, 10, 25, 5, 30, 0, 15]
		
		
		//l.sort(null);
		//System.out.println(l);//[0, 5, 10, 15, 20, 25, 30]
		//sort by natural
		//Collections.sort(l);
		//System.out.println(l);//[0, 5, 10, 15, 20, 25, 30] natural sorting
		//sorting according me
		//Collections.sort(l, new MyComparator());
		//System.out.println(l);
		
		//using lambda
		Comparator<Integer>c = (o1,o2) -> (o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(l, c);
		//System.out.println(l);
		//l.stream().forEach(System.out::println);
		//for(Integer i:l) {
		//	if(i%2==0)
		//	System.out.println(i);
		//}
		//l.stream().forEach(System.out::println);
		
		//using lambda
		List<Integer> l2 = l.stream().filter( i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}
}
