package com.zerzif.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zerzif.spring.entities.Student;
import com.zerzif.spring.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("zerzif", "ahmed", "zerzif@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("fatima", "fatima", "fatima@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("mouhamed", "ali", "mouhamed@gmail.com");
		studentRepository.save(student3);
	}

}
