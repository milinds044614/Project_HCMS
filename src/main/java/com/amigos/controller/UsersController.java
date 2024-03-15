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

import com.amigos.entities.Users;
import com.amigos.services.UsersService;
@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService;

	@GetMapping("/users")
	private ResponseEntity<List<Users>> getAll() {
		return new ResponseEntity<List<Users>>(usersService.getAllUsers(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/Users", method = RequestMethod.POST)
	@PostMapping("/users")
	private ResponseEntity<Void> save(@RequestBody Users user, UriComponentsBuilder ucBuilder) {
		if (user == null) {
			throw new RuntimeException("user Object can 't  be NULL");
		}
		usersService.addUsers(user);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("Users/{id}").buildAndExpand(user).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/users/{id}")
	private ResponseEntity<Users> get(@PathVariable int id) {
		Users user = usersService.getUsersById(id);
		if (user == null) {
			return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Users>(user, HttpStatus.OK);
		}
	}

	@PutMapping("/users/{id}")
	private ResponseEntity<Void> update(@RequestBody Users toBeUpdateuser, @PathVariable int id) {
		if (toBeUpdateuser == null) {
			throw new RuntimeException("user Object can 't  be NULL");
		}
		Users existinguser = usersService.getUsersById(id);
		if (toBeUpdateuser == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			usersService.updateUsers(toBeUpdateuser);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/users/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Users deleteuser = usersService.getUsersById(id);
		if (deleteuser == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			usersService.deleteUsers(deleteuser);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
