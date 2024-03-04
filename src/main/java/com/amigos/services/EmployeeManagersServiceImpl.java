package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.EmployeeManagersDAO;
import com.amigos.entities.EmployeeManagers;
@Service
public class EmployeeManagersServiceImpl  implements EmployeeManagersService{
	@Autowired
	private EmployeeManagersDAO employeeManagersDAO;

	@Override
	public List<EmployeeManagers> getAllEmployeeManagers() {
		// TODO Auto-generated method stub
		return employeeManagersDAO.getAllEmployeeManagers();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		employeeManagersDAO.addEmployeeManagers(employeeManager);
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeManager(int employeeManagerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeManagers getEmployeeManagerById(int employeeManagerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
