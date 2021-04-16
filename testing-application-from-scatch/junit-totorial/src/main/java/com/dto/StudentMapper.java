package com.dto;

public class StudentMapper {

	public StudentDTO toDTO(Student entity) {
		StudentDTO dto = new StudentDTO();
		dto.setStudentId(entity.getStudentId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setYear(entity.getYear());
        return dto;
	}
	
	public Student toEntity(StudentDTO dto) {
        Student entity = new Student();
        entity.setStudentId(dto.getStudentId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setYear(dto.getYear());
        return entity;
    }
}
