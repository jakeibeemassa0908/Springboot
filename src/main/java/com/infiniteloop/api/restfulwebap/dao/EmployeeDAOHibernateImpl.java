package com.infiniteloop.api.restfulwebap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteloop.api.restfulwebap.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	private EntityManager entintyManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntintyManager) {
		entintyManager = theEntintyManager;
	}
	
	@Override
	public List<Employee> findAll() {
		//get current hibernate session
		Session currentSession = entintyManager.unwrap(Session.class);
		
		//create query
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
		
		return query.getResultList();
	}

	@Override
	public Employee findById(int id) {
		//get current hibernate session
		Session currentSession = entintyManager.unwrap(Session.class);
		
		//get the employee
		return currentSession.get(Employee.class, id);
	}

	@Override
	public void save(Employee employee) {
		//get current hibernate session
		Session currentSession = entintyManager.unwrap(Session.class);
		
		//save employee
		currentSession.saveOrUpdate(employee);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
