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

import com.amigos.entities.CandidateProfiles;

import com.amigos.services.CandidateProfilesService;

@RestController
public class CandidateProfilesController {
	@Autowired
	private CandidateProfilesService candidateProfilesService;
	
	@GetMapping("/candidateproiles")
	private ResponseEntity<List<CandidateProfiles>> getAll() {
		return new ResponseEntity<List<CandidateProfiles>>(candidateProfilesService.getAllCandidateProfiles(), HttpStatus.OK);
	}
	// @RequestMapping(value = "/CandidateProfiles", method = RequestMethod.POST)
		@PostMapping("/CandidateProfiles")
		private ResponseEntity<Void> save(@RequestBody CandidateProfiles CandidateProfile, UriComponentsBuilder ucBuilder) {
			if (CandidateProfile == null) {
				throw new RuntimeException("CandidateProfile Object can 't  be NULL");
			}
			candidateProfilesService.addCandidateProfiles(CandidateProfile);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("CandidateProfiles/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/CandidateProfiles/{id}")
		private ResponseEntity<CandidateProfiles> get(@PathVariable int id) {
			CandidateProfiles emp = candidateProfilesService.getCandidateProfilesById(id);
			if (emp == null) {
				return new ResponseEntity<CandidateProfiles>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<CandidateProfiles>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/CandidateProfiles/{id}")
		private ResponseEntity<Void> update(@RequestBody CandidateProfiles toBeUpdateEmp, @PathVariable int id) {
			if (toBeUpdateEmp == null) {
				throw new RuntimeException("CandidateProfile Object can 't  be NULL");
			}
			CandidateProfiles existingEmp = candidateProfilesService.getCandidateProfilesById(id);
			if (toBeUpdateEmp == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				candidateProfilesService.updateCandidateProfiles(existingEmp);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/CandidateProfiles/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			CandidateProfiles deleteCandidateProfile = candidateProfilesService.getCandidateProfilesById(id);
			if (deleteCandidateProfile == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				candidateProfilesService.deleteCandidateProfiles(deleteCandidateProfile);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
}
