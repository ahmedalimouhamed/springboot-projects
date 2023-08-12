package com.zerzif.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zerzif.springboot.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
