package com.amigos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amigos.entities.AppraisalForms;

import com.amigos.services.AppraisalFormsService;

@RestController
public class AppraisalFormsController {
	@Autowired
	private AppraisalFormsService appraisalService;
	
	@GetMapping("/Appraisal")
	private ResponseEntity<List<AppraisalForms>> getAll() {
		return new ResponseEntity<List<AppraisalForms>>(appraisalService.getAllAppraisalForms(), HttpStatus.OK);
	}

}
