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

import com.amigos.entities.Projects;
import com.amigos.services.ProjectsService;
@RestController
public class ProjectController {
	@Autowired
	private ProjectsService projectService;

	@GetMapping("/projects")
	private ResponseEntity<List<Projects>> getAll() {
		return new ResponseEntity<List<Projects>>(projectService.getAllProjects(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/Projects", method = RequestMethod.POST)
	@PostMapping("/projects")
	private ResponseEntity<Void> save(@RequestBody Projects project, UriComponentsBuilder ucBuilder) {
		if (project == null) {
			throw new RuntimeException("project Object can 't  be NULL");
		}
		projectService.addProject(project);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("Projects/{id}").buildAndExpand(project).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/projects/{id}")
	private ResponseEntity<Projects> get(@PathVariable int id) {
		Projects project = projectService.getProjectById(id);
		if (project == null) {
			return new ResponseEntity<Projects>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Projects>(project, HttpStatus.OK);
		}
	}

	@PutMapping("/projects/{id}")
	private ResponseEntity<Void> update(@RequestBody Projects toBeUpdateproject, @PathVariable int id) {
		if (toBeUpdateproject == null) {
			throw new RuntimeException("project Object can 't  be NULL");
		}
		Projects existingproject = projectService.getProjectById(id);
		if (toBeUpdateproject == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			projectService.updateProject(toBeUpdateproject);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/projects/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Projects deleteproject = projectService.getProjectById(id);
		if (deleteproject == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			projectService.deleteProject(deleteproject);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
