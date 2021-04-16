package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	private String name;
	private int eno;
	
	Employee(String name,int eno){
		this.name=name;
		this.eno=eno;
	}
	
	public String toString() {
		return name+":"+eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	/*@Override
	public int compareTo(Employee o) {
		
		//return (eno<o.eno)?-1:(eno>o.eno)?1:0;
		return o.name.compareTo(name);
	}*/
}

/*class MyAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return ((o1.getEno()<o2.getEno())?-1:(o1.getEno()>o2.getEno())?1:0);
	}
	
}*/
public class LambdaExpression6 {

	public static void main(String[] args) {
		//Employee e = new Employee("Chaman",100);
		//System.out.println(e);
		ArrayList<Employee>l=new ArrayList<>();
		l.add(new Employee("Rahi",900));
		l.add(new Employee("Chaman",200));
		l.add(new Employee("Sahil",300));
		l.add(new Employee("Aman",800));
		l.add(new Employee("Naman",500));
		l.add(new Employee("Ryaan",100));
		System.out.println(l);
		
		//Collections.sort(l, new MyAgeComparator());
		//Collections.sort(l, (e1,e2) -> (e1.getEno()<e2.getEno())?-1:(e1.getEno()>e2.getEno())?1:0);
		Collections.sort(l, ( e1,e2) -> ( e1.getName().compareTo(e2.getName() ) ) );
		System.out.println(l);
	}
}
