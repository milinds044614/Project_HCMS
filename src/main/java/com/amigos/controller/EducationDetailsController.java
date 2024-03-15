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

import com.amigos.entities.EducationDetails;

import com.amigos.services.EducationDetailsService;

@RestController
public class EducationDetailsController {
	@Autowired
	private EducationDetailsService educationService;
	
	@GetMapping("/educationDetials")
	private ResponseEntity<List<EducationDetails>> getAll() {
		return new ResponseEntity<List<EducationDetails>>(educationService.getAllEducationDetails(), HttpStatus.OK);
	}
	
	// @RequestMapping(value = "/educationDetails", method = RequestMethod.POST)
		@PostMapping("/educationDetails")
		private ResponseEntity<Void> save(@RequestBody EducationDetails EducationDetail, UriComponentsBuilder ucBuilder) {
			if (EducationDetail == null) {
				throw new RuntimeException("EducationDetail Object can 't  be NULL");
			}
			educationService.addEducationDetail(EducationDetail);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("educationDetails/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/educationDetails/{id}")
		private ResponseEntity<EducationDetails> get(@PathVariable int id) {
			EducationDetails emp = educationService.getEducationDetailById(id);
			if (emp == null) {
				return new ResponseEntity<EducationDetails>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<EducationDetails>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/educationDetails/{id}")
		private ResponseEntity<Void> update(@RequestBody EducationDetails toBeUpdateEmp, @PathVariable int id) {
			if (toBeUpdateEmp == null) {
				throw new RuntimeException("EducationDetail Object can 't  be NULL");
			}
			EducationDetails existingEmp = educationService.getEducationDetailById(id);
			if (toBeUpdateEmp == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				educationService.updateEducationDetail(toBeUpdateEmp);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/educationDetails/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			EducationDetails deleteEducationDetail = educationService.getEducationDetailById(id);
			if (deleteEducationDetail == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				educationService.deleteEducationDetail(deleteEducationDetail);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
}
