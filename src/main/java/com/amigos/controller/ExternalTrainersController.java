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

import com.amigos.entities.Employees;
import com.amigos.entities.ExternalTrainers;
import com.amigos.services.ExternalTrainersService;

@RestController
public class ExternalTrainersController {
	@Autowired
	private ExternalTrainersService externalTrainersService;
	
	@GetMapping("/externalTrainers")
	private ResponseEntity<List<ExternalTrainers>> getAll() {
		return new ResponseEntity<List<ExternalTrainers>>( externalTrainersService.getAllExternalTrainers(), HttpStatus.OK);
	}
	
	// @RequestMapping(value = "/employees", method = RequestMethod.POST)
		@PostMapping("/externalTrainers")
		private ResponseEntity<Void> save(@RequestBody ExternalTrainers externalTrainer, UriComponentsBuilder ucBuilder) {
			if (externalTrainer == null) {
				throw new RuntimeException("externalTrainers Object can 't  be NULL");
			}
			externalTrainersService.addExternalTrainer(externalTrainer);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/externalTrainers/{id}")
		private ResponseEntity<ExternalTrainers> get(@PathVariable int id) {
			ExternalTrainers emp = externalTrainersService.getExternalTrainerById(id);
			if (emp == null) {
				return new ResponseEntity<ExternalTrainers>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<ExternalTrainers>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/externalTrainers/{id}")
		private ResponseEntity<Void> update(@RequestBody ExternalTrainers toBeUpdateEmpT, @PathVariable int id) {
			if (toBeUpdateEmpT == null) {
				throw new RuntimeException("externalTrainers Object can 't  be NULL");
			}
			ExternalTrainers existingEmpT = externalTrainersService.getExternalTrainerById(id);
			if (toBeUpdateEmpT == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				externalTrainersService.updateExternalTrainer(existingEmpT);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/externalTrainers/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			ExternalTrainers deleteEmployeeT = externalTrainersService.getExternalTrainerById(id);
			if (deleteEmployeeT == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				externalTrainersService.deleteExternalTrainer(deleteEmployeeT);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
}
