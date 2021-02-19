package com.set.hashset;

public class Person {
	
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		
		Person p = (Person) obj;
		return (this.getId() == p.getId());
	}
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = result * prime + getId();
		return result;
	}
}
