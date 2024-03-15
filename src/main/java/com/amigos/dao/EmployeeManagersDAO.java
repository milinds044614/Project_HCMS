package com.amigos.dao;

import java.util.List;

import com.amigos.entities.EmployeeManagers;

public interface EmployeeManagersDAO {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManager(EmployeeManagers EmployeeManager);

	void updateEmployeeManager(EmployeeManagers EmployeeManager);

	void deleteEmployeeManager(EmployeeManagers EmployeeManagerId);

	EmployeeManagers getEmployeeManagerById(int EmployeeManagerId);
}