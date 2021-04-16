package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListFullDemo extends ArrayList{

	public static void main(String[] args) {
		
		ArrayList<Integer>al1=new ArrayList<>(5);//ArrayList(int initialCapacity)
		
		System.out.println("public boolean add(E e)");
		
		al1.add(15);
		al1.add(30);
		al1.add(40);
		
		//for(Integer no:l){
		for(int i=0;i<al1.size();i++){
			//System.out.println("Number : "+no);
			System.out.println("Number : "+al1.get(i));
		}
		
		System.out.println("public void add(int index, E element)");
		
		//adding element 25 at third position
		al1.add(2, 25);
		int i=0;
		while(i<al1.size()){
			System.out.println("Number : "+al1.get(i));
			i++;
		}
		
		System.out.println("public boolean addAll(Collection<? extends E> c)");
		
		//creating another arraylist
		ArrayList<Integer>al2=new ArrayList<>(5);
		al2.add(50);
		al2.add(60);
		al2.add(70);
		al2.add(80);
		
		//inserting all elements, ll will get printed after l
		al1.addAll(al2);
		
		/*for(int j=0;j<al1.size();j++){
			System.out.println("Number : "+al1.get(j));
		}*/
		/*int j=0;
		while(j<al1.size()){
			System.out.println("Number : "+al1.get(j));
			j++;
		}*/
		int j=0;
		do{
			System.out.println("Number : "+al1.get(j));
			j++;
		}while(j<al1.size());
		/*for(Integer no:l){
			System.out.println("Number : "+no);
			
		}*/
		
		System.out.println("public boolean addAll(int index, Collection<? extends E> c)");
		//insert all elements of al2 at 3rd position
		al1.addAll(1, al2);
		
		for(Integer no:al1){
			System.out.println("Number : "+no);
			
		}
		
		System.out.println("public void clear()");
		
		int size=al2.size();
		System.out.println("Before clear() al2 size:"+size);
		al2.clear();
		size=al2.size();
		System.out.println("After clear() al2 size:"+size);
		
		System.out.println("Print al2 elements");
		for(Integer no:al2){
			System.out.println("Number : "+no);
			
		}
		
		System.out.println("public Object clone()");
		
		//create 3rd arraylist with empty element
		ArrayList<StringBuilder>al3 = new ArrayList<>();
		
		//insert new value into al3
		al3.add(new StringBuilder("Chaman "));
		System.out.println(al3);
		ArrayList<StringBuilder>al4 = (ArrayList)al3.clone();
		System.out.println(al4);
		
		System.out.println("public boolean contains(Object o)");
		
		//check given no is available in list
		boolean containNo=al1.contains(50);
		if(containNo == true){
			System.out.println("No is available");
		}else{
			System.out.println("No is not available");
		}
		
		boolean containNo2=al1.contains(90);
		if(containNo2 == true){
			System.out.println("No is available");
		}else{
			System.out.println("No is not available");
		}
		
		System.out.println("public void ensureCapacity(int minCapacity)");
		
		ArrayList<Integer>al5=new ArrayList<>(5);
		al5.add(1);
		al5.add(2);
		al5.add(3);
		
		al5.ensureCapacity(15);// this will increase the capacity of the ArrayList to 15 elements
		for(Integer no:al5){
			System.out.println("Number : "+no);
		}
		//trim to size
		al5.trimToSize();
		
		//new method void forEach() is added in jdk1.8
		System.out.println("void forEach(Consumer<? super E> action)");
		//forEach() is a lambda expression to iterate element
		//al1.forEach(action -> System.out.println(action));
		al1.forEach(System.out::println);
		
		System.out.println("public E get(int index)");
		//I want to retrieve 3rd index element
		int findNo=al1.get(3);
		System.out.println("al1[3]:"+findNo);
		
		System.out.println("public int indexOf(Object o)");
		// retrieving the index of element 70
		int retrieveIndex=al1.indexOf(70);
		System.out.println("element 70 is at index: "+retrieveIndex);
		
		System.out.println("public boolean isEmpty()");
		
		//check al2 is empty
		boolean isal2Empty=al2.isEmpty();
		if(isal2Empty == true){
			System.out.println("al2 is empty");
		}else{
			System.out.println("al2 is not empty");
		}
		
		System.out.println("Iterator<E>	iterator()");
		
		Iterator<Integer> itr=al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("int	lastIndexOf(Object o)");
		
		int lastIndex=al1.lastIndexOf(50);
		System.out.println("The last occurence of 50 is at al1["+lastIndex+"]");
		
		System.out.println("ListIterator<E>	listIterator()");
		
		//ListIterator Interface is used to traverse the element in backward and forward direction.
		ListIterator<Integer>lisIterator=al1.listIterator();
		System.out.println("traversing elements in forward direction..."); 
		while(lisIterator.hasNext()){
			System.out.println(lisIterator.next());
		}
		System.out.println("traversing elements in backward direction..."); 
		while(lisIterator.hasPrevious()){
			System.out.println(lisIterator.previous());
		}
		
		System.out.println("ListIterator<E>	listIterator(int index)");
		ListIterator<Integer>listIterator2=al1.listIterator(5);
		
		System.out.println("public E remove(int index)");
		System.out.println("Before remove al1 size: "+al1.size());
		//remove element  at 3rd position
		al1.remove(3);
		System.out.println("After remove al1 size: "+al1.size());
		
		System.out.println("public boolean remove(Object o)");
		System.out.println("Before remove 50 from al1 size: "+al1.size());
		//remove element  50
		al1.remove(new Integer(50));
		System.out.println("After remove 50 from al1 size: "+al1.size());
		
		System.out.println("boolean	removeAll(Collection<?> c)");
		System.out.println(al3);
		al3.removeAll(al4);
		System.out.println(al3);
		
		System.out.println("boolean	removeIf(Predicate<? super E> filter)");
		
		System.out.println("protected void	removeRange(int fromIndex, int toIndex)");
		
		ArrayListFullDemo list=new ArrayListFullDemo();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("List :"+list);
		// removing range of 1st 2 elements
		list.removeRange(1, 3);
		System.out.println("The list after using removeRange:" +list);
		
		System.out.println("void replaceAll(UnaryOperator<E> operator)");
		
		System.out.println("boolean	retainAll(Collection<?> c)");
		
		
		System.out.println("public E set(int index, E element)");
		System.out.println(al1);
		//replace element according to u
		al1.set(0, 50);
		System.out.println(al1);
		
		System.out.println("public int size()");
		System.out.println("Size of al1:"+al1.size());
		
		System.out.println("void	sort(Comparator<? super E> c)");
		
		System.out.println("Spliterator<E>	spliterator()");
		
		System.out.println("List<E>	subList(int fromIndex, int toIndex)");
		
		//display list from 0 to 3
		System.out.println(al1.subList(0, 3));
		
		System.out.println("Object[] toArray()");
		System.out.println("Before calling toArray()\n"+al1);
		//convert arraylist object into array
		Object[] array=al1.toArray();
		System.out.println("After calling toArray()\n");
		for(Object a:array){
			System.out.println("No: "+a);
		}
		
		System.out.println("<T> T[]	toArray(T[] a)");
		// toArray copies content into other array
		Integer list2[]=new Integer[al1.size()];
		list2=al1.toArray(list2);
		System.out.println("Size of array list2="+list2.length);
		//display list2 element
		for(Integer o:list2){
			System.out.println("No: "+o);
		}
		
		System.out.println("void trimToSize()");
		/*
		 *trims the capacity of this ArrayList instance to be the list's current size. 
		 *An application can use this operation to minimize the storage of an ArrayList instance.
		 */
		ArrayList<Integer>al=new ArrayList<>(30);
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println("Before calling trimeToSize() al size:"+al.size());
		al.trimToSize();
		System.out.println("After calling trimeToSize() al size:"+al.size());
	}

}
