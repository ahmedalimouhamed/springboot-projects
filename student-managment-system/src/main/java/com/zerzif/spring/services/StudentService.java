package com.zerzif.spring.services;

import java.util.List;

import com.zerzif.spring.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id); 
}
