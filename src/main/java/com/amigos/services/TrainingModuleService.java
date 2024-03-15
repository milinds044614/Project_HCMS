package com.amigos.services;

import java.util.List;

import com.amigos.entities.TrainingModules;

public interface TrainingModuleService {
	List<TrainingModules> getAllTrainingModules();

	void addTrainingModule(TrainingModules trainingModule);

	void updateTrainingModule(TrainingModules trainingModule);

	void deleteTrainingModule(TrainingModules trainingModule);

	TrainingModules getTrainingModuleById(int trainingModuleId);
}
