package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.EducationDetails;
import com.amigos.entities.Employees;
import com.amigos.services.EducationDetailsService;

@RestController
public class EducationDetailsController {
	@Autowired
	private EducationDetailsService educationService;
	
	@GetMapping("/educationDetials")
	private ResponseEntity<List<EducationDetails>> getAll() {
		return new ResponseEntity<List<EducationDetails>>(educationService.getAllEducationDetails(), HttpStatus.OK);
	}
}
