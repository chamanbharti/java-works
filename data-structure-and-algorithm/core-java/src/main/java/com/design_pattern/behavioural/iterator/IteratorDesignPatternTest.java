package design_pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

interface Iterator{
	public boolean hasNext();
	public Object next();
}

interface Container{
	public Iterator getIterator();
}
class NameRepository implements Container {
	
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		
		int index;

		@Override
		public boolean hasNext() {
			if(index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
public class IteratorDesignPatternTest {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		for(Iterator itr = namesRepository.getIterator();itr.hasNext();) {
			 String name = (String)itr.next();
			 System.out.println("Name : "+name);
		}
		
		// collection style
		ArrayList<String>arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]  
		
		//java.util.Iterator<String> iterator = arrlist.iterator();
		ListIterator<String> iterator = arrlist.listIterator();
		while(iterator.hasNext()) {
			String i = iterator.next();
			System.out.println(i);
		}
	}
}
