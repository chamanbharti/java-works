package com.set.hashset;

public class Employee {
	
	private Integer id;
    private String firstname;
    private String lastName;
    private String department;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
    
	/*public boolean equals(Object o){
		
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		if(getClass() != o.getClass()){
			return false;
		}
		Employee e = (Employee) o;
		return (this.getId() == e.getId());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}*/
	public int hashCode(){
		
		final int prime = 31;
		int result = 0;
		result = result * prime + getId();
		result = result * prime + ((id == null) ? 0: id.hashCode());
		result = result * prime + ((firstname == null)? 0:firstname.hashCode());
		result = result * prime + ((lastName == null) ? 0: lastName.hashCode());
		result = result * prime + ((department == null) ? 0:department.hashCode());
		
		return result;
	}
	
}
