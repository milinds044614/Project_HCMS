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

import com.amigos.entities.Certifications;

import com.amigos.services.CertificationsService;

@RestController
public class CertificationsController {
	@Autowired
	private CertificationsService certificationsService;
	
	@GetMapping("/certifications")
	private ResponseEntity<List<Certifications>> getAll() {
		return new ResponseEntity<List<Certifications>>(certificationsService.getAllCertifications(), HttpStatus.OK);
	}
	// @RequestMapping(value = "/certifications", method = RequestMethod.POST)
		@PostMapping("/certifications")
		private ResponseEntity<Void> save(@RequestBody Certifications employee, UriComponentsBuilder ucBuilder) {
			if (employee == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			certificationsService.addCertifications(employee);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("certifications/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/certifications/{id}")
		private ResponseEntity<Certifications> get(@PathVariable int id) {
			Certifications emp = certificationsService.getCertificationsById(id);
			if (emp == null) {
				return new ResponseEntity<Certifications>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<Certifications>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/certifications/{id}")
		private ResponseEntity<Void> update(@RequestBody Certifications toBeUpdateEmp, @PathVariable int id) {
			if (toBeUpdateEmp == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			Certifications existingEmp = certificationsService.getCertificationsById(id);
			if (toBeUpdateEmp == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				certificationsService.updateCertifications(existingEmp);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/certifications/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			Certifications deleteEmployee = certificationsService.getCertificationsById(id);
			if (deleteEmployee == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				certificationsService.deleteCertifications(deleteEmployee);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}

}
