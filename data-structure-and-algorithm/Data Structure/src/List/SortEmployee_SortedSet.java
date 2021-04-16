package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmployee_SortedSet {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Rahi", "Akela", 34);
        Employee e2 = new Employee(3, "Chaman", "Bharti", 30);
        Employee e3 = new Employee(4, "Sahil", "Bharti", 31);
        Employee e4 = new Employee(2, "Aman", "Bharti", 25);
        
        SortedSet<Employee> emp = new TreeSet<Employee>(new FNameSort());
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        
        //unsorted list
        System.out.println("Unsorted List");
        System.out.println(emp);
        
	}

}
