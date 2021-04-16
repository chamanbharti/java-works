package books.geegsforgeegs.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		for(int i=0;i<11;i++) {
			ll.add(i);
		}
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<11;i++) {
			al.add(i);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
