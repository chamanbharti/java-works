package com.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

public class StudentModelMapperTest {

	private ModelMapper modelMapper = new ModelMapper();
	
	@Test
	void testModelMapperToEntity() {
		
		StudentDTO dto = new StudentDTO("123","Chaman","Snow",2450);
		
		//StudentMapper mapper = new StudentMapper();
		//Student entity = mapper.toEntity(dto);
		Student entity = modelMapper.map(dto, Student.class);
		
		assertEquals(entity.getStudentId(), dto.getStudentId());
		assertEquals(entity.getFirstName(), dto.getFirstName());
		assertEquals(entity.getLastName(), dto.getLastName());
		assertEquals(entity.getYear(), dto.getYear());
	}
	
	@Test
	void testModelMapperToDTO() {
		
		Student entity = new Student("123","Chaman","Snow",2450);
		
		//StudentMapper mapper = new StudentMapper();
		//StudentDTO dto = mapper.toDTO(entity);
		StudentDTO dto = modelMapper.map(entity, StudentDTO.class);
		
		assertEquals(dto.getStudentId(), entity.getStudentId());
		assertEquals(dto.getFirstName(), entity.getFirstName());
		assertEquals(dto.getLastName(), entity.getLastName());
		assertEquals(dto.getYear(), entity.getYear());
	}

}
