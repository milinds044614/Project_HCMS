package com.amigos.dao;

import java.util.List;

import com.amigos.entities.ExternalTrainers;



public interface ExternalTrainersDAO {
	List<ExternalTrainers> getAllExternalTrainersDAO();

	void addExternalTrainers(ExternalTrainersDAO ExternalTrainer);

	void updateExternalTrainers(ExternalTrainersDAO ExternalTrainer);

	void deleteExternalTrainers(int ExternalTrainerId);

	ExternalTrainersDAO getExternalTrainersById(int ExternalTrainerId);

}
