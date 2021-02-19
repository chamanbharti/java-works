package act21.model;

public class Transaction {

	private int transId;
	private String transProductType;
	private String transType;
	private String transAmount;
	private String transParentId;
	private String priority;
	private int empId;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getTransProductType() {
		return transProductType;
	}
	public void setTransProductType(String transProductType) {
		this.transProductType = transProductType;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransParentId() {
		return transParentId;
	}
	public void setTransParentId(String transParentId) {
		this.transParentId = transParentId;
	}
	public String isPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", transProductType=" + transProductType + ", transType=" + transType
				+ ", transAmount=" + transAmount + ", transParentId=" + transParentId + ", priority=" + priority
				+ ", empId=" + empId + "]";
	}
	
	
	
}
