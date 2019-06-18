package com.infiniteloop.api.restfulwebap.service;

import java.util.List;

import com.infiniteloop.api.restfulwebap.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	public Employee findById(int id);
	public void  save(Employee theEmployee);
	public void deleteById(int id);
	

}
