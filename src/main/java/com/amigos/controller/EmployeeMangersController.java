package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.amigos.entities.EmployeeManagers;

import com.amigos.services.EmployeeManagersService;

@RestController
public class EmployeeMangersController {

	@Autowired
	private EmployeeManagersService employeeManagersService;
	
	@GetMapping("/employeeManagers")
	private ResponseEntity<List<EmployeeManagers>> getAll() {
		return new ResponseEntity<List<EmployeeManagers>>(employeeManagersService.getAllEmployeeManagers(), HttpStatus.OK);
	}
	
	// @RequestMapping(value = "/employees", method = RequestMethod.POST)
		@PostMapping("/employeeManagers")
		private ResponseEntity<Void> save(@RequestBody EmployeeManagers employeeManager, UriComponentsBuilder ucBuilder) {
			if (employeeManager == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			employeeManagersService.addEmployeeManager(employeeManager);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/employeeManagers/{id}")
		private ResponseEntity<EmployeeManagers> get(@PathVariable int id) {
			EmployeeManagers emp = employeeManagersService.getEmployeeManagerById(id);
			if (emp == null) {
				return new ResponseEntity<EmployeeManagers>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<EmployeeManagers>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/employeeManagers/{id}")
		private ResponseEntity<Void> update(@RequestBody EmployeeManagers toBeUpdateEmpManager, @PathVariable int id) {
			if (toBeUpdateEmpManager == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			EmployeeManagers existingEmp = employeeManagersService.getEmployeeManagerById(id);
			if (toBeUpdateEmpManager == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				employeeManagersService.updateEmployeeManager(toBeUpdateEmpManager);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/employeeManagers/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			EmployeeManagers deleteEmployeeManager = employeeManagersService.getEmployeeManagerById(id);
			if (deleteEmployeeManager == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				employeeManagersService.deleteEmployeeManager(deleteEmployeeManager);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
	
}
