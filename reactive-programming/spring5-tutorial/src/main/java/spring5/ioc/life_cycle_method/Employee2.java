package spring5.ioc.life_cycle_method;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee2 //implements InitializingBean, DisposableBean
{

	private int id;
	private String name;
	
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
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	//@Override
	//public void afterPropertiesSet() throws Exception {
	public void init() {
		System.out.println("inside init()  performed clean up task");
		
	}
	//@Override
	//public void destroy() throws Exception {
	public void cleanup() {
		System.out.println("inside cleanup()  performed clean up task");
		
	}
	
	
}
