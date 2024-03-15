package com.amigos.services;

import java.util.List;

import com.amigos.entities.ExternalTrainers;

public interface ExternalTrainersService {
	List<ExternalTrainers> getAllExternalTrainers();

	void addExternalTrainer(ExternalTrainers ExternalTrainer);

	void updateExternalTrainer(ExternalTrainers ExternalTrainer);

	void deleteExternalTrainer(ExternalTrainers ExternalTrainerId);

	ExternalTrainers getExternalTrainerById(int ExternalTrainerId);

}
