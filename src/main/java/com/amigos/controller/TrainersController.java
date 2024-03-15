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

import com.amigos.entities.Trainers;

import com.amigos.services.TrainersService;
@RestController
public class TrainersController {
	@Autowired
	private TrainersService trainersService; 

	@GetMapping("/trainers")
	private ResponseEntity<List<Trainers>> getAll() {
		return new ResponseEntity<List<Trainers>>(trainersService.getAllTrainers(), HttpStatus.OK);
	}
	
	// @RequestMapping(value = "/Trainers", method = RequestMethod.POST)
		@PostMapping("/trainers")
		private ResponseEntity<Void> save(@RequestBody Trainers trainer, UriComponentsBuilder ucBuilder) {
			if (trainer == null) {
				throw new RuntimeException("Trainer Object can 't  be NULL");
			}
			trainersService.addTrainer(trainer);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("Trainers/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/trainers/{id}")
		private ResponseEntity<Trainers> get(@PathVariable int id) {
			Trainers tra = trainersService.getTrainerById(id);
			if (tra == null) {
				return new ResponseEntity<Trainers>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<Trainers>(tra, HttpStatus.OK);
			}
		}

		@PutMapping("/trainers/{id}")
		private ResponseEntity<Void> update(@RequestBody Trainers toBeUpdateTra, @PathVariable int id) {
			if (toBeUpdateTra == null) {
				throw new RuntimeException("Trainer  Object can 't  be NULL");
			}
			Trainers existingEmp = trainersService.getTrainerById(id);
			if (toBeUpdateTra == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				trainersService.updateTrainer(toBeUpdateTra);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/trainers/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			Trainers deleteTrainer = trainersService.getTrainerById(id);
			if (deleteTrainer  == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				trainersService.deleteTrainer(deleteTrainer);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}

}
