package com.example.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restAPI.Service.EmployeeService;
import com.example.restAPI.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value="/getAllEmployee")
	public ResponseEntity<List<Employee>> getEmployee() {
		return ResponseEntity.ok().body(employeeService.GetAllEmployees());
	}
	
	@PostMapping(value="/createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee e) {
		return ResponseEntity.ok().body(employeeService.CreateEmployee(e));
	}
	
	@PutMapping(value="/updateEmployee/{Id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long Id, @RequestBody Employee e) throws Exception {
		e.setId(Id);
		return ResponseEntity.ok().body(employeeService.UpdateEmployee(e));
		
	}
	
	@DeleteMapping(value="/deleteEmployee/{Id}")
	public HttpStatus deleteEmployee(@PathVariable long Id) throws Exception {
		employeeService.DeleteEmployee(Id);
		return HttpStatus.OK;
	}
	
	@GetMapping(value="/getEmployeeById/{Id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long Id) throws Exception {
		return ResponseEntity.ok().body(employeeService.GetEmployeeById(Id));
		
	}
}
