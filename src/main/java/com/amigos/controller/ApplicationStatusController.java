package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.ApplicationStatus;

import com.amigos.services.ApplicationStatusService;

@RestController
public class ApplicationStatusController {
	@Autowired
	private ApplicationStatusService applicationStatusService;
	@GetMapping("/ApplicaionStatus")
	private ResponseEntity<List<ApplicationStatus>> getAll() {
		return new ResponseEntity<List<ApplicationStatus>>(applicationStatusService.getAllApplicationStatus(), HttpStatus.OK);
	}

}
