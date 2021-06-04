package com.example.restAPI.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.restAPI.exception.apiExceptions;
import com.example.restAPI.model.Employee;
import com.example.restAPI.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Employee CreateEmployee(Employee e) {
		return employeeRepo.save(e);
	}

	@Override
	public Employee UpdateEmployee(Employee e) throws apiExceptions {
		Optional<Employee> employee = this.employeeRepo.findById(e.getId());
		
		if(employee.isPresent()) {
			Employee empToUpdate = employee.get();
			empToUpdate.setId(e.getId());
			empToUpdate.setName(e.getName());
			empToUpdate.setSalary(e.getSalary());
			employeeRepo.save(empToUpdate);
			return empToUpdate;
		} else throw new apiExceptions("Employee ID not found");
	}

	@Override
	public List<Employee> GetAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public void DeleteEmployee(Long Id) throws apiExceptions {
		Optional<Employee> employee = this.employeeRepo.findById(Id);
		if(employee.isPresent())
		employeeRepo.deleteById(Id);
		else throw new apiExceptions("Employee ID not found");
		
	}

	@Override
	public Employee GetEmployeeById(Long Id) throws apiExceptions {
		Optional<Employee> employee = this.employeeRepo.findById(Id);
		if(employee.isPresent())
		return employeeRepo.getById(Id);
		else throw new apiExceptions("Employee ID not found");
	}

}
