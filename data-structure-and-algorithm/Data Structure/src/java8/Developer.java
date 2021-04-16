package java8;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private Integer age;
	private BigDecimal salary;
	
	public Developer(String name, Integer age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Developer [Name=" + name + ", Age=" + age + ", Salary=" + salary + "]";
	}
	
	
}
