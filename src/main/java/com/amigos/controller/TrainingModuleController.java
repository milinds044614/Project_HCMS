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
import org.springframework.web.util.UriComponentsBuilder;

import com.amigos.entities.TrainingModules;
import com.amigos.services.TrainingModuleService;

public class TrainingModuleController {
	@Autowired
	private TrainingModuleService TrainingModulesService;

	@GetMapping("/trainingModules")
	private ResponseEntity<List<TrainingModules>> getAll() {
		return new ResponseEntity<List<TrainingModules>>(TrainingModulesService.getAllTrainingModules(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/TrainingModules", method = RequestMethod.POST)
	@PostMapping("/trainingModules")
	private ResponseEntity<Void> save(@RequestBody TrainingModules trainingModule, UriComponentsBuilder ucBuilder) {
		if (trainingModule == null) {
			throw new RuntimeException("trainingModule Object can 't  be NULL");
		}
		TrainingModulesService.addTrainingModule(trainingModule);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("TrainingModules/{id}").buildAndExpand(trainingModule).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/trainingModules/{id}")
	private ResponseEntity<TrainingModules> get(@PathVariable int id) {
		TrainingModules trainingModule = TrainingModulesService.getTrainingModuleById(id);
		if (trainingModule == null) {
			return new ResponseEntity<TrainingModules>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TrainingModules>(trainingModule, HttpStatus.OK);
		}
	}

	@PutMapping("/trainingModules/{id}")
	private ResponseEntity<Void> update(@RequestBody TrainingModules toBeUpdatetrainingModule, @PathVariable int id) {
		if (toBeUpdatetrainingModule == null) {
			throw new RuntimeException("trainingModule Object can 't  be NULL");
		}
		TrainingModules existingtrainingModule = TrainingModulesService.getTrainingModuleById(id);
		if (toBeUpdatetrainingModule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			TrainingModulesService.updateTrainingModule(toBeUpdatetrainingModule);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/trainingModules/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		TrainingModules deletetrainingModule = TrainingModulesService.getTrainingModuleById(id);
		if (deletetrainingModule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			TrainingModulesService.deleteTrainingModule(deletetrainingModule);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
