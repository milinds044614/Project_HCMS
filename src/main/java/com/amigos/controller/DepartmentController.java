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

import com.amigos.entities.Departments;
import com.amigos.services.DepartmentsService;
@RestController
public class DepartmentController {
	@Autowired
	private DepartmentsService DepartmentsService;

	@GetMapping("/departments")
	private ResponseEntity<List<Departments>> getAll() {
		return new ResponseEntity<List<Departments>>(DepartmentsService.getAllDepartments(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/Departments", method = RequestMethod.POST)
	@PostMapping("/departments")
	private ResponseEntity<Void> save(@RequestBody Departments employee, UriComponentsBuilder ucBuilder) {
		if (employee == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		DepartmentsService.addDepartment(employee);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("Departments/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/departments/{id}")
	private ResponseEntity<Departments> get(@PathVariable int id) {
		Departments emp = DepartmentsService.getDepartmentById(id);
		if (emp == null) {
			return new ResponseEntity<Departments>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Departments>(emp, HttpStatus.OK);
		}
	}

	@PutMapping("/departments/{id}")
	private ResponseEntity<Void> update(@RequestBody Departments toBeUpdateDep, @PathVariable int id) {
		if (toBeUpdateDep == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		Departments existingEmp = DepartmentsService.getDepartmentById(id);
		if (toBeUpdateDep == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			DepartmentsService.updateDepartment(toBeUpdateDep);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/departments/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Departments deleteEmployee = DepartmentsService.getDepartmentById(id);
		if (deleteEmployee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			DepartmentsService.deleteDepartment(deleteEmployee);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
