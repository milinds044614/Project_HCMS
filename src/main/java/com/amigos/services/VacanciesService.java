package com.amigos.services;

import java.util.List;

import com.amigos.entities.Vacancies;

public interface VacanciesService {
	List<Vacancies> getAllVacancies();

	void addVacancies(Vacancies vacancie);

	void updateVacancies(Vacancies vacancie);

	void deleteVacancies(Vacancies vacancie);

	Vacancies getVacanciesById(int vacancieId);
}
