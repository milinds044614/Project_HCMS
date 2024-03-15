package com.amigos.services;

import java.util.List;

import com.amigos.entities.EmployeeManagers;

public interface EmployeeManagersService {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManager(EmployeeManagers employeeManager);

	void updateEmployeeManager(EmployeeManagers employeeManager);

	void deleteEmployeeManager(EmployeeManagers employeeManagerId);

	EmployeeManagers getEmployeeManagerById(int employeeManagerId);

}
