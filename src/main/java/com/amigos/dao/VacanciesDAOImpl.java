package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.Vacancies;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VacanciesDAOImpl implements VacanciesDAO{
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Vacancies> getAllVacancies() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Vacancies", Vacancies.class).getResultList();
	}

	@Override
	public void addVacancie(Vacancies vacancie) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(vacancie);
	}

	@Override
	public void updateVacancie(Vacancies vacancie) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(vacancie);
	}

	@Override
	public void deleteVacancie(Vacancies obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public Vacancies getVacancieById(int vacancieId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Vacancies.class, vacancieId);
	}
	
}
