package design_pattern.behavioural.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InternalIterator {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Rahi");
		list.add("Chaman");
		list.add("Saheel");
//		//Getting Iterator
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
