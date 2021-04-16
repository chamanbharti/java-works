package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
	
//	@Autowired
//	private StudentUtil util;
	
	@Override
	public Integer saveStudent(Student s) {

		StudentUtil.calculateDetails(s);
		
		s = repo.save(s);
		return s.getStdId();
	}

	@Override
	public void updateStudent(Student s) {
		StudentUtil.calculateDetails(s);
		repo.save(s);
		
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Student getOneStudent(Integer id) {
		Optional<Student>opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
