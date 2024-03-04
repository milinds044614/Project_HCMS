package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.amigos.entities.ExternalTrainers;
import com.amigos.services.ExternalTrainersService;

@RestController
public class ExternalTrainersController {
	@Autowired
	private ExternalTrainersService externalTrainersService;
	
	@GetMapping("/ExternalTrainers")
	private ResponseEntity<List<ExternalTrainers>> getAll() {
		return new ResponseEntity<List<ExternalTrainers>>( externalTrainersService.getAllExternalTrainers(), HttpStatus.OK);
	}
	
}
