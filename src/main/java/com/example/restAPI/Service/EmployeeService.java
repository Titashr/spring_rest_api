package com.example.restAPI.Service;

import java.util.List;

import com.example.restAPI.model.Employee;

public interface EmployeeService {

	Employee CreateEmployee(Employee e);
	Employee UpdateEmployee(Employee e) throws Exception;
	List<Employee> GetAllEmployees();
	void DeleteEmployee(Long Id) throws Exception;
	Employee GetEmployeeById(Long Id) throws Exception;
}
