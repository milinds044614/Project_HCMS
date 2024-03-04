package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.amigos.entities.LeaveApprovals;

import com.amigos.services.LeaveApprovalsService;

@RestController
public class LeaveApprovalsController {
	@Autowired
	private LeaveApprovalsService leaveApprovalsService; 

	@GetMapping("/LeaveApprovals")
	private ResponseEntity<List<LeaveApprovals>> getAll() {
		return new ResponseEntity<List<LeaveApprovals>>(leaveApprovalsService.getAllLeaveApprovals(), HttpStatus.OK);
	}
}
