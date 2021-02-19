package act21.model;

public class SampleOutput {

	 private int empId;
	 private String empName;
	 private String locationCategory;
	 private double amount;
	 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLocationCategory() {
		return locationCategory;
	}
	public void setLocationCategory(String locationCategory) {
		this.locationCategory = locationCategory;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SampleOutput [empId=" + empId + ", empName=" + empName + ", locationCategory=" + locationCategory
				+ ", amount=" + amount + "]";
	}
	 
	 
}
