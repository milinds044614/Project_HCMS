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

import com.amigos.entities.Roles;
import com.amigos.services.RolesService;

@RestController
public class RoleController {
	@Autowired
	private RolesService roleService;
	
	
	@GetMapping("/roles")
	private ResponseEntity<List<Roles>> getAll() {
		return new ResponseEntity<List<Roles>>(roleService.getAllRoles(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/Roles", method = RequestMethod.POST)
	@PostMapping("/roles")
	private ResponseEntity<Void> save(@RequestBody Roles role, UriComponentsBuilder ucBuilder) {
		if (role == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		roleService.addRole(role);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("Roles/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/roles/{id}")
	private ResponseEntity<Roles> get(@PathVariable int id) {
		Roles role = roleService.getRoleById(id);
		if (role == null) {
			return new ResponseEntity<Roles>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Roles>(role, HttpStatus.OK);
		}
	}

	@PutMapping("/roles/{id}")
	private ResponseEntity<Void> update(@RequestBody Roles toBeUpdateRole, @PathVariable int id) {
		if (toBeUpdateRole == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		Roles existingEmp = roleService.getRoleById(id);
		if (toBeUpdateRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			roleService.updateRole(toBeUpdateRole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/roles/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Roles deleteRole = roleService.getRoleById(id);
		if (deleteRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			roleService.deleteRole(deleteRole);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
}
