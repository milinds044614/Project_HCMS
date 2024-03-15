package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Vacancies;

public interface VacanciesDAO {
	List<Vacancies> getAllVacancies();

	void addVacancie(Vacancies vacancie);

	void updateVacancie(Vacancies vacancie);

	void deleteVacancie(Vacancies obj);

	Vacancies getVacancieById(int vacancieId);

}
