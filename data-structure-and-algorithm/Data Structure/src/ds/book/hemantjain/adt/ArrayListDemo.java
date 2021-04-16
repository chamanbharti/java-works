package ds.book.hemantjain.adt;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo{

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);//add 1 to the end of the list
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("contents of Array:"+al);//array is converted to string and printed to screen
		al.add(2,9);//9 is added to 2nd index
		al.add(5,9);//9 is added to 5th index
		System.out.println("contents of Array:"+al);
		
		System.out.println("Array Size:"+al.size());//array size printed
		System.out.println("Array IsEmpty:"+al.isEmpty());
		
		al.remove(al.size()-1);//last element of array is removed
		
		System.out.println("Array Size:"+al.size());
		al.remove(al);//all the elements of array are removed
		
		System.out.println("Array IsEmpty:"+al.isEmpty());
		
		al.remove(al.size()-1);//last element of array is removed
		
		System.out.println("Array Size:"+al.size());
		
		al.removeAll(al);//all element of array are removed
		
		System.out.println("Array IsEmpty:"+al.isEmpty());
		
		
		/*for(Integer i:al) {
			System.out.print(i+" ");
		}*/
		/*for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}*/
		/*int i=0;
		//while(i<4) 
		do{
			System.out.print(al.get(i)+" ");
			i++;
		}while(i<4);*/
		
		/*Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		/*ListIterator<Integer>itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	}

}
