package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pet implements Comparable{
	String petId;
	String petType;
	
	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public Pet(int petId,String argPetType){
		petId=petId;
		this.petType=argPetType;
	}
	//Ascending order
	/*public int compareTo(Object o){
		Pet petAnother = (Pet)o;
		return this.petType.compareTo(petAnother.petType);
	}*/
	//Descending order
	/*public int compareTo(Object o){
		Pet petAnother = (Pet)o;
		return petAnother.petType.compareTo(this.petType);
	}*/
	//Asceding order
	public int compareTo(Object o){
		Pet petAnother = (Pet)o;
		return petAnother.petId.compareTo(this.petId);
	}
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Pet(2,"Dog"));
		list.add(new Pet(1,"Parrot"));
		list.add(new Pet(3,"Cat"));
		
		Collections.sort(list);
		
		for(Iterator itr=list.iterator();itr.hasNext();){
			Pet element=(Pet)itr.next();
			System.out.println(element);
		}
	}
	 public String toString(){
		 return petType;
	 }

	
}
