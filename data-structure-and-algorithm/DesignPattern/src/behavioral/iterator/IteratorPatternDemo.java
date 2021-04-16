package behavioral.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		
		NameRepository namesRepository = new NameRepository();
		for(Iterator itr = namesRepository.getIterator();itr.hasNext();) {
			String name = (String) itr.next();
			System.out.println("Name: "+name);
		}
		
		
	}
}
