package com.java8;

public class Employee{
	
	 	private int id;
	    private String name;
	    private String grade;
	    private long salary;
	    private int age = -1;
	 
	    public Employee(Integer id, String name,String grade, long salary, Integer age){
	        this.id = id;
	        this.name = name;
	        this.grade = grade;
	        this.salary = salary;
	        this.age = age;
	    }
	     
	    //Other getter and setter methods
	     
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

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	
}
