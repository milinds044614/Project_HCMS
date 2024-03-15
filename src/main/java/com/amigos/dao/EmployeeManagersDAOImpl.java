package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.EmployeeManagers;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeManagersDAOImpl implements EmployeeManagersDAO{

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<EmployeeManagers> getAllEmployeeManagers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Employee_Managers", EmployeeManagers.class).getResultList();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(employeeManager);
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(employeeManager);
	}

	@Override
	public void deleteEmployeeManager(EmployeeManagers employeeManagerId) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(employeeManagerId);
	}

	@Override
	public EmployeeManagers getEmployeeManagerById(int employeeManagerId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(EmployeeManagers.class, employeeManagerId);
	}

	
	
}
