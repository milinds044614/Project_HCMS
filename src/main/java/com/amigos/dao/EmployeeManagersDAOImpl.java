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
	public void addEmployeeManagers(EmployeeManagers EmployeeManager) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(EmployeeManager);
	}

	@Override
	public void updateEmployeeManagers(EmployeeManagers EmployeeManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeManagers(int EmployeeManagerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeManagers getEmployeeManagersById(int EmployeeManagerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeManagers> getAllEmployeeManagerManagers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
