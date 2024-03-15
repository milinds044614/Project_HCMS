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
import com.amigos.entities.LeaveApprovals;

import com.amigos.services.LeaveApprovalsService;

@RestController
public class LeaveApprovalsController {
	@Autowired
	private LeaveApprovalsService leaveApprovalsService; 

	@GetMapping("/LeaveApprovals")
	private ResponseEntity<List<LeaveApprovals>> getAll() {
		return new ResponseEntity<List<LeaveApprovals>>(leaveApprovalsService.getAllLeaveApprovals(), HttpStatus.OK);
	}
	
	// @RequestMapping(value = "/employees", method = RequestMethod.POST)
		@PostMapping("/leaveApprovalsService")
		private ResponseEntity<Void> save(@RequestBody LeaveApprovals leaveApproval, UriComponentsBuilder ucBuilder) {
			if (leaveApproval == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			leaveApprovalsService.addLeaveApproval(leaveApproval);
			HttpHeaders headers = new HttpHeaders();
			// headers.setLocation(ucBuilder.path("employees/{id}").buildAndExpand(emp).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@GetMapping("/leaveApprovalsService/{id}")
		private ResponseEntity<LeaveApprovals> get(@PathVariable int id) {
			LeaveApprovals emp = leaveApprovalsService.getLeaveApprovalById(id);
			if (emp == null) {
				return new ResponseEntity<LeaveApprovals>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<LeaveApprovals>(emp, HttpStatus.OK);
			}
		}

		@PutMapping("/leaveApprovalsService/{id}")
		private ResponseEntity<Void> update(@RequestBody LeaveApprovals toBeUpdateLeave, @PathVariable int id) {
			if (toBeUpdateLeave == null) {
				throw new RuntimeException("Employee Object can 't  be NULL");
			}
			LeaveApprovals existingLeave = leaveApprovalsService.getLeaveApprovalById(id);
			if (toBeUpdateLeave == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				leaveApprovalsService.updateLeaveApproval(toBeUpdateLeave);

				return new ResponseEntity<Void>(HttpStatus.OK);
			} 
		}

		@DeleteMapping("/leaveApprovalsService/{id}")
		private ResponseEntity<Void> delete(@PathVariable int id) {
			LeaveApprovals leaveApprovals = leaveApprovalsService.getLeaveApprovalById(id);
			if (leaveApprovals == null) {
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			} else {
				leaveApprovalsService.deleteLeaveApproval(leaveApprovals);

				return new ResponseEntity<Void>(HttpStatus.OK);
			}
		}
}
