package com.dto;
//https://www.amitph.com/spring-entity-to-dto/
public class Student {

	private String studentId;
    private String firstName;
    private String lastName;
    private int year;
    public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String firstName, String lastName, int year) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    
}
