package com.hashcode_equal;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String department;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//equals() implementation
	public boolean equals(Object o){
		
		if(o == null){
			return false;
		}
		
		if(o == this){
			return true;
		}
		
		if(getClass() != o.getClass()){
			return false;
		}
		
		if(o instanceof Employee){
			Employee e = (Employee)o;
			return (this.getId() == e.getId());//through id
		}else
			return false;
		//Employee e = (Employee)o;
		//return (this.getId() == e.getId());//through id
		//return (this.getFirstName() == e.getFirstName());//through name
	}

	//hashcode() implementation
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = result * prime + getId();
		return result;
	}
	
	
}
