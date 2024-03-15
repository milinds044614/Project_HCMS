package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.TrainingFeedback;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingFeedbackDAOImpl implements TrainingFeedbackDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<TrainingFeedback> getAllTrainingFeedback() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from TrainingFeedback", TrainingFeedback.class).getResultList();
	}

	@Override
	public void addTrainingFeedback(TrainingFeedback trainingFeedback) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(trainingFeedback);
	}

	@Override
	public void updateTrainingFeedback(TrainingFeedback trainingFeedback) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(trainingFeedback);
	}

	@Override
	public void deleteTrainingFeedback(TrainingFeedback obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public TrainingFeedback getTrainingFeedbackById(int trainingFeedbackId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(TrainingFeedback.class, trainingFeedbackId);
	}
	
}
