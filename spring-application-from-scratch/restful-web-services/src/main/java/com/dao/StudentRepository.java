package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	// dynamic proxy class + object
}
