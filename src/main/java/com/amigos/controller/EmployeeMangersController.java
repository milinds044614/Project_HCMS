package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.EmployeeManagers;
import com.amigos.entities.Employees;
import com.amigos.services.EmployeeManagersService;

@RestController
public class EmployeeMangersController {

	@Autowired
	private EmployeeManagersService employeeManagersService;
	
	@GetMapping("/employeeManagers")
	private ResponseEntity<List<EmployeeManagers>> getAll() {
		return new ResponseEntity<List<EmployeeManagers>>(employeeManagersService.getAllEmployeeManagers(), HttpStatus.OK);
	}
	
	
	
}
