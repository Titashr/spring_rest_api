package com.example.restAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Employee")
public class Employee {
	
	public Employee(long id, String name, Double salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}
	public Employee() {
		super();
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmpId")
	private long Id;
	@Column(name="EmpName")
	private String Name;
	@Column(name="EmpSal")
	private Double Salary;

}
