package com.amigos.dao;

import java.util.List;

import com.amigos.entities.EmployeeManagers;

public interface EmployeeManagersDAO {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManagers(EmployeeManagers EmployeeManager);

	void updateEmployeeManagers(EmployeeManagers EmployeeManager);

	void deleteEmployeeManagers(int EmployeeManagerId);

	EmployeeManagers getEmployeeManagersById(int EmployeeManagerId);
}