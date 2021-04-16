package spring5.di.setter_constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

class HRDept{
	void work() {
		System.out.println("some work of human resource");
	}
}
public class Company {
	@Autowired(required = false)
	@Qualifier("dept2") 
	HRDept dept;
	
	
//	public Company(HRDept dept) {
//		this.dept = dept;
//		System.out.println("Company(HRDept dept) constructor created");
//	}
//	
//	public HRDept getDept() {
//		return dept;
//	}
//	
//	public void setDept(HRDept dept) {
//		this.dept = dept;
//		System.out.println("setDept(HRDept dept) setter has called");
//	}
	
	public void companyWork() {
		if(dept == null)
			System.out.println("no client  no work");
		else
			dept.work();
		
		
	}
	
}
