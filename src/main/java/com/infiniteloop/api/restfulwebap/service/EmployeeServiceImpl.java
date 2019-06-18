package com.infiniteloop.api.restfulwebap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteloop.api.restfulwebap.dao.EmployeeDAO;
import com.infiniteloop.api.restfulwebap.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;
	
	@Autowired
	public  EmployeeServiceImpl(EmployeeDAO thEmployeeDAO) {
		employeeDao = thEmployeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDao.deleteById(id);
		
	}

}
