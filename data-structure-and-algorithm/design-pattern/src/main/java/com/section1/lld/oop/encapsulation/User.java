package com.section1.lld.oop.encapsulation;

import com.section1.lld.oop.Address;

public class User {

	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
