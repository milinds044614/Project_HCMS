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

import com.amigos.entities.LeaveRequests;
import com.amigos.services.LeaveRequestsService;

@RestController
public class LeaveRequestController {
	@Autowired
	private LeaveRequestsService leaveRequestsService;

	@GetMapping("/leaveRequests")
	private ResponseEntity<List<LeaveRequests>> getAll() {
		return new ResponseEntity<List<LeaveRequests>>(leaveRequestsService.getAllLeaveRequests(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/LeaveRequests", method = RequestMethod.POST)
	@PostMapping("/leaveRequests")
	private ResponseEntity<Void> save(@RequestBody LeaveRequests leaveReq, UriComponentsBuilder ucBuilder) {
		if (leaveReq == null) {
			throw new RuntimeException("LeaveRequest Object can 't  be NULL");
		}
		leaveRequestsService.addLeaveRequest(leaveReq);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("LeaveRequests/{id}").buildAndExpand(emp).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/leaveRequests/{id}")
	private ResponseEntity<LeaveRequests> get(@PathVariable int id) {
		LeaveRequests leaveReqest = leaveRequestsService.getLeaveRequestById(id);
		if (leaveReqest == null) {
			return new ResponseEntity<LeaveRequests>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<LeaveRequests>(leaveReqest, HttpStatus.OK);
		}
	}

	@PutMapping("/leaveRequests/{id}")
	private ResponseEntity<Void> update(@RequestBody LeaveRequests toBeUpdateEmp, @PathVariable int id) {
		if (toBeUpdateEmp == null) {
			throw new RuntimeException("Employee Object can 't  be NULL");
		}
		LeaveRequests existingLeaveRequest = leaveRequestsService.getLeaveRequestById(id);
		if (toBeUpdateEmp == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveRequestsService.updateLeaveRequest(existingLeaveRequest);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/leaveRequests/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		LeaveRequests deleteLeaveReq = leaveRequestsService.getLeaveRequestById(id);
		if (deleteLeaveReq == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveRequestsService.deleteLeaveRequest(deleteLeaveReq);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	
	}
}
