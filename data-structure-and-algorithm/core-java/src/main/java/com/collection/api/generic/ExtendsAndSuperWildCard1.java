package com.collection.api.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*
Object name= new String("prem"); //works
List<Number> numbers = new ArrayList<Integer>();//gets compile time error

Integer[] myInts = {1,2,3,4};
Number[] myNumber = myInts;
myNumber[0] = 3.14; 
//attempt of heap pollution i.e. at runtime gets java.lang.ArrayStoreException: java.lang.Double(we can fool compiler but not run-time)

List<String> list=new ArrayList<>();
list.add("prem");
List<Object> listObject=list; //Type mismatch: cannot convert from List<String> to List<Object> at Compiletime  
*/

/*
class  A { }
//B is A
class B extends A { }
//C is A
class C extends A { }
*/

class A { }
class B extends A { }
class C extends B { }

public class ExtendsAndSuperWildCard1 {

	public static void main(String[] args) {
		/*
		//Generics allows you to work with Types dynamically in a safe way
		//ListA
		List<A> listA = new ArrayList<A>();

		//add
		listA.add(new A());
		listA.add(new B());
		listA.add(new C());

		//get
		A a0 = listA.get(0);
		A a1 = listA.get(1);
		A a2 = listA.get(2);
		//ListB
		List<B> listB = new ArrayList<B>();

		//add
		listB.add(new B());

		//get
		B b0 = listB.get(0);
		//Problem #1

		//not compiled
		//danger of **adding** non-B objects using listA reference
		//listA = listB;
		
		//Problem #2

		//not compiled
		//danger of **getting** non-B objects using listB reference
		//listB = listA;
		
//		The solution - Generic Wildcards
//		Wildcard is a reference type feature and it can not be instantiated directly
//
//		Solution #1 <? super A> aka lower bound aka contravariance aka consumers guarantees that it is operates by A and all superclasses, that is why it is safe to add

		List<? super A> listSuperA;
		listSuperA = listA;
		listSuperA = new ArrayList<Object>();

		//add
		listSuperA.add(new A());
		listSuperA.add(new B());

		//get
		Object o0 = listSuperA.get(0);
		
//		Solution #2
//
//		<? extends A> aka upper bound aka covariance aka producers guarantees that it is operates by A and all subclasses, 
//		that is why it is safe to get and cast

		List<? extends A> listExtendsA;
		listExtendsA = listA;
		listExtendsA = listB;

		//get
		A a01 = listExtendsA.get(0);
		*/
		
		/*
		 List<? extends Number> list1 = new ArrayList<Integer>();
		    list1.add(null);  //OK
		    Number n = list1.get(0);  //OK
		    Serializable s = list1.get(0);  //OK
		    Object o = list1.get(0);  //OK

		    list1.add(2.3);  //ERROR
		    list1.add(5);  //ERROR
		    list1.add(new Object());  //ERROR
		    Integer i = list1.get(0);  //ERROR
		    
		    List<? super Number> list2 = new ArrayList<Number>();
		    list2.add(null);  //OK
		    list2.add(2.3);  //OK
		    list2.add(5);  //OK
		    Object oo = list2.get(0);  //OK

		    list2.add(new Object());  //ERROR
		    Number nn = list2.get(0);  //ERROR
		    Serializable ss = list2.get(0);  //ERROR
		    Integer ii = list2.get(0);  //ERROR
		    */
		
	}
	
	
}
