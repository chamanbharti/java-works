package com.service;


import java.util.List;

import com.model.Student;
// ctrl + shift + O  : for import package
public interface StudentService {

	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Student getOneStudent(Integer id);
	List<Student> getAllStudents();
}
