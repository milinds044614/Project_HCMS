package com.amigos.dao;

import java.util.List;

import com.amigos.entities.ExternalTrainers;



public interface ExternalTrainersDAO {
	List<ExternalTrainers> getAllExternalTrainers();

	void addExternalTrainer(ExternalTrainers ExternalTrainer);

	void updateExternalTrainer(ExternalTrainers ExternalTrainer);

	void deleteExternalTrainer(ExternalTrainers ExternalTrainerId);

	ExternalTrainers getExternalTrainerById(int ExternalTrainerId);

}
