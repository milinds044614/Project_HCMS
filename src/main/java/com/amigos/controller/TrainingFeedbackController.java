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

import com.amigos.entities.TrainingFeedback;
import com.amigos.services.TrainingFeedbackService;
@RestController
public class TrainingFeedbackController {

	@Autowired
	private TrainingFeedbackService trainingFeedbackService;

	@GetMapping("/trainingFeedback")
	private ResponseEntity<List<TrainingFeedback>> getAll() {
		return new ResponseEntity<List<TrainingFeedback>>(trainingFeedbackService.getAllTrainingFeedback(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/TrainingFeedback", method = RequestMethod.POST)
	@PostMapping("/trainingFeedback")
	private ResponseEntity<Void> save(@RequestBody TrainingFeedback trainingFeedback, UriComponentsBuilder ucBuilder) {
		if (trainingFeedback == null) {
			throw new RuntimeException("trainingfeedbackloyee Object can 't  be NULL");
		}
		trainingFeedbackService.addTrainingFeedback(trainingFeedback);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("TrainingFeedback/{id}").buildAndExpand(trainingfeedback).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/trainingFeedback/{id}")
	private ResponseEntity<TrainingFeedback> get(@PathVariable int id) {
		TrainingFeedback trainingfeedback = trainingFeedbackService.getTrainingFeedbackById(id);
		if (trainingfeedback == null) {
			return new ResponseEntity<TrainingFeedback>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TrainingFeedback>(trainingfeedback, HttpStatus.OK);
		}
	}

	@PutMapping("/trainingFeedback/{id}")
	private ResponseEntity<Void> update(@RequestBody TrainingFeedback toBeUpdatetrainingfeedback, @PathVariable int id) {
		if (toBeUpdatetrainingfeedback == null) {
			throw new RuntimeException("trainingfeedbackloyee Object can 't  be NULL");
		}
		TrainingFeedback existingTrainingfeedback = trainingFeedbackService.getTrainingFeedbackById(id);
		if (toBeUpdatetrainingfeedback == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingFeedbackService.updateTrainingFeedback(toBeUpdatetrainingfeedback);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/trainingFeedback/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		TrainingFeedback deleteTrainingfeedback = trainingFeedbackService.getTrainingFeedbackById(id);
		if (deleteTrainingfeedback == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingFeedbackService.deleteTrainingFeedback(deleteTrainingfeedback);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
