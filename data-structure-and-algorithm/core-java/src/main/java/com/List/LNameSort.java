package List;

import java.util.Comparator;

public class LNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//ascending order
		//return o1.getLastName().compareTo(o2.getLastName());
		
		//descending order
		return o2.getLastName().compareTo(o1.getLastName());
	}

	
}
