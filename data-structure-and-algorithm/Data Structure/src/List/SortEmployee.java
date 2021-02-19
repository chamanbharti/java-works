package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Rahi", "Akela", 34);
        Employee e2 = new Employee(3, "Chaman", "Bharti", 30);
        Employee e3 = new Employee(4, "Sahil", "Bharti", 31);
        Employee e4 = new Employee(2, "Aman", "Bharti", 25);
        
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        
        //unsorted list
        System.out.println("Unsorted List");
        System.out.println(emp);
        
    
     // Default Sorting by employee id
        System.out.println("Default Sorting by id");
         Collections.sort(emp);
         System.out.println(emp);
        
        //Age Sorter
       System.out.println("Age Sorting");
       Collections.sort(emp, new AgeSort());
       System.out.println(emp);
       
        //First name sorter
        System.out.println("First Name Sorting");
        Collections.sort(emp, new FNameSort());
        System.out.println(emp);
        
      //Last name sorter
        System.out.println("Last Name Sorting Descending Order");
        Collections.sort(emp, new LNameSort());
        System.out.println(emp);
	}

}
