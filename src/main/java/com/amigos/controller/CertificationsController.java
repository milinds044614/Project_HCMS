package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.Certifications;
import com.amigos.entities.Employees;
import com.amigos.services.CertificationsService;

@RestController
public class CertificationsController {
	@Autowired
	private CertificationsService certificationsService;
	
	@GetMapping("/certifications")
	private ResponseEntity<List<Certifications>> getAll() {
		return new ResponseEntity<List<Certifications>>(certificationsService.getAllCertifications(), HttpStatus.OK);
	}

}
