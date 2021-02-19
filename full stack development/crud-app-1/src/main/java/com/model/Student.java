package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Student {

	@NotBlank(message = "Please enter a valid email")
	@Email(message = "Please enter a valid email")
	@Id
	private String email;
	
	@NotBlank(message = "Please enter your name")
	@Size(min = 2,message = "Your name must be wrong")
	private String name;
	
	@NotBlank(message = "Please enter your password")
	@Size(min = 4,message = "invalid password entered at least 4 characters")
	private String password;
	
	@NotBlank(message = "Please enter your age")
	@Pattern(regexp = "[\\d]{2}",message = "invalid age(age's length should be 2)")
	private String age;
	
	@NotBlank(message = "Please enter your phone number")
//	@Pattern(regexp = "[\\d]{10}",message = "invalid phone number(age's length should be 10)")
	@Pattern(regexp = "[6789][0-9]{9}",message = "invalid phone number(mobile number should start with 6,7,8,9 and total number should be 10)")
	private String phoneNumber;
	public Student() {
	}
	public Student(String name, String email, String password, String age, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
