package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.ExternalTrainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ExternalTrainersDAOImpl implements ExternalTrainersDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<ExternalTrainers> getAllExternalTrainersDAO() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from ExternalTrainer",ExternalTrainers.class).getResultList();
	}

	@Override
	public void addExternalTrainers(ExternalTrainersDAO externalTrainer) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(externalTrainer);
	}

	@Override
	public void updateExternalTrainers(ExternalTrainersDAO externalTrainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExternalTrainers(int externalTrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExternalTrainersDAO getExternalTrainersById(int externalTrainerId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
