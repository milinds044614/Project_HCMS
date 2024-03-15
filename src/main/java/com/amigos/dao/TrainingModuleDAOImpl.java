package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.TrainingModules;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingModuleDAOImpl implements TrainingModuleDAO{
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<TrainingModules> getAllTrainingModules() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from TrainingModules", TrainingModules.class).getResultList();
	}

	@Override
	public void addTrainingModule(TrainingModules trainingModule) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(trainingModule);
	}

	@Override
	public void updateTrainingModule(TrainingModules trainingModule) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(trainingModule);
	}

	@Override
	public void deleteTrainingModule(TrainingModules obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public TrainingModules getTrainingModuleById(int trainingModuleId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(TrainingModules.class,trainingModuleId);
	}
	
}
