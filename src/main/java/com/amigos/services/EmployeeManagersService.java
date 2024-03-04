package com.amigos.services;

import java.util.List;

import com.amigos.entities.EmployeeManagers;

public interface EmployeeManagersService {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManager(EmployeeManagers EmployeeManager);

	void updateEmployeeManager(EmployeeManagers EmployeeManager);

	void deleteEmployeeManager(int EmployeeManagerId);

	EmployeeManagers getEmployeeManagerById(int EmployeeManagerId);

}
