package com.comparator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PetComparator implements Comparator,Serializable{
	
	public int compare(Object o1,Object o2){
		int result=0;
		Pet pet = (Pet)o1;
		Pet petAnother = (Pet)o2;
		//use integer class's natural ordering
		Integer pld=new Integer(pet.getPetId());
		Integer pAnotherId=new Integer(petAnother.getPetId());
		result=pld.compareTo(pAnotherId);
		//if id are same compare by petType
		if(result==0){
			result=pet.getPetType().compareTo(petAnother.getPetId());
		}
		return result;
	}
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Pet(2,"Dog"));
		list.add(new Pet(1,"Parrot"));
		list.add(new Pet(2,"Cat"));
		
		Collections.sort(list,new PetComparator());
		
		for(Iterator itr=list.iterator();itr.hasNext();){
			Pet element=(Pet)itr.next();
			System.out.println(element);
		}
	}
	
}
