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

import com.amigos.entities.TrainingSchedules;
import com.amigos.services.TrainingSchedulesService;
@RestController
public class TrainingSchedulesController {

	@Autowired
	private TrainingSchedulesService trainingSchedulesService;

	@GetMapping("/trainingSchedules")
	private ResponseEntity<List<TrainingSchedules>> getAll() {
		return new ResponseEntity<List<TrainingSchedules>>(trainingSchedulesService.getAllTrainingSchedules(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/TrainingSchedules", method = RequestMethod.POST)
	@PostMapping("/trainingSchedules")
	private ResponseEntity<Void> save(@RequestBody TrainingSchedules trainingSchedule, UriComponentsBuilder ucBuilder) {
		if (trainingSchedule == null) {
			throw new RuntimeException("trainingSchedule Object can 't  be NULL");
		}
		trainingSchedulesService.addTrainingSchedule(trainingSchedule);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("TrainingSchedules/{id}").buildAndExpand(trainingSchedule).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/trainingSchedules/{id}")
	private ResponseEntity<TrainingSchedules> get(@PathVariable int id) {
		TrainingSchedules trainingSchedule = trainingSchedulesService.getTrainingScheduleById(id);
		if (trainingSchedule == null) {
			return new ResponseEntity<TrainingSchedules>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TrainingSchedules>(trainingSchedule, HttpStatus.OK);
		}
	}

	@PutMapping("/trainingSchedules/{id}")
	private ResponseEntity<Void> update(@RequestBody TrainingSchedules toBeUpdatetrainingSchedule, @PathVariable int id) {
		if (toBeUpdatetrainingSchedule == null) {
			throw new RuntimeException("trainingSchedule Object can 't  be NULL");
		}
		TrainingSchedules existingtrainingSchedule = trainingSchedulesService.getTrainingScheduleById(id);
		if (toBeUpdatetrainingSchedule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingSchedulesService.updateTrainingSchedule(toBeUpdatetrainingSchedule);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/trainingSchedules/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		TrainingSchedules deletetrainingSchedule = trainingSchedulesService.getTrainingScheduleById(id);
		if (deletetrainingSchedule == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			trainingSchedulesService.deleteTrainingSchedule(deletetrainingSchedule);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
}
