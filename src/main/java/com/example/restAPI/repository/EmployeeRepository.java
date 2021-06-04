package com.example.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restAPI.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
