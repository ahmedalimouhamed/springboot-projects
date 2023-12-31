package com.zerzif.springboot.services;

import java.util.List;

import com.zerzif.springboot.models.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
