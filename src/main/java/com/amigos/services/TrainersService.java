package com.amigos.services;

import java.util.List;

import com.amigos.entities.Trainers;

public interface TrainersService {
	List<Trainers> getAllTrainers();

	void addTrainer(Trainers Trainer);

	void updateTrainer(Trainers Trainer);

	void deleteTrainer(Trainers TrainerId);

	Trainers getTrainerById(int TrainerId);


}
