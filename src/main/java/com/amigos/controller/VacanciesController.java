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

import com.amigos.entities.Vacancies;
import com.amigos.services.VacanciesService;

@RestController
public class VacanciesController {
	@Autowired
	private VacanciesService vacanciesService;

	@GetMapping("/vacancies")
	private ResponseEntity<List<Vacancies>> getAll() {
		return new ResponseEntity<List<Vacancies>>(vacanciesService.getAllVacancies(), HttpStatus.OK);
	}

	// @RequestMapping(value = "/Vacancies", method = RequestMethod.POST)
	@PostMapping("/vacancies")
	private ResponseEntity<Void> save(@RequestBody Vacancies vacancie, UriComponentsBuilder ucBuilder) {
		if (vacancie == null) {
			throw new RuntimeException("vacancie Object can 't  be NULL");
		}
		vacanciesService.addVacancies(vacancie);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("Vacancies/{id}").buildAndExpand(vacancie).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping("/vacancies/{id}")
	private ResponseEntity<Vacancies> get(@PathVariable int id) {
		Vacancies vacancie = vacanciesService.getVacanciesById(id);
		if (vacancie == null) {
			return new ResponseEntity<Vacancies>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Vacancies>(vacancie, HttpStatus.OK);
		}
	}

	@PutMapping("/vacancies/{id}")
	private ResponseEntity<Void> update(@RequestBody Vacancies toBeUpdatevacancie, @PathVariable int id) {
		if (toBeUpdatevacancie == null) {
			throw new RuntimeException("vacancie Object can 't  be NULL");
		}
		Vacancies existingvacancie = vacanciesService.getVacanciesById(id);
		if (toBeUpdatevacancie == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			vacanciesService.updateVacancies(toBeUpdatevacancie);

			return new ResponseEntity<Void>(HttpStatus.OK);
		} 
	}

	@DeleteMapping("/vacancies/{id}")
	private ResponseEntity<Void> delete(@PathVariable int id) {
		Vacancies deletevacancie = vacanciesService.getVacanciesById(id);
		if (deletevacancie == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			vacanciesService.deleteVacancies(deletevacancie);

			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

}
