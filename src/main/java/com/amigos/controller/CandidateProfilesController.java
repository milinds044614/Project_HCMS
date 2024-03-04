package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.CandidateProfiles;
import com.amigos.entities.Employees;
import com.amigos.services.CandidateProfilesService;

@RestController
public class CandidateProfilesController {
	@Autowired
	private CandidateProfilesService candidateProfilesService;
	
	@GetMapping("/candidateproiles")
	private ResponseEntity<List<CandidateProfiles>> getAll() {
		return new ResponseEntity<List<CandidateProfiles>>(candidateProfilesService.getAllCandidateProfiles(), HttpStatus.OK);
	}
}
