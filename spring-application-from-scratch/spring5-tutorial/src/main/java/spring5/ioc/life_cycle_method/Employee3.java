package spring5.ioc.life_cycle_method;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee3 //implements InitializingBean, DisposableBean
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
	@PostConstruct
	public void init() {
		System.out.println("inside init()  performed clean up task");
		
	}
	//@Override
	//public void destroy() throws Exception {
	@PreDestroy
	public void cleanup() {
		System.out.println("inside cleanup()  performed clean up task");
		
	}
	
	
}
