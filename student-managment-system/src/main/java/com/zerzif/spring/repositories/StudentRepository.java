package com.zerzif.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerzif.spring.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
