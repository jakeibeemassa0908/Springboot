package com.infiniteloop.api.restfulwebap.dao;

import java.util.List;

import com.infiniteloop.api.restfulwebap.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int theId);

}
