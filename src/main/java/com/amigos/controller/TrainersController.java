package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.Trainers;
import com.amigos.services.TrainersService;
@RestController
public class TrainersController {
	@Autowired
	private TrainersService TrainersService; 

	@GetMapping("/Trainers")
	private ResponseEntity<List<Trainers>> getAll() {
		return new ResponseEntity<List<Trainers>>(TrainersService.getAllTrainers(), HttpStatus.OK);
	}

}
