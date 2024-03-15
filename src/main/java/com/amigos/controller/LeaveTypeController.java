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

import com.amigos.entities.LeaveTypes;
import com.amigos.services.LeaveTypesService;
@RestController
public class LeaveTypeController {
	@Autowired
	private LeaveTypesService leaveTypesService;

	@GetMapping("/leaveTypes")
	private ResponseEntity<List<LeaveTypes>> getAll() {
		return new ResponseEntity<List<LeaveTypes>>(leaveTypesService.getAllLeaveTypes(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/LeaveTypes", method = RequestMethod.POST)
	@PostMapping("/leaveTypes")
	private ResponseEntity<Void> save(@RequestBody LeaveTypes leaveType, UriComponentsBuilder ucBuilder) {
		if (leaveType == null) {
			throw new RuntimeException("leaveType Object can 't  be NULL");
		}
		leaveTypesService.addLeaveType(leaveType);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("LeaveTypes/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/leaveTypes/{id}")
	private ResponseEntity<LeaveTypes> get(@PathVariable int id) {
		LeaveTypes leaveType = leaveTypesService.getLeaveTypeById(id);
		if (leaveType == null) {
			return new ResponseEntity<LeaveTypes>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<LeaveTypes>(leaveType, HttpStatus.OK);
		}
	}

	@PutMapping("/leaveTypes/{id}")
	private ResponseEntity<Void> update(@RequestBody LeaveTypes toBeUpdateLeaveT, @PathVariable int id) {
		if (toBeUpdateLeaveT == null) {
			throw new RuntimeException("leaveType Object can 't  be NULL");
		}
		LeaveTypes existingLeaveT = leaveTypesService.getLeaveTypeById(id);
		if (toBeUpdateLeaveT == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveTypesService.updateLeaveType(toBeUpdateLeaveT);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/leaveTypes/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		LeaveTypes deleteLeaveT = leaveTypesService.getLeaveTypeById(id);
		if (deleteLeaveT == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveTypesService.deleteLeaveType(deleteLeaveT);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
