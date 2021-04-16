package com.comparator.journaldev;

import java.util.Comparator;

public class EmployeeComparatorByIdAndName implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2){
		int flag = e1.getId() - e2.getId();
		if(flag == 0)
			flag = e1.getName().compareTo(e2.getName());
		return flag;
	}

}
