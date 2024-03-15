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

import com.amigos.entities.AppraisalForms;
import com.amigos.entities.AppraisalForms;
import com.amigos.services.AppraisalFormsService;

@RestController
public class AppraisalFormsController {
	@Autowired
	private AppraisalFormsService appraisalService;
	
	@GetMapping("/appraisalForms")
	private ResponseEntity<List<AppraisalForms>> getAll() {
		return new ResponseEntity<List<AppraisalForms>>(appraisalService.getAllAppraisalForms(), HttpStatus.OK);
	}
	// @RequestMapping(value = "/AppraisalForms", method = RequestMethod.POST)
		@PostMapping("/appraisalForms")
		private ResponseEntity<Void> save(@RequestBody AppraisalForms appraisalForms, UriComponentsBuilder ucBuilder) {
			if (appraisalForms == null) {
				throw new RuntimeException("AppraisalForms Object can 't  be NULL");
			}
			appraisalService.addAppraisalForms(appraisalForms);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("AppraisalForms/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/AppraisalForms/{id}")
		private ResponseEntity<AppraisalForms> get(@PathVariable int id) {
			AppraisalForms emp = appraisalService.getAppraisalFormsById(id);
			if (emp == null) {
				return new ResponseEntity<AppraisalForms>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<AppraisalForms>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/AppraisalForms/{id}")
		private ResponseEntity<Void> update(@RequestBody AppraisalForms toBeUpdateEmp, @PathVariable int id) {
			if (toBeUpdateEmp == null) {
				throw new RuntimeException("AppraisalForms Object can 't  be NULL");
			}
			AppraisalForms existingEmp = appraisalService.getAppraisalFormsById(id);
			if (toBeUpdateEmp == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				appraisalService.updateAppraisalForms(toBeUpdateEmp);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/AppraisalForms/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			AppraisalForms deleteAppraisalForms = appraisalService.getAppraisalFormsById(id);
			if (deleteAppraisalForms == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				appraisalService.deleteAppraisalForms(deleteAppraisalForms);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
}
