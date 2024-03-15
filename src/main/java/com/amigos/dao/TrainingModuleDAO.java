package com.amigos.dao;

import java.util.List;

import com.amigos.entities.TrainingModules;

public interface TrainingModuleDAO {
	List<TrainingModules> getAllTrainingModules();

	void addTrainingModule(TrainingModules trainingModule);

	void updateTrainingModule(TrainingModules trainingModule);

	void deleteTrainingModule(TrainingModules obj);

	TrainingModules getTrainingModuleById(int trainingModuleId);

}
