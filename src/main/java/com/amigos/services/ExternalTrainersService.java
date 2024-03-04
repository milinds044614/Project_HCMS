package com.amigos.services;

import java.util.List;

import com.amigos.entities.ExternalTrainers;

public interface ExternalTrainersService {
	List<ExternalTrainers> getAllExternalTrainers();

	void addExternalTrainers(ExternalTrainers ExternalTrainer);

	void updateExternalTrainers(ExternalTrainers ExternalTrainer);

	void deleteExternalTrainers(int ExternalTrainerId);

	ExternalTrainers getExternalTrainersById(int ExternalTrainerId);

}
