package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repo;
	
	@Override
	public Integer saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student saveStudent=repo.save(student);
		
		return saveStudent.getsId();
	}

}
