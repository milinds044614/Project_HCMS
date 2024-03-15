package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.VacanciesDAO;
import com.amigos.entities.Vacancies;

@Service
public class VacanciesServiceImpl implements VacanciesService{
	@Autowired
	private VacanciesDAO vacanciesDAO;

	@Override
	public List<Vacancies> getAllVacancies() {
		// TODO Auto-generated method stub
		return vacanciesDAO.getAllVacancies();
	}

	@Override
	public void addVacancies(Vacancies vacancie) {
		// TODO Auto-generated method stub
		vacanciesDAO.addVacancie(vacancie);
	}

	@Override
	public void updateVacancies(Vacancies vacancie) {
		// TODO Auto-generated method stub
		vacanciesDAO.updateVacancie(vacancie);
	}

	@Override
	public void deleteVacancies(Vacancies vacancie) {
		// TODO Auto-generated method stub
		vacanciesDAO.deleteVacancie(vacancie);
	}

	@Override
	public Vacancies getVacanciesById(int vacancieId) {
		// TODO Auto-generated method stub
		return vacanciesDAO.getVacancieById(vacancieId);
	}
	
}
