package design_pattern.behavioural.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExternalIterator {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Rahi");
		list.add("Chaman");
		list.add("Saheel");
		//Getting Iterator
		list=null;
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
