package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.TrainersDAO;
import com.amigos.entities.Trainers;

@Service
public class TrainersServiceImple implements TrainersService{
	@Autowired
	private TrainersDAO trainersDAO;
	@Override
	public List<Trainers> getAllTrainers() {
		// TODO Auto-generated method stub
		return trainersDAO.getAllTrainers();
	}

	@Override
	public void addTrainer(Trainers Trainer) {
		// TODO Auto-generated method stub
		trainersDAO.addTrainer(Trainer);
	}

	@Override
	public void updateTrainer(Trainers Trainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainer(int TrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainers getTrainerById(int TrainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
