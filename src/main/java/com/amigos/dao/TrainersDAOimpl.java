package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Trainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class TrainersDAOimpl implements TrainersDAO {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Trainers> getAllTrainers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Trainers", Trainers.class).getResultList();
	}

	@Override
	public void addTrainer(Trainers trainer) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(trainer);
		
	}

	@Override
	public void updateTrainer(Trainers trainer) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(trainer);
	}

	@Override
	public void deleteTrainer(int trainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainers getTrainerById(int trainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
