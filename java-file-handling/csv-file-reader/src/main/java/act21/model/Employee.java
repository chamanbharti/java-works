package act21.model;

public class Employee {
	
	 private int empId;
	 private String name;
	 private String location;
	 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", location=" + location + "]";
	}
	
	 
}
