package com.dto;

public class StudentDTO {

	private String studentId;
    private String firstName;
    private String lastName;
    private int year;
    public StudentDTO() {
	}
    
	public StudentDTO(String studentId, String firstName, String lastName, int year) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}

	public StudentDTO(Student entity) {
		this.studentId = entity.getStudentId();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
		this.year = entity.getYear();
	}
	
	public Student toEntity() {
		Student entity = new Student();
		entity.setStudentId(this.studentId);
		entity.setFirstName(this.firstName);
		entity.setLastName(this.lastName);
		entity.setYear(this.year);
		
		return entity;
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
